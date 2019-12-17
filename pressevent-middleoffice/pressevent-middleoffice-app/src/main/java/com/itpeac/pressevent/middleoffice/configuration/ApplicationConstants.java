package com.itpeac.pressevent.middleoffice.configuration;

public interface ApplicationConstants {
    String SPRING_PROFILE_DEVELOPMENT = "dev";
    String SPRING_PROFILE_TEST = "test";
    String SPRING_PROFILE_PRODUCTION = "prod";

    // Spring profile used when deploying to Amazon ECS
    String SPRING_PROFILE_AWS_ECS = "aws-ecs";
    // Spring profile used to enable swagger
    String SPRING_PROFILE_SWAGGER = "swagger";
}
