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

public val FilledGroup.ArrowTurnRight: ImageVector
    get() {
        if (_arrowTurnRight != null) {
            return _arrowTurnRight!!
        }
        _arrowTurnRight = Builder(name = "ArrowTurnRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4584f, 3.2929f)
                curveTo(16.0679f, 2.9024f, 15.4348f, 2.9023f, 15.0442f, 3.2928f)
                curveTo(14.6537f, 3.6833f, 14.6536f, 4.3165f, 15.0441f, 4.7071f)
                lineTo(17.3367f, 7.0f)
                horizontalLineTo(10.5f)
                curveTo(8.0147f, 7.0f, 6.0f, 9.0147f, 6.0f, 11.5f)
                verticalLineTo(20.0f)
                curveTo(6.0f, 20.5523f, 6.4477f, 21.0f, 7.0f, 21.0f)
                curveTo(7.5523f, 21.0f, 8.0f, 20.5523f, 8.0f, 20.0f)
                verticalLineTo(11.5f)
                curveTo(8.0f, 10.1193f, 9.1193f, 9.0f, 10.5f, 9.0f)
                horizontalLineTo(17.8353f)
                lineTo(15.043f, 11.7915f)
                curveTo(14.6524f, 12.182f, 14.6523f, 12.8151f, 15.0428f, 13.2057f)
                curveTo(15.4333f, 13.5963f, 16.0664f, 13.5964f, 16.457f, 13.2059f)
                lineTo(20.7073f, 8.9569f)
                curveTo(20.8949f, 8.7694f, 21.0003f, 8.515f, 21.0003f, 8.2498f)
                curveTo(21.0004f, 7.9845f, 20.895f, 7.7302f, 20.7075f, 7.5426f)
                lineTo(16.4584f, 3.2929f)
                close()
            }
        }
        .build()
        return _arrowTurnRight!!
    }

private var _arrowTurnRight: ImageVector? = null
