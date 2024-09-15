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

public val LineAwesomeIcons.Smile: ImageVector
    get() {
        if (_smile != null) {
            return _smile!!
        }
        _smile = Builder(name = "Smile", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.535f, 6.0f, 26.0f, 10.465f, 26.0f, 16.0f)
                curveTo(26.0f, 21.535f, 21.535f, 26.0f, 16.0f, 26.0f)
                curveTo(10.465f, 26.0f, 6.0f, 21.535f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(11.5f, 12.0f)
                curveTo(10.672f, 12.0f, 10.0f, 12.672f, 10.0f, 13.5f)
                curveTo(10.0f, 14.328f, 10.672f, 15.0f, 11.5f, 15.0f)
                curveTo(12.328f, 15.0f, 13.0f, 14.328f, 13.0f, 13.5f)
                curveTo(13.0f, 12.672f, 12.328f, 12.0f, 11.5f, 12.0f)
                close()
                moveTo(20.5f, 12.0f)
                curveTo(19.672f, 12.0f, 19.0f, 12.672f, 19.0f, 13.5f)
                curveTo(19.0f, 14.328f, 19.672f, 15.0f, 20.5f, 15.0f)
                curveTo(21.328f, 15.0f, 22.0f, 14.328f, 22.0f, 13.5f)
                curveTo(22.0f, 12.672f, 21.328f, 12.0f, 20.5f, 12.0f)
                close()
                moveTo(10.813f, 19.0f)
                lineTo(9.094f, 20.0f)
                curveTo(10.477f, 22.387f, 13.047f, 24.0f, 16.0f, 24.0f)
                curveTo(18.953f, 24.0f, 21.523f, 22.387f, 22.906f, 20.0f)
                lineTo(21.188f, 19.0f)
                curveTo(20.148f, 20.793f, 18.227f, 22.0f, 16.0f, 22.0f)
                curveTo(13.773f, 22.0f, 11.852f, 20.793f, 10.813f, 19.0f)
                close()
            }
        }
        .build()
        return _smile!!
    }

private var _smile: ImageVector? = null
