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

public val MaterialDesignIcons.MicrophoneQuestionOutline: ImageVector
    get() {
        if (_microphoneQuestionOutline != null) {
            return _microphoneQuestionOutline!!
        }
        _microphoneQuestionOutline = Builder(name = "MicrophoneQuestionOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3f, 11.0f)
                curveTo(14.3f, 14.0f, 11.76f, 16.1f, 9.0f, 16.1f)
                reflectiveCurveTo(3.7f, 14.0f, 3.7f, 11.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 14.41f, 4.72f, 17.23f, 8.0f, 17.72f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.72f)
                curveTo(13.28f, 17.23f, 16.0f, 14.41f, 16.0f, 11.0f)
                moveTo(7.8f, 4.9f)
                curveTo(7.8f, 4.24f, 8.34f, 3.7f, 9.0f, 3.7f)
                reflectiveCurveTo(10.2f, 4.24f, 10.2f, 4.9f)
                lineTo(10.19f, 11.1f)
                curveTo(10.19f, 11.76f, 9.66f, 12.3f, 9.0f, 12.3f)
                reflectiveCurveTo(7.8f, 11.76f, 7.8f, 11.1f)
                moveTo(9.0f, 14.0f)
                curveTo(10.66f, 14.0f, 12.0f, 12.66f, 12.0f, 11.0f)
                verticalLineTo(5.0f)
                curveTo(12.0f, 3.34f, 10.66f, 2.0f, 9.0f, 2.0f)
                reflectiveCurveTo(6.0f, 3.34f, 6.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(6.0f, 12.66f, 7.34f, 14.0f, 9.0f, 14.0f)
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
        return _microphoneQuestionOutline!!
    }

private var _microphoneQuestionOutline: ImageVector? = null
