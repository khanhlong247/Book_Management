# BÀI TẬP LỚN - NHÓM 2

### Đề tài: Quản lý ấn phẩm trong thư viện

## Yêu cầu:
- Phát triển code từ mã nguồn đã cho, theo hướng hoàn thiện dần các kiểu dữ liệu và chức năng của Giao diện. Ví dụ: Thời gian chuyển sang kiểu Date/DateTime, các Items có sẵn được hiện theo List để người dùng chọn (Ví dụ: nhập ấn phẩm, list chọn sách, báo, tạp chí, chuyên san…; Phòng tập có list chọn Phòng tập yoga, Phòng tập gym, Phòng tập bơi…).
- **Tìm kiếm:** Ít nhất phải tìm kiếm theo String và tìm kiếm theo Số
   
   + Đối với tìm kiếm theo String phải tìm kiếm gần đúng. Ví dụ: tìm kiếm theo tên, nhập A trả về các tên Nguyễn Văn A, Trần Thị A…
   + Đối với tìm kiếm theo số cần tìm kiếm theo 1 miền. Ví dụ: tìm kiếm theo giá tiền thì cho người dùng chọn hoặc nhập khoảng giá tiền.
- **Thống kê:** Tổng số, lớn nhất, nhỏ nhất. Ví dụ: Tổng số hộ dân, tổng số cư dân, tổng số người có tiền án, tổng số người có nhân thân đặc biệt….

- **Các trường như:** ID/Mã SV/ Mã nhân viên… của các bản ghi sau khi thêm, sửa, xoá không được trùng nhau. 

- **Đóng gói:** Hãy đóng gói thành phần mềm sau khi code xong, có 2 dạng: đóng gói sinh ra file .exe, hoặc đóng gói dưới dạng Excutable Jar file, để khi click vào app, phần mềm sẽ chạy. 

- **Viết file Readme:** mô tả phần mềm, các chức năng chính, đăng nhập, chạy chương trình…

- Nộp mã nguồn, phần mềm sau đóng gói và file readme. Nếu quá lớn các em có thể đẩy lên github và share.

## Authors

### OopJavaN03_LT
- Lưu Mai Tuyết - 22010226
- Trương Long Khánh - 22010198
- Trần Bá Hiện - 21012315

## Java Compiler

**Một số trình biên dịch đề xuất**

- **Eclipse:**

  - Website: https://www.eclipse.org/
  - Eclipse hỗ trợ trên nhiều hệ điều hành, bao gồm Windows, Linux và macOS.

- **NetBeans:**

  - Website: https://netbeans.apache.org/
  - NetBeans hỗ trợ trên nhiều hệ điều hành, bao gồm Windows, Linux và macOS.

- **Visual Studio Code:**

  - Website: https://code.visualstudio.com/
  - Visual Studio Code hỗ trợ trên nhiều hệ điều hành, bao gồm Windows, Linux và macOS.

## Features

### Các chức năng của chương trình

- **Quản lý sách:**

    - Thêm sách.
    - Chỉnh sửa sách.
    - Xóa sách.
    - Tìm kiếm sách.

- **Quản lý đọc giả mượn sách:**

    - Thêm đọc giả.
    - Chỉnh sửa đọc giả.
    - Xóa đọc giả.
    - Tìm kiếm đọc giả.

- **Quản lý phiếu mượn sách:**

    - Thêm phiếu mượn.
    - Chỉnh sửa phiếu mượn.
    - Xóa phiếu mượn.
    - Tìm kiếm phiếu mượn.

- **Thống kê:**

    - Thống kê số lượng sách trong thư viện và số lượng sách được mượn.
 
## Deployment

**1. Đăng nhập chương trình**

Trên màn hình đăng nhập, nhập username là "admin", nhập password là "admin"

**2. Quản lý sách**

- **Thêm sách**

Bước 1: Nhập thông tin sách
Bước 2: Ấn nút "Thêm"

- **Chỉnh sửa sách**

Bước 1: Chọn dòng thông tin sách muốn sửa
Bước 2: Ấn nút "Sửa"
Bước 3: SỬa thông tin sách
Bước 4: Ấn nút "Lưu"

- **Xóa sách**

Bước 1: Chọn dòng muốn xóa
Bước 2: Ấn nút "Xóa"

- **Tìm kiếm sách**

Gõ keywword vào thanh tìm kiếm và ấn nút "Tìm kiếm"

**3. Quản lý đọc giả mượn sách**

- **Thêm đọc giả**

Bước 1: Nhập thông tin đọc giả
Bước 2: Ấn nút "Thêm"

- **Chỉnh sửa đọc giả**

Bước 1: Chọn dòng thông tin đọc giả muốn sửa
Bước 2: Ấn nút "Sửa"
Bước 3: SỬa thông tin đọc giả
Bước 4: Ấn nút "Lưu"

- **Xóa đọc giả**

Bước 1: Chọn dòng muốn xóa
Bước 2: Ấn nút "Xóa"

- **Tìm kiếm đọc giả**

Gõ keywword vào thanh tìm kiếm và ấn nút "Tìm kiếm"

**4. Quản lý phiếu mượn sách**

- **Thêm phiếu mượn**

Bước 1: Nhập thông tin phiếu mượn
Bước 2: Ấn nút "Thêm"

- **Chỉnh sửa phiếu mượn**

Bước 1: Chọn dòng thông tin phiếu mượn muốn sửa
Bước 2: Ấn nút "Sửa"
Bước 3: SỬa thông tin phiếu mượn
Bước 4: Ấn nút "Lưu"

- **Xóa phiếu mượn**

Bước 1: Chọn dòng muốn xóa
Bước 2: Ấn nút "Xóa"

- **Tìm kiếm phiếu mượn**

Gõ keywword vào thanh tìm kiếm và ấn nút "Tìm kiếm"

**5. Thông kê**

![Screenshot 2024-01-22 234436](https://github.com/khanhlong247/khanhlong/assets/85059988/2608b681-6cc3-42ec-b83b-62074d943c6a)

## Optimizations

**1. Sử dụng cấu trúc try-catch trong đọc ghi file:**

- Lý do 1: Sử dụng cấu trúc try-catch vì sau khi khởi tạo hàm ghi thông tin vào file thì lúc này vẫn chư có file, vì vậy nếu không có xử lý ngoại lệ, chương trình sẽ dừng và lỗi. 
- Lý do 2: Khi viết tới hàm đọc hoặc ghi file, Netbeans IDE báo lỗi và gợi ý sử dụng try catch.

**2. Sử dụng phương thức toObject():**

Sử dụng phương thức toObject() để giải quyết vấn đề liên kết các thuộc tính trong các lớp khác nhau được chứa trong các package khác nhau lại để có thể đọc ghi file.

## Github Profile - Links

[link to Github](https://github.com/khanhlong247/khanhlong.git)

## Contributing

Contributions are always welcome!
