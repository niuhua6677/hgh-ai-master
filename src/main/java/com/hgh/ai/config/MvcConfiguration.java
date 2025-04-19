package com.hgh.ai.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfiguration implements WebMvcConfigurer {

    /**
     * 添加跨域资源共享（CORS）的映射配置
     * 此方法用于配置允许从任何来源访问应用的API，并指定允许的HTTP方法和头部
     *
     * @param registry CorsRegistry对象，用于注册CORS映射
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 配置路径映射，"/**"表示匹配所有路径
        registry.addMapping("/**")
                // 允许所有来源的跨域请求
                .allowedOrigins("*")
                // 指定允许的HTTP方法
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                // 允许所有头部，"*"表示通配符
                .allowedHeaders("*")
                // 暴露特定的头部，以便客户端可以访问
                .exposedHeaders("Content-Disposition");
    }
}
