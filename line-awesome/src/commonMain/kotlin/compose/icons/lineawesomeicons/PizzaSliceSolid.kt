package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.PizzaSliceSolid: ImageVector
    get() {
        if (_pizzaSliceSolid != null) {
            return _pizzaSliceSolid!!
        }
        _pizzaSliceSolid = Builder(name = "PizzaSliceSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.375f, 3.8125f)
                lineTo(12.0625f, 4.6563f)
                lineTo(4.0625f, 26.5625f)
                lineTo(3.8438f, 27.1563f)
                lineTo(4.8438f, 28.1563f)
                lineTo(5.4375f, 27.9375f)
                lineTo(27.3438f, 19.9375f)
                lineTo(28.1875f, 19.625f)
                lineTo(27.9688f, 18.75f)
                curveTo(27.9688f, 18.75f, 26.5586f, 13.1211f, 22.7188f, 9.2813f)
                curveTo(18.8789f, 5.4414f, 13.25f, 4.0313f, 13.25f, 4.0313f)
                close()
                moveTo(13.5938f, 6.2813f)
                curveTo(14.7305f, 6.6328f, 18.4297f, 7.8672f, 21.2813f, 10.7188f)
                curveTo(24.1328f, 13.5703f, 25.3672f, 17.2695f, 25.7188f, 18.4063f)
                lineTo(24.1875f, 18.9688f)
                curveTo(24.0859f, 18.5664f, 23.9648f, 18.0977f, 23.75f, 17.5625f)
                curveTo(23.1406f, 16.0508f, 22.0039f, 14.0664f, 19.9688f, 12.0313f)
                curveTo(17.9336f, 9.9961f, 15.9492f, 8.8906f, 14.4375f, 8.2813f)
                curveTo(13.8984f, 8.0664f, 13.4375f, 7.9219f, 13.0313f, 7.8125f)
                close()
                moveTo(12.375f, 9.6875f)
                curveTo(12.7109f, 9.7773f, 13.1406f, 9.9063f, 13.6875f, 10.125f)
                curveTo(14.9766f, 10.6445f, 16.7344f, 11.6094f, 18.5625f, 13.4375f)
                curveTo(19.0977f, 13.9727f, 19.5391f, 14.4883f, 19.9375f, 15.0f)
                curveTo(18.8633f, 15.0352f, 18.0f, 15.918f, 18.0f, 17.0f)
                curveTo(18.0f, 18.1055f, 18.8945f, 19.0f, 20.0f, 19.0f)
                curveTo(20.7383f, 19.0f, 21.3711f, 18.5977f, 21.7188f, 18.0f)
                curveTo(21.7617f, 18.1016f, 21.8359f, 18.2148f, 21.875f, 18.3125f)
                curveTo(22.1016f, 18.875f, 22.2227f, 19.3203f, 22.3125f, 19.6563f)
                lineTo(12.3125f, 23.2813f)
                curveTo(12.0586f, 22.8125f, 11.5703f, 22.5f, 11.0f, 22.5f)
                curveTo(10.1719f, 22.5f, 9.5f, 23.1719f, 9.5f, 24.0f)
                curveTo(9.5f, 24.1055f, 9.5117f, 24.2148f, 9.5313f, 24.3125f)
                lineTo(6.625f, 25.375f)
                lineTo(10.125f, 15.7813f)
                curveTo(10.3906f, 15.9102f, 10.6836f, 16.0f, 11.0f, 16.0f)
                curveTo(12.1055f, 16.0f, 13.0f, 15.1055f, 13.0f, 14.0f)
                curveTo(13.0f, 13.0664f, 12.3633f, 12.2852f, 11.5f, 12.0625f)
                close()
                moveTo(14.0f, 17.5f)
                curveTo(13.1719f, 17.5f, 12.5f, 18.1719f, 12.5f, 19.0f)
                curveTo(12.5f, 19.8281f, 13.1719f, 20.5f, 14.0f, 20.5f)
                curveTo(14.8281f, 20.5f, 15.5f, 19.8281f, 15.5f, 19.0f)
                curveTo(15.5f, 18.1719f, 14.8281f, 17.5f, 14.0f, 17.5f)
                close()
            }
        }
        .build()
        return _pizzaSliceSolid!!
    }

private var _pizzaSliceSolid: ImageVector? = null
