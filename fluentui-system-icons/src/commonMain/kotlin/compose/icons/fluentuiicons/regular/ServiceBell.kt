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

public val RegularGroup.ServiceBell: ImageVector
    get() {
        if (_serviceBell != null) {
            return _serviceBell!!
        }
        _serviceBell = Builder(name = "ServiceBell", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.75f, 7.5f)
                curveTo(11.3358f, 7.5f, 11.0f, 7.8358f, 11.0f, 8.25f)
                curveTo(11.0f, 8.6642f, 11.3358f, 9.0f, 11.75f, 9.0f)
                curveTo(13.072f, 9.0f, 14.4618f, 9.7587f, 15.1594f, 10.7557f)
                curveTo(15.3969f, 11.0951f, 15.8645f, 11.1778f, 16.2039f, 10.9403f)
                curveTo(16.5433f, 10.7028f, 16.6259f, 10.2352f, 16.3885f, 9.8958f)
                curveTo(15.4134f, 8.5022f, 13.5672f, 7.5f, 11.75f, 7.5f)
                close()
                moveTo(9.5f, 4.5f)
                curveTo(9.5f, 3.1193f, 10.6193f, 2.0f, 12.0f, 2.0f)
                curveTo(13.3807f, 2.0f, 14.5f, 3.1193f, 14.5f, 4.5f)
                verticalLineTo(5.3796f)
                curveTo(17.8398f, 6.4332f, 20.25f, 9.5608f, 20.25f, 13.25f)
                curveTo(20.25f, 13.6642f, 19.9142f, 14.0f, 19.5f, 14.0f)
                horizontalLineTo(4.5f)
                curveTo(4.0858f, 14.0f, 3.75f, 13.6642f, 3.75f, 13.25f)
                curveTo(3.75f, 9.5714f, 6.1722f, 6.457f, 9.5f, 5.3921f)
                verticalLineTo(4.5f)
                close()
                moveTo(13.0f, 4.5f)
                curveTo(13.0f, 3.9477f, 12.5523f, 3.5f, 12.0f, 3.5f)
                curveTo(11.4477f, 3.5f, 11.0f, 3.9477f, 11.0f, 4.5f)
                verticalLineTo(5.0626f)
                curveTo(11.3348f, 5.0213f, 11.6757f, 5.0f, 12.0214f, 5.0f)
                curveTo(12.3527f, 5.0f, 12.6792f, 5.0195f, 13.0f, 5.0575f)
                verticalLineTo(4.5f)
                close()
                moveTo(5.2915f, 12.5f)
                horizontalLineTo(18.7091f)
                curveTo(18.3382f, 9.1236f, 15.4925f, 6.5f, 12.0214f, 6.5f)
                curveTo(8.5456f, 6.5f, 5.6672f, 9.128f, 5.2915f, 12.5f)
                close()
                moveTo(4.0f, 15.0f)
                curveTo(2.8954f, 15.0f, 2.0f, 15.8954f, 2.0f, 17.0f)
                curveTo(2.0f, 18.1046f, 2.8954f, 19.0f, 4.0f, 19.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 19.0f, 22.0f, 18.1046f, 22.0f, 17.0f)
                curveTo(22.0f, 15.8954f, 21.1046f, 15.0f, 20.0f, 15.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(3.5f, 17.0f)
                curveTo(3.5f, 16.7239f, 3.7239f, 16.5f, 4.0f, 16.5f)
                horizontalLineTo(20.0f)
                curveTo(20.2761f, 16.5f, 20.5f, 16.7239f, 20.5f, 17.0f)
                curveTo(20.5f, 17.2761f, 20.2761f, 17.5f, 20.0f, 17.5f)
                horizontalLineTo(4.0f)
                curveTo(3.7239f, 17.5f, 3.5f, 17.2761f, 3.5f, 17.0f)
                close()
            }
        }
        .build()
        return _serviceBell!!
    }

private var _serviceBell: ImageVector? = null
