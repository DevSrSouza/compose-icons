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

public val FilledGroup.ServiceBell: ImageVector
    get() {
        if (_serviceBell != null) {
            return _serviceBell!!
        }
        _serviceBell = Builder(name = "ServiceBell", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                curveTo(10.0f, 2.8954f, 10.8954f, 2.0f, 12.0f, 2.0f)
                curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
                verticalLineTo(5.2391f)
                curveTo(17.5964f, 6.126f, 20.25f, 9.3772f, 20.25f, 13.2482f)
                curveTo(20.25f, 13.6625f, 19.9142f, 13.9982f, 19.5f, 13.9982f)
                horizontalLineTo(4.5f)
                curveTo(4.0858f, 13.9982f, 3.75f, 13.6625f, 3.75f, 13.2482f)
                curveTo(3.75f, 9.3876f, 6.4177f, 6.1499f, 10.0f, 5.2492f)
                verticalLineTo(4.0f)
                close()
                moveTo(13.25f, 7.5f)
                curveTo(12.8358f, 7.5f, 12.5f, 7.8358f, 12.5f, 8.25f)
                curveTo(12.5f, 8.6642f, 12.8358f, 9.0f, 13.25f, 9.0f)
                curveTo(14.5032f, 9.0f, 15.3927f, 9.6184f, 16.1355f, 10.68f)
                curveTo(16.3729f, 11.0193f, 16.8406f, 11.102f, 17.18f, 10.8645f)
                curveTo(17.5193f, 10.6271f, 17.602f, 10.1594f, 17.3645f, 9.82f)
                curveTo(16.4346f, 8.4909f, 15.136f, 7.5f, 13.25f, 7.5f)
                close()
                moveTo(2.0f, 17.0f)
                curveTo(2.0f, 15.8954f, 2.8954f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 15.0f, 22.0f, 15.8954f, 22.0f, 17.0f)
                curveTo(22.0f, 18.1046f, 21.1046f, 19.0f, 20.0f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 19.0f, 2.0f, 18.1046f, 2.0f, 17.0f)
                close()
            }
        }
        .build()
        return _serviceBell!!
    }

private var _serviceBell: ImageVector? = null
