<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form class="form-signin" action="/cp/login" method="post">
    <img class="mb-4" src="/img/1.jpg" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal">LOG 手机</h1>
    <label for="inputEmail" class="sr-only">Account number</label>
    <input type="text" name="UserName" id="inputEmail" class="form-control" placeholder="Account number" required autofocus>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" name="pwd" id="inputPassword" class="form-control" placeholder="Password" required>
    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"> Remember account
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Landing</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
</form>

