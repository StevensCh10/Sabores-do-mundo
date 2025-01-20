import Image from "next/image";
import { GridContainer } from "../GridContainer";
import { FiPhone, FiMail, FiMapPin } from "react-icons/fi";

export function SectionAboutUs() {
  return (
    <section className="bg-white-100">
      <GridContainer>
        <div className="relative">
          <div className="flex items-center space-x-14 py-20">
            <Image
              src="carne.svg"
              alt="Carne"
              width={663}
              height={631}
              className="rounded-lg"
            />

            <div className="flex flex-col space-y-4">
              <h3 className="flex flex-col items-center text-6xl font-serif">
                Venha conhecer um pouco da gente!
              </h3>

              <p className="text-gray-600">
                O Sabores do Mundo é mais do que um restaurante; é um convite
                para explorar a riqueza culinária de diferentes culturas.
                Inspirados pelas tradições gastronômicas globais, criamos um
                ambiente onde cada refeição é uma viagem única, repleta de
                aromas, sabores e histórias que conectam pessoas de todos os
                cantos do mundo.
              </p>

              <small className="text-gray-500">
                Nosso compromisso começa na escolha dos melhores ingredientes,
                que são cuidadosamente selecionados para garantir autenticidade
                e qualidade em cada prato. Nossa equipe apaixonada e acolhedora
                se dedica a proporcionar uma experiência memorável, seja você um
                explorador de novos sabores ou um apaixonado por receitas
                tradicionais.
              </small>
            </div>
          </div>

          <div className="absolute top-3/4 left-1/4 transform -translate-y-1/2 bg-gray-100 text-white p-10 rounded-lg shadow-md w-80">
            <h5 className="text-xl font-semibold mb-4">Venha nos visitar</h5>

            <div className="flex items-center space-x-2 mb-4 hover:underline cursor-pointer">
              <FiPhone className="text-white" />
              <p>(11) 99992-2224</p>
            </div>

            <div className="flex items-center space-x-2 mb-4 hover:underline cursor-pointer">
              <FiMail className="text-white" />
              <p>saboresdomundo@gmail.com</p>
            </div>

            <div className="flex items-center space-x-2 hover:underline cursor-pointer">
              <FiMapPin className="text-white" />
              <p>Rua do malote. Av Malote Brabo 146</p>
            </div>
          </div>
        </div>
      </GridContainer>
    </section>
  );
}
