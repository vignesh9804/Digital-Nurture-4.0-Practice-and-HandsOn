import './App.css';
import CurrencyConverter from './components/currencyConverter';
import Increment from './components/Increment';

function App() {
  const sayWelcome = () => {
    alert("Welcome");
  }

  const clickOnMe = () => {
    alert("I was Clicked");
  }

  return (
    <div className="App">
      <Increment/>
      <button onClick={sayWelcome}>Welcome</button>
      <br/>
      <button onClick={clickOnMe}>Click on me</button>
      <CurrencyConverter/>
    </div>
  );
}

export default App;
