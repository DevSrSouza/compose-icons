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

public val RegularGroup.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) {
            return _calendarStar!!
        }
        _calendarStar = Builder(name = "CalendarStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                lineTo(21.0012f, 12.0226f)
                curveTo(20.5378f, 11.7258f, 20.0342f, 11.4861f, 19.5004f, 11.3136f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                lineTo(11.3136f, 19.5004f)
                curveTo(11.4861f, 20.0342f, 11.7258f, 20.5378f, 12.0226f, 21.0012f)
                lineTo(6.25f, 21.0f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(16.984f, 14.0455f)
                lineTo(16.9446f, 14.1441f)
                lineTo(16.3876f, 15.9311f)
                horizontalLineTo(14.5851f)
                curveTo(14.0527f, 15.9311f, 13.813f, 16.5995f, 14.1682f, 16.9671f)
                lineTo(14.2418f, 17.0323f)
                lineTo(15.7001f, 18.1368f)
                lineTo(15.1431f, 19.9238f)
                curveTo(14.978f, 20.4535f, 15.5181f, 20.8989f, 15.9641f, 20.6548f)
                lineTo(16.0417f, 20.6044f)
                lineTo(17.5f, 19.5f)
                lineTo(18.9583f, 20.6044f)
                curveTo(19.3905f, 20.9318f, 19.9638f, 20.534f, 19.8789f, 20.0163f)
                lineTo(19.8569f, 19.9238f)
                lineTo(19.2999f, 18.1368f)
                lineTo(20.7582f, 17.0323f)
                curveTo(21.1889f, 16.7061f, 21.0059f, 16.0185f, 20.5113f, 15.9387f)
                lineTo(20.4149f, 15.9311f)
                horizontalLineTo(18.6124f)
                lineTo(18.0554f, 14.1441f)
                curveTo(17.8915f, 13.6183f, 17.2123f, 13.5854f, 16.984f, 14.0455f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                close()
            }
        }
        .build()
        return _calendarStar!!
    }

private var _calendarStar: ImageVector? = null
