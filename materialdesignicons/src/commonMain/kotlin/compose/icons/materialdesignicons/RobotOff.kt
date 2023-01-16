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

public val MaterialDesignIcons.RobotOff: ImageVector
    get() {
        if (_robotOff != null) {
            return _robotOff!!
        }
        _robotOff = Builder(name = "RobotOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(23.0f, 18.5f, 22.64f, 18.88f, 22.17f, 18.97f)
                lineTo(18.97f, 15.77f)
                curveTo(19.0f, 15.68f, 19.0f, 15.59f, 19.0f, 15.5f)
                curveTo(19.0f, 14.12f, 17.88f, 13.0f, 16.5f, 13.0f)
                curveTo(16.41f, 13.0f, 16.32f, 13.0f, 16.23f, 13.03f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.73f)
                curveTo(10.4f, 5.39f, 10.0f, 4.74f, 10.0f, 4.0f)
                curveTo(10.0f, 2.9f, 10.9f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(14.0f, 2.9f, 14.0f, 4.0f)
                curveTo(14.0f, 4.74f, 13.6f, 5.39f, 13.0f, 5.73f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                curveTo(17.87f, 7.0f, 21.0f, 10.13f, 21.0f, 14.0f)
                horizontalLineTo(22.0f)
                curveTo(22.55f, 14.0f, 23.0f, 14.45f, 23.0f, 15.0f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.89f, 21.78f)
                curveTo(19.62f, 21.92f, 19.32f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 22.0f, 3.0f, 21.11f, 3.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 19.0f, 1.0f, 18.55f, 1.0f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(1.0f, 14.45f, 1.45f, 14.0f, 2.0f, 14.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 11.53f, 4.29f, 9.36f, 6.22f, 8.11f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(10.0f, 15.5f)
                curveTo(10.0f, 14.12f, 8.88f, 13.0f, 7.5f, 13.0f)
                reflectiveCurveTo(5.0f, 14.12f, 5.0f, 15.5f)
                reflectiveCurveTo(6.12f, 18.0f, 7.5f, 18.0f)
                reflectiveCurveTo(10.0f, 16.88f, 10.0f, 15.5f)
                moveTo(16.07f, 17.96f)
                lineTo(14.04f, 15.93f)
                curveTo(14.23f, 16.97f, 15.04f, 17.77f, 16.07f, 17.96f)
                close()
            }
        }
        .build()
        return _robotOff!!
    }

private var _robotOff: ImageVector? = null
