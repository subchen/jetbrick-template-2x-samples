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
package jetbrick.template.samples.jfinal;

import jetbrick.template.samples.jfinal.controller.*;
import jetbrick.template.web.jfinal.JetTemplateRenderFactory;
import com.jfinal.config.*;

public class JetxConfig extends JFinalConfig {

    @Override
    public void configConstant(Constants me) {
        me.setMainRenderFactory(new JetTemplateRenderFactory());
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/index", IndexController.class);
        me.add("/users", UsersController.class);
        me.add("/books", BooksController.class);
    }

    @Override
    public void configPlugin(Plugins me) {
    }

    @Override
    public void configInterceptor(Interceptors me) {
    }

    @Override
    public void configHandler(Handlers me) {
    }
}
