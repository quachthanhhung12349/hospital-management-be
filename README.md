# Giới thiệu ứng dụng

Ứng dụng giúp bệnh nhân đăng ký khám bệnh với các bác sĩ.

## Front End
- React JS ^17.0.1
- Material UI ^4.11.2
- TypeScript ^^4.1.3
- node-sass ^4.14.1
- AJAX - axios ^0.21.1
- Git
- Visual Studio Code

## Back End
- Java 17
- Spring Boot ^2.4.1
- Hibernate 5.1.3.Final
- Swagger ^2.9.2
- SQL / PostgreSQL: version 42.2.18
- Maven 1.8
- Tomcat 9.0

## Triển khai
- Vercel
- Heroku

# Links:
- Backend: https://github.com/quachthanhhung12349/hospital-management-be
- Frontend: https://github.com/quachthanhhung12349/Hospital-management-project
- SQL: https://drive.google.com/file/d/1vYf-jmGafZ8fbHyN401scEfI4bONmI1j/view?usp=sharing

## Tính năng

### Admin:
1. Đăng nhập vào tài khoản đã có.
2. Xem danh sách tất cả tài khoản bác sĩ - Đang yêu cầu / Đã duyệt / Đã từ chối.
3. Xem thông tin chi tiết về bác sĩ.
4. Duyệt hoặc từ chối tài khoản bác sĩ.
5. Đăng xuất.

### Bệnh nhân:
1. Đăng ký tài khoản mới.
2. Đăng nhập vào tài khoản đã có.
3. Tạo yêu cầu với bác sĩ đã được duyệt để xin lời khuyên hoặc kê đơn thuốc bằng cách mô tả vấn đề.
4. Xem danh sách tất cả yêu cầu trước đó - Đã trả lời / Đang chờ.
5. Tạo một chủ đề mới trong trang diễn đàn.
6. Có thể trả lời các chủ đề trong diễn đàn của người khác.
7. Đăng xuất.

### Bác sĩ:
1. Đăng ký tài khoản mới.
2. Đăng nhập chỉ khi tài khoản đã được admin duyệt.
3. Xem danh sách các yêu cầu mới từ bệnh nhân.
4. Xem danh sách các yêu cầu đã trả lời trước đó.
5. Trả lời yêu cầu của bệnh nhân bằng cách cung cấp lời khuyên, kê đơn thuốc hoặc yêu cầu bệnh nhân đến khám trực tiếp.
6. Có thể tạo một chủ đề mới trong trang diễn đàn.
7. Có thể trả lời các chủ đề trong diễn đàn của người khác.
8. Đăng xuất.

## Hướng dẫn bắt đầu

### Back End
- Git clone dự án này
- Chạy cơ sở dữ liệu PostgreSQL theo đường dẫn ở trên
- Trong file application.yml, Thay đổi thông tin 'datasource' ở theo vị trí lưu của CSDL vừa tải về (url, username và password)
- Dùng đường link trên để tạo mật khẩu cho ứng dụng https://myaccount.google.com/u/0/apppasswords
- Trong file application.yml, Thay thế tài khoản và mật khẩu ở phần mail bằng email của bạn và mật khẩu vừa mới tạo
- Chạy ứng dụng Spring Boot

### Front End
- Git clone dự án này
- Thực hiện `npm install --force`
- Xây dựng ứng dụng bằng `vercel build`
- Chạy ứng dụng bằng `serve -s build`

## Cách sử dụng
- Người dùng có thể đăng nhập với tư cách là Admin, Bệnh nhân hoặc Bác sĩ.
- Tài khoản admin:
* Username: admin
* Password: 123
- Tài khoản bệnh nhân
* Username: patient
* Password: patient
- Tài khoản bác sĩ
* Username: abc123
* Password: abc123
- Tài khoản bác sĩ (bị rejected):
* Username: fakedoctor
* Password: fakedoctor
- Admin chịu trách nhiệm quản lý tất cả tài khoản bác sĩ.
- Admin có thể duyệt hoặc từ chối yêu cầu tài khoản bác sĩ mới.
- Bệnh nhân có thể tạo yêu cầu cho bác sĩ cụ thể để xin lời khuyên hoặc kê đơn thuốc.
- Bác sĩ có thể trả lời yêu cầu của bệnh nhân.
- Cả bệnh nhân và bác sĩ đều có thể xem danh sách các yêu cầu, bao gồm các yêu cầu mới và đã được trả lời.
- Người dùng có thể đăng xuất.

### Authentication FLow
![Alt](/login.png "login")

### Admin FLow
![Alt](/admin.png "admin")

### Patient and Doctor FLow
![Alt](/patientDoctor.png "patientDoctor")

## Development Tool
- Eclipse - Spring Tools Suit 4
- Visual Studio code
- Postman
- DBeaver

## ER Diagram
![Alt](/ERD.png "ERD")

## Giấy phép
Dự án này thuộc giấy phép GNU General Public License.







