import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FfondopantallaComponent } from './ffondopantalla.component';

describe('FfondopantallaComponent', () => {
  let component: FfondopantallaComponent;
  let fixture: ComponentFixture<FfondopantallaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FfondopantallaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FfondopantallaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
