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

public val FilledGroup.CalendarError: ImageVector
    get() {
        if (_calendarError != null) {
            return _calendarError!!
        }
        _calendarError = Builder(name = "CalendarError", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0218f)
                verticalLineTo(8.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(12.0218f)
                curveTo(11.375f, 19.9897f, 11.0f, 18.7886f, 11.0f, 17.5f)
                curveTo(11.0f, 13.9101f, 13.9101f, 11.0f, 17.5f, 11.0f)
                curveTo(18.7886f, 11.0f, 19.9897f, 11.375f, 21.0f, 12.0218f)
                close()
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.25f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                close()
                moveTo(17.0f, 14.5f)
                curveTo(17.0f, 14.2239f, 17.2239f, 14.0f, 17.5f, 14.0f)
                curveTo(17.7761f, 14.0f, 18.0f, 14.2239f, 18.0f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(18.0f, 18.7761f, 17.7761f, 19.0f, 17.5f, 19.0f)
                curveTo(17.2239f, 19.0f, 17.0f, 18.7761f, 17.0f, 18.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(18.125f, 20.5f)
                curveTo(18.125f, 20.8452f, 17.8452f, 21.125f, 17.5f, 21.125f)
                curveTo(17.1548f, 21.125f, 16.875f, 20.8452f, 16.875f, 20.5f)
                curveTo(16.875f, 20.1548f, 17.1548f, 19.875f, 17.5f, 19.875f)
                curveTo(17.8452f, 19.875f, 18.125f, 20.1548f, 18.125f, 20.5f)
                close()
            }
        }
        .build()
        return _calendarError!!
    }

private var _calendarError: ImageVector? = null
