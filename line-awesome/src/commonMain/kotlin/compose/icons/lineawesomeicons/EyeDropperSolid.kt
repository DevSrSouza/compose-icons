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

public val LineAwesomeIcons.EyeDropperSolid: ImageVector
    get() {
        if (_eyeDropperSolid != null) {
            return _eyeDropperSolid!!
        }
        _eyeDropperSolid = Builder(name = "EyeDropperSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.6563f, 3.0313f)
                curveTo(23.5469f, 3.0313f, 22.4336f, 3.4414f, 21.5938f, 4.2813f)
                lineTo(18.8125f, 7.0938f)
                lineTo(17.8125f, 6.0938f)
                lineTo(16.4063f, 7.5f)
                lineTo(17.4063f, 8.5f)
                lineTo(7.9063f, 18.0f)
                curveTo(6.8672f, 19.0391f, 6.2734f, 19.793f, 5.9063f, 20.4688f)
                curveTo(5.5391f, 21.1445f, 5.4102f, 21.7539f, 5.3438f, 22.1563f)
                curveTo(5.2773f, 22.5586f, 5.2422f, 22.7773f, 5.0f, 23.2188f)
                curveTo(4.7578f, 23.6602f, 4.2656f, 24.2969f, 3.2813f, 25.2813f)
                lineTo(2.5938f, 26.0f)
                lineTo(3.2813f, 26.7188f)
                lineTo(5.2813f, 28.7188f)
                lineTo(6.0f, 29.4063f)
                lineTo(6.7188f, 28.7188f)
                curveTo(7.6797f, 27.7578f, 8.293f, 27.293f, 8.7188f, 27.0625f)
                curveTo(9.1445f, 26.832f, 9.3711f, 26.7891f, 9.7813f, 26.7188f)
                curveTo(10.1914f, 26.6484f, 10.7813f, 26.5352f, 11.4688f, 26.1563f)
                curveTo(12.1563f, 25.7773f, 12.9375f, 25.1563f, 14.0f, 24.0938f)
                lineTo(23.5f, 14.5938f)
                lineTo(24.5f, 15.5938f)
                lineTo(25.9063f, 14.1875f)
                lineTo(24.9063f, 13.1875f)
                lineTo(27.7188f, 10.4063f)
                curveTo(29.3984f, 8.7266f, 29.3984f, 5.9609f, 27.7188f, 4.2813f)
                curveTo(26.8789f, 3.4414f, 25.7656f, 3.0313f, 24.6563f, 3.0313f)
                close()
                moveTo(24.6563f, 5.0313f)
                curveTo(25.2461f, 5.0313f, 25.8203f, 5.2578f, 26.2813f, 5.7188f)
                curveTo(27.1992f, 6.6367f, 27.1992f, 8.082f, 26.2813f, 9.0f)
                lineTo(23.5f, 11.7813f)
                lineTo(20.2188f, 8.5f)
                lineTo(23.0f, 5.7188f)
                curveTo(23.4609f, 5.2578f, 24.0664f, 5.0313f, 24.6563f, 5.0313f)
                close()
                moveTo(18.8125f, 9.9063f)
                lineTo(22.0938f, 13.1875f)
                lineTo(12.5938f, 22.6875f)
                curveTo(11.6094f, 23.6719f, 10.9414f, 24.1641f, 10.5f, 24.4063f)
                curveTo(10.0586f, 24.6484f, 9.8398f, 24.6836f, 9.4375f, 24.75f)
                curveTo(9.0352f, 24.8164f, 8.457f, 24.9141f, 7.7813f, 25.2813f)
                curveTo(7.3203f, 25.5313f, 6.6953f, 26.1289f, 6.0938f, 26.6563f)
                lineTo(5.3438f, 25.9063f)
                curveTo(5.8906f, 25.2891f, 6.4922f, 24.6563f, 6.75f, 24.1875f)
                curveTo(7.1289f, 23.5f, 7.2422f, 22.8789f, 7.3125f, 22.4688f)
                curveTo(7.3828f, 22.0586f, 7.4258f, 21.8633f, 7.6563f, 21.4375f)
                curveTo(7.8867f, 21.0117f, 8.3516f, 20.3672f, 9.3125f, 19.4063f)
                close()
            }
        }
        .build()
        return _eyeDropperSolid!!
    }

private var _eyeDropperSolid: ImageVector? = null
