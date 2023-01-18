package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9705f, 4.3625f)
                curveTo(12.9964f, 3.5336f, 11.4983f, 4.2258f, 11.4983f, 5.5048f)
                verticalLineTo(9.4935f)
                lineTo(5.4705f, 4.3634f)
                curveTo(4.4964f, 3.5344f, 2.9983f, 4.2266f, 2.9983f, 5.5057f)
                verticalLineTo(18.4986f)
                curveTo(2.9983f, 19.3771f, 3.705f, 19.9787f, 4.4633f, 20.0008f)
                horizontalLineTo(4.5496f)
                curveTo(4.8678f, 19.9915f, 5.1908f, 19.8789f, 5.4704f, 19.6409f)
                lineTo(11.4983f, 14.5111f)
                verticalLineTo(18.4977f)
                curveTo(11.4983f, 19.7768f, 12.9964f, 20.469f, 13.9704f, 19.6401f)
                lineTo(21.3802f, 13.3342f)
                curveTo(22.2013f, 12.6354f, 22.2013f, 11.3675f, 21.3803f, 10.6688f)
                lineTo(13.9705f, 4.3625f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
