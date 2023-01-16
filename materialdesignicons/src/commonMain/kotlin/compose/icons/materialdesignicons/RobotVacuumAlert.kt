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

public val MaterialDesignIcons.RobotVacuumAlert: ImageVector
    get() {
        if (_robotVacuumAlert != null) {
            return _robotVacuumAlert!!
        }
        _robotVacuumAlert = Builder(name = "RobotVacuumAlert", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(12.6f, 2.0f, 15.2f, 3.1f, 17.1f, 4.9f)
                lineTo(15.7f, 6.3f)
                curveTo(14.1f, 4.8f, 12.1f, 4.0f, 10.0f, 4.0f)
                reflectiveCurveTo(5.8f, 4.8f, 4.3f, 6.3f)
                lineTo(2.9f, 4.9f)
                curveTo(4.8f, 3.1f, 7.4f, 2.0f, 10.0f, 2.0f)
                moveTo(1.7f, 6.5f)
                lineTo(3.2f, 7.9f)
                curveTo(2.4f, 9.2f, 2.0f, 10.6f, 2.0f, 12.0f)
                curveTo(2.0f, 16.4f, 5.6f, 20.0f, 10.0f, 20.0f)
                reflectiveCurveTo(18.0f, 16.4f, 18.0f, 12.0f)
                curveTo(18.0f, 10.6f, 17.6f, 9.2f, 16.9f, 7.9f)
                lineTo(18.4f, 6.5f)
                curveTo(19.4f, 8.1f, 20.0f, 10.0f, 20.0f, 12.0f)
                curveTo(20.0f, 17.5f, 15.5f, 22.0f, 10.0f, 22.0f)
                reflectiveCurveTo(0.0f, 17.5f, 0.0f, 12.0f)
                curveTo(0.0f, 10.0f, 0.6f, 8.1f, 1.7f, 6.5f)
                moveTo(10.0f, 6.0f)
                curveTo(13.3f, 6.0f, 16.0f, 8.7f, 16.0f, 12.0f)
                curveTo(16.0f, 13.6f, 15.4f, 15.1f, 14.2f, 16.2f)
                lineTo(12.8f, 14.8f)
                curveTo(12.1f, 15.6f, 11.1f, 16.0f, 10.0f, 16.0f)
                reflectiveCurveTo(7.9f, 15.6f, 7.2f, 14.8f)
                lineTo(5.8f, 16.2f)
                curveTo(4.6f, 15.1f, 4.0f, 13.6f, 4.0f, 12.0f)
                curveTo(4.0f, 8.7f, 6.7f, 6.0f, 10.0f, 6.0f)
                moveTo(10.0f, 8.0f)
                curveTo(9.4f, 8.0f, 9.0f, 8.4f, 9.0f, 9.0f)
                reflectiveCurveTo(9.4f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveTo(11.0f, 9.6f, 11.0f, 9.0f)
                reflectiveCurveTo(10.6f, 8.0f, 10.0f, 8.0f)
                moveTo(22.0f, 12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                moveTo(22.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _robotVacuumAlert!!
    }

private var _robotVacuumAlert: ImageVector? = null
