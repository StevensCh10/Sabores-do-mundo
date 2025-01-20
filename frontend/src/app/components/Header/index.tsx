import Link from "next/link";
import { GridContainer } from "../GridContainer";
import { FiPhone, FiMail } from "react-icons/fi";
import Image from "next/image";

export function Header() {
  return (
    <header>
      <div className="sticky top-0 w-full bg-gray-100 border-b border-b-gray-100 z-50 py-3">
        <GridContainer className="flex justify-between items-center">
          <div className="flex items-center space-x-8 text-white-100">
            <div className="flex items-center space-x-2 hover:underline cursor-pointer">
              <FiPhone />
              <p>(11) 99992-2224</p>
            </div>

            <div className="flex items-center space-x-2 hover:underline cursor-pointer">
              <FiMail />
              <p>saboresdomundo@gmail.com</p>
            </div>
          </div>

          <div className="flex  space-x-4">
            <div className="w-8 h-8 rounded-full bg-gray-200 flex items-center justify-center transition-transform duration-300 hover:scale-110 cursor-pointer">
              <Image src="/twitter.svg" width={15} height={15} alt="Twitter" />
            </div>
            <div className="w-8 h-8 rounded-full bg-gray-200 flex items-center justify-center transition-transform duration-300 hover:scale-110 cursor-pointer">
              <Image
                src="/facebook.svg"
                width={15}
                height={15}
                alt="Facebook"
              />
            </div>
            <div className="w-8 h-8 rounded-full bg-gray-200 flex items-center justify-center transition-transform duration-300 hover:scale-110 cursor-pointer">
              <Image
                src="/instagram.svg"
                width={15}
                height={15}
                alt="Instagram"
              />
            </div>
            <div className="w-8 h-8 rounded-full bg-gray-200 flex items-center justify-center transition-transform duration-300 hover:scale-110 cursor-pointer">
              <Image src="/github.svg" width={15} height={15} alt="GitHub" />
            </div>
          </div>
        </GridContainer>
      </div>

      <GridContainer className="flex justify-between items-center p-4 border-b-white-100">
        <div className="flex items-center space-x-4">
          <Image src="/logo.svg" width={55} height={55} alt="Logo" />
          <p className="text-4xl font-sans italic text-gray-100">Sabores do Mundo</p>
        </div>

        <div className="flex items-center space-x-8 ">
          <nav className="flex space-x-4">
            <Link
              href="/"
              className="hover:bg-gray-300 hover:rounded-full px-3 py-2 transition duration-300"
            >
              Home
            </Link>
            <Link
              href="/"
              className="hover:bg-gray-300 hover:rounded-full px-3 py-2 transition duration-300"
            >
              Cardápio
            </Link>
            <Link
              href="/"
              className="hover:bg-gray-300 hover:rounded-full px-3 py-2 transition duration-300"
            >
              Reservas
            </Link>
            <Link
              href="/about"
              className="hover:bg-gray-300 hover:rounded-full px-3 py-2 transition duration-300"
            >
              Sobre nós
            </Link>
            <Link
              href="/about"
              className="hover:bg-gray-300 hover:rounded-full px-3 py-2 transition duration-300"
            >
              Contato
            </Link>
          </nav>
          <button className="border-2 border-black font-bold px-6 py-2 rounded-full hover:bg-gray-300 transition duration-300">
            Reserve uma mesa
          </button>
        </div>
      </GridContainer>
    </header>
  );
}
