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

public val MaterialDesignIcons.AlarmMultiple: ImageVector
    get() {
        if (_alarmMultiple != null) {
            return _alarmMultiple!!
        }
        _alarmMultiple = Builder(name = "AlarmMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.29f, 3.25f)
                lineTo(5.16f, 6.72f)
                lineTo(4.0f, 5.34f)
                lineTo(8.14f, 1.87f)
                lineTo(9.29f, 3.25f)
                moveTo(22.0f, 5.35f)
                lineTo(20.84f, 6.73f)
                lineTo(16.7f, 3.25f)
                lineTo(17.86f, 1.87f)
                lineTo(22.0f, 5.35f)
                moveTo(13.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 21.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 13.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 5.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 13.0f, 4.0f)
                moveTo(13.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 7.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 13.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 19.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 13.0f, 6.0f)
                moveTo(12.0f, 7.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.03f)
                lineTo(16.72f, 13.5f)
                lineTo(16.1f, 14.86f)
                lineTo(12.0f, 13.0f)
                verticalLineTo(7.5f)
                moveTo(1.0f, 14.0f)
                curveTo(1.0f, 11.5f, 2.13f, 9.3f, 3.91f, 7.83f)
                curveTo(3.33f, 9.1f, 3.0f, 10.5f, 3.0f, 12.0f)
                lineTo(3.06f, 13.13f)
                lineTo(3.0f, 14.0f)
                curveTo(3.0f, 16.28f, 4.27f, 18.26f, 6.14f, 19.28f)
                curveTo(7.44f, 20.5f, 9.07f, 21.39f, 10.89f, 21.78f)
                curveTo(10.28f, 21.92f, 9.65f, 22.0f, 9.0f, 22.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 1.0f, 14.0f)
                close()
            }
        }
        .build()
        return _alarmMultiple!!
    }

private var _alarmMultiple: ImageVector? = null
