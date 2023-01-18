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

public val RegularGroup.Fluid: ImageVector
    get() {
        if (_fluid != null) {
            return _fluid!!
        }
        _fluid = Builder(name = "Fluid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                horizontalLineTo(16.745f)
                curveTo(17.9876f, 5.0f, 18.995f, 6.0074f, 18.995f, 7.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.495f)
                verticalLineTo(7.25f)
                curveTo(17.495f, 6.8358f, 17.1592f, 6.5f, 16.745f, 6.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(6.5f, 11.0f)
                verticalLineTo(16.745f)
                curveTo(6.5f, 17.1592f, 6.8358f, 17.495f, 7.25f, 17.495f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.995f)
                horizontalLineTo(7.25f)
                curveTo(6.0074f, 18.995f, 5.0f, 17.9876f, 5.0f, 16.745f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(2.0f, 4.25f)
                curveTo(2.0f, 3.0074f, 3.0074f, 2.0f, 4.25f, 2.0f)
                horizontalLineTo(7.75f)
                curveTo(8.9926f, 2.0f, 10.0f, 3.0074f, 10.0f, 4.25f)
                verticalLineTo(7.75f)
                curveTo(10.0f, 8.9926f, 8.9926f, 10.0f, 7.75f, 10.0f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 10.0f, 2.0f, 8.9926f, 2.0f, 7.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(4.25f, 3.5f)
                curveTo(3.8358f, 3.5f, 3.5f, 3.8358f, 3.5f, 4.25f)
                verticalLineTo(7.75f)
                curveTo(3.5f, 8.1642f, 3.8358f, 8.5f, 4.25f, 8.5f)
                horizontalLineTo(7.75f)
                curveTo(8.1642f, 8.5f, 8.5f, 8.1642f, 8.5f, 7.75f)
                verticalLineTo(4.25f)
                curveTo(8.5f, 3.8358f, 8.1642f, 3.5f, 7.75f, 3.5f)
                horizontalLineTo(4.25f)
                close()
                moveTo(12.0f, 14.25f)
                curveTo(12.0f, 13.0074f, 13.0074f, 12.0f, 14.25f, 12.0f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 12.0f, 22.0f, 13.0074f, 22.0f, 14.25f)
                verticalLineTo(19.75f)
                curveTo(22.0f, 20.9926f, 20.9926f, 22.0f, 19.75f, 22.0f)
                horizontalLineTo(14.25f)
                curveTo(13.0074f, 22.0f, 12.0f, 20.9926f, 12.0f, 19.75f)
                verticalLineTo(14.25f)
                close()
                moveTo(14.25f, 13.5f)
                curveTo(13.8358f, 13.5f, 13.5f, 13.8358f, 13.5f, 14.25f)
                verticalLineTo(19.75f)
                curveTo(13.5f, 20.1642f, 13.8358f, 20.5f, 14.25f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 20.5f, 20.5f, 20.1642f, 20.5f, 19.75f)
                verticalLineTo(14.25f)
                curveTo(20.5f, 13.8358f, 20.1642f, 13.5f, 19.75f, 13.5f)
                horizontalLineTo(14.25f)
                close()
            }
        }
        .build()
        return _fluid!!
    }

private var _fluid: ImageVector? = null
