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

public val RegularGroup.Toolbox: ImageVector
    get() {
        if (_toolbox != null) {
            return _toolbox!!
        }
        _toolbox = Builder(name = "Toolbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.2529f)
                verticalLineTo(7.0003f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 7.0003f, 2.0f, 8.0077f, 2.0f, 9.2503f)
                verticalLineTo(17.7471f)
                curveTo(2.0f, 18.9897f, 3.0074f, 19.9971f, 4.25f, 19.9971f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 19.9971f, 22.0f, 18.9897f, 22.0f, 17.7471f)
                verticalLineTo(9.2503f)
                curveTo(22.0f, 8.0077f, 20.9926f, 7.0003f, 19.75f, 7.0003f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.2529f)
                curveTo(17.0f, 5.0103f, 15.9926f, 4.0029f, 14.75f, 4.0029f)
                horizontalLineTo(9.25f)
                curveTo(8.0074f, 4.0029f, 7.0f, 5.0103f, 7.0f, 6.2529f)
                close()
                moveTo(9.25f, 5.5029f)
                horizontalLineTo(14.75f)
                curveTo(15.1642f, 5.5029f, 15.5f, 5.8387f, 15.5f, 6.2529f)
                verticalLineTo(7.0003f)
                horizontalLineTo(8.5f)
                verticalLineTo(6.2529f)
                curveTo(8.5f, 5.8387f, 8.8358f, 5.5029f, 9.25f, 5.5029f)
                close()
                moveTo(7.0f, 8.5029f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.5003f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.5029f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.5003f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 8.5003f, 20.5f, 8.8361f, 20.5f, 9.2503f)
                verticalLineTo(11.5003f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.7503f)
                curveTo(17.5f, 10.3361f, 17.1642f, 10.0003f, 16.75f, 10.0003f)
                curveTo(16.3358f, 10.0003f, 16.0f, 10.3361f, 16.0f, 10.7503f)
                verticalLineTo(11.5003f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.7503f)
                curveTo(8.0f, 10.3361f, 7.6642f, 10.0003f, 7.25f, 10.0003f)
                curveTo(6.8358f, 10.0003f, 6.5f, 10.3361f, 6.5f, 10.7503f)
                verticalLineTo(11.5003f)
                horizontalLineTo(3.5f)
                verticalLineTo(9.2503f)
                curveTo(3.5f, 8.8361f, 3.8358f, 8.5003f, 4.25f, 8.5003f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.5029f)
                close()
                moveTo(16.0f, 13.0003f)
                verticalLineTo(14.2503f)
                curveTo(16.0f, 14.6645f, 16.3358f, 15.0003f, 16.75f, 15.0003f)
                curveTo(17.1642f, 15.0003f, 17.5f, 14.6645f, 17.5f, 14.2503f)
                verticalLineTo(13.0003f)
                horizontalLineTo(20.5f)
                verticalLineTo(17.7471f)
                curveTo(20.5f, 18.1613f, 20.1642f, 18.4971f, 19.75f, 18.4971f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 18.4971f, 3.5f, 18.1613f, 3.5f, 17.7471f)
                verticalLineTo(13.0003f)
                horizontalLineTo(6.5f)
                verticalLineTo(14.2503f)
                curveTo(6.5f, 14.6645f, 6.8358f, 15.0003f, 7.25f, 15.0003f)
                curveTo(7.6642f, 15.0003f, 8.0f, 14.6645f, 8.0f, 14.2503f)
                verticalLineTo(13.0003f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
