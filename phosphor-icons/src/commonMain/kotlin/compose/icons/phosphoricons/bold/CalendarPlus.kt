package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CalendarPlus: ImageVector
    get() {
        if (_calendarPlus != null) {
            return _calendarPlus!!
        }
        _calendarPlus = Builder(name = "CalendarPlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(140.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(164.0f)
                horizontalLineTo(100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 152.0f)
                close()
                moveTo(228.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineTo(48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 28.0f)
                horizontalLineTo(68.0f)
                verticalLineTo(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(72.0f)
                verticalLineTo(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(52.0f, 52.0f)
                verticalLineTo(76.0f)
                horizontalLineTo(204.0f)
                verticalLineTo(52.0f)
                close()
                moveTo(204.0f, 204.0f)
                verticalLineTo(100.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(204.0f)
                close()
            }
        }
        .build()
        return _calendarPlus!!
    }

private var _calendarPlus: ImageVector? = null
