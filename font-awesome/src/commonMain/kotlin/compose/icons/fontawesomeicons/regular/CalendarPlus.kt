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

public val RegularGroup.CalendarPlus: ImageVector
    get() {
        if (_calendarPlus != null) {
            return _calendarPlus!!
        }
        _calendarPlus = Builder(name = "CalendarPlus", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 232.0f)
                curveTo(237.3f, 232.0f, 248.0f, 242.7f, 248.0f, 256.0f)
                verticalLineTo(304.0f)
                horizontalLineTo(296.0f)
                curveTo(309.3f, 304.0f, 320.0f, 314.7f, 320.0f, 328.0f)
                curveTo(320.0f, 341.3f, 309.3f, 352.0f, 296.0f, 352.0f)
                horizontalLineTo(248.0f)
                verticalLineTo(400.0f)
                curveTo(248.0f, 413.3f, 237.3f, 424.0f, 224.0f, 424.0f)
                curveTo(210.7f, 424.0f, 200.0f, 413.3f, 200.0f, 400.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(152.0f)
                curveTo(138.7f, 352.0f, 128.0f, 341.3f, 128.0f, 328.0f)
                curveTo(128.0f, 314.7f, 138.7f, 304.0f, 152.0f, 304.0f)
                horizontalLineTo(200.0f)
                verticalLineTo(256.0f)
                curveTo(200.0f, 242.7f, 210.7f, 232.0f, 224.0f, 232.0f)
                close()
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
                moveTo(48.0f, 448.0f)
                curveTo(48.0f, 456.8f, 55.16f, 464.0f, 64.0f, 464.0f)
                horizontalLineTo(384.0f)
                curveTo(392.8f, 464.0f, 400.0f, 456.8f, 400.0f, 448.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(448.0f)
                close()
            }
        }
        .build()
        return _calendarPlus!!
    }

private var _calendarPlus: ImageVector? = null
