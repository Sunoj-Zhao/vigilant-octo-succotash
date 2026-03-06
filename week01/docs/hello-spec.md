# Hello 接口规格文档
## 1. 核心目标
- 开发GET类型的Hello接口，返回统一格式JSON响应；
- 验证Spring Boot项目环境、Controller扫描、接口访问流程的正确性；
- 接口返回固定成功状态码、提示信息和自定义欢迎语。

## 2. 业务规则
- 请求方式：GET
- 访问路径：/api/hello（完整地址：http://localhost:8080/api/hello）
- 请求参数：无（无URL参数、无请求体）
- 返回字段规则：
  - code：固定200（业务成功码）
  - msg：固定"success"（成功提示）
  - data：字符串类型，如"Hello Spring Boot"

## 3. 技术约束
- 框架：Spring Boot 3.x
- 语言：Java 17
- 端口：8080
- 控制器注解：@RestController
- 返回值：通用包装类ResultVO<String>

## 4. 输入输出
### 4.1 输入
- 请求示例：http://localhost:8080/api/hello

### 4.2 输出
- 成功响应示例：
{
  "code": 200,
  "msg": "success",
  "data": "Hello Spring Boot"
}
- 字段说明：
| 字段 | 类型   | 说明                 |
|------|--------|----------------------|
| code | Integer| 业务状态码（200=成功）|
| msg  | String | 提示信息             |
| data | String | 核心响应数据         |

## 5. 验收标准
- 项目启动无报错，Tomcat运行在8080端口；
- 访问接口无404/500错误；
- 返回JSON包含code/msg/data三个字段，值符合规则；
- HTTP响应状态码为200。