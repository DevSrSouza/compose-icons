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

public val RegularGroup.PhoneKey: ImageVector
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
                curveTo(17.4411f, 11.4536f, 16.9328f, 11.7585f, 16.5f, 12.1458f)
                verticalLineTo(4.25f)
                curveTo(16.5f, 3.8358f, 16.1642f, 3.5f, 15.75f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 3.5f, 7.5f, 3.8358f, 7.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(7.5f, 20.1642f, 7.8358f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(11.0278f)
                curveTo(11.0094f, 20.6018f, 11.0f, 20.7058f, 11.0f, 20.8107f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.25f)
                curveTo(7.0074f, 22.0f, 6.0f, 20.9926f, 6.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6.0f, 3.0074f, 7.0074f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(15.75f)
                close()
                moveTo(13.2489f, 17.5f)
                curveTo(13.3487f, 17.4999f, 13.4441f, 17.5192f, 13.5313f, 17.5545f)
                lineTo(12.084f, 19.0018f)
                lineTo(10.7511f, 19.0038f)
                curveTo(10.3369f, 19.0044f, 10.0006f, 18.6691f, 10.0f, 18.2549f)
                curveTo(9.9994f, 17.8407f, 10.3347f, 17.5044f, 10.7489f, 17.5038f)
                lineTo(13.2489f, 17.5f)
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
