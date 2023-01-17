package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.CalendarDays: ImageVector
    get() {
        if (_calendarDays != null) {
            return _calendarDays!!
        }
        _calendarDays = Builder(name = "CalendarDays", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 64.0f)
                horizontalLineTo(296.0f)
                verticalLineTo(24.0f)
                curveTo(296.0f, 10.75f, 306.7f, 0.0f, 320.0f, 0.0f)
                curveTo(333.3f, 0.0f, 344.0f, 10.75f, 344.0f, 24.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(384.0f)
                curveTo(419.3f, 64.0f, 448.0f, 92.65f, 448.0f, 128.0f)
                verticalLineTo(448.0f)
                curveTo(448.0f, 483.3f, 419.3f, 512.0f, 384.0f, 512.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 512.0f, 0.0f, 483.3f, 0.0f, 448.0f)
                verticalLineTo(128.0f)
                curveTo(0.0f, 92.65f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(104.0f)
                verticalLineTo(24.0f)
                curveTo(104.0f, 10.75f, 114.7f, 0.0f, 128.0f, 0.0f)
                curveTo(141.3f, 0.0f, 152.0f, 10.75f, 152.0f, 24.0f)
                verticalLineTo(64.0f)
                close()
                moveTo(48.0f, 248.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(248.0f)
                close()
                moveTo(48.0f, 296.0f)
                verticalLineTo(360.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(296.0f)
                horizontalLineTo(48.0f)
                close()
                moveTo(176.0f, 296.0f)
                verticalLineTo(360.0f)
                horizontalLineTo(272.0f)
                verticalLineTo(296.0f)
                horizontalLineTo(176.0f)
                close()
                moveTo(320.0f, 296.0f)
                verticalLineTo(360.0f)
                horizontalLineTo(400.0f)
                verticalLineTo(296.0f)
                horizontalLineTo(320.0f)
                close()
                moveTo(400.0f, 192.0f)
                horizontalLineTo(320.0f)
                verticalLineTo(248.0f)
                horizontalLineTo(400.0f)
                verticalLineTo(192.0f)
                close()
                moveTo(400.0f, 408.0f)
                horizontalLineTo(320.0f)
                verticalLineTo(464.0f)
                horizontalLineTo(384.0f)
                curveTo(392.8f, 464.0f, 400.0f, 456.8f, 400.0f, 448.0f)
                verticalLineTo(408.0f)
                close()
                moveTo(272.0f, 408.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(464.0f)
                horizontalLineTo(272.0f)
                verticalLineTo(408.0f)
                close()
                moveTo(128.0f, 408.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(448.0f)
                curveTo(48.0f, 456.8f, 55.16f, 464.0f, 64.0f, 464.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(408.0f)
                close()
                moveTo(272.0f, 192.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(248.0f)
                horizontalLineTo(272.0f)
                verticalLineTo(192.0f)
                close()
            }
        }
        .build()
        return _calendarDays!!
    }

private var _calendarDays: ImageVector? = null
