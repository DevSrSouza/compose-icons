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

public val MaterialDesignIcons.AlarmNote: ImageVector
    get() {
        if (_alarmNote != null) {
            return _alarmNote!!
        }
        _alarmNote = Builder(name = "AlarmNote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4f, 1.86f)
                lineTo(16.11f, 3.39f)
                lineTo(20.71f, 7.25f)
                lineTo(22.0f, 5.72f)
                lineTo(17.4f, 1.86f)
                moveTo(6.6f, 1.86f)
                lineTo(2.0f, 5.71f)
                lineTo(3.29f, 7.24f)
                lineTo(7.88f, 3.39f)
                lineTo(6.6f, 1.86f)
                moveTo(12.0f, 4.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 22.0f)
                curveTo(12.33f, 22.0f, 12.67f, 22.0f, 13.0f, 21.94f)
                verticalLineTo(19.94f)
                curveTo(12.67f, 20.0f, 12.33f, 20.0f, 12.0f, 20.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 13.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 6.0f)
                curveTo(15.1f, 6.0f, 17.83f, 8.03f, 18.71f, 11.0f)
                horizontalLineTo(20.78f)
                curveTo(19.85f, 6.9f, 16.2f, 4.0f, 12.0f, 4.0f)
                moveTo(23.0f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.5f, 23.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.0f, 20.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.5f, 18.0f)
                curveTo(18.04f, 18.0f, 18.57f, 18.18f, 19.0f, 18.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                moveTo(11.5f, 8.0f)
                verticalLineTo(13.25f)
                lineTo(7.5f, 15.62f)
                lineTo(8.25f, 16.85f)
                lineTo(13.0f, 14.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _alarmNote!!
    }

private var _alarmNote: ImageVector? = null
