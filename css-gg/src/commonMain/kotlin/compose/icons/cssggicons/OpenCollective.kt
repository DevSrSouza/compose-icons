package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.OpenCollective: ImageVector
    get() {
        if (_openCollective != null) {
            return _openCollective!!
        }
        _openCollective = Builder(name = "OpenCollective", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.6818f, 15.7529f)
                lineTo(18.8116f, 17.8827f)
                curveTo(20.1752f, 16.3052f, 21.0f, 14.249f, 21.0f, 12.0001f)
                curveTo(21.0f, 9.7875f, 20.2016f, 7.7613f, 18.8771f, 6.1941f)
                lineTo(16.7444f, 8.3267f)
                curveTo(17.5315f, 9.3418f, 18.0f, 10.6162f, 18.0f, 12.0001f)
                curveTo(18.0f, 13.4203f, 17.5066f, 14.7253f, 16.6818f, 15.7529f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6734f, 16.7445f)
                curveTo(14.6583f, 17.5315f, 13.3839f, 18.0f, 12.0f, 18.0f)
                curveTo(8.6863f, 18.0f, 6.0f, 15.3137f, 6.0f, 12.0f)
                curveTo(6.0f, 8.6863f, 8.6863f, 6.0f, 12.0f, 6.0f)
                curveTo(13.4202f, 6.0f, 14.7252f, 6.4934f, 15.7528f, 7.3182f)
                lineTo(17.8826f, 5.1884f)
                curveTo(16.3051f, 3.8248f, 14.2489f, 3.0f, 12.0f, 3.0f)
                curveTo(7.0294f, 3.0f, 3.0f, 7.0294f, 3.0f, 12.0f)
                curveTo(3.0f, 16.9706f, 7.0294f, 21.0f, 12.0f, 21.0f)
                curveTo(14.2126f, 21.0f, 16.2387f, 20.2016f, 17.806f, 18.8771f)
                lineTo(15.6734f, 16.7445f)
                close()
            }
        }
        .build()
        return _openCollective!!
    }

private var _openCollective: ImageVector? = null
