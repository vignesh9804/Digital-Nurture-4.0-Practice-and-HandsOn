import './App.css';
import CalcutateScore from './components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalcutateScore studentName="Vignesh" school="KKR Gowtham" total={284} goal={3}/>
    </div>
  );
}

export default App;
