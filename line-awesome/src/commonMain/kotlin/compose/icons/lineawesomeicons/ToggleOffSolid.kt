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

public val LineAwesomeIcons.ToggleOffSolid: ImageVector
    get() {
        if (_toggleOffSolid != null) {
            return _toggleOffSolid!!
        }
        _toggleOffSolid = Builder(name = "ToggleOffSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                curveTo(8.3789f, 7.0f, 7.7734f, 7.0664f, 7.1875f, 7.1875f)
                curveTo(6.8945f, 7.2461f, 6.5938f, 7.3203f, 6.3125f, 7.4063f)
                curveTo(3.793f, 8.2031f, 1.7422f, 10.0859f, 0.7188f, 12.5f)
                curveTo(0.6055f, 12.7695f, 0.4922f, 13.0313f, 0.4063f, 13.3125f)
                curveTo(0.1367f, 14.1641f, 0.0f, 15.0586f, 0.0f, 16.0f)
                curveTo(0.0f, 16.9297f, 0.1445f, 17.8125f, 0.4063f, 18.6563f)
                curveTo(0.4102f, 18.6641f, 0.4023f, 18.6797f, 0.4063f, 18.6875f)
                curveTo(1.2031f, 21.207f, 3.0859f, 23.2578f, 5.5f, 24.2813f)
                curveTo(5.7695f, 24.3945f, 6.0313f, 24.5078f, 6.3125f, 24.5938f)
                curveTo(7.1641f, 24.8633f, 8.0586f, 25.0f, 9.0f, 25.0f)
                lineTo(23.0f, 25.0f)
                curveTo(27.957f, 25.0f, 32.0f, 20.957f, 32.0f, 16.0f)
                curveTo(32.0f, 11.043f, 27.957f, 7.0f, 23.0f, 7.0f)
                close()
                moveTo(9.0f, 9.0f)
                curveTo(12.8789f, 9.0f, 16.0f, 12.1211f, 16.0f, 16.0f)
                curveTo(16.0f, 19.8789f, 12.8789f, 23.0f, 9.0f, 23.0f)
                curveTo(5.1211f, 23.0f, 2.0f, 19.8789f, 2.0f, 16.0f)
                curveTo(2.0f, 15.7578f, 2.0078f, 15.5156f, 2.0313f, 15.2813f)
                curveTo(2.3867f, 11.7422f, 5.3633f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(14.625f, 9.0f)
                lineTo(23.0f, 9.0f)
                curveTo(26.8789f, 9.0f, 30.0f, 12.1211f, 30.0f, 16.0f)
                curveTo(30.0f, 19.8789f, 26.8789f, 23.0f, 23.0f, 23.0f)
                lineTo(14.625f, 23.0f)
                curveTo(16.6758f, 21.3477f, 18.0f, 18.8281f, 18.0f, 16.0f)
                curveTo(18.0f, 13.1719f, 16.6758f, 10.6523f, 14.625f, 9.0f)
                close()
            }
        }
        .build()
        return _toggleOffSolid!!
    }

private var _toggleOffSolid: ImageVector? = null
