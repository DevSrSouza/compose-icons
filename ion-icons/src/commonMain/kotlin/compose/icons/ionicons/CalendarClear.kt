package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CalendarClear: ImageVector
    get() {
        if (_calendarClear != null) {
            return _calendarClear!!
        }
        _calendarClear = Builder(name = "CalendarClear", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, -64.0f)
                horizontalLineTo(400.0f)
                verticalLineTo(48.45f)
                curveToRelative(0.0f, -8.61f, -6.62f, -16.0f, -15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 368.0f, 48.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(144.0f)
                verticalLineTo(48.45f)
                curveToRelative(0.0f, -8.61f, -6.62f, -16.0f, -15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 112.0f, 48.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, 64.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(476.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineTo(416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _calendarClear!!
    }

private var _calendarClear: ImageVector? = null
