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

public val MaterialDesignIcons.AlarmNoteOff: ImageVector
    get() {
        if (_alarmNoteOff != null) {
            return _alarmNoteOff!!
        }
        _alarmNoteOff = Builder(name = "AlarmNoteOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                verticalLineTo(15.8f)
                lineTo(20.0f, 16.8f)
                verticalLineTo(15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                moveTo(2.38f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.0f, 4.88f)
                lineTo(2.0f, 5.71f)
                lineTo(3.29f, 7.24f)
                lineTo(4.41f, 6.3f)
                lineTo(5.21f, 7.1f)
                curveTo(1.95f, 10.85f, 2.35f, 16.54f, 6.11f, 19.8f)
                curveTo(7.74f, 21.22f, 9.83f, 22.0f, 12.0f, 22.0f)
                curveTo(12.33f, 22.0f, 12.67f, 22.0f, 13.0f, 21.94f)
                verticalLineTo(19.94f)
                curveTo(12.67f, 20.0f, 12.33f, 20.0f, 12.0f, 20.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 13.0f)
                curveTo(5.0f, 11.36f, 5.57f, 9.77f, 6.63f, 8.5f)
                lineTo(11.41f, 13.3f)
                lineTo(7.5f, 15.62f)
                lineTo(8.25f, 16.85f)
                lineTo(12.44f, 14.33f)
                lineTo(16.38f, 18.27f)
                curveTo(15.14f, 18.88f, 14.64f, 20.38f, 15.25f, 21.62f)
                curveTo(15.86f, 22.86f, 17.36f, 23.36f, 18.6f, 22.75f)
                curveTo(19.09f, 22.5f, 19.5f, 22.11f, 19.73f, 21.62f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.38f, 1.73f)
                moveTo(12.0f, 6.0f)
                curveTo(15.1f, 6.0f, 17.83f, 8.03f, 18.71f, 11.0f)
                horizontalLineTo(20.78f)
                curveTo(19.85f, 6.9f, 16.2f, 4.0f, 12.0f, 4.0f)
                curveTo(10.65f, 4.0f, 9.31f, 4.3f, 8.1f, 4.9f)
                lineTo(9.62f, 6.42f)
                curveTo(10.38f, 6.14f, 11.19f, 6.0f, 12.0f, 6.0f)
                moveTo(11.5f, 8.3f)
                lineTo(13.0f, 9.8f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(8.3f)
                moveTo(7.88f, 3.39f)
                lineTo(6.6f, 1.86f)
                lineTo(5.76f, 2.56f)
                lineTo(7.18f, 4.0f)
                lineTo(7.88f, 3.39f)
                moveTo(17.4f, 1.86f)
                lineTo(16.11f, 3.39f)
                lineTo(20.71f, 7.25f)
                lineTo(22.0f, 5.72f)
                lineTo(17.4f, 1.86f)
                close()
            }
        }
        .build()
        return _alarmNoteOff!!
    }

private var _alarmNoteOff: ImageVector? = null
