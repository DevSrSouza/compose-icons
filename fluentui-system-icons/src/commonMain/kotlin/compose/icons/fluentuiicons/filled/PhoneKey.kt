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

public val FilledGroup.PhoneKey: ImageVector
    get() {
        if (_phoneKey != null) {
            return _phoneKey!!
        }
        _phoneKey = Builder(name = "PhoneKey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 2.0f)
                curveTo(16.9926f, 2.0f, 18.0f, 3.0074f, 18.0f, 4.25f)
                verticalLineTo(11.2561f)
                curveTo(16.2522f, 11.8738f, 15.0f, 13.5407f, 15.0f, 15.5f)
                curveTo(15.0f, 15.6866f, 15.0114f, 15.8709f, 15.0336f, 16.0521f)
                lineTo(13.0858f, 18.0f)
                horizontalLineTo(10.75f)
                curveTo(10.3358f, 18.0f, 10.0f, 18.3358f, 10.0f, 18.75f)
                curveTo(10.0f, 19.1642f, 10.3358f, 19.5f, 10.75f, 19.5f)
                horizontalLineTo(11.5858f)
                lineTo(11.5126f, 19.5732f)
                curveTo(11.1844f, 19.9014f, 11.0f, 20.3465f, 11.0f, 20.8107f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.25f)
                curveTo(7.0074f, 22.0f, 6.0f, 20.9926f, 6.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6.0f, 3.0074f, 7.0074f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(15.75f)
                close()
                moveTo(19.5f, 19.0f)
                curveTo(21.433f, 19.0f, 23.0f, 17.433f, 23.0f, 15.5f)
                curveTo(23.0f, 13.567f, 21.433f, 12.0f, 19.5f, 12.0f)
                curveTo(17.567f, 12.0f, 16.0f, 13.567f, 16.0f, 15.5f)
                curveTo(16.0f, 15.8161f, 16.0419f, 16.1223f, 16.1204f, 16.4136f)
                curveTo(16.0666f, 16.4452f, 16.0159f, 16.4841f, 15.9697f, 16.5303f)
                lineTo(12.2197f, 20.2803f)
                curveTo(12.079f, 20.421f, 12.0f, 20.6117f, 12.0f, 20.8107f)
                verticalLineTo(22.25f)
                curveTo(12.0f, 22.6642f, 12.3358f, 23.0f, 12.75f, 23.0f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 23.0f, 15.0f, 22.7761f, 15.0f, 22.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                curveTo(16.2761f, 22.0f, 16.5f, 21.7761f, 16.5f, 21.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(17.5f)
                curveTo(17.7761f, 20.5f, 18.0f, 20.2761f, 18.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.5f)
                close()
                moveTo(21.0f, 15.0f)
                curveTo(21.0f, 15.5523f, 20.5523f, 16.0f, 20.0f, 16.0f)
                curveTo(19.4477f, 16.0f, 19.0f, 15.5523f, 19.0f, 15.0f)
                curveTo(19.0f, 14.4477f, 19.4477f, 14.0f, 20.0f, 14.0f)
                curveTo(20.5523f, 14.0f, 21.0f, 14.4477f, 21.0f, 15.0f)
                close()
            }
        }
        .build()
        return _phoneKey!!
    }

private var _phoneKey: ImageVector? = null
