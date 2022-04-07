import React from "react";
const SignIn = () =>{
    return (

    <>
    <nav className="main-nav">
        <div className="logo">
            <h2>
            <span>R</span>ipple
            <span>T</span>one
            </h2>
        </div>
        <div className="menu-link">
            <ul>
                <li><a href="#">Home</a></li>
            </ul>
            <div className="hamburger-menu">
                <a>
                <img src="https://image.flaticon.com/icons/svg/2016/2016012.svg" alt="burger icon" />
                </a>
            </div>
        </div>
    </nav>
    <div className="main-div" id="box">
        <ul>
            <li>
            <div className="form">
            <h2 className="h2"> <b>Login</b> </h2>
        <form action="">
            <div className="form-div">
                <label htmlFor="email"></label>
                <input size="50" className="input" type="text" autoComplete="off" name="email" id="email" placeholder="Enter email" required></input>
            </div>
                <br></br>
            <div className="form-div">
                <label htmlFor="password"></label>
                <input className="input" type="text" autoComplete="off" name="password" id="password" placeholder="Enter Password" required></input>
            </div>
                <br></br>
            <div className="signin" id="signinLink">
                New User? Sign up
            </div>
                <br></br>
            <button className="submit" type="submit" id="submitButton"><b>Submit</b></button>
        </form>
        </div>
        </li>
        </ul>
        </div>
    </>
    )
}
export default SignIn;