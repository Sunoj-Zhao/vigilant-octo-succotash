# 健康检查接口规格文档
## 1. 核心目标
- 开发健康检查接口，返回项目基础状态信息；
- 验证多字段JSON返回、时间格式化、固定字段定义的正确性。

## 2. 业务规则
- 请求方式：GET
- 访问路径：/api/health（完整地址：http://localhost:8080/api/health）
- 请求参数：无
- 返回字段规则：
  - appName：固定"springboot-hello"（项目名）
  - version：固定"1.0.0"（版本号）
  - time：当前系统时间（格式：yyyy-MM-dd HH:mm:ss）
  - status：固定"UP"（项目状态）

## 3. 技术约束
- 框架：Spring Boot 3.x
- 语言：Java 17
- 时间格式化：使用SimpleDateFormat或LocalDateTime
- 返回值：通用包装类ResultVO<HealthVO>

## 4. 输入输出
### 4.1 输入
- 请求示例：http://localhost:8080/api/health

### 4.2 输出
- 成功响应示例：
{
  "code": 200,
  "msg": "success",
  "data": {
    "appName": "springboot-hello",
    "version": "1.0.0",
    "time": "2026-03-06 10:00:00",
    "status": "UP"
  }
}
- 字段说明：
| 字段   | 类型   | 说明                 |
|--------|--------|----------------------|
| appName| String | 项目名称             |
| version| String | 项目版本             |
| time   | String | 当前系统时间         |
| status | String | 项目运行状态（UP=正常）|

## 5. 验收标准
- 项目启动正常，接口访问无404/500错误；
- 返回JSON包含code/msg/data，data内字段完整；
- time字段格式符合yyyy-MM-dd HH:mm:ss；
- status字段固定为"UP"。