import { useState } from 'react';
import './App.css';
import Greeting from './components/Greetings';
import LogoutButton from './components/Logout';
import LoginButton from './components/Login';

function App() {
  const [isLogin,setIsLogin] = useState(false)
  const onChangeLoginStatus=()=>{
    setIsLogin((prevState)=>!prevState)
  }
  
  const displayButton=()=>{
    if(isLogin){
      return <LogoutButton onClick={onChangeLoginStatus}/>
    }else{
      return <LoginButton onClick={onChangeLoginStatus}/>
    }
  }

  return (
    <div className="App">
      <Greeting isLogin={isLogin}/>
      {displayButton()}
    </div>
  );
}

export default App;
