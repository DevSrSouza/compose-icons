package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.AlarmSnooze: ImageVector
    get() {
        if (_alarmSnooze != null) {
            return _alarmSnooze!!
        }
        _alarmSnooze = Builder(name = "AlarmSnooze", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.88f, 3.39f)
                lineTo(6.6f, 1.86f)
                lineTo(2.0f, 5.71f)
                lineTo(3.29f, 7.24f)
                lineTo(7.88f, 3.39f)
                moveTo(22.0f, 5.72f)
                lineTo(17.4f, 1.86f)
                lineTo(16.11f, 3.39f)
                lineTo(20.71f, 7.25f)
                lineTo(22.0f, 5.72f)
                moveTo(12.0f, 4.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 21.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 4.0f)
                moveTo(12.0f, 20.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 13.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 13.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 20.0f)
                moveTo(9.0f, 11.0f)
                horizontalLineTo(12.63f)
                lineTo(9.0f, 15.2f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.37f)
                lineTo(15.0f, 10.8f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _alarmSnooze!!
    }

private var _alarmSnooze: ImageVector? = null
