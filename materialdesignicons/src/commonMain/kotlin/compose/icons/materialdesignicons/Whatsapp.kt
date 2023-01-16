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

public val MaterialDesignIcons.Whatsapp: ImageVector
    get() {
        if (_whatsapp != null) {
            return _whatsapp!!
        }
        _whatsapp = Builder(name = "Whatsapp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.04f, 2.0f)
                curveTo(6.58f, 2.0f, 2.13f, 6.45f, 2.13f, 11.91f)
                curveTo(2.13f, 13.66f, 2.59f, 15.36f, 3.45f, 16.86f)
                lineTo(2.05f, 22.0f)
                lineTo(7.3f, 20.62f)
                curveTo(8.75f, 21.41f, 10.38f, 21.83f, 12.04f, 21.83f)
                curveTo(17.5f, 21.83f, 21.95f, 17.38f, 21.95f, 11.92f)
                curveTo(21.95f, 9.27f, 20.92f, 6.78f, 19.05f, 4.91f)
                curveTo(17.18f, 3.03f, 14.69f, 2.0f, 12.04f, 2.0f)
                moveTo(12.05f, 3.67f)
                curveTo(14.25f, 3.67f, 16.31f, 4.53f, 17.87f, 6.09f)
                curveTo(19.42f, 7.65f, 20.28f, 9.72f, 20.28f, 11.92f)
                curveTo(20.28f, 16.46f, 16.58f, 20.15f, 12.04f, 20.15f)
                curveTo(10.56f, 20.15f, 9.11f, 19.76f, 7.85f, 19.0f)
                lineTo(7.55f, 18.83f)
                lineTo(4.43f, 19.65f)
                lineTo(5.26f, 16.61f)
                lineTo(5.06f, 16.29f)
                curveTo(4.24f, 15.0f, 3.8f, 13.47f, 3.8f, 11.91f)
                curveTo(3.81f, 7.37f, 7.5f, 3.67f, 12.05f, 3.67f)
                moveTo(8.53f, 7.33f)
                curveTo(8.37f, 7.33f, 8.1f, 7.39f, 7.87f, 7.64f)
                curveTo(7.65f, 7.89f, 7.0f, 8.5f, 7.0f, 9.71f)
                curveTo(7.0f, 10.93f, 7.89f, 12.1f, 8.0f, 12.27f)
                curveTo(8.14f, 12.44f, 9.76f, 14.94f, 12.25f, 16.0f)
                curveTo(12.84f, 16.27f, 13.3f, 16.42f, 13.66f, 16.53f)
                curveTo(14.25f, 16.72f, 14.79f, 16.69f, 15.22f, 16.63f)
                curveTo(15.7f, 16.56f, 16.68f, 16.03f, 16.89f, 15.45f)
                curveTo(17.1f, 14.87f, 17.1f, 14.38f, 17.04f, 14.27f)
                curveTo(16.97f, 14.17f, 16.81f, 14.11f, 16.56f, 14.0f)
                curveTo(16.31f, 13.86f, 15.09f, 13.26f, 14.87f, 13.18f)
                curveTo(14.64f, 13.1f, 14.5f, 13.06f, 14.31f, 13.3f)
                curveTo(14.15f, 13.55f, 13.67f, 14.11f, 13.53f, 14.27f)
                curveTo(13.38f, 14.44f, 13.24f, 14.46f, 13.0f, 14.34f)
                curveTo(12.74f, 14.21f, 11.94f, 13.95f, 11.0f, 13.11f)
                curveTo(10.26f, 12.45f, 9.77f, 11.64f, 9.62f, 11.39f)
                curveTo(9.5f, 11.15f, 9.61f, 11.0f, 9.73f, 10.89f)
                curveTo(9.84f, 10.78f, 10.0f, 10.6f, 10.1f, 10.45f)
                curveTo(10.23f, 10.31f, 10.27f, 10.2f, 10.35f, 10.04f)
                curveTo(10.43f, 9.87f, 10.39f, 9.73f, 10.33f, 9.61f)
                curveTo(10.27f, 9.5f, 9.77f, 8.26f, 9.56f, 7.77f)
                curveTo(9.36f, 7.29f, 9.16f, 7.35f, 9.0f, 7.34f)
                curveTo(8.86f, 7.34f, 8.7f, 7.33f, 8.53f, 7.33f)
                close()
            }
        }
        .build()
        return _whatsapp!!
    }

private var _whatsapp: ImageVector? = null
