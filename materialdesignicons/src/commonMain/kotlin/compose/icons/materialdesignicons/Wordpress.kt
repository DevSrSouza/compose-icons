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

public val MaterialDesignIcons.Wordpress: ImageVector
    get() {
        if (_wordpress != null) {
            return _wordpress!!
        }
        _wordpress = Builder(name = "Wordpress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.42f, 12.0f)
                curveTo(3.42f, 10.76f, 3.69f, 9.58f, 4.16f, 8.5f)
                lineTo(8.26f, 19.72f)
                curveTo(5.39f, 18.33f, 3.42f, 15.4f, 3.42f, 12.0f)
                moveTo(17.79f, 11.57f)
                curveTo(17.79f, 12.3f, 17.5f, 13.15f, 17.14f, 14.34f)
                lineTo(16.28f, 17.2f)
                lineTo(13.18f, 8.0f)
                lineTo(14.16f, 7.9f)
                curveTo(14.63f, 7.84f, 14.57f, 7.16f, 14.11f, 7.19f)
                curveTo(14.11f, 7.19f, 12.72f, 7.3f, 11.82f, 7.3f)
                lineTo(9.56f, 7.19f)
                curveTo(9.1f, 7.16f, 9.05f, 7.87f, 9.5f, 7.9f)
                lineTo(10.41f, 8.0f)
                lineTo(11.75f, 11.64f)
                lineTo(9.87f, 17.27f)
                lineTo(6.74f, 8.0f)
                lineTo(7.73f, 7.9f)
                curveTo(8.19f, 7.84f, 8.13f, 7.16f, 7.67f, 7.19f)
                curveTo(7.67f, 7.19f, 6.28f, 7.3f, 5.38f, 7.3f)
                lineTo(4.83f, 7.29f)
                curveTo(6.37f, 4.96f, 9.0f, 3.42f, 12.0f, 3.42f)
                curveTo(14.23f, 3.42f, 16.27f, 4.28f, 17.79f, 5.67f)
                horizontalLineTo(17.68f)
                curveTo(16.84f, 5.67f, 16.24f, 6.4f, 16.24f, 7.19f)
                curveTo(16.24f, 7.9f, 16.65f, 8.5f, 17.08f, 9.2f)
                curveTo(17.41f, 9.77f, 17.79f, 10.5f, 17.79f, 11.57f)
                moveTo(12.15f, 12.75f)
                lineTo(14.79f, 19.97f)
                lineTo(14.85f, 20.09f)
                curveTo(13.96f, 20.41f, 13.0f, 20.58f, 12.0f, 20.58f)
                curveTo(11.16f, 20.58f, 10.35f, 20.46f, 9.58f, 20.23f)
                lineTo(12.15f, 12.75f)
                moveTo(19.53f, 7.88f)
                curveTo(20.2f, 9.11f, 20.58f, 10.5f, 20.58f, 12.0f)
                curveTo(20.58f, 15.16f, 18.86f, 17.93f, 16.31f, 19.41f)
                lineTo(18.93f, 11.84f)
                curveTo(19.42f, 10.62f, 19.59f, 9.64f, 19.59f, 8.77f)
                lineTo(19.53f, 7.88f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 21.54f)
                curveTo(17.26f, 21.54f, 21.54f, 17.26f, 21.54f, 12.0f)
                curveTo(21.54f, 6.74f, 17.26f, 2.46f, 12.0f, 2.46f)
                curveTo(6.74f, 2.46f, 2.46f, 6.74f, 2.46f, 12.0f)
                curveTo(2.46f, 17.26f, 6.74f, 21.54f, 12.0f, 21.54f)
                close()
            }
        }
        .build()
        return _wordpress!!
    }

private var _wordpress: ImageVector? = null
