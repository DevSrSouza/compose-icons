package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerUpLeft: ImageVector
    get() {
        if (_cornerUpLeft != null) {
            return _cornerUpLeft!!
        }
        _cornerUpLeft = Builder(name = "CornerUpLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.628f, 14.722f)
                lineTo(9.216f, 16.139f)
                lineTo(2.839f, 9.789f)
                lineTo(9.189f, 3.411f)
                lineTo(10.606f, 4.822f)
                lineTo(6.83f, 8.615f)
                lineTo(17.135f, 8.593f)
                curveTo(19.344f, 8.588f, 21.139f, 10.375f, 21.144f, 12.584f)
                lineTo(21.161f, 20.584f)
                lineTo(19.161f, 20.589f)
                lineTo(19.144f, 12.589f)
                curveTo(19.142f, 11.484f, 18.244f, 10.591f, 17.14f, 10.593f)
                lineTo(6.504f, 10.616f)
                lineTo(10.628f, 14.722f)
                close()
            }
        }
        .build()
        return _cornerUpLeft!!
    }

private var _cornerUpLeft: ImageVector? = null
