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

public val RegularGroup.KeyboardShiftUppercase: ImageVector
    get() {
        if (_keyboardShiftUppercase != null) {
            return _keyboardShiftUppercase!!
        }
        _keyboardShiftUppercase = Builder(name = "KeyboardShiftUppercase", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3216f, 2.6031f)
                curveTo(12.6239f, 1.7989f, 11.3757f, 1.7989f, 10.6779f, 2.6031f)
                lineTo(2.4325f, 12.1069f)
                curveTo(1.4495f, 13.24f, 2.2543f, 15.0037f, 3.7544f, 15.0037f)
                horizontalLineTo(7.0004f)
                verticalLineTo(17.25f)
                curveTo(7.0004f, 18.2165f, 7.7839f, 19.0f, 8.7504f, 19.0f)
                horizontalLineTo(15.2504f)
                curveTo(16.2169f, 19.0f, 17.0004f, 18.2165f, 17.0004f, 17.25f)
                verticalLineTo(15.0037f)
                horizontalLineTo(20.2452f)
                curveTo(21.7452f, 15.0037f, 22.5501f, 13.24f, 21.567f, 12.1069f)
                lineTo(13.3216f, 2.6031f)
                close()
                moveTo(11.8109f, 3.5861f)
                curveTo(11.9106f, 3.4712f, 12.0889f, 3.4712f, 12.1886f, 3.5861f)
                lineTo(20.434f, 13.0899f)
                curveTo(20.5745f, 13.2518f, 20.4595f, 13.5037f, 20.2452f, 13.5037f)
                horizontalLineTo(16.2504f)
                curveTo(15.8362f, 13.5037f, 15.5004f, 13.8395f, 15.5004f, 14.2537f)
                verticalLineTo(17.25f)
                curveTo(15.5004f, 17.3881f, 15.3885f, 17.5f, 15.2504f, 17.5f)
                horizontalLineTo(8.7504f)
                curveTo(8.6123f, 17.5f, 8.5004f, 17.3881f, 8.5004f, 17.25f)
                verticalLineTo(14.2537f)
                curveTo(8.5004f, 13.8395f, 8.1646f, 13.5037f, 7.7504f, 13.5037f)
                horizontalLineTo(3.7544f)
                curveTo(3.5401f, 13.5037f, 3.4251f, 13.2518f, 3.5655f, 13.0899f)
                lineTo(11.8109f, 3.5861f)
                close()
                moveTo(7.7504f, 20.5f)
                curveTo(7.3362f, 20.5f, 7.0004f, 20.8358f, 7.0004f, 21.25f)
                curveTo(7.0004f, 21.6642f, 7.3362f, 22.0f, 7.7504f, 22.0f)
                horizontalLineTo(16.2504f)
                curveTo(16.6646f, 22.0f, 17.0004f, 21.6642f, 17.0004f, 21.25f)
                curveTo(17.0004f, 20.8358f, 16.6646f, 20.5f, 16.2504f, 20.5f)
                horizontalLineTo(7.7504f)
                close()
            }
        }
        .build()
        return _keyboardShiftUppercase!!
    }

private var _keyboardShiftUppercase: ImageVector? = null
