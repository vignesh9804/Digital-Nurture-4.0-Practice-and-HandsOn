const ScoreLessThanSeventy = ({players}) =>{
    const Players70 = players.filter((eachItem)=>eachItem.score<70);
    return(
        <ul>
            {Players70.map((eachItem)=>{
                return <li>Mr. {eachItem.name} <span>{eachItem.score}</span></li>
            })}
        </ul>
    )


}

export default ScoreLessThanSeventy