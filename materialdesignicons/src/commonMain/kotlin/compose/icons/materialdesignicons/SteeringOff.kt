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

public val MaterialDesignIcons.SteeringOff: ImageVector
    get() {
        if (_steeringOff != null) {
            return _steeringOff!!
        }
        _steeringOff = Builder(name = "SteeringOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(17.25f, 20.5f)
                curveTo(15.7f, 21.5f, 13.95f, 22.0f, 12.0f, 22.0f)
                curveTo(9.25f, 22.0f, 6.9f, 21.0f, 4.95f, 19.05f)
                curveTo(3.0f, 17.1f, 2.0f, 14.75f, 2.0f, 12.0f)
                curveTo(2.0f, 10.05f, 2.5f, 8.3f, 3.5f, 6.75f)
                lineTo(2.0f, 5.27f)
                moveTo(13.0f, 19.92f)
                curveTo(14.0f, 19.8f, 14.93f, 19.5f, 15.78f, 19.05f)
                lineTo(13.5f, 16.78f)
                curveTo(13.34f, 16.84f, 13.16f, 16.88f, 13.0f, 16.92f)
                verticalLineTo(19.92f)
                moveTo(4.08f, 11.0f)
                horizontalLineTo(7.0f)
                lineTo(7.37f, 10.63f)
                lineTo(4.96f, 8.23f)
                curveTo(4.5f, 9.08f, 4.21f, 10.0f, 4.08f, 11.0f)
                moveTo(19.92f, 13.0f)
                horizontalLineTo(16.92f)
                curveTo(16.8f, 13.54f, 16.6f, 14.05f, 16.33f, 14.5f)
                lineTo(9.91f, 8.09f)
                lineTo(10.0f, 8.0f)
                horizontalLineTo(14.0f)
                lineTo(17.0f, 11.0f)
                horizontalLineTo(19.92f)
                curveTo(19.67f, 9.05f, 18.79f, 7.38f, 17.27f, 6.0f)
                curveTo(15.76f, 4.66f, 14.0f, 4.0f, 12.0f, 4.0f)
                curveTo(10.26f, 4.0f, 8.71f, 4.5f, 7.34f, 5.5f)
                lineTo(5.91f, 4.09f)
                curveTo(7.66f, 2.71f, 9.69f, 2.0f, 12.0f, 2.0f)
                curveTo(14.75f, 2.0f, 17.1f, 3.0f, 19.05f, 4.95f)
                curveTo(21.0f, 6.9f, 22.0f, 9.25f, 22.0f, 12.0f)
                curveTo(22.0f, 14.31f, 21.29f, 16.34f, 19.91f, 18.09f)
                lineTo(18.5f, 16.67f)
                curveTo(19.28f, 15.59f, 19.76f, 14.36f, 19.92f, 13.0f)
                moveTo(11.0f, 19.92f)
                verticalLineTo(16.92f)
                curveTo(10.0f, 16.7f, 9.16f, 16.24f, 8.46f, 15.54f)
                curveTo(7.76f, 14.84f, 7.3f, 14.0f, 7.08f, 13.0f)
                horizontalLineTo(4.08f)
                curveTo(4.3f, 14.77f, 5.05f, 16.3f, 6.35f, 17.6f)
                curveTo(7.65f, 18.9f, 9.2f, 19.67f, 11.0f, 19.92f)
                close()
            }
        }
        .build()
        return _steeringOff!!
    }

private var _steeringOff: ImageVector? = null
