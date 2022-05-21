package com.we.shopservice;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBatisPlusCodeGeneratorApplicationTests {

    @Test
    void contextLoads() {
        String projectPath = System.getProperty("user.dir");
        FastAutoGenerator.create("jdbc:mysql://47.106.94.112/classtask?useSSL=false", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("Ran") // 设置作者
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(projectPath + "/src/main/java") // 指定输出目录
                            .disableOpenDir() // 禁止打开输出目录
                            .commentDate("yyyy-MM-dd") // 注释日期
                            .dateType(DateType.ONLY_DATE); // 时间策略
                })
                .packageConfig(builder -> {
                    builder.parent("com.leadsrelated"); // 设置父包名

                })
                .strategyConfig(builder -> {
                    builder.addInclude("blogs",
                                    "leads") // 设置需要生成的表名

                            .entityBuilder()
                            .enableChainModel()
                            .enableLombok()
                            .idType(IdType.ASSIGN_ID)

                            .controllerBuilder()
                            .enableHyphenStyle()
                            .enableRestStyle()

                            .mapperBuilder()
                            .enableMapperAnnotation();

                })
                .execute();
    }

}
