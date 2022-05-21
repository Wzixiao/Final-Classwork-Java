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
        FastAutoGenerator.create("jdbc:mysql://47.106.94.112/finalclasswork_shop?useSSL=false&serverTimezone=GMT%2B8", "root", "123456")
                .globalConfig(builder -> builder.author("wRan")
                        .fileOverride()
                        .outputDir(projectPath + "/src/main/java")
                        .disableOpenDir()
                        .commentDate("yyyy-MM-dd hh:mm:ss")
                        .dateType(DateType.ONLY_DATE))
                .packageConfig(builder -> builder.parent("com.we.shopservice"))
                .strategyConfig(builder -> builder
                        .addInclude("commodity", "details")
                        .entityBuilder()
                        .enableChainModel()
                        .enableLombok()
                        .idType(IdType.ASSIGN_ID)
                        .controllerBuilder()
                        .enableHyphenStyle()
                        .enableRestStyle()
                        .mapperBuilder()
                        .enableMapperAnnotation())
                .execute();
    }

}
