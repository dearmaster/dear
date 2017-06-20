<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String ctx = request.getContextPath();
%>
<html>

<head>
    <title>dearmaster</title>
    <link rel="stylesheet" href="<%= ctx%>/css/bootstrap.css">
    <link rel="stylesheet" href="<%= ctx%>/css/main.css">
</head>

<body>
<div id="container">

    <div class="left" id="main_left">

        <div id="header">Dark Ritual</div>

        <div class="right" id="main">

            <div class="padded">

                <h1>Porttitor posuere</h1>
                <p class="meta">October 24th, 2006 by Duis porttitor</p>

                <p>In hac habitasse platea dictumst. Duis porttitor. Sed vulputate elementum nisl. Vivamus et mi at arcu mattis iaculis. Nullam posuere tristique tortor. In bibendum. Aenean ornare, <a href="index.html">nunc eget pretium</a> porttitor, sem est pretium leo, non euismod nulla dui non diam. Pellentesque dictum faucibus leo. Vestibulum ac ante. Sed in est.</p>

                <blockquote><p>Sed sodales nisl sit amet augue. Donec ultrices, augue ullamcorper posuere laoreet, turpis massa tristique justo, sed egestas metus magna sed purus.</p></blockquote>

                <p>Aliquam risus justo, mollis in, laoreet a, consectetuer nec, risus. Nunc blandit sodales lacus. Nam luctus semper mi. In eu diam.</p>

                <p>Fusce porta pede nec eros. Maecenas ipsum sem, interdum non, aliquam vitae, interdum nec, metus. Maecenas ornare lobortis risus. Etiam placerat varius mauris. Maecenas viverra. Sed feugiat. Donec mattis <a href="index.html">quam aliquam</a> risus. Nulla non felis sollicitudin urna blandit egestas. Integer et libero varius pede tristique ultricies. Cras nisl. Proin quis massa semper felis euismod ultricies.
                </p>


                <h1>Heading 1</h1>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>

                <h2>Heading 2</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>

                <h3>Heading 3</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>

                <h4>Heading 4</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>

                <h5>Heading 5</h5>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>

                <h6>Heading 6</h6>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>

                <div class="content_separator"></div>

                <h2>Images in text</h2>

                <p>Curabitur faucibus risus quis lectus. <a href="#">Donec vehicula</a>. Pellentesque nec, lectus. Nullam dictum sem. Phasellus varius. Vestibulum in felis in mauris consequat molestie</p>

                <img src="sample-thumbnail.jpg" width="75" height="75" alt="" class="alignleft"/>

                <p>Consectetur adipiscing elit. In nisi. Duis condimentum est nec augue blandit scelerisque. Phasellus varius. Vestibulum in felis in mauris consequat molestie. Sem nec pellentesque condimentum, turpis massa ultricies nisi, at molestie justo eros ac velit.</p>

                <img src="sample-thumbnail.jpg" width="75" height="75" alt="" class="alignright"/>

                <p>Curabitur euismod mi ac neque. Cras vel tortor molestie <a href="#">tortor luctus</a> facilisis. Nulla a nunc. Vivamus est. Integer ac sem quis ipsum dignissim sodales. Nam pulvinar sem eu nibh. Suspendisse non nulla et ligula bibendum facilisis. Suspendisse potenti. Vivamus leo.</p>

                <p>Nulla lacus tortor, ornare vitae, vulputate vitae, sed quis magna. Pellentesque urna urna, bibendum non, ornare in, sollicitudin quis, est.</p>

                <div class="clearer">&nbsp;</div>

                <div class="content_separator"></div>

                <h2>Messages</h2>

                <div class="success">Success!</div>

                <div class="notice">Notice</div>

                <div class="error">Error..</div>

                <div class="content_separator"></div>

                <h2>Blockquote</h2>

                <blockquote>
                    <p><span>&quot;</span> Praesent orci nisi, interdum quis, tristique vitae, consectetur sed, arcu. Ut at sapien non dolor semper sollicitudin. Etiam semper erat quis odio. Quisque commodo suscipit velit. Nulla facilisi. <span>&quot;</span></p>
                    - Duis justo quam
                </blockquote>

                <div class="content_separator"></div>

                <h2>Lists</h2>

                <h3>Unsorted list</h3>
                <ul>
                    <li>Blandit in, interdum a</li>
                    <li>Ultrices non lectus</li>
                    <li>Nunc id odio</li>
                    <li>Fusce ultricies</li>
                </ul>

                <h3>Ordered list</h3>
                <ol>
                    <li>Blandit in, interdum a</li>
                    <li>Ultrices non lectus</li>
                    <li>Nunc id odio</li>
                    <li>Fusce ultricies</li>
                </ol>

                <h3>Definition list</h3>

                <dl>
                    <dt>title</dt>
                    <dd>definition</dd>
                    <dd>definition</dd>
                    <dt>title</dt>
                    <dt>title</dt>
                    <dd>definition</dd>
                    <dt>title</dt>
                    <dd>definition</dd>
                </dl>

                <div class="content_separator"></div>

                <h2>Tables</h2>

                <h3>Data table</h3>

                <table class="data-table">
                    <tr>
                        <th>Property 1</th>
                        <th>Property 2</th>
                        <th>Property 3</th>
                        <th>Property 4</th>
                    </tr>
                    <tr class="even">
                        <td>Value 1.1</td>
                        <td>Value 1.2</td>
                        <td>Value 1.3</td>
                        <td>Value 1.4</td>
                    </tr>
                    <tr>
                        <td>Value 2.1</td>
                        <td>Value 2.2</td>
                        <td>Value 2.3</td>
                        <td>Value 2.4</td>
                    </tr>
                    <tr class="even">
                        <td>Value 3.1</td>
                        <td>Value 3.2</td>
                        <td>Value 3.3</td>
                        <td>Value 3.4</td>
                    </tr>
                    <tr>
                        <td>Value 4.1</td>
                        <td>Value 4.2</td>
                        <td>Value 4.3</td>
                        <td>Value 4.4</td>
                    </tr>
                </table>

            </div>

        </div>

        <div class="left" id="subnav">

            <h1>博客分类</h1>
            <ul>
                <li><a href="index.html">生活日记</a></li>
                <li><a href="index.html">工作相关</a></li>
                <li><a href="index.html">semper</a></li>
                <li><a href="index.html">convallis</a></li>
            </ul>

            <h1>摄影天地</h1>
            <ul>
                <li><a href="index.html">consequat molestie</a></li>
                <li><a href="index.html">sem justo</a></li>
                <li><a href="index.html">semper</a></li>
                <li><a href="index.html">sociis natoque</a></li>
            </ul>

            <h1>常用工具</h1>
            <ul>
                <li><a href="index.html">sociis natoque</a></li>
                <li><a href="index.html">magna sed purus</a></li>
                <li><a href="index.html">tincidunt</a></li>
                <li><a href="index.html">consequat molestie</a></li>
            </ul>

        </div>

        <div class="clearer">&nbsp;</div>

    </div>

    <div class="right" id="main_right">

        <div class="padded">

            <h4>Etiam placerat</h4>
            <p>Fusce porta pede nec eros. Maecenas ipsum sem, interdum non, aliquam vitae, interdum nec, metus. Maecenas ornare lobortis risus. Donec mattis <a href="index.html">quam aliquam</a> risus. Nulla non felis sollicitudin urna blandit egestas. Integer et libero varius pede tristique ultricies. Cras nisl. Proin quis massa semper felis euismod ultricies.</p>

            <h4>Maecenas</h4>
            <p>Fusce porta pede nec eros. Maecenas ipsum sem, interdum non, aliquam vitae, interdum nec, metus. Maecenas ornare lobortis risus.</p>

            <h4>Lobortis</h4>
            <p>Interdum nec, metus. Maecenas ornare lobortis risus. Donec mattis quam aliquam risus. Nulla non felis sollicitudin urna blandit egestas. Integer et libero <a href="index.html">varius pede</a> tristique ultricies. Cras nisl. Proin quis massa semper felis euismod ultricies.</p>

        </div>

    </div>

    <div class="clearer">&nbsp;</div>

    <div id="footer">

        <span class="left">&copy; 2009 <a href="index.html">Website.com</a>. Valid <a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a> &amp; <a href="http://validator.w3.org/check?uri=referer">XHTML</a></span>

        <span class="right"><a href="http://www.cssmoban.com/">Website template</a> from <a href="http://cssmoban.com/">cssMoban.com</a></span>

        <div class="clearer">&nbsp;</div>

    </div>

</div>
</body>

</html>
