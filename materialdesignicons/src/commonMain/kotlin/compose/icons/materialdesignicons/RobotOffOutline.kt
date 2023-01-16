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

public val MaterialDesignIcons.RobotOffOutline: ImageVector
    get() {
        if (_robotOffOutline != null) {
            return _robotOffOutline!!
        }
        _robotOffOutline = Builder(name = "RobotOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(23.0f, 18.5f, 22.64f, 18.88f, 22.17f, 18.97f)
                lineTo(20.2f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.2f)
                lineTo(19.0f, 15.8f)
                verticalLineTo(14.0f)
                curveTo(19.0f, 11.24f, 16.76f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(12.2f)
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
                moveTo(8.5f, 13.5f)
                curveTo(7.4f, 13.5f, 6.5f, 14.4f, 6.5f, 15.5f)
                reflectiveCurveTo(7.4f, 17.5f, 8.5f, 17.5f)
                reflectiveCurveTo(10.5f, 16.61f, 10.5f, 15.5f)
                reflectiveCurveTo(9.61f, 13.5f, 8.5f, 13.5f)
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
                moveTo(18.11f, 20.0f)
                lineTo(15.6f, 17.5f)
                curveTo(15.57f, 17.5f, 15.53f, 17.5f, 15.5f, 17.5f)
                curveTo(14.4f, 17.5f, 13.5f, 16.61f, 13.5f, 15.5f)
                curveTo(13.5f, 15.47f, 13.5f, 15.43f, 13.5f, 15.4f)
                lineTo(7.7f, 9.59f)
                curveTo(6.1f, 10.42f, 5.0f, 12.08f, 5.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.11f)
                close()
            }
        }
        .build()
        return _robotOffOutline!!
    }

private var _robotOffOutline: ImageVector? = null
