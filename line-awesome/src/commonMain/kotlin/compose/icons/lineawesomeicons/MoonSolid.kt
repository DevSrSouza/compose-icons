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

public val LineAwesomeIcons.MoonSolid: ImageVector
    get() {
        if (_moonSolid != null) {
            return _moonSolid!!
        }
        _moonSolid = Builder(name = "MoonSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                lineTo(7.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(20.2813f, 7.9375f)
                lineTo(18.625f, 8.0f)
                curveTo(13.2813f, 8.1914f, 9.0f, 12.5781f, 9.0f, 17.9688f)
                curveTo(9.0f, 23.4805f, 13.4883f, 27.9688f, 19.0f, 27.9688f)
                curveTo(24.3906f, 27.9688f, 28.7773f, 23.6875f, 28.9688f, 18.3438f)
                lineTo(29.0313f, 16.7188f)
                lineTo(27.5625f, 17.4063f)
                curveTo(26.7813f, 17.7773f, 25.9141f, 17.9688f, 25.0f, 17.9688f)
                curveTo(21.6758f, 17.9688f, 19.0f, 15.293f, 19.0f, 11.9688f)
                curveTo(19.0f, 11.0547f, 19.2227f, 10.2188f, 19.5938f, 9.4375f)
                close()
                moveTo(17.375f, 10.3125f)
                curveTo(17.25f, 10.8672f, 17.0f, 11.375f, 17.0f, 11.9688f)
                curveTo(17.0f, 16.375f, 20.5938f, 19.9688f, 25.0f, 19.9688f)
                curveTo(25.6055f, 19.9688f, 26.1211f, 19.7227f, 26.6875f, 19.5938f)
                curveTo(25.9258f, 23.2188f, 22.8594f, 25.9688f, 19.0f, 25.9688f)
                curveTo(14.5703f, 25.9688f, 11.0f, 22.3984f, 11.0f, 17.9688f)
                curveTo(11.0f, 14.1172f, 13.7578f, 11.082f, 17.375f, 10.3125f)
                close()
            }
        }
        .build()
        return _moonSolid!!
    }

private var _moonSolid: ImageVector? = null
