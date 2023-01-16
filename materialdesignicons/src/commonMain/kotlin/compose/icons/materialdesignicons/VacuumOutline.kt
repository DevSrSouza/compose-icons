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

public val MaterialDesignIcons.VacuumOutline: ImageVector
    get() {
        if (_vacuumOutline != null) {
            return _vacuumOutline!!
        }
        _vacuumOutline = Builder(name = "VacuumOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.66f, 20.0f)
                lineTo(13.87f, 3.81f)
                curveTo(13.5f, 2.97f, 12.93f, 2.29f, 12.16f, 1.77f)
                curveTo(11.4f, 1.26f, 10.55f, 1.0f, 9.61f, 1.0f)
                curveTo(8.77f, 1.0f, 8.0f, 1.21f, 7.3f, 1.63f)
                reflectiveCurveTo(6.04f, 2.62f, 5.63f, 3.32f)
                reflectiveCurveTo(5.0f, 4.8f, 5.0f, 5.64f)
                lineTo(5.03f, 9.0f)
                horizontalLineTo(2.03f)
                verticalLineTo(14.45f)
                curveTo(2.65f, 14.17f, 3.31f, 14.03f, 4.0f, 14.03f)
                verticalLineTo(11.03f)
                horizontalLineTo(9.0f)
                curveTo(9.57f, 11.03f, 10.04f, 11.23f, 10.43f, 11.62f)
                curveTo(10.82f, 12.0f, 11.0f, 12.47f, 11.0f, 13.0f)
                verticalLineTo(20.03f)
                horizontalLineTo(8.91f)
                curveTo(8.76f, 20.75f, 8.44f, 21.41f, 7.97f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                curveTo(13.0f, 12.28f, 12.8f, 11.62f, 12.45f, 11.0f)
                reflectiveCurveTo(11.61f, 9.91f, 11.0f, 9.56f)
                curveTo(10.42f, 9.2f, 9.75f, 9.0f, 9.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.64f)
                curveTo(7.0f, 4.92f, 7.25f, 4.31f, 7.76f, 3.79f)
                reflectiveCurveTo(8.89f, 3.0f, 9.61f, 3.0f)
                curveTo(10.14f, 3.0f, 10.63f, 3.16f, 11.06f, 3.46f)
                reflectiveCurveTo(11.81f, 4.14f, 12.0f, 4.61f)
                lineTo(18.46f, 20.0f)
                lineTo(16.0f, 20.03f)
                verticalLineTo(22.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(20.03f)
                lineTo(20.66f, 20.0f)
                moveTo(4.0f, 18.0f)
                curveTo(4.55f, 18.0f, 5.0f, 18.45f, 5.0f, 19.0f)
                reflectiveCurveTo(4.55f, 20.0f, 4.0f, 20.0f)
                reflectiveCurveTo(3.0f, 19.55f, 3.0f, 19.0f)
                reflectiveCurveTo(3.45f, 18.0f, 4.0f, 18.0f)
                moveTo(4.0f, 16.0f)
                curveTo(2.34f, 16.0f, 1.0f, 17.34f, 1.0f, 19.0f)
                reflectiveCurveTo(2.34f, 22.0f, 4.0f, 22.0f)
                reflectiveCurveTo(7.0f, 20.66f, 7.0f, 19.0f)
                reflectiveCurveTo(5.66f, 16.0f, 4.0f, 16.0f)
                close()
            }
        }
        .build()
        return _vacuumOutline!!
    }

private var _vacuumOutline: ImageVector? = null
