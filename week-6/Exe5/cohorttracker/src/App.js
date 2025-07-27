import './App.css';
import { CohortsData} from './Cohort'
import CohortDetails from './CohortDetails'; 

function App() {
 
  return (
  <div>
    <h1>Cohorts Details</h1>
    <div className='details_outer_div'>
      {CohortsData.map(cohort => <CohortDetails cohort={cohort}/>)}
    </div>
  </div>
  );
}

export default App;
