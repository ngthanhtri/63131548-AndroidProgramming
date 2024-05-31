# Cấu Trúc Của Một Ứng Dụng Android và Lý Thuyết Lập Trình

## 1. Kiến Thức Cơ Bản về Android

Trước khi đi sâu vào cấu trúc của một ứng dụng Android, hãy điểm qua một số kiến thức cơ bản về lập trình Android:

- **Ngôn Ngữ Lập Trình:** **Java**, **Kotlin**.
- **Giao Diện Người Dùng:** XML (Extensible Markup Language).
- **Môi Trường Phát Triển:** ![Android Studio](https://developer.android.com/studio/images/studio-icon-stable.png)
- **Quản Lý Phiên Bản:** Git (hoặc bất kỳ công cụ quản lý phiên bản nào khác).

## 2. Cấu Trúc Tổng Quan của Một Ứng Dụng Android

Một ứng dụng Android thường bao gồm các thành phần sau:

### a. Activity

- **Activity:** Đại diện cho một màn hình giao diện người dùng trong ứng dụng. Mỗi activity có thể chứa nhiều thành phần giao diện như button, text fields, etc.

### b. Fragment

- **Fragment:** Được sử dụng để tạo giao diện linh hoạt hơn, cho phép tạo ra các màn hình chia sẻ hoặc có thể tái sử dụng.

### c. Layout

- **Layouts:** Định dạng cách các thành phần giao diện được sắp xếp và hiển thị trên màn hình. Các loại layout phổ biến bao gồm LinearLayout, RelativeLayout, và ConstraintLayout.

### d. Intent

- **Intent:** Dùng để giao tiếp giữa các thành phần khác nhau của ứng dụng, như chuyển từ một activity sang activity khác.

### e. Service

- **Service:** Chạy ở background và không có giao diện người dùng. Thường được sử dụng cho các tác vụ dài hạn như tải dữ liệu từ internet.

### f. BroadcastReceiver

- **BroadcastReceiver:** Được sử dụng để lắng nghe và phản ứng với các sự kiện hệ thống hoặc tùy chỉnh, như khi thiết bị khởi động lại hoặc khi có tin nhắn đến.

## 3. Lập Trình Ứng Dụng Android


