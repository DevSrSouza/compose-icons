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

public val LineAwesomeIcons.QuestionSolid: ImageVector
    get() {
        if (_questionSolid != null) {
            return _questionSolid!!
        }
        _questionSolid = Builder(name = "QuestionSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(11.6719f, 4.0f, 8.0f, 7.0547f, 8.0f, 11.0f)
                lineTo(8.0f, 14.0f)
                lineTo(14.0f, 14.0f)
                lineTo(14.0f, 11.0f)
                curveTo(14.0f, 10.8516f, 14.0898f, 10.6367f, 14.4375f, 10.4063f)
                curveTo(14.7852f, 10.1758f, 15.3516f, 10.0f, 16.0f, 10.0f)
                curveTo(16.6523f, 10.0f, 17.2188f, 10.1758f, 17.5625f, 10.4063f)
                curveTo(17.9063f, 10.6367f, 18.0f, 10.8359f, 18.0f, 11.0f)
                curveTo(18.0f, 11.5781f, 17.8125f, 11.9805f, 17.4375f, 12.4375f)
                curveTo(17.0625f, 12.8945f, 16.4805f, 13.3672f, 15.8438f, 13.9063f)
                curveTo(14.5664f, 14.9883f, 13.0f, 16.4961f, 13.0f, 19.0f)
                lineTo(13.0f, 20.0f)
                lineTo(19.0f, 20.0f)
                lineTo(19.0f, 19.0f)
                curveTo(19.0f, 18.6602f, 19.125f, 18.4219f, 19.5f, 18.0313f)
                curveTo(19.875f, 17.6406f, 20.4961f, 17.1797f, 21.1563f, 16.625f)
                curveTo(22.4766f, 15.5156f, 24.0f, 13.8164f, 24.0f, 11.0f)
                curveTo(24.0f, 7.0898f, 20.3359f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(19.3945f, 6.0f, 22.0f, 8.3672f, 22.0f, 11.0f)
                curveTo(22.0f, 13.1445f, 21.0234f, 14.1016f, 19.8438f, 15.0938f)
                curveTo(19.2539f, 15.5898f, 18.625f, 16.0742f, 18.0625f, 16.6563f)
                curveTo(17.7148f, 17.0156f, 17.4453f, 17.4844f, 17.25f, 18.0f)
                lineTo(15.3125f, 18.0f)
                curveTo(15.625f, 16.9883f, 16.2344f, 16.2188f, 17.1563f, 15.4375f)
                curveTo(17.7695f, 14.9219f, 18.4375f, 14.3828f, 19.0f, 13.6875f)
                curveTo(19.5625f, 12.9922f, 20.0f, 12.082f, 20.0f, 11.0f)
                curveTo(20.0f, 10.0391f, 19.4297f, 9.2422f, 18.6875f, 8.75f)
                curveTo(17.9453f, 8.2578f, 17.0039f, 8.0f, 16.0f, 8.0f)
                curveTo(14.9922f, 8.0f, 14.0508f, 8.2578f, 13.3125f, 8.75f)
                curveTo(12.5742f, 9.2422f, 12.0f, 10.043f, 12.0f, 11.0f)
                lineTo(12.0f, 12.0f)
                lineTo(10.0f, 12.0f)
                lineTo(10.0f, 11.0f)
                curveTo(10.0f, 8.3164f, 12.5977f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(13.0f, 22.0f)
                lineTo(13.0f, 28.0f)
                lineTo(19.0f, 28.0f)
                lineTo(19.0f, 22.0f)
                close()
                moveTo(15.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 26.0f)
                lineTo(15.0f, 26.0f)
                close()
            }
        }
        .build()
        return _questionSolid!!
    }

private var _questionSolid: ImageVector? = null
