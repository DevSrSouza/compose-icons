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

public val MaterialDesignIcons.MotionSensorOff: ImageVector
    get() {
        if (_motionSensorOff != null) {
            return _motionSensorOff!!
        }
        _motionSensorOff = Builder(name = "MotionSensorOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4f, 8.2f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.2f)
                lineTo(11.4f, 8.2f)
                moveTo(19.67f, 1.0f)
                horizontalLineTo(18.33f)
                curveTo(18.33f, 3.58f, 20.42f, 5.67f, 23.0f, 5.67f)
                verticalLineTo(4.33f)
                curveTo(21.16f, 4.33f, 19.67f, 2.84f, 19.67f, 1.0f)
                moveTo(21.0f, 1.0f)
                curveTo(21.0f, 2.11f, 21.9f, 3.0f, 23.0f, 3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(21.0f)
                moveTo(17.0f, 1.0f)
                horizontalLineTo(15.67f)
                curveTo(15.67f, 5.05f, 18.95f, 8.33f, 23.0f, 8.33f)
                verticalLineTo(7.0f)
                curveTo(19.69f, 7.0f, 17.0f, 4.31f, 17.0f, 1.0f)
                moveTo(10.0f, 3.8f)
                curveTo(11.0f, 3.8f, 11.8f, 3.0f, 11.8f, 2.0f)
                reflectiveCurveTo(11.0f, 0.2f, 10.0f, 0.2f)
                reflectiveCurveTo(8.2f, 1.0f, 8.2f, 2.0f)
                reflectiveCurveTo(9.0f, 3.8f, 10.0f, 3.8f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.46f, 5.35f)
                lineTo(2.0f, 5.8f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.8f)
                verticalLineTo(7.33f)
                lineTo(5.05f, 6.94f)
                lineTo(5.68f, 7.57f)
                lineTo(2.0f, 22.0f)
                horizontalLineTo(3.8f)
                lineTo(6.67f, 13.89f)
                lineTo(9.0f, 17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.8f)
                verticalLineTo(15.59f)
                lineTo(8.31f, 11.05f)
                lineTo(8.5f, 10.37f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(9.38f, 4.87f)
                curveTo(9.08f, 4.37f, 8.54f, 4.03f, 7.92f, 4.03f)
                curveTo(7.75f, 4.03f, 7.58f, 4.06f, 7.42f, 4.11f)
                lineTo(7.34f, 4.14f)
                lineTo(11.35f, 8.15f)
                lineTo(9.38f, 4.87f)
                close()
            }
        }
        .build()
        return _motionSensorOff!!
    }

private var _motionSensorOff: ImageVector? = null
