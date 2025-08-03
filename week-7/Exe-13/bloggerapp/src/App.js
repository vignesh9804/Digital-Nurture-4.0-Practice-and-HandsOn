
import './App.css';
import Blog from './components/BlogDetails';
import Book from './components/BookDetails';
import Course from './components/CourseDetails';

function App() {
  const bookDetails = [
  { id: 101, bname: "Rings of Fire", price: 400 },
  { id: 102, bname: "JavaScript Essentials", price: 550 },
  { id: 103, bname: "The Clean Coder", price: 620 }
];

const blogDetails = [
  { id: 201, bname: "React Learning", blogBy: "Stepen", blogMatter: "Welcome to React" },
  { id: 202, bname: "Understanding JS", blogBy: "Alex", blogMatter: "Deep dive into closures" },
  { id: 203, bname: "Web Dev Trends", blogBy: "Maria", blogMatter: "Latest in Frontend" }
];

const courseDetails = [
  { id: 301, cname: "Angular", cdate: "4/5/2021" },
  { id: 302, cname: "ReactJS", cdate: "6/10/2021" },
  { id: 303, cname: "VueJS", cdate: "12/1/2022" }
];

const showCourse = true;
const showBook = true;
const showBlog = true;
const DisplayCourse = () => <div>
        <h1>Course Details</h1>
        <Course courseDetails={courseDetails}/>
      </div>

const DisplayBook = () => <div>
        <h1>Book Details</h1>
        <Book bookDetails={bookDetails}/>
      </div>

const DisplayBlog = () => <div>
        <h1>Blog Details</h1>
        <Blog blogDetails={blogDetails}/>
      </div>

  return (
    <div className="full_outer_div">
      {showCourse && <DisplayCourse />}
      {showBook && <DisplayBook />}
      {showBlog && <DisplayBlog />}
    </div>
);

}

export default App;
