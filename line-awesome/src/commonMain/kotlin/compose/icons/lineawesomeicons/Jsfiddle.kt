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

public val LineAwesomeIcons.Jsfiddle: ImageVector
    get() {
        if (_jsfiddle != null) {
            return _jsfiddle!!
        }
        _jsfiddle = Builder(name = "Jsfiddle", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.9922f, 14.3477f)
                curveTo(25.9102f, 9.7227f, 22.1406f, 6.0f, 17.5f, 6.0f)
                curveTo(14.0273f, 6.0f, 11.043f, 8.0859f, 9.7266f, 11.0742f)
                curveTo(9.4883f, 11.0313f, 9.2461f, 11.0f, 9.0f, 11.0f)
                curveTo(6.8594f, 11.0f, 5.1289f, 12.6836f, 5.0195f, 14.7969f)
                curveTo(3.2188f, 15.832f, 2.0f, 17.7734f, 2.0f, 20.0f)
                curveTo(2.0f, 23.3125f, 4.6875f, 26.0f, 8.0f, 26.0f)
                lineTo(24.0f, 26.0f)
                curveTo(27.3125f, 26.0f, 30.0f, 23.3125f, 30.0f, 20.0f)
                curveTo(30.0f, 17.3867f, 28.3242f, 15.168f, 25.9922f, 14.3477f)
                close()
                moveTo(20.8906f, 23.0f)
                curveTo(18.9766f, 23.0f, 17.1445f, 21.3555f, 15.375f, 19.7656f)
                curveTo(13.8633f, 18.4063f, 12.3008f, 17.0f, 11.1094f, 17.0f)
                curveTo(9.9258f, 17.0f, 9.0f, 17.8789f, 9.0f, 19.0f)
                curveTo(9.0f, 20.0859f, 9.9688f, 21.0f, 11.1094f, 21.0f)
                curveTo(12.0977f, 21.0f, 12.9883f, 20.5898f, 13.8398f, 19.7422f)
                lineTo(15.25f, 21.1563f)
                curveTo(14.0234f, 22.3828f, 12.6328f, 23.0f, 11.1094f, 23.0f)
                curveTo(8.8438f, 23.0f, 7.0f, 21.207f, 7.0f, 19.0f)
                curveTo(7.0f, 16.793f, 8.8438f, 15.0f, 11.1094f, 15.0f)
                curveTo(13.0664f, 15.0f, 14.9219f, 16.6641f, 16.7109f, 18.2773f)
                curveTo(18.1992f, 19.6133f, 19.7422f, 21.0f, 20.8867f, 21.0f)
                curveTo(22.0547f, 21.0f, 23.0f, 20.1016f, 23.0f, 19.0f)
                curveTo(23.0f, 17.8789f, 22.0742f, 17.0f, 20.8906f, 17.0f)
                curveTo(19.5352f, 17.0f, 18.3281f, 17.9023f, 18.0117f, 18.2188f)
                lineTo(16.5977f, 16.8086f)
                curveTo(16.668f, 16.7344f, 18.4258f, 15.0f, 20.8906f, 15.0f)
                curveTo(23.1563f, 15.0f, 25.0f, 16.793f, 25.0f, 19.0f)
                curveTo(25.0f, 21.207f, 23.1563f, 23.0f, 20.8906f, 23.0f)
                close()
            }
        }
        .build()
        return _jsfiddle!!
    }

private var _jsfiddle: ImageVector? = null
