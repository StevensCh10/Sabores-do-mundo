export function SectionHero() {
  return (
    <section className="bg-bannerImg bg-cover bg-bottom">
      <div className="flex flex-col items-center justify-center text-center py-20">
        <h1 className="text-6xl font-serif italic mb-4">
          A melhor <br /> comida para <br /> seu gosto
        </h1>

        <small className="text-lg text-gray-600 mb-8">
          Descubra uma culinária deliciosa e momentos <br /> inesquecíveis em
          nosso acolhedor refúgio culinário.
        </small>

        <div className="flex space-x-4">
          <button className="px-6 py-4 bg-red-500 text-white font-bold rounded-full transform transition duration-300 hover:scale-105">
            Reserve uma mesa
          </button>
          <button className="border-2 border-black font-bold px-6 py-4 rounded-full transform transition duration-300 hover:scale-110">
            Explorar cardápio
          </button>
        </div>
      </div>
    </section>
  );
}
