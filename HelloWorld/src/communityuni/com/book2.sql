-- 1. Khởi tạo Database
CREATE DATABASE IF NOT EXISTS book;
USE book;

-- 2. Tạo bảng gốc: Tác giả
CREATE TABLE book.authors 
(
  authorID INT NOT NULL AUTO_INCREMENT,
  firstName VARCHAR(20) NOT NULL,
  lastName VARCHAR(30) NOT NULL,
  PRIMARY KEY (authorID)
);

-- 3. Tạo bảng gốc: Sách (Đầu sách)
CREATE TABLE book.titles
(
  isbn VARCHAR(20) NOT NULL,
  title VARCHAR(100) NOT NULL,
  editionNumber INT NOT NULL,
  copyright VARCHAR(4) NOT NULL,
  PRIMARY KEY (isbn)
);

-- 4. Tạo bảng trung gian: Liên kết Tác giả - Sách (Sửa đồng bộ tên thành authorISBN)
CREATE TABLE book.authorISBN
(
  authorID INT NOT NULL,
  isbn VARCHAR(20) NOT NULL,
  FOREIGN KEY (authorID) REFERENCES book.authors(authorID),
  FOREIGN KEY (isbn) REFERENCES book.titles(isbn)
);
  
-- 5. Chèn dữ liệu vào bảng authors (Tạo ra các ID tự động từ 1 đến 5)
INSERT INTO book.authors (firstName, lastName)
VALUES
  ('Paul', 'Deitel'),
  ('Harvey', 'Deitel'),
  ('Abbey', 'Deitel'),
  ('Dan', 'Quirk'),
  ('Michael', 'Morgano');

-- 6. Chèn dữ liệu vào bảng titles
INSERT INTO book.titles (isbn, title, editionNumber, copyright)
VALUES
  ('0132151006', 'Internet & World Wide Web How to Program', 5, '2012'),
  ('0133807800', 'Java How to Program', 10, '2015'),
  ('0132575655', 'Java How to Program, Late Objects Version', 10, '2015'),
  ('013299044X', 'C How to Program', 7, '2013'),
  ('0132990601', 'Simply Visual Basic 2010', 4, '2013'),
  ('0133406954', 'Visual Basic 2012 How to Program', 6, '2014'),
  ('013379337', 'Visual C# 2012 How to Program', 5, '2014'), -- Sửa lại mã ISBN bị thiếu số 0 ở ảnh trước thành '013379337' để khớp khóa ngoại bên dưới
  ('0136151574', 'Visual C++ How to Program', 2, '2008'),
  ('013378713', 'C++ How to Program', 9, '2014'),        -- Sửa lại mã ISBN tương tự 
  ('0133764036', 'Android How to Program', 2, '2015'),
  ('0133570924', 'Android for Programmers: An App-Driven Approach, Volume 1', 2, '2014'),
  ('0132121360', 'Android for Programmers: An App-Driven Approach', 1, '2012');
  
-- 7. Chèn dữ liệu vào bảng mối quan hệ authorISBN
INSERT INTO book.authorISBN (authorID, isbn)
VALUES
  (1, '0132151006'),
  (2, '0132151006'),
  (3, '0132151006'),
  (1, '0133807800'),
  (2, '0133807800'),
  (1, '0132575655'),
  (2, '0132575655'),
  (1, '013299044X'),
  (2, '013299044X'),
  (1, '0132990601'),
  (2, '0132990601'),
  (3, '0132990601'),
  (1, '0133406954'),
  (2, '0133406954'),
  (3, '0133406954'),
  (1, '013379337'),
  (2, '013379337'),
  (1, '0136151574'),
  (2, '0136151574'),
  (4, '0136151574'),
  (1, '013378713'),
  (2, '013378713'),
  (1, '0133764036'),
  (2, '0133764036'),
  (3, '0133764036'),
  (1, '0133570924'),
  (2, '0133570924'),
  (3, '0133570924'),
  (1, '0132121360'),
  (2, '0132121360'),
  (3, '0132121360'),
  (5, '0132121360');

-- 8. Kiểm tra lại dữ liệu sau khi nạp thành công
SELECT * FROM book.authors;
SELECT * FROM book.titles;
SELECT * FROM book.authorISBN;