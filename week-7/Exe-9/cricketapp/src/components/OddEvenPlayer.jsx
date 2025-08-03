export const OddPlayer = ([first,,thrid,,fifth]) => {
    return(
        <ul>
            <li>first: {first}</li>
            <li>thrid: {thrid}</li>
            <li>fifth: {fifth}</li>
        </ul>
    )
}

export const EvenPlayer = ([,second,,forth,,sixth]) => {
    return(
        <ul>
            <li>second: {second}</li>
            <li>forth: {forth}</li>
            <li>sixth: {sixth}</li>
        </ul>
    )
}

export const MergedPlayers = ({players}) => {
    return (
        <ul>
            {players.map((eachItem)=><li>Mr. {eachItem}</li>
            )}
        </ul>
    )
}
