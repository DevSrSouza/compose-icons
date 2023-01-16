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

public val MaterialDesignIcons.AlarmOff: ImageVector
    get() {
        if (_alarmOff != null) {
            return _alarmOff!!
        }
        _alarmOff = Builder(name = "AlarmOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.28f)
                lineTo(6.6f, 1.86f)
                lineTo(5.74f, 2.57f)
                lineTo(7.16f, 4.0f)
                moveTo(16.47f, 18.39f)
                curveTo(15.26f, 19.39f, 13.7f, 20.0f, 12.0f, 20.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 13.0f)
                curveTo(5.0f, 11.3f, 5.61f, 9.74f, 6.61f, 8.53f)
                moveTo(2.92f, 2.29f)
                lineTo(1.65f, 3.57f)
                lineTo(3.0f, 4.9f)
                lineTo(1.87f, 5.83f)
                lineTo(3.29f, 7.25f)
                lineTo(4.4f, 6.31f)
                lineTo(5.2f, 7.11f)
                curveTo(3.83f, 8.69f, 3.0f, 10.75f, 3.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 22.0f)
                curveTo(14.25f, 22.0f, 16.31f, 21.17f, 17.89f, 19.8f)
                lineTo(20.09f, 22.0f)
                lineTo(21.36f, 20.73f)
                lineTo(3.89f, 3.27f)
                lineTo(2.92f, 2.29f)
                moveTo(22.0f, 5.72f)
                lineTo(17.4f, 1.86f)
                lineTo(16.11f, 3.39f)
                lineTo(20.71f, 7.25f)
                lineTo(22.0f, 5.72f)
                moveTo(12.0f, 6.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 13.0f)
                curveTo(19.0f, 13.84f, 18.84f, 14.65f, 18.57f, 15.4f)
                lineTo(20.09f, 16.92f)
                curveTo(20.67f, 15.73f, 21.0f, 14.41f, 21.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 4.0f)
                curveTo(10.59f, 4.0f, 9.27f, 4.33f, 8.08f, 4.91f)
                lineTo(9.6f, 6.43f)
                curveTo(10.35f, 6.16f, 11.16f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _alarmOff!!
    }

private var _alarmOff: ImageVector? = null
