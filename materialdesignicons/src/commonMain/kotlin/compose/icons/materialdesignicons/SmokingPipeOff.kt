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

public val MaterialDesignIcons.SmokingPipeOff: ImageVector
    get() {
        if (_smokingPipeOff != null) {
            return _smokingPipeOff!!
        }
        _smokingPipeOff = Builder(name = "SmokingPipeOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(19.71f, 21.6f)
                curveTo(19.19f, 21.85f, 18.62f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(13.0f, 22.0f, 11.72f, 21.5f, 8.89f, 18.65f)
                lineTo(5.12f, 14.88f)
                curveTo(4.56f, 14.32f, 3.8f, 14.0f, 3.0f, 14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                curveTo(4.33f, 12.0f, 5.6f, 12.53f, 6.53f, 13.47f)
                lineTo(10.3f, 17.23f)
                curveTo(11.0f, 17.92f, 12.0f, 18.0f, 13.0f, 18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(21.93f, 18.73f)
                curveTo(21.97f, 18.5f, 22.0f, 18.25f, 22.0f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 13.89f, 21.11f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(16.2f)
                lineTo(21.93f, 18.73f)
                moveTo(18.5f, 9.7f)
                lineTo(18.5f, 9.77f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.76f)
                curveTo(20.0f, 7.62f, 18.78f, 5.66f, 16.85f, 4.73f)
                horizontalLineTo(16.82f)
                curveTo(17.58f, 4.0f, 17.9f, 3.0f, 17.8f, 2.0f)
                horizontalLineTo(16.32f)
                curveTo(16.34f, 2.11f, 16.35f, 2.23f, 16.35f, 2.35f)
                curveTo(16.35f, 3.37f, 15.5f, 4.2f, 14.5f, 4.2f)
                horizontalLineTo(14.5f)
                verticalLineTo(5.7f)
                curveTo(16.71f, 5.7f, 18.5f, 7.5f, 18.5f, 9.7f)
                moveTo(11.83f, 8.63f)
                curveTo(12.05f, 8.68f, 12.27f, 8.7f, 12.5f, 8.7f)
                horizontalLineTo(14.0f)
                curveTo(15.07f, 8.66f, 15.96f, 9.5f, 16.0f, 10.56f)
                curveTo(16.0f, 10.61f, 16.0f, 10.65f, 16.0f, 10.7f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.36f)
                curveTo(17.42f, 8.53f, 15.88f, 7.12f, 14.05f, 7.2f)
                lineTo(14.0f, 7.2f)
                horizontalLineTo(12.5f)
                curveTo(11.45f, 7.12f, 10.65f, 6.25f, 10.65f, 5.2f)
                curveTo(10.67f, 4.22f, 11.5f, 3.43f, 12.46f, 3.45f)
                lineTo(12.5f, 3.45f)
                verticalLineTo(2.0f)
                curveTo(10.65f, 2.0f, 9.15f, 3.5f, 9.15f, 5.35f)
                curveTo(9.15f, 5.58f, 9.17f, 5.8f, 9.22f, 6.0f)
                lineTo(11.83f, 8.63f)
                close()
            }
        }
        .build()
        return _smokingPipeOff!!
    }

private var _smokingPipeOff: ImageVector? = null
