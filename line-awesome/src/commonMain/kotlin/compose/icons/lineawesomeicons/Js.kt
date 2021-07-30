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

public val LineAwesomeIcons.Js: ImageVector
    get() {
        if (_js != null) {
            return _js!!
        }
        _js = Builder(name = "Js", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth =
                32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.0f)
                lineTo(0.0f, 25.0f)
                lineTo(32.0f, 25.0f)
                lineTo(32.0f, 7.0f)
                close()
                moveTo(2.0f, 9.0f)
                lineTo(30.0f, 9.0f)
                lineTo(30.0f, 23.0f)
                lineTo(2.0f, 23.0f)
                close()
                moveTo(12.0f, 12.0f)
                lineTo(12.0f, 17.5f)
                curveTo(12.0f, 17.7148f, 11.7148f, 18.0f, 11.5f, 18.0f)
                curveTo(11.2852f, 18.0f, 11.0f, 17.7148f, 11.0f, 17.5f)
                lineTo(11.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                lineTo(9.0f, 17.5f)
                curveTo(9.0f, 18.8828f, 10.1172f, 20.0f, 11.5f, 20.0f)
                curveTo(12.8828f, 20.0f, 14.0f, 18.8828f, 14.0f, 17.5f)
                lineTo(14.0f, 12.0f)
                close()
                moveTo(18.5f, 12.0f)
                curveTo(17.1172f, 12.0f, 16.0f, 13.1172f, 16.0f, 14.5f)
                curveTo(16.0f, 15.8828f, 17.1172f, 17.0f, 18.5f, 17.0f)
                curveTo(18.7148f, 17.0f, 19.0f, 17.2852f, 19.0f, 17.5f)
                curveTo(19.0f, 17.8008f, 18.8828f, 18.0f, 18.5f, 18.0f)
                curveTo(18.1328f, 18.0f, 18.0742f, 17.9219f, 18.0625f, 17.9063f)
                curveTo(18.0508f, 17.8906f, 18.0f, 17.8281f, 18.0f, 17.5938f)
                lineTo(16.0f, 17.5938f)
                curveTo(16.0f, 18.1602f, 16.1641f, 18.7969f, 16.625f, 19.2813f)
                curveTo(17.0859f, 19.7656f, 17.7695f, 20.0f, 18.5f, 20.0f)
                curveTo(19.918f, 20.0f, 21.0f, 18.8008f, 21.0f, 17.5f)
                curveTo(21.0f, 16.1172f, 19.8828f, 15.0f, 18.5f, 15.0f)
                curveTo(18.2852f, 15.0f, 18.0f, 14.7148f, 18.0f, 14.5f)
                curveTo(18.0f, 14.2852f, 18.2852f, 14.0f, 18.5f, 14.0f)
                curveTo(18.7656f, 14.0f, 18.8477f, 14.0625f, 18.9063f, 14.125f)
                curveTo(18.9648f, 14.1875f, 19.0f, 14.293f, 19.0f, 14.4063f)
                lineTo(21.0f, 14.4063f)
                curveTo(21.0f, 13.8164f, 20.7852f, 13.2148f, 20.3438f, 12.75f)
                curveTo(19.9023f, 12.2852f, 19.2344f, 12.0f, 18.5f, 12.0f)
                close()
            }
        }
        .build()
        return _js!!
    }

private var _js: ImageVector? = null
