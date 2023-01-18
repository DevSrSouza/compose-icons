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

public val RegularGroup.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(16.6944f, 5.0f, 20.5f, 8.8056f, 20.5f, 13.5f)
                curveTo(20.5f, 18.1944f, 16.6944f, 22.0f, 12.0f, 22.0f)
                curveTo(7.3056f, 22.0f, 3.5f, 18.1944f, 3.5f, 13.5f)
                curveTo(3.5f, 8.8056f, 7.3056f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 6.5f)
                curveTo(8.134f, 6.5f, 5.0f, 9.634f, 5.0f, 13.5f)
                curveTo(5.0f, 17.366f, 8.134f, 20.5f, 12.0f, 20.5f)
                curveTo(15.866f, 20.5f, 19.0f, 17.366f, 19.0f, 13.5f)
                curveTo(19.0f, 9.634f, 15.866f, 6.5f, 12.0f, 6.5f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(12.3797f, 8.0f, 12.6935f, 8.2822f, 12.7432f, 8.6482f)
                lineTo(12.75f, 8.75f)
                verticalLineTo(13.25f)
                curveTo(12.75f, 13.6642f, 12.4142f, 14.0f, 12.0f, 14.0f)
                curveTo(11.6203f, 14.0f, 11.3065f, 13.7178f, 11.2568f, 13.3518f)
                lineTo(11.25f, 13.25f)
                verticalLineTo(8.75f)
                curveTo(11.25f, 8.3358f, 11.5858f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(19.1472f, 5.1137f)
                lineTo(19.2298f, 5.1736f)
                lineTo(20.3882f, 6.1377f)
                curveTo(20.7066f, 6.4027f, 20.7498f, 6.8756f, 20.4849f, 7.194f)
                curveTo(20.2419f, 7.4858f, 19.8243f, 7.5465f, 19.5112f, 7.3505f)
                lineTo(19.4286f, 7.2906f)
                lineTo(18.2702f, 6.3264f)
                curveTo(17.9518f, 6.0615f, 17.9086f, 5.5886f, 18.1735f, 5.2702f)
                curveTo(18.4165f, 4.9784f, 18.8341f, 4.9177f, 19.1472f, 5.1137f)
                close()
                moveTo(14.25f, 2.5f)
                curveTo(14.6642f, 2.5f, 15.0f, 2.8358f, 15.0f, 3.25f)
                curveTo(15.0f, 3.6297f, 14.7178f, 3.9435f, 14.3518f, 3.9931f)
                lineTo(14.25f, 4.0f)
                horizontalLineTo(9.75f)
                curveTo(9.3358f, 4.0f, 9.0f, 3.6642f, 9.0f, 3.25f)
                curveTo(9.0f, 2.8703f, 9.2822f, 2.5565f, 9.6482f, 2.5069f)
                lineTo(9.75f, 2.5f)
                horizontalLineTo(14.25f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
