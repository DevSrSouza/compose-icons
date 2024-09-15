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

public val CssGgIcons.CornerUpRight: ImageVector
    get() {
        if (_cornerUpRight != null) {
            return _cornerUpRight!!
        }
        _cornerUpRight = Builder(name = "CornerUpRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.372f, 14.722f)
                lineTo(14.783f, 16.139f)
                lineTo(21.161f, 9.789f)
                lineTo(14.811f, 3.411f)
                lineTo(13.394f, 4.822f)
                lineTo(17.17f, 8.615f)
                lineTo(6.865f, 8.593f)
                curveTo(4.655f, 8.588f, 2.861f, 10.375f, 2.856f, 12.584f)
                lineTo(2.839f, 20.584f)
                lineTo(4.839f, 20.589f)
                lineTo(4.856f, 12.589f)
                curveTo(4.858f, 11.484f, 5.756f, 10.591f, 6.86f, 10.593f)
                lineTo(17.496f, 10.616f)
                lineTo(13.372f, 14.722f)
                close()
            }
        }
        .build()
        return _cornerUpRight!!
    }

private var _cornerUpRight: ImageVector? = null
