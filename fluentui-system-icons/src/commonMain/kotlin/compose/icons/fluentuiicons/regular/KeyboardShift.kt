package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.KeyboardShift: ImageVector
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
                moveTo(12.1886f, 3.5861f)
                curveTo(12.0889f, 3.4712f, 11.9106f, 3.4712f, 11.8109f, 3.5861f)
                lineTo(3.5655f, 13.0899f)
                curveTo(3.4251f, 13.2518f, 3.5401f, 13.5037f, 3.7544f, 13.5037f)
                horizontalLineTo(7.7504f)
                curveTo(8.1646f, 13.5037f, 8.5004f, 13.8395f, 8.5004f, 14.2537f)
                verticalLineTo(20.2507f)
                curveTo(8.5004f, 20.3888f, 8.6123f, 20.5007f, 8.7504f, 20.5007f)
                horizontalLineTo(15.2504f)
                curveTo(15.3885f, 20.5007f, 15.5004f, 20.3888f, 15.5004f, 20.2507f)
                verticalLineTo(14.2537f)
                curveTo(15.5004f, 13.8395f, 15.8362f, 13.5037f, 16.2504f, 13.5037f)
                horizontalLineTo(20.2452f)
                curveTo(20.4595f, 13.5037f, 20.5745f, 13.2518f, 20.434f, 13.0899f)
                lineTo(12.1886f, 3.5861f)
                close()
            }
        }
        .build()
        return _keyboardShift!!
    }

private var _keyboardShift: ImageVector? = null
