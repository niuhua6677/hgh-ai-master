# HGH-AI 项目

## 简介

HGH-AI 是一个基于 Spring Boot 和 AI 技术的大模型应用。它集成了 OpenAI 和 Ollama 的聊天模型，使用RAG,Fuction Calling,Prompt等主流大模型应用架构，支持 PDF 知识库处理、课程管理、学校信息查询等功能，适用于教育、客服等场景。

## 技术栈

- **编程语言**: Java 17
- **框架**:
  - Spring Boot 3.4.3
  - MyBatis Plus
  - Spring AI (OpenAI 和 Ollama 集成)
- **数据库**: MySQL
- **工具库**:
  - Lombok
  - VectorStore
  - PDF 文档读取工具
- **其他依赖**:
  - Maven 构建工具
  - Micrometer 观测工具

## 目录结构

src\main\java\com\hgh\ai\config: [CommonConfiguration.java,MvcConfiguration.java]
src\main\java\com\hgh\ai\repository: [ChatHistoryRepository.java,FileRepository.java,InMemoryChatHistoryRepository.java,LocalPdfFileRepository.java]
src\main\java\com\hgh\ai\controller: [ChatController.java,ChatHistoryController.java,CustomerServiceController.java,GameController.java,PdfController.java]
src\main\java\com\hgh\ai: [HghAiApplication.java,MtAiApplication.java]
src\main\java\com\hgh\ai\entity\query: [CourseQuery.java]
src\main\java\com\hgh\ai\tools: [CourseTools.java]
src\main\java\com\hgh\ai\mapper: [CourseMapper.java,CourseReservationMapper.java,SchoolMapper.java]
src\main\java\com\hgh\ai\service\impl: [CourseReservationServiceImpl.java,CourseServiceImpl.java,SchoolServiceImpl.java]
src\main\java\com\hgh\ai\entity\vo: [MessageVO.java,Result.java]
: [README.md,chat-history.json,chat-memory.json,chat-pdf.json,chat-pdf.properties,pom.xml]
src\main\java\com\hgh\ai\model: [AlibabaOpenAiChatModel.java]
src\main\resources: [application-local.properties,application-local.yaml,application.yaml]
src\main\java\com\hgh\ai\entity\po: [Course.java,CourseReservation.java,Msg.java,School.java]
src\main\resources\mapper: [CourseMapper.xml,CourseReservationMapper.xml,SchoolMapper.xml]
src\main\java\com\hgh\ai\utils: [VectorDistanceUtils.java]
src\main\java\com\hgh\ai\service: [ICourseReservationService.java,ICourseService.java,ISchoolService.java]
src\main\java\com\hgh\ai\constants: [SystemConstants.java]

## 运行环境

- **JDK 版本**: 17
- **Spring Boot 版本**: 3.4.3
- **Maven 依赖**:
  - `com.baomidou:mybatis-plus-spring-boot3-starter==3.5`
  - `com.mysql:mysql-connector-j`
  - `org.projectlombok:lombok==1.18`
  - `org.springframework.ai:spring-ai-bom==1.0`
  - `org.springframework.ai:spring-ai-ollama-spring-boot-starter`
  - `org.springframework.ai:spring-ai-openai-spring-boot-starter`
  - `org.springframework.ai:spring-ai-pdf-document-reader`
  - `org.springframework.boot:spring-boot-starter-test`
  - `org.springframework.boot:spring-boot-starter-web`

## 使用说明

1. **克隆项目**
   bash git clone <项目仓库地址>
2. **安装依赖**
   bash mvn clean install
3. **配置文件**

   - 修改 `src/main/resources/application.yaml` 文件，配置数据库连接和其他必要参数。
4. **运行项目**
   bash mvn spring-boot:run
5. **访问接口**

   - 启动后，可以通过浏览器或 Postman 访问 `/chat`, `/course`, `/school` 等接口。

## 贡献指南

欢迎为本项目贡献代码！请遵循以下步骤：

1. Fork 本项目到您的 GitHub 账户。
2. 创建一个新的分支进行开发。
3. 提交 Pull Request，并详细描述您的更改内容。
4. 我们会尽快审核并合并您的代码。

## 联系方式

如有任何问题，请联系项目维护者：

- Email: [18319523592@163.com](https://github.com/niuhua6677)
- GitHub: [https://github.com/niuhua6677](https://github.com/niuhua6677)
