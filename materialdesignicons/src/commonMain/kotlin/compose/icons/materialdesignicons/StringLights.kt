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

public val MaterialDesignIcons.StringLights: ImageVector
    get() {
        if (_stringLights != null) {
            return _stringLights!!
        }
        _stringLights = Builder(name = "StringLights", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.56f, 11.39f)
                curveTo(22.36f, 10.59f, 21.82f, 9.85f, 21.05f, 9.44f)
                lineTo(20.63f, 7.74f)
                curveTo(21.11f, 7.58f, 21.57f, 7.41f, 22.0f, 7.23f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 6.07f, 16.53f, 7.03f, 12.0f, 7.03f)
                reflectiveCurveTo(4.0f, 6.07f, 2.0f, 5.0f)
                verticalLineTo(7.23f)
                curveTo(2.43f, 7.41f, 2.89f, 7.58f, 3.37f, 7.74f)
                lineTo(2.95f, 9.44f)
                curveTo(2.18f, 9.85f, 1.64f, 10.59f, 1.44f, 11.39f)
                curveTo(0.905f, 13.57f, 0.385f, 17.31f, 2.92f, 17.93f)
                curveTo(4.0f, 18.2f, 6.0f, 17.89f, 7.27f, 12.82f)
                curveTo(7.46f, 12.0f, 7.33f, 11.12f, 6.84f, 10.39f)
                lineTo(7.26f, 8.67f)
                curveTo(8.14f, 8.81f, 9.05f, 8.9f, 10.0f, 8.96f)
                verticalLineTo(10.74f)
                curveTo(9.35f, 11.33f, 9.0f, 12.17f, 9.0f, 13.0f)
                curveTo(9.0f, 15.24f, 9.39f, 19.0f, 12.0f, 19.0f)
                curveTo(13.12f, 19.0f, 15.0f, 18.22f, 15.0f, 13.0f)
                curveTo(15.0f, 12.17f, 14.65f, 11.33f, 14.0f, 10.74f)
                verticalLineTo(8.96f)
                curveTo(14.95f, 8.9f, 15.86f, 8.81f, 16.74f, 8.67f)
                lineTo(17.16f, 10.39f)
                curveTo(16.67f, 11.12f, 16.54f, 12.0f, 16.73f, 12.82f)
                curveTo(18.0f, 17.89f, 20.0f, 18.2f, 21.08f, 17.93f)
                curveTo(23.61f, 17.31f, 23.09f, 13.57f, 22.56f, 11.39f)
                moveTo(5.81f, 12.47f)
                curveTo(5.81f, 12.47f, 4.74f, 16.84f, 3.28f, 16.5f)
                curveTo(1.82f, 16.12f, 2.9f, 11.75f, 2.9f, 11.75f)
                reflectiveCurveTo(3.26f, 10.29f, 4.71f, 10.65f)
                reflectiveCurveTo(5.81f, 12.47f, 5.81f, 12.47f)
                moveTo(12.0f, 17.5f)
                curveTo(10.5f, 17.5f, 10.5f, 13.0f, 10.5f, 13.0f)
                reflectiveCurveTo(10.5f, 11.5f, 12.0f, 11.5f)
                reflectiveCurveTo(13.5f, 13.0f, 13.5f, 13.0f)
                reflectiveCurveTo(13.5f, 17.5f, 12.0f, 17.5f)
                moveTo(20.72f, 16.5f)
                curveTo(19.27f, 16.84f, 18.19f, 12.47f, 18.19f, 12.47f)
                reflectiveCurveTo(17.83f, 11.0f, 19.29f, 10.65f)
                reflectiveCurveTo(21.1f, 11.75f, 21.1f, 11.75f)
                reflectiveCurveTo(22.18f, 16.12f, 20.72f, 16.5f)
                close()
            }
        }
        .build()
        return _stringLights!!
    }

private var _stringLights: ImageVector? = null
