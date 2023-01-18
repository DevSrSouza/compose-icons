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

public val FilledGroup.CalendarToolbox: ImageVector
    get() {
        if (_calendarToolbox != null) {
            return _calendarToolbox!!
        }
        _calendarToolbox = Builder(name = "CalendarToolbox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.8786f)
                curveTo(20.5245f, 11.4859f, 19.9148f, 11.25f, 19.25f, 11.25f)
                lineTo(15.6023f, 11.2539f)
                curveTo(14.1522f, 11.3306f, 13.0f, 12.5308f, 13.0f, 14.0f)
                verticalLineTo(14.05f)
                curveTo(11.8589f, 14.2816f, 11.0f, 15.2905f, 11.0f, 16.5f)
                close()
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.25f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineTo(13.5f)
                curveTo(12.6716f, 15.0f, 12.0f, 15.6716f, 12.0f, 16.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(17.75f)
                curveTo(14.5f, 17.3358f, 14.8358f, 17.0f, 15.25f, 17.0f)
                curveTo(15.6642f, 17.0f, 16.0f, 17.3358f, 16.0f, 17.75f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.75f)
                curveTo(19.0f, 17.3358f, 19.3358f, 17.0f, 19.75f, 17.0f)
                curveTo(20.1642f, 17.0f, 20.5f, 17.3358f, 20.5f, 17.75f)
                verticalLineTo(18.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(16.5f)
                curveTo(23.0f, 15.6716f, 22.3284f, 15.0f, 21.5f, 15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 13.0335f, 20.2165f, 12.25f, 19.25f, 12.25f)
                horizontalLineTo(15.75f)
                curveTo(14.7835f, 12.25f, 14.0f, 13.0335f, 14.0f, 14.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(15.5f, 14.0f)
                curveTo(15.5f, 13.8619f, 15.6119f, 13.75f, 15.75f, 13.75f)
                horizontalLineTo(19.25f)
                curveTo(19.3881f, 13.75f, 19.5f, 13.8619f, 19.5f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(14.0f)
                close()
                moveTo(12.0f, 21.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(20.25f)
                curveTo(14.5f, 20.6642f, 14.8358f, 21.0f, 15.25f, 21.0f)
                curveTo(15.6642f, 21.0f, 16.0f, 20.6642f, 16.0f, 20.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.25f)
                curveTo(19.0f, 20.6642f, 19.3358f, 21.0f, 19.75f, 21.0f)
                curveTo(20.1642f, 21.0f, 20.5f, 20.6642f, 20.5f, 20.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.5f)
                curveTo(23.0f, 22.3284f, 22.3284f, 23.0f, 21.5f, 23.0f)
                horizontalLineTo(13.5f)
                curveTo(12.6716f, 23.0f, 12.0f, 22.3284f, 12.0f, 21.5f)
                close()
            }
        }
        .build()
        return _calendarToolbox!!
    }

private var _calendarToolbox: ImageVector? = null
