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

public val MaterialDesignIcons.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 23.0f)
                verticalLineTo(21.0f)
                curveTo(20.59f, 21.05f, 19.22f, 20.9f, 18.0f, 20.0f)
                curveTo(16.24f, 21.25f, 13.77f, 21.25f, 12.0f, 20.0f)
                curveTo(10.23f, 21.25f, 7.76f, 21.25f, 6.0f, 20.0f)
                curveTo(4.78f, 20.9f, 3.41f, 21.05f, 2.0f, 21.0f)
                verticalLineTo(23.0f)
                curveTo(3.37f, 23.05f, 4.78f, 22.94f, 6.0f, 22.25f)
                curveTo(7.84f, 23.25f, 10.15f, 23.25f, 12.0f, 22.25f)
                curveTo(13.85f, 23.25f, 16.16f, 23.25f, 18.0f, 22.25f)
                curveTo(19.22f, 22.94f, 20.63f, 23.05f, 22.0f, 23.0f)
                moveTo(20.5f, 11.97f)
                verticalLineTo(9.95f)
                curveTo(18.74f, 9.96f, 17.0f, 9.0f, 16.18f, 7.41f)
                lineTo(15.29f, 5.86f)
                curveTo(15.0f, 5.4f, 14.55f, 5.11f, 14.07f, 4.97f)
                lineTo(8.5f, 3.94f)
                lineTo(5.0f, 6.38f)
                lineTo(6.13f, 8.0f)
                lineTo(8.95f, 6.1f)
                lineTo(10.97f, 6.43f)
                lineTo(8.81f, 7.88f)
                curveTo(8.21f, 8.29f, 7.88f, 9.0f, 8.0f, 9.71f)
                lineTo(8.53f, 12.81f)
                curveTo(7.12f, 12.26f, 3.21f, 11.0f, 3.0f, 13.23f)
                curveTo(3.36f, 15.67f, 6.07f, 17.32f, 8.06f, 18.82f)
                curveTo(9.5f, 19.29f, 11.06f, 18.58f, 12.0f, 17.46f)
                curveTo(13.32f, 19.16f, 15.89f, 19.46f, 17.5f, 18.0f)
                curveTo(17.03f, 17.58f, 16.5f, 17.15f, 16.0f, 16.8f)
                verticalLineTo(12.95f)
                lineTo(12.19f, 9.95f)
                lineTo(14.44f, 8.44f)
                curveTo(15.62f, 10.59f, 18.0f, 12.0f, 20.5f, 11.97f)
                moveTo(14.0f, 14.0f)
                verticalLineTo(15.47f)
                curveTo(14.0f, 15.43f, 11.66f, 14.16f, 11.81f, 14.24f)
                lineTo(10.73f, 13.7f)
                lineTo(10.31f, 11.08f)
                lineTo(14.0f, 14.0f)
                moveTo(19.0f, 3.5f)
                curveTo(19.0f, 4.61f, 18.11f, 5.5f, 17.0f, 5.5f)
                reflectiveCurveTo(15.0f, 4.61f, 15.0f, 3.5f)
                reflectiveCurveTo(15.9f, 1.5f, 17.0f, 1.5f)
                reflectiveCurveTo(19.0f, 2.4f, 19.0f, 3.5f)
                close()
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
