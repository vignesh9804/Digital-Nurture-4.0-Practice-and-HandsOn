const Greeting = (props) => {
    const {isLogin} =  props

    if(isLogin){
        return <h1>Welcome Back</h1>
    }
    else{
        return <h1>Please Sign up</h1>
    }
}

export default Greeting