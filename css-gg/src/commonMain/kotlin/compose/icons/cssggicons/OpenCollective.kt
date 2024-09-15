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
                moveTo(16.682f, 15.753f)
                lineTo(18.812f, 17.883f)
                curveTo(20.175f, 16.305f, 21.0f, 14.249f, 21.0f, 12.0f)
                curveTo(21.0f, 9.787f, 20.202f, 7.761f, 18.877f, 6.194f)
                lineTo(16.744f, 8.327f)
                curveTo(17.531f, 9.342f, 18.0f, 10.616f, 18.0f, 12.0f)
                curveTo(18.0f, 13.42f, 17.507f, 14.725f, 16.682f, 15.753f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.673f, 16.744f)
                curveTo(14.658f, 17.531f, 13.384f, 18.0f, 12.0f, 18.0f)
                curveTo(8.686f, 18.0f, 6.0f, 15.314f, 6.0f, 12.0f)
                curveTo(6.0f, 8.686f, 8.686f, 6.0f, 12.0f, 6.0f)
                curveTo(13.42f, 6.0f, 14.725f, 6.493f, 15.753f, 7.318f)
                lineTo(17.883f, 5.188f)
                curveTo(16.305f, 3.825f, 14.249f, 3.0f, 12.0f, 3.0f)
                curveTo(7.029f, 3.0f, 3.0f, 7.029f, 3.0f, 12.0f)
                curveTo(3.0f, 16.971f, 7.029f, 21.0f, 12.0f, 21.0f)
                curveTo(14.213f, 21.0f, 16.239f, 20.202f, 17.806f, 18.877f)
                lineTo(15.673f, 16.744f)
                close()
            }
        }
        .build()
        return _openCollective!!
    }

private var _openCollective: ImageVector? = null
