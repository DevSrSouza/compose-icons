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

public val FilledGroup.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 1.25f)
                curveTo(17.1642f, 1.25f, 17.5f, 1.5858f, 17.5f, 2.0f)
                verticalLineTo(3.0f)
                curveTo(17.5f, 3.4142f, 17.1642f, 3.75f, 16.75f, 3.75f)
                curveTo(16.3358f, 3.75f, 16.0f, 3.4142f, 16.0f, 3.0f)
                verticalLineTo(2.0f)
                curveTo(16.0f, 1.5858f, 16.3358f, 1.25f, 16.75f, 1.25f)
                close()
                moveTo(20.4697f, 2.4697f)
                curveTo(20.7626f, 2.1768f, 21.2375f, 2.1768f, 21.5303f, 2.4697f)
                curveTo(21.8232f, 2.7626f, 21.8232f, 3.2374f, 21.5303f, 3.5303f)
                lineTo(19.5303f, 5.5303f)
                curveTo(19.2375f, 5.8232f, 18.7626f, 5.8232f, 18.4697f, 5.5303f)
                curveTo(18.1768f, 5.2374f, 18.1768f, 4.7626f, 18.4697f, 4.4697f)
                lineTo(20.4697f, 2.4697f)
                close()
                moveTo(8.25f, 6.3107f)
                verticalLineTo(9.1894f)
                lineTo(14.8106f, 15.75f)
                horizontalLineTo(17.6893f)
                lineTo(8.25f, 6.3107f)
                close()
                moveTo(19.0606f, 15.0f)
                lineTo(20.4697f, 13.591f)
                curveTo(21.3484f, 12.7123f, 21.3484f, 11.2877f, 20.4697f, 10.409f)
                lineTo(13.591f, 3.5303f)
                curveTo(12.7123f, 2.6516f, 11.2877f, 2.6516f, 10.409f, 3.5303f)
                lineTo(9.0f, 4.9394f)
                lineTo(19.0606f, 15.0f)
                close()
                moveTo(13.0f, 16.0607f)
                lineTo(7.9393f, 11.0f)
                lineTo(3.0303f, 15.909f)
                curveTo(2.1517f, 16.7877f, 2.1517f, 18.2123f, 3.0303f, 19.091f)
                lineTo(4.909f, 20.9697f)
                curveTo(5.7877f, 21.8484f, 7.2123f, 21.8483f, 8.091f, 20.9697f)
                lineTo(13.0f, 16.0607f)
                close()
                moveTo(9.5303f, 14.4697f)
                curveTo(9.8232f, 14.7626f, 9.8232f, 15.2375f, 9.5303f, 15.5304f)
                lineTo(8.0303f, 17.0304f)
                curveTo(7.7374f, 17.3233f, 7.2625f, 17.3233f, 6.9696f, 17.0304f)
                curveTo(6.6768f, 16.7375f, 6.6768f, 16.2626f, 6.9696f, 15.9697f)
                lineTo(8.4697f, 14.4697f)
                curveTo(8.7625f, 14.1768f, 9.2374f, 14.1768f, 9.5303f, 14.4697f)
                close()
                moveTo(22.0f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(20.5858f, 8.0f, 20.25f, 7.6642f, 20.25f, 7.25f)
                curveTo(20.25f, 6.8358f, 20.5858f, 6.5f, 21.0f, 6.5f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 6.5f, 22.75f, 6.8358f, 22.75f, 7.25f)
                curveTo(22.75f, 7.6642f, 22.4142f, 8.0f, 22.0f, 8.0f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
