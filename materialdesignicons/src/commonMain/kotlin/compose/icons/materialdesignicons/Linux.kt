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

public val MaterialDesignIcons.Linux: ImageVector
    get() {
        if (_linux != null) {
            return _linux!!
        }
        _linux = Builder(name = "Linux", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.62f, 8.35f)
                curveTo(14.2f, 8.63f, 12.87f, 9.39f, 12.67f, 9.54f)
                curveTo(12.28f, 9.85f, 11.92f, 9.83f, 11.53f, 9.53f)
                curveTo(11.33f, 9.37f, 10.0f, 8.61f, 9.58f, 8.34f)
                curveTo(9.1f, 8.03f, 9.13f, 7.64f, 9.66f, 7.42f)
                curveTo(11.3f, 6.73f, 12.94f, 6.78f, 14.57f, 7.45f)
                curveTo(15.06f, 7.66f, 15.08f, 8.05f, 14.62f, 8.35f)
                moveTo(21.84f, 15.63f)
                curveTo(20.91f, 13.54f, 19.64f, 11.64f, 18.0f, 9.97f)
                curveTo(17.47f, 9.42f, 17.14f, 8.8f, 16.94f, 8.09f)
                curveTo(16.84f, 7.76f, 16.77f, 7.42f, 16.7f, 7.08f)
                curveTo(16.5f, 6.2f, 16.41f, 5.3f, 16.0f, 4.47f)
                curveTo(15.27f, 2.89f, 14.0f, 2.07f, 12.16f, 2.0f)
                curveTo(10.35f, 2.05f, 9.0f, 2.81f, 8.21f, 4.4f)
                curveTo(8.0f, 4.83f, 7.85f, 5.28f, 7.75f, 5.74f)
                curveTo(7.58f, 6.5f, 7.43f, 7.29f, 7.25f, 8.06f)
                curveTo(7.1f, 8.71f, 6.8f, 9.27f, 6.29f, 9.77f)
                curveTo(4.68f, 11.34f, 3.39f, 13.14f, 2.41f, 15.12f)
                curveTo(2.27f, 15.41f, 2.13f, 15.7f, 2.04f, 16.0f)
                curveTo(1.85f, 16.66f, 2.33f, 17.12f, 3.03f, 16.96f)
                curveTo(3.47f, 16.87f, 3.91f, 16.78f, 4.33f, 16.65f)
                curveTo(4.74f, 16.5f, 4.9f, 16.6f, 5.0f, 17.0f)
                curveTo(5.65f, 19.15f, 7.07f, 20.66f, 9.24f, 21.5f)
                curveTo(13.36f, 23.06f, 18.17f, 20.84f, 19.21f, 16.92f)
                curveTo(19.28f, 16.65f, 19.38f, 16.55f, 19.68f, 16.65f)
                curveTo(20.14f, 16.79f, 20.61f, 16.89f, 21.08f, 17.0f)
                curveTo(21.57f, 17.09f, 21.93f, 16.84f, 22.0f, 16.36f)
                curveTo(22.03f, 16.1f, 21.94f, 15.87f, 21.84f, 15.63f)
            }
        }
        .build()
        return _linux!!
    }

private var _linux: ImageVector? = null
