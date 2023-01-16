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

public val MaterialDesignIcons.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.66f, 11.2f)
                curveTo(17.43f, 10.9f, 17.15f, 10.64f, 16.89f, 10.38f)
                curveTo(16.22f, 9.78f, 15.46f, 9.35f, 14.82f, 8.72f)
                curveTo(13.33f, 7.26f, 13.0f, 4.85f, 13.95f, 3.0f)
                curveTo(13.0f, 3.23f, 12.17f, 3.75f, 11.46f, 4.32f)
                curveTo(8.87f, 6.4f, 7.85f, 10.07f, 9.07f, 13.22f)
                curveTo(9.11f, 13.32f, 9.15f, 13.42f, 9.15f, 13.55f)
                curveTo(9.15f, 13.77f, 9.0f, 13.97f, 8.8f, 14.05f)
                curveTo(8.57f, 14.15f, 8.33f, 14.09f, 8.14f, 13.93f)
                curveTo(8.08f, 13.88f, 8.04f, 13.83f, 8.0f, 13.76f)
                curveTo(6.87f, 12.33f, 6.69f, 10.28f, 7.45f, 8.64f)
                curveTo(5.78f, 10.0f, 4.87f, 12.3f, 5.0f, 14.47f)
                curveTo(5.06f, 14.97f, 5.12f, 15.47f, 5.29f, 15.97f)
                curveTo(5.43f, 16.57f, 5.7f, 17.17f, 6.0f, 17.7f)
                curveTo(7.08f, 19.43f, 8.95f, 20.67f, 10.96f, 20.92f)
                curveTo(13.1f, 21.19f, 15.39f, 20.8f, 17.03f, 19.32f)
                curveTo(18.86f, 17.66f, 19.5f, 15.0f, 18.56f, 12.72f)
                lineTo(18.43f, 12.46f)
                curveTo(18.22f, 12.0f, 17.66f, 11.2f, 17.66f, 11.2f)
                moveTo(14.5f, 17.5f)
                curveTo(14.22f, 17.74f, 13.76f, 18.0f, 13.4f, 18.1f)
                curveTo(12.28f, 18.5f, 11.16f, 17.94f, 10.5f, 17.28f)
                curveTo(11.69f, 17.0f, 12.4f, 16.12f, 12.61f, 15.23f)
                curveTo(12.78f, 14.43f, 12.46f, 13.77f, 12.33f, 13.0f)
                curveTo(12.21f, 12.26f, 12.23f, 11.63f, 12.5f, 10.94f)
                curveTo(12.69f, 11.32f, 12.89f, 11.7f, 13.13f, 12.0f)
                curveTo(13.9f, 13.0f, 15.11f, 13.44f, 15.37f, 14.8f)
                curveTo(15.41f, 14.94f, 15.43f, 15.08f, 15.43f, 15.23f)
                curveTo(15.46f, 16.05f, 15.1f, 16.95f, 14.5f, 17.5f)
                horizontalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
