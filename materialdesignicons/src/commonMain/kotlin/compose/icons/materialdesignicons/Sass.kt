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

public val MaterialDesignIcons.Sass: ImageVector
    get() {
        if (_sass != null) {
            return _sass!!
        }
        _sass = Builder(name = "Sass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(10.0f, 15.33f)
                curveTo(10.16f, 15.87f, 10.14f, 16.37f, 10.0f, 16.83f)
                curveTo(10.0f, 16.88f, 9.96f, 16.93f, 9.94f, 17.0f)
                curveTo(9.92f, 17.0f, 9.9f, 17.07f, 9.87f, 17.12f)
                curveTo(9.76f, 17.36f, 9.6f, 17.59f, 9.41f, 17.79f)
                curveTo(8.83f, 18.43f, 8.0f, 18.67f, 7.67f, 18.47f)
                curveTo(7.29f, 18.25f, 7.5f, 17.35f, 8.16f, 16.64f)
                curveTo(8.88f, 15.88f, 9.92f, 15.38f, 9.92f, 15.38f)
                verticalLineTo(15.38f)
                lineTo(10.0f, 15.33f)
                moveTo(18.27f, 6.28f)
                curveTo(17.82f, 4.5f, 14.87f, 3.92f, 12.09f, 4.91f)
                curveTo(10.43f, 5.5f, 8.63f, 6.42f, 7.34f, 7.63f)
                curveTo(5.81f, 9.07f, 5.56f, 10.32f, 5.66f, 10.84f)
                curveTo(6.0f, 12.68f, 8.54f, 13.89f, 9.58f, 14.78f)
                verticalLineTo(14.79f)
                curveTo(9.28f, 14.94f, 7.04f, 16.07f, 6.5f, 17.23f)
                curveTo(5.96f, 18.45f, 6.6f, 19.33f, 7.0f, 19.45f)
                curveTo(8.34f, 19.81f, 9.69f, 19.16f, 10.41f, 18.07f)
                curveTo(11.11f, 17.03f, 11.06f, 15.68f, 10.75f, 15.0f)
                curveTo(11.17f, 14.9f, 11.66f, 14.85f, 12.28f, 14.92f)
                curveTo(14.04f, 15.13f, 14.38f, 16.22f, 14.31f, 16.68f)
                curveTo(14.25f, 17.14f, 13.88f, 17.39f, 13.76f, 17.47f)
                curveTo(13.64f, 17.54f, 13.6f, 17.57f, 13.61f, 17.63f)
                curveTo(13.62f, 17.71f, 13.68f, 17.71f, 13.78f, 17.69f)
                curveTo(13.93f, 17.66f, 14.71f, 17.32f, 14.74f, 16.47f)
                curveTo(14.78f, 15.39f, 13.75f, 14.19f, 11.93f, 14.22f)
                curveTo(11.18f, 14.24f, 10.71f, 14.31f, 10.37f, 14.44f)
                lineTo(10.29f, 14.35f)
                curveTo(9.16f, 13.15f, 7.08f, 12.3f, 7.17f, 10.68f)
                curveTo(7.2f, 10.09f, 7.4f, 8.55f, 11.17f, 6.67f)
                curveTo(14.25f, 5.13f, 16.72f, 5.55f, 17.15f, 6.5f)
                curveTo(17.76f, 7.83f, 15.83f, 10.32f, 12.63f, 10.68f)
                curveTo(11.41f, 10.82f, 10.76f, 10.34f, 10.6f, 10.17f)
                curveTo(10.43f, 10.0f, 10.41f, 9.97f, 10.35f, 10.0f)
                curveTo(10.24f, 10.07f, 10.31f, 10.23f, 10.35f, 10.33f)
                curveTo(10.44f, 10.58f, 10.84f, 11.0f, 11.5f, 11.24f)
                curveTo(12.09f, 11.43f, 13.53f, 11.54f, 15.26f, 10.87f)
                curveTo(17.2f, 10.12f, 18.72f, 8.03f, 18.27f, 6.28f)
                close()
            }
        }
        .build()
        return _sass!!
    }

private var _sass: ImageVector? = null
