try:
    from tkinter import *
except:
    from Tkinter import *

class tel3:
    def Tel3():
        root3 = Tk()
        menubar = Menu(root3)

        root3.geometry("500x500")
        root3.title("Prioritizer | Cotação")
        root3.configure(background='#b3ccff')


        frameCima = Frame(root3, width=477, height=400, bd=7, relief="raise",pady=10,padx=10, bg=["#fff"])
        frameCima.pack(side=TOP)
        labelFinal = Label(frameCima, text="Insira seu capital em reais", width=30, font=('arial', 11, 'bold'))
        labelFinal.place(x=110, y=0)


        botaoBack = Button(frameCima,width=10, height=2, text="Dolar", font=('arial', 11, 'bold'))
        botaoBack.place(x=290, y=30)

        
        


        labelCreated = Label(root3, font=('arial',9, 'bold'), text="CREATED BY: CHAMELEON", width=20, height=2, bd=1, relief="raise")
        labelCreated.pack(side=BOTTOM, fill=X)

        labelFinal = Label(frameCima, text="Seu capital", width=20)
        labelFinal.place(x=138, y=150)

        entraCap = Entry(frameCima, width=17)
        entraCap.place(x=150, y=180)



        

        labelFinal = Label(frameCima, font=('arial',14, 'bold'), text="Resultado", width=27, height=2, bd=1, relief="raise")
        labelFinal.place(x=70, y=300)

        def cotacaoEuro():
            if(str(entraCap.get()).isnumeric()):
                numero = float(entraCap.get())

                converter = numero / 4.41
        
                labelFinal["text"] = converter


        botaoEuro = Button(frameCima,width=10, height=2, text="Euro", command=cotacaoEuro, font=('arial', 11, 'bold'))
        botaoEuro.place(x=50, y=30)


        def cotacaoDolar():
            if(str(entraCap.get()).isnumeric()):
                numero = float(entraCap.get())

                converter = numero / 3.92
        
                labelFinal["text"] = converter






        botaoDolar = Button(frameCima,width=10, height=2, text="Dolar", command=cotacaoDolar, font=('arial', 11, 'bold'))
        botaoDolar.place(x=290, y=30)


        def cotacaoBitcoin():
            if(str(entraCap.get()).isnumeric()):
                numero = float(entraCap.get())

                converter = numero / 15.979,45
        
                labelFinal["text"] = converter





        botaoCotacao = Button(frameCima,width=10, height=2, text="Bitcoin", command=cotacaoBitcoin, font=('arial', 11, 'bold'))
        botaoCotacao.place(x=170, y=30)


        frameBaixo = Frame(root3, width=200, height=100, bd=1, relief="raise",pady=3,padx=3, bg=["#ccc"])
        frameBaixo.pack(side=BOTTOM, fill=X)

        def sair():
            root3.destroy()
            

        botaoSair = Button(frameBaixo,width=10, height=2, text="Sair", command=sair, font=('arial', 11, 'bold'),bg=["#fff"])
        botaoSair.place(x=50, y=10)
        



        
            



        root3.mainloop()

    Tel3()





    

 
