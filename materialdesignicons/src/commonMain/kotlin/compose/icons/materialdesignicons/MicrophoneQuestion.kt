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

public val MaterialDesignIcons.MicrophoneQuestion: ImageVector
    get() {
        if (_microphoneQuestion != null) {
            return _microphoneQuestion!!
        }
        _microphoneQuestion = Builder(name = "MicrophoneQuestion", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                curveTo(10.66f, 2.0f, 12.0f, 3.34f, 12.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(12.0f, 12.66f, 10.66f, 14.0f, 9.0f, 14.0f)
                reflectiveCurveTo(6.0f, 12.66f, 6.0f, 11.0f)
                verticalLineTo(5.0f)
                curveTo(6.0f, 3.34f, 7.34f, 2.0f, 9.0f, 2.0f)
                moveTo(16.0f, 11.0f)
                curveTo(16.0f, 14.53f, 13.39f, 17.44f, 10.0f, 17.93f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.93f)
                curveTo(4.61f, 17.44f, 2.0f, 14.53f, 2.0f, 11.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 13.76f, 6.24f, 16.0f, 9.0f, 16.0f)
                reflectiveCurveTo(14.0f, 13.76f, 14.0f, 11.0f)
                horizontalLineTo(16.0f)
                moveTo(20.5f, 14.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(20.5f)
                moveTo(18.5f, 9.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                curveTo(17.0f, 7.34f, 18.34f, 6.0f, 20.0f, 6.0f)
                reflectiveCurveTo(23.0f, 7.34f, 23.0f, 9.0f)
                curveTo(23.0f, 9.97f, 22.5f, 10.88f, 21.71f, 11.41f)
                lineTo(21.41f, 11.6f)
                curveTo(20.84f, 12.0f, 20.5f, 12.61f, 20.5f, 13.3f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.3f)
                curveTo(19.0f, 12.11f, 19.6f, 11.0f, 20.59f, 10.35f)
                lineTo(20.88f, 10.16f)
                curveTo(21.27f, 9.9f, 21.5f, 9.47f, 21.5f, 9.0f)
                curveTo(21.5f, 8.17f, 20.83f, 7.5f, 20.0f, 7.5f)
                reflectiveCurveTo(18.5f, 8.17f, 18.5f, 9.0f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _microphoneQuestion!!
    }

private var _microphoneQuestion: ImageVector? = null
