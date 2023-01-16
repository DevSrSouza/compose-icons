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

public val MaterialDesignIcons.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9f, 18.5f)
                lineTo(21.9f, 20.1f)
                lineTo(21.5f, 22.0f)
                lineTo(12.1f, 19.5f)
                lineTo(2.7f, 22.0f)
                lineTo(2.2f, 20.1f)
                lineTo(8.2f, 18.5f)
                lineTo(2.1f, 16.9f)
                lineTo(2.6f, 15.0f)
                lineTo(12.0f, 17.5f)
                lineTo(21.4f, 15.0f)
                lineTo(21.9f, 16.9f)
                lineTo(15.9f, 18.5f)
                moveTo(16.07f, 7.92f)
                curveTo(15.91f, 7.7f, 15.71f, 7.5f, 15.5f, 7.33f)
                curveTo(15.05f, 6.9f, 14.5f, 6.59f, 14.06f, 6.13f)
                curveTo(13.0f, 5.08f, 12.79f, 3.34f, 13.44f, 2.0f)
                curveTo(12.79f, 2.17f, 12.18f, 2.54f, 11.67f, 2.95f)
                curveTo(9.84f, 4.46f, 9.11f, 7.1f, 10.0f, 9.38f)
                curveTo(10.0f, 9.45f, 10.04f, 9.53f, 10.04f, 9.62f)
                curveTo(10.04f, 9.78f, 9.93f, 9.92f, 9.79f, 10.0f)
                curveTo(9.63f, 10.05f, 9.46f, 10.0f, 9.33f, 9.9f)
                curveTo(9.28f, 9.86f, 9.25f, 9.82f, 9.22f, 9.77f)
                curveTo(8.42f, 8.74f, 8.29f, 7.26f, 8.84f, 6.07f)
                curveTo(7.65f, 7.06f, 7.0f, 8.72f, 7.11f, 10.29f)
                curveTo(7.13f, 10.65f, 7.18f, 11.0f, 7.3f, 11.36f)
                curveTo(7.41f, 11.8f, 7.59f, 12.23f, 7.82f, 12.61f)
                curveTo(8.57f, 13.86f, 9.9f, 14.76f, 11.32f, 14.94f)
                curveTo(12.84f, 15.14f, 14.46f, 14.85f, 15.63f, 13.79f)
                curveTo(16.93f, 12.59f, 17.4f, 10.67f, 16.71f, 9.0f)
                lineTo(16.61f, 8.83f)
                curveTo(16.47f, 8.5f, 16.28f, 8.2f, 16.04f, 7.93f)
                lineTo(16.07f, 7.92f)
                moveTo(13.83f, 12.47f)
                curveTo(13.63f, 12.65f, 13.31f, 12.83f, 13.05f, 12.91f)
                curveTo(12.26f, 13.19f, 11.46f, 12.79f, 11.0f, 12.31f)
                curveTo(11.84f, 12.11f, 12.34f, 11.47f, 12.5f, 10.83f)
                curveTo(12.61f, 10.25f, 12.39f, 9.78f, 12.29f, 9.22f)
                curveTo(12.21f, 8.69f, 12.22f, 8.23f, 12.42f, 7.73f)
                curveTo(12.55f, 8.0f, 12.69f, 8.28f, 12.86f, 8.5f)
                curveTo(13.41f, 9.22f, 14.27f, 9.54f, 14.45f, 10.5f)
                curveTo(14.47f, 10.63f, 14.5f, 10.72f, 14.5f, 10.83f)
                curveTo(14.5f, 11.43f, 14.26f, 12.07f, 13.82f, 12.47f)
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
