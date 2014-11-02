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
package jetbrick.template.samples.extension;

import java.util.ArrayList;
import java.util.List;
import jetbrick.template.JetAnnotations;
import jetbrick.template.samples.dao.DaoUtils;
import jetbrick.template.samples.model.BookInfo;
import jetbrick.template.samples.model.UserInfo;

@JetAnnotations.Methods
public class Methods {

    public static List<BookInfo> getBooks(UserInfo user) {
        List<BookInfo> books = new ArrayList<BookInfo>();
        for (BookInfo book : DaoUtils.getBookList()) {
            if (book.getAuthorId().equals(user.getId())) {
                books.add(book);
            }
        }
        return books;
    }

    public static UserInfo getAuthorUser(BookInfo book) {
        return DaoUtils.getUser(book.getAuthorId());
    }
}
