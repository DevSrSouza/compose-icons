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

public val MaterialDesignIcons.Ubuntu: ImageVector
    get() {
        if (_ubuntu != null) {
            return _ubuntu!!
        }
        _ubuntu = Builder(name = "Ubuntu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                moveTo(14.34f, 7.74f)
                curveTo(14.92f, 8.07f, 15.65f, 7.87f, 16.0f, 7.3f)
                curveTo(16.31f, 6.73f, 16.12f, 6.0f, 15.54f, 5.66f)
                curveTo(14.97f, 5.33f, 14.23f, 5.5f, 13.9f, 6.1f)
                curveTo(13.57f, 6.67f, 13.77f, 7.41f, 14.34f, 7.74f)
                moveTo(11.88f, 15.5f)
                curveTo(11.35f, 15.5f, 10.85f, 15.39f, 10.41f, 15.18f)
                lineTo(9.57f, 16.68f)
                curveTo(10.27f, 17.0f, 11.05f, 17.22f, 11.88f, 17.22f)
                curveTo(12.37f, 17.22f, 12.83f, 17.15f, 13.28f, 17.03f)
                curveTo(13.36f, 16.54f, 13.64f, 16.1f, 14.1f, 15.84f)
                curveTo(14.56f, 15.57f, 15.08f, 15.55f, 15.54f, 15.72f)
                curveTo(16.43f, 14.85f, 17.0f, 13.66f, 17.09f, 12.33f)
                lineTo(15.38f, 12.31f)
                curveTo(15.22f, 14.1f, 13.72f, 15.5f, 11.88f, 15.5f)
                moveTo(11.88f, 8.5f)
                curveTo(13.72f, 8.5f, 15.22f, 9.89f, 15.38f, 11.69f)
                lineTo(17.09f, 11.66f)
                curveTo(17.0f, 10.34f, 16.43f, 9.15f, 15.54f, 8.28f)
                curveTo(15.08f, 8.45f, 14.55f, 8.42f, 14.1f, 8.16f)
                curveTo(13.64f, 7.9f, 13.36f, 7.45f, 13.28f, 6.97f)
                curveTo(12.83f, 6.85f, 12.37f, 6.78f, 11.88f, 6.78f)
                curveTo(11.05f, 6.78f, 10.27f, 6.97f, 9.57f, 7.32f)
                lineTo(10.41f, 8.82f)
                curveTo(10.85f, 8.61f, 11.35f, 8.5f, 11.88f, 8.5f)
                moveTo(8.37f, 12.0f)
                curveTo(8.37f, 10.81f, 8.96f, 9.76f, 9.86f, 9.13f)
                lineTo(9.0f, 7.65f)
                curveTo(7.94f, 8.36f, 7.15f, 9.43f, 6.83f, 10.69f)
                curveTo(7.21f, 11.0f, 7.45f, 11.47f, 7.45f, 12.0f)
                curveTo(7.45f, 12.53f, 7.21f, 13.0f, 6.83f, 13.31f)
                curveTo(7.15f, 14.56f, 7.94f, 15.64f, 9.0f, 16.34f)
                lineTo(9.86f, 14.87f)
                curveTo(8.96f, 14.24f, 8.37f, 13.19f, 8.37f, 12.0f)
                moveTo(14.34f, 16.26f)
                curveTo(13.77f, 16.59f, 13.57f, 17.32f, 13.9f, 17.9f)
                curveTo(14.23f, 18.47f, 14.97f, 18.67f, 15.54f, 18.34f)
                curveTo(16.12f, 18.0f, 16.31f, 17.27f, 16.0f, 16.7f)
                curveTo(15.65f, 16.12f, 14.92f, 15.93f, 14.34f, 16.26f)
                moveTo(5.76f, 10.8f)
                curveTo(5.1f, 10.8f, 4.56f, 11.34f, 4.56f, 12.0f)
                curveTo(4.56f, 12.66f, 5.1f, 13.2f, 5.76f, 13.2f)
                curveTo(6.43f, 13.2f, 6.96f, 12.66f, 6.96f, 12.0f)
                curveTo(6.96f, 11.34f, 6.43f, 10.8f, 5.76f, 10.8f)
                close()
            }
        }
        .build()
        return _ubuntu!!
    }

private var _ubuntu: ImageVector? = null
