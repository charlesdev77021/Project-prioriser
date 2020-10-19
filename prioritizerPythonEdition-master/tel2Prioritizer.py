# -*- coding:UTF-8 -*-

try:
    from tkinter import *
except:
    from Tkinter import *


def telaPrioritizer():
    root2 = Tk()
    menubar = Menu(root2)

    root2.geometry("500x500")
    root2.title("Prioritizer")
    root2.configure(background='#b3ccff')



    frameCima = Frame(root2, width=477, height=400, bd=7, relief="raise",pady=10,padx=10, bg=["#fff"])
    frameCima.pack(side=TOP)

    labelUm = Label(frameCima, text="Água", width=5, height=1)
    labelUm.grid(row=0,column=0)

    labelDois = Label(frameCima, text="Luz", width=20, height=1)
    labelDois.grid(row=1,column=0)

    labelTres = Label(frameCima, text="Telefone", width=20, height=1)
    labelTres.grid(row=2,column=0)

    labelQuatro = Label(frameCima, text="Aluguel", width=20, height=1)
    labelQuatro.grid(row=3,column=0)

    labelCinco = Label(frameCima, text="Alimentação", width=20, height=1)
    labelCinco.grid(row=4,column=0)

    labelSeis = Label(frameCima, text="Escola", width=20, height=1)
    labelSeis.grid(row=5,column=0)

    labelSete = Label(frameCima, text="Plano de saude", width=20, height=1)
    labelSete.grid(row=6,column=0)

    labelOito = Label(frameCima, text="Trasporte", width=20, height=1)
    labelOito.grid(row=7,column=0)

    labelNove = Label(frameCima, text="Lazer", width=20, height=1)
    labelNove.grid(row=8,column=0)

    labelDez = Label(frameCima, text="Outro", width=20, height=1)
    labelDez.grid(row=9,column=0)


    labelCapital = Label(frameCima, text="Seu capital: ", width=10, height=1)
    labelCapital.grid(row=1,column=4)



    entry = Entry(frameCima, width=10)
    entry.grid(row=0,column=1)

    entry2 = Entry(frameCima, width=10)
    entry2.grid(row=1,column=1)

    entry3 = Entry(frameCima, width=10)
    entry3.grid(row=2,column=1)

    entry4 = Entry(frameCima, width=10)
    entry4.grid(row=3,column=1)

    entry5 = Entry(frameCima, width=10)
    entry5.grid(row=4,column=1)

    entry6 = Entry(frameCima, width=10)
    entry6.grid(row=5,column=1)

    entry7 = Entry(frameCima, width=10)
    entry7.grid(row=6,column=1)

    entry8 = Entry(frameCima, width=10)
    entry8.grid(row=7,column=1)

    entry9 = Entry(frameCima, width=10)
    entry9.grid(row=8,column=1)


    entry10 = Entry(frameCima, width=10)
    entry10.grid(row=9,column=1)

    entryCap = Entry(frameCima, width=10)
    entryCap.grid(row=2,column=4)




    

    labelResult = Label(frameCima, text="Resultado: ", width=20, height=1)
    labelResult.grid(row=7,column=4)


    def calculo():
        try:
            
            if(str(entry.get()).isnumeric()) and str(entry2.get()).isnumeric() and str(entry3.get()).isnumeric() and str(entry4.get()).isnumeric() and str(entry5.get()).isnumeric() and str(entry6.get()).isnumeric() and str(entry7.get()).isnumeric() and str(entry8.get()).isnumeric() and str(entry9.get()).isnumeric():
                
                num1 = float(entry.get())
                num2 = float(entry2.get())
                num3 = float(entry3.get())
                num4 = float(entry4.get())
                num5 = float(entry5.get())
                num6 = float(entry6.get())
                num7 = float(entry7.get())
                num8 = float(entry8.get())
                num9 = float(entry9.get())

                numCap = float(entryCap.get())




                numFinal = (numCap) - (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9) -1

                
                labelResult["text"] = numFinal
            else:
                labelResult["text"] = "Ruim"
        except:
            labelResult["text"] = "Valores incorretos"


           



    botaoPrioritizerr = Button(frameCima, width=5, height=1, text="Prioritizer", command=calculo, font=('arial', 9, 'bold'))
    botaoPrioritizerr.grid(row=5, column=4)
        


    labelCreated = Label(root2, font=('arial',9, 'bold'), text="CREATED BY: CHAMELEON", width=20, height=2, bd=1, relief="raise")
    labelCreated.pack(side=BOTTOM, fill=X)


    frameBaixo = Frame(root2, width=200, height=100, bd=1, relief="raise",pady=3,padx=3, bg=["#ccc"])
    frameBaixo.pack(side=BOTTOM, fill=X)

    def sair():
        root2.destroy()
        

    botaoSair = Button(frameBaixo,width=10, height=2, text="Sair", command=sair, font=('arial', 11, 'bold'),bg=["#fff"])
    botaoSair.place(x=50, y=10)


    root2.mainloop()

telaPrioritizer()
