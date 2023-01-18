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

public val FilledGroup.KeyboardShift: ImageVector
    get() {
        if (_keyboardShift != null) {
            return _keyboardShift!!
        }
        _keyboardShift = Builder(name = "KeyboardShift", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6779f, 2.6031f)
                curveTo(11.3757f, 1.7989f, 12.6239f, 1.7989f, 13.3216f, 2.6031f)
                lineTo(21.567f, 12.1069f)
                curveTo(22.5501f, 13.24f, 21.7452f, 15.0037f, 20.2452f, 15.0037f)
                horizontalLineTo(17.0004f)
                verticalLineTo(20.2507f)
                curveTo(17.0004f, 21.2172f, 16.2169f, 22.0007f, 15.2504f, 22.0007f)
                horizontalLineTo(8.7504f)
                curveTo(7.7839f, 22.0007f, 7.0004f, 21.2172f, 7.0004f, 20.2507f)
                verticalLineTo(15.0037f)
                horizontalLineTo(3.7544f)
                curveTo(2.2543f, 15.0037f, 1.4495f, 13.24f, 2.4325f, 12.1069f)
                lineTo(10.6779f, 2.6031f)
                close()
            }
        }
        .build()
        return _keyboardShift!!
    }

private var _keyboardShift: ImageVector? = null
