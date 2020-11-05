package cn.lnfvc.mapper;

import cn.lnfvc.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    Book findById(Integer id);

    List<Book> findAllBooks();

    int insert(Book book);

    int delete(Integer id);

    int update(Book book);

}
