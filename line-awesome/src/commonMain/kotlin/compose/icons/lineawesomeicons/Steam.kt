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

public val LineAwesomeIcons.Steam: ImageVector
    get() {
        if (_steam != null) {
            return _steam!!
        }
        _steam = Builder(name = "Steam", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(10.891f, 27.0f, 6.599f, 23.494f, 5.367f, 18.766f)
                lineTo(9.033f, 20.336f)
                curveTo(9.202f, 21.833f, 10.458f, 23.0f, 12.0f, 23.0f)
                curveTo(13.657f, 23.0f, 15.0f, 21.657f, 15.0f, 20.0f)
                curveTo(15.0f, 19.968f, 14.991f, 19.937f, 14.99f, 19.906f)
                lineTo(19.168f, 16.984f)
                curveTo(21.298f, 16.894f, 23.0f, 15.152f, 23.0f, 13.0f)
                curveTo(23.0f, 10.791f, 21.209f, 9.0f, 19.0f, 9.0f)
                curveTo(16.848f, 9.0f, 15.107f, 10.702f, 15.018f, 12.832f)
                lineTo(12.094f, 17.01f)
                curveTo(12.062f, 17.009f, 12.032f, 17.0f, 12.0f, 17.0f)
                curveTo(11.337f, 17.0f, 10.729f, 17.222f, 10.232f, 17.586f)
                lineTo(5.033f, 15.357f)
                curveTo(5.369f, 9.592f, 10.152f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(19.0f, 10.0f)
                curveTo(20.657f, 10.0f, 22.0f, 11.343f, 22.0f, 13.0f)
                curveTo(22.0f, 14.657f, 20.657f, 16.0f, 19.0f, 16.0f)
                curveTo(17.343f, 16.0f, 16.0f, 14.657f, 16.0f, 13.0f)
                curveTo(16.0f, 11.343f, 17.343f, 10.0f, 19.0f, 10.0f)
                close()
                moveTo(19.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 11.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(13.105f, 18.0f, 14.0f, 18.895f, 14.0f, 20.0f)
                curveTo(14.0f, 21.105f, 13.105f, 22.0f, 12.0f, 22.0f)
                curveTo(11.191f, 22.0f, 10.499f, 21.518f, 10.184f, 20.828f)
                lineTo(10.967f, 21.164f)
                curveTo(11.159f, 21.247f, 11.36f, 21.287f, 11.557f, 21.287f)
                curveTo(12.139f, 21.287f, 12.693f, 20.946f, 12.938f, 20.377f)
                curveTo(13.264f, 19.616f, 12.91f, 18.734f, 12.148f, 18.408f)
                lineTo(11.42f, 18.096f)
                curveTo(11.605f, 18.039f, 11.797f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _steam!!
    }

private var _steam: ImageVector? = null
