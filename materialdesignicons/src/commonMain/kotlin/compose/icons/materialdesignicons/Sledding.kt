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

public val MaterialDesignIcons.Sledding: ImageVector
    get() {
        if (_sledding != null) {
            return _sledding!!
        }
        _sledding = Builder(name = "Sledding", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.91f, 16.64f)
                curveTo(22.75f, 15.95f, 22.44f, 15.34f, 21.97f, 14.81f)
                curveTo(21.5f, 14.28f, 20.91f, 13.91f, 20.2f, 13.69f)
                lineTo(19.77f, 15.14f)
                curveTo(20.43f, 15.33f, 20.91f, 15.73f, 21.23f, 16.36f)
                curveTo(21.54f, 17.0f, 21.58f, 17.62f, 21.37f, 18.27f)
                curveTo(21.15f, 18.93f, 20.73f, 19.41f, 20.12f, 19.73f)
                reflectiveCurveTo(18.88f, 20.08f, 18.23f, 19.86f)
                lineTo(14.9f, 18.79f)
                lineTo(15.37f, 17.38f)
                lineTo(18.7f, 18.46f)
                lineTo(19.16f, 17.0f)
                lineTo(17.2f, 16.4f)
                lineTo(15.14f, 11.91f)
                curveTo(14.95f, 11.5f, 14.66f, 11.19f, 14.27f, 10.97f)
                curveTo(13.88f, 10.75f, 13.45f, 10.67f, 13.0f, 10.74f)
                lineTo(10.88f, 11.11f)
                lineTo(11.91f, 7.84f)
                curveTo(12.06f, 7.37f, 12.03f, 6.91f, 11.81f, 6.5f)
                curveTo(11.6f, 6.04f, 11.24f, 5.74f, 10.74f, 5.59f)
                curveTo(10.33f, 5.46f, 9.91f, 5.5f, 9.47f, 5.68f)
                lineTo(4.0f, 8.0f)
                verticalLineTo(12.1f)
                lineTo(2.4f, 11.58f)
                lineTo(1.94f, 13.0f)
                lineTo(5.87f, 14.3f)
                lineTo(5.4f, 15.7f)
                lineTo(1.47f, 14.44f)
                lineTo(1.0f, 15.84f)
                lineTo(17.76f, 21.32f)
                curveTo(18.45f, 21.54f, 19.13f, 21.57f, 19.82f, 21.41f)
                curveTo(20.5f, 21.26f, 21.12f, 20.94f, 21.65f, 20.5f)
                curveTo(22.18f, 20.0f, 22.55f, 19.43f, 22.77f, 18.74f)
                curveTo(23.0f, 18.0f, 23.07f, 17.32f, 22.91f, 16.64f)
                moveTo(6.0f, 9.33f)
                lineTo(7.93f, 8.5f)
                lineTo(6.9f, 11.67f)
                curveTo(6.74f, 12.14f, 6.79f, 12.61f, 7.04f, 13.08f)
                lineTo(6.0f, 12.75f)
                verticalLineTo(9.33f)
                moveTo(13.5f, 18.32f)
                lineTo(6.81f, 16.17f)
                lineTo(7.27f, 14.76f)
                lineTo(13.92f, 16.92f)
                lineTo(13.5f, 18.32f)
                moveTo(9.47f, 13.87f)
                lineTo(13.45f, 13.0f)
                lineTo(14.62f, 15.56f)
                lineTo(9.47f, 13.87f)
                moveTo(14.0f, 3.0f)
                curveTo(14.0f, 4.11f, 13.11f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(10.0f, 4.11f, 10.0f, 3.0f)
                reflectiveCurveTo(10.9f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(14.0f, 1.9f, 14.0f, 3.0f)
                close()
            }
        }
        .build()
        return _sledding!!
    }

private var _sledding: ImageVector? = null
