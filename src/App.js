
import { Route, Routes } from 'react-router-dom';
import './App.css';
import ListProduct from './components/ListProduct';

function App() {
  return (
    <div className="App">
       <Routes>
        <Route path='/' Component={ListProduct}/>  
       </Routes>
    </div>
  );
}

export default App;
