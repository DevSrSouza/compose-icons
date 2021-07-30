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

public val LineAwesomeIcons.Chromecast: ImageVector
    get() {
        if (_chromecast != null) {
            return _chromecast!!
        }
        _chromecast = Builder(name = "Chromecast", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                curveTo(4.897f, 6.0f, 4.0f, 6.897f, 4.0f, 8.0f)
                lineTo(4.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                lineTo(6.0f, 8.0f)
                lineTo(26.0f, 8.0f)
                lineTo(26.0f, 24.0f)
                lineTo(18.0f, 24.0f)
                lineTo(18.0f, 26.0f)
                lineTo(26.0f, 26.0f)
                curveTo(27.103f, 26.0f, 28.0f, 25.103f, 28.0f, 24.0f)
                lineTo(28.0f, 8.0f)
                curveTo(28.0f, 6.897f, 27.103f, 6.0f, 26.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(4.0f, 14.0f)
                lineTo(4.0f, 16.0f)
                curveTo(9.1694f, 16.0f, 13.4362f, 19.9423f, 13.9492f, 24.9785f)
                curveTo(13.9834f, 25.3143f, 14.0f, 25.6554f, 14.0f, 26.0f)
                lineTo(16.0f, 26.0f)
                curveTo(16.0f, 19.383f, 10.617f, 14.0f, 4.0f, 14.0f)
                close()
                moveTo(4.0f, 18.0f)
                lineTo(4.0f, 20.0f)
                curveTo(7.309f, 20.0f, 10.0f, 22.691f, 10.0f, 26.0f)
                lineTo(12.0f, 26.0f)
                curveTo(12.0f, 21.589f, 8.411f, 18.0f, 4.0f, 18.0f)
                close()
                moveTo(4.0f, 22.0f)
                lineTo(4.0f, 26.0f)
                lineTo(8.0f, 26.0f)
                curveTo(8.0f, 23.791f, 6.209f, 22.0f, 4.0f, 22.0f)
                close()
            }
        }
        .build()
        return _chromecast!!
    }

private var _chromecast: ImageVector? = null
