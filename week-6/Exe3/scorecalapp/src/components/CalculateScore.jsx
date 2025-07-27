import '../stylesheets/mystyle.css'

const CalcutateScore = (props) => {
    const {studentName,school,total,goal} = props

    const calScore = (score,goal) => {
        return (score/goal).toFixed(2);
    }

    return (
        <div className='student_details_div'>
            <h1 className='main_heading'>Student Details</h1>
            <div>
                <p className="details_heading name_heading">
                    Name: <span className='stu_name'>{studentName}</span>
                </p>
                <p className="details_heading school_heading">
                    School: <span className='stu_name'>{school}</span>
                </p>
                <p className="details_heading marks_heading">
                    Total: <span className='stu_name'>{total} Marks</span>
                </p>
                <p className="details_heading percentage_heading">
                    Percentage: <span className='stu_name'>{calScore(total,goal)}%</span>
                </p>
            </div>
        </div>
    )
}

export default CalcutateScore