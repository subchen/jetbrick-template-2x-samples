/**
 * jetbrick-template
 * http://subchen.github.io/jetbrick-template/
 *
 * Copyright 2010-2014 Guoqiang Chen. All rights reserved.
 * Email: subchen@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrick.template.samples.dao;

import java.util.*;
import jetbrick.template.samples.model.BookInfo;
import jetbrick.template.samples.model.UserInfo;
import jetbrick.util.DateUtils;

public class DaoUtils {
    private static Map<Integer, UserInfo> users;
    private static Map<Integer, BookInfo> books;

    static {
        users = new LinkedHashMap<Integer, UserInfo>();
        addUser(new UserInfo(1, "张三", "zhangshan@qq.com", 0));
        addUser(new UserInfo(2, "李四", "lisi@qq.com", 0));
        addUser(new UserInfo(3, "王五", "wangwu@qq.com", 1));
        addUser(new UserInfo(4, "赵六", "zhaoliu@qq.com", 1));

        books = new LinkedHashMap<Integer, BookInfo>();
        addBook(new BookInfo(1, "语文书", 1, 23.10, DateUtils.parse("2000-01-01")));
        addBook(new BookInfo(2, "数学书", 1, 18.00, DateUtils.parse("2001-02-01")));
        addBook(new BookInfo(3, "英语书", 1, 19.99, DateUtils.parse("2002-03-01")));
        addBook(new BookInfo(4, "物理书", 1, 17.10, DateUtils.parse("2003-04-01")));
        addBook(new BookInfo(5, "化学书", 2, 16.12, DateUtils.parse("2004-05-01")));
        addBook(new BookInfo(6, "政治书", 2, 25.44, DateUtils.parse("2005-06-01")));
        addBook(new BookInfo(7, "地理书", 2, 20.00, DateUtils.parse("2006-07-01")));
        addBook(new BookInfo(8, "历史书", 3, 20.07, DateUtils.parse("2007-08-01")));
        addBook(new BookInfo(9, "生物书", 3, 20.07, DateUtils.parse("2008-09-01")));
    }

    private static void addUser(UserInfo user) {
        users.put(user.getId(), user);
    }

    private static void addBook(BookInfo book) {
        books.put(book.getId(), book);
    }

    public static UserInfo getUser(Integer id) {
        return users.get(id);
    }

    public static Collection<UserInfo> getUserList() {
        return users.values();
    }

    public static BookInfo getBook(Integer id) {
        return books.get(id);
    }

    public static Collection<BookInfo> getBookList() {
        return books.values();
    }
}
