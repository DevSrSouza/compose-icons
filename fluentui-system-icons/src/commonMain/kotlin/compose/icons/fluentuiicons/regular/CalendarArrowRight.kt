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

public val RegularGroup.CalendarArrowRight: ImageVector
    get() {
        if (_calendarArrowRight != null) {
            return _calendarArrowRight!!
        }
        _calendarArrowRight = Builder(name = "CalendarArrowRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                curveTo(21.0f, 4.3432f, 19.6569f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 3.0f, 3.0f, 4.3432f, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.6569f, 4.3432f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(12.0218f)
                curveTo(11.7253f, 20.5368f, 11.4858f, 20.0335f, 11.3135f, 19.5f)
                horizontalLineTo(6.0f)
                curveTo(5.1716f, 19.5f, 4.5f, 18.8284f, 4.5f, 18.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(11.3135f)
                curveTo(20.0335f, 11.4858f, 20.5368f, 11.7253f, 21.0f, 12.0218f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.0f, 4.5f)
                horizontalLineTo(18.0f)
                curveTo(18.8284f, 4.5f, 19.5f, 5.1716f, 19.5f, 6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.0f)
                curveTo(4.5f, 5.1716f, 5.1716f, 4.5f, 6.0f, 4.5f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                close()
                moveTo(17.6464f, 15.3536f)
                curveTo(17.4512f, 15.1583f, 17.4512f, 14.8417f, 17.6464f, 14.6464f)
                curveTo(17.8417f, 14.4512f, 18.1583f, 14.4512f, 18.3536f, 14.6464f)
                lineTo(20.8536f, 17.1464f)
                curveTo(21.0488f, 17.3417f, 21.0488f, 17.6583f, 20.8536f, 17.8536f)
                lineTo(18.3536f, 20.3536f)
                curveTo(18.1583f, 20.5488f, 17.8417f, 20.5488f, 17.6464f, 20.3536f)
                curveTo(17.4512f, 20.1583f, 17.4512f, 19.8417f, 17.6464f, 19.6464f)
                lineTo(19.2929f, 18.0f)
                horizontalLineTo(14.5f)
                curveTo(14.2239f, 18.0f, 14.0f, 17.7761f, 14.0f, 17.5f)
                curveTo(14.0f, 17.2239f, 14.2239f, 17.0f, 14.5f, 17.0f)
                horizontalLineTo(19.2929f)
                lineTo(17.6464f, 15.3536f)
                close()
            }
        }
        .build()
        return _calendarArrowRight!!
    }

private var _calendarArrowRight: ImageVector? = null
