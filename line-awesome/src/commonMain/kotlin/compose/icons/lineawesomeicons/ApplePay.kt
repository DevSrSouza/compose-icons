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

public val LineAwesomeIcons.ApplePay: ImageVector
    get() {
        if (_applePay != null) {
            return _applePay!!
        }
        _applePay = Builder(name = "ApplePay", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.828f, 9.0f)
                curveTo(8.243f, 9.0f, 7.565f, 9.335f, 7.137f, 9.83f)
                curveTo(6.801f, 10.239f, 6.439f, 10.879f, 6.57f, 11.52f)
                curveTo(7.173f, 11.593f, 7.826f, 11.221f, 8.199f, 10.727f)
                curveTo(8.628f, 10.269f, 8.865f, 9.641f, 8.828f, 9.0f)
                close()
                moveTo(4.799f, 11.66f)
                curveTo(3.214f, 11.66f, 2.0f, 13.037f, 2.0f, 15.027f)
                curveTo(2.0f, 17.627f, 3.825f, 20.0f, 4.953f, 20.0f)
                curveTo(5.643f, 20.0f, 5.899f, 19.549f, 6.801f, 19.549f)
                curveTo(7.64f, 19.549f, 7.902f, 20.0f, 8.629f, 20.0f)
                curveTo(9.98f, 20.0f, 11.1f, 17.245f, 11.141f, 17.072f)
                curveTo(10.919f, 16.974f, 9.617f, 16.349f, 9.617f, 14.863f)
                curveTo(9.617f, 13.429f, 10.805f, 12.783f, 10.855f, 12.752f)
                curveTo(10.209f, 11.776f, 9.164f, 11.66f, 8.773f, 11.66f)
                curveTo(7.866f, 11.66f, 7.064f, 12.154f, 6.635f, 12.154f)
                curveTo(6.187f, 12.154f, 5.533f, 11.66f, 4.799f, 11.66f)
                close()
                moveTo(13.0f, 12.0f)
                lineTo(13.0f, 20.0f)
                lineTo(15.0f, 20.0f)
                lineTo(15.0f, 17.0f)
                lineTo(15.5f, 17.0f)
                curveTo(16.481f, 17.0f, 17.174f, 16.333f, 17.582f, 15.5f)
                lineTo(18.0f, 15.5f)
                lineTo(18.0f, 14.5f)
                curveTo(18.0f, 13.131f, 16.869f, 12.0f, 15.5f, 12.0f)
                lineTo(13.0f, 12.0f)
                close()
                moveTo(20.223f, 12.0f)
                lineTo(18.0f, 18.842f)
                lineTo(18.0f, 20.0f)
                lineTo(20.0f, 20.0f)
                lineTo(20.0f, 19.158f)
                lineTo(20.051f, 19.0f)
                lineTo(21.949f, 19.0f)
                lineTo(22.0f, 19.158f)
                lineTo(22.0f, 20.0f)
                lineTo(24.0f, 20.0f)
                lineTo(24.0f, 18.842f)
                lineTo(21.777f, 12.0f)
                lineTo(20.223f, 12.0f)
                close()
                moveTo(24.0f, 12.0f)
                lineTo(24.0f, 13.297f)
                lineTo(26.0f, 16.373f)
                lineTo(26.0f, 20.0f)
                lineTo(28.0f, 20.0f)
                lineTo(28.0f, 16.373f)
                lineTo(30.0f, 13.297f)
                lineTo(30.0f, 12.0f)
                lineTo(28.0f, 12.0f)
                lineTo(28.0f, 12.703f)
                lineTo(27.0f, 14.242f)
                lineTo(26.0f, 12.703f)
                lineTo(26.0f, 12.0f)
                lineTo(24.0f, 12.0f)
                close()
                moveTo(15.0f, 14.0f)
                lineTo(15.5f, 14.0f)
                curveTo(15.787f, 14.0f, 16.0f, 14.213f, 16.0f, 14.5f)
                curveTo(16.0f, 14.787f, 15.787f, 15.0f, 15.5f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 14.0f)
                close()
                moveTo(21.0f, 16.08f)
                lineTo(21.299f, 17.0f)
                lineTo(20.701f, 17.0f)
                lineTo(21.0f, 16.08f)
                close()
            }
        }
        .build()
        return _applePay!!
    }

private var _applePay: ImageVector? = null
