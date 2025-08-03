
const ListOfPlayers = ({players}) =>{
    return(
        <ul>
            {players.map((eachItem)=><li>Mr. {eachItem.name} <span>{eachItem.score}</span></li>)}
        </ul>
    )
}

export default ListOfPlayers