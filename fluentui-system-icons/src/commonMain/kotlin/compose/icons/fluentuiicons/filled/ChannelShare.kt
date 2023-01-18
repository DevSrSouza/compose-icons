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

public val FilledGroup.ChannelShare: ImageVector
    get() {
        if (_channelShare != null) {
            return _channelShare!!
        }
        _channelShare = Builder(name = "ChannelShare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(12.25f)
                curveTo(14.0449f, 3.0f, 15.5f, 4.4551f, 15.5f, 6.25f)
                curveTo(15.5f, 6.6642f, 15.1642f, 7.0f, 14.75f, 7.0f)
                curveTo(14.3358f, 7.0f, 14.0f, 6.6642f, 14.0f, 6.25f)
                curveTo(14.0f, 5.2835f, 13.2165f, 4.5f, 12.25f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(12.25f)
                curveTo(4.5f, 13.2165f, 5.2835f, 14.0f, 6.25f, 14.0f)
                horizontalLineTo(12.1035f)
                curveTo(12.43f, 12.8457f, 13.4912f, 12.0f, 14.75f, 12.0f)
                curveTo(16.2688f, 12.0f, 17.5f, 13.2312f, 17.5f, 14.75f)
                curveTo(17.5f, 16.2688f, 16.2688f, 17.5f, 14.75f, 17.5f)
                curveTo(13.4912f, 17.5f, 12.43f, 16.6543f, 12.1035f, 15.5f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 15.5f, 3.0f, 14.0449f, 3.0f, 12.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(17.75f, 10.0f)
                curveTo(18.7165f, 10.0f, 19.5f, 10.7835f, 19.5f, 11.75f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(11.75f)
                curveTo(10.7835f, 19.5f, 10.0f, 18.7165f, 10.0f, 17.75f)
                curveTo(10.0f, 17.3358f, 9.6642f, 17.0f, 9.25f, 17.0f)
                curveTo(8.8358f, 17.0f, 8.5f, 17.3358f, 8.5f, 17.75f)
                curveTo(8.5f, 19.5449f, 9.9551f, 21.0f, 11.75f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(11.75f)
                curveTo(21.0f, 9.9551f, 19.5449f, 8.5f, 17.75f, 8.5f)
                horizontalLineTo(11.8965f)
                curveTo(11.57f, 7.3457f, 10.5088f, 6.5f, 9.25f, 6.5f)
                curveTo(7.7312f, 6.5f, 6.5f, 7.7312f, 6.5f, 9.25f)
                curveTo(6.5f, 10.7688f, 7.7312f, 12.0f, 9.25f, 12.0f)
                curveTo(10.5088f, 12.0f, 11.57f, 11.1543f, 11.8965f, 10.0f)
                horizontalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _channelShare!!
    }

private var _channelShare: ImageVector? = null
