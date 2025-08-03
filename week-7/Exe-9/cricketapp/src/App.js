import './App.css';
import { IndianPlayers } from './components/IndianPlayers';
import ListOfPlayers from './components/ListOfPlayers';
import {OddPlayer,EvenPlayer,MergedPlayers} from './components/OddEvenPlayer';
import ScoreLessThanSeventy from './components/ScoreLess70';

function App() {
  const players = [
  { name: "Rohit", score: 85 },
  { name: "Virat", score: 92 },
  { name: "Gill", score: 77 },
  { name: "Rahul", score: 60 },
  { name: "Surya", score: 48 },
  { name: "Hardik", score: 70 },
  { name: "Jadeja", score: 55 },
  { name: "Kuldeep", score: 40 },
  { name: "Shami", score: 35 },
  { name: "Bumrah", score: 30 },
  { name: "Siraj", score: 25 }
  ];

  const oddEvenPlayerList = ['a','b','c','d','e','f'];
  const mergedPlayers = IndianPlayers;

  const flag = false;

  if(flag){
    return(
      <div>
        <h1>List of Players</h1>
        <ListOfPlayers players={players}></ListOfPlayers>
        <hr/>
        <h1>List of Playes having score lessthan 70</h1>
        <ScoreLessThanSeventy players={players}></ScoreLessThanSeventy>
      </div>
    )
  }else{
    return(
      <div>
        <h1>Odd Players</h1>
        {OddPlayer(oddEvenPlayerList)}
        <hr/>
        <h1>Even Players</h1>
        {EvenPlayer(oddEvenPlayerList)}
        <hr/>
        <h1>Merged Playes</h1>
        <MergedPlayers players = {mergedPlayers} />
      </div>
    )
  }
}

export default App;
