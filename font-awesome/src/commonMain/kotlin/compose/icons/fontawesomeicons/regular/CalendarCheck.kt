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

public val RegularGroup.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) {
            return _calendarCheck!!
        }
        _calendarCheck = Builder(name = "CalendarCheck", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.1f, 408.1f)
                curveTo(207.6f, 418.3f, 192.4f, 418.3f, 183.0f, 408.1f)
                lineTo(119.0f, 344.1f)
                curveTo(109.7f, 335.6f, 109.7f, 320.4f, 119.0f, 311.0f)
                curveTo(128.4f, 301.7f, 143.6f, 301.7f, 152.1f, 311.0f)
                lineTo(200.0f, 358.1f)
                lineTo(295.0f, 263.0f)
                curveTo(304.4f, 253.7f, 319.6f, 253.7f, 328.1f, 263.0f)
                curveTo(338.3f, 272.4f, 338.3f, 287.6f, 328.1f, 296.1f)
                lineTo(216.1f, 408.1f)
                close()
                moveTo(128.0f, 0.0f)
                curveTo(141.3f, 0.0f, 152.0f, 10.75f, 152.0f, 24.0f)
                verticalLineTo(64.0f)
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
                close()
                moveTo(400.0f, 192.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(448.0f)
                curveTo(48.0f, 456.8f, 55.16f, 464.0f, 64.0f, 464.0f)
                horizontalLineTo(384.0f)
                curveTo(392.8f, 464.0f, 400.0f, 456.8f, 400.0f, 448.0f)
                verticalLineTo(192.0f)
                close()
            }
        }
        .build()
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null
