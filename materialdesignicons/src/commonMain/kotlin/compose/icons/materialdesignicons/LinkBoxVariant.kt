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

public val MaterialDesignIcons.LinkBoxVariant: ImageVector
    get() {
        if (_linkBoxVariant != null) {
            return _linkBoxVariant!!
        }
        _linkBoxVariant = Builder(name = "LinkBoxVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                moveTo(13.94f, 14.81f)
                lineTo(11.73f, 17.0f)
                curveTo(11.08f, 17.67f, 10.22f, 18.0f, 9.36f, 18.0f)
                curveTo(8.5f, 18.0f, 7.64f, 17.67f, 7.0f, 17.0f)
                curveTo(5.67f, 15.71f, 5.67f, 13.58f, 7.0f, 12.26f)
                lineTo(8.35f, 10.9f)
                lineTo(8.34f, 11.5f)
                curveTo(8.33f, 12.0f, 8.41f, 12.5f, 8.57f, 12.94f)
                lineTo(8.62f, 13.09f)
                lineTo(8.22f, 13.5f)
                curveTo(7.91f, 13.8f, 7.74f, 14.21f, 7.74f, 14.64f)
                curveTo(7.74f, 15.07f, 7.91f, 15.47f, 8.22f, 15.78f)
                curveTo(8.83f, 16.4f, 9.89f, 16.4f, 10.5f, 15.78f)
                lineTo(12.7f, 13.59f)
                curveTo(13.0f, 13.28f, 13.18f, 12.87f, 13.18f, 12.44f)
                curveTo(13.18f, 12.0f, 13.0f, 11.61f, 12.7f, 11.3f)
                curveTo(12.53f, 11.14f, 12.44f, 10.92f, 12.44f, 10.68f)
                curveTo(12.44f, 10.45f, 12.53f, 10.23f, 12.7f, 10.06f)
                curveTo(13.03f, 9.73f, 13.61f, 9.74f, 13.94f, 10.06f)
                curveTo(14.57f, 10.7f, 14.92f, 11.54f, 14.92f, 12.44f)
                curveTo(14.92f, 13.34f, 14.57f, 14.18f, 13.94f, 14.81f)
                moveTo(17.0f, 11.74f)
                lineTo(15.66f, 13.1f)
                verticalLineTo(12.5f)
                curveTo(15.67f, 12.0f, 15.59f, 11.5f, 15.43f, 11.06f)
                lineTo(15.38f, 10.92f)
                lineTo(15.78f, 10.5f)
                curveTo(16.09f, 10.2f, 16.26f, 9.79f, 16.26f, 9.36f)
                curveTo(16.26f, 8.93f, 16.09f, 8.53f, 15.78f, 8.22f)
                curveTo(15.17f, 7.6f, 14.1f, 7.61f, 13.5f, 8.22f)
                lineTo(11.3f, 10.42f)
                curveTo(11.0f, 10.72f, 10.82f, 11.13f, 10.82f, 11.56f)
                curveTo(10.82f, 12.0f, 11.0f, 12.39f, 11.3f, 12.7f)
                curveTo(11.47f, 12.86f, 11.56f, 13.08f, 11.56f, 13.32f)
                curveTo(11.56f, 13.56f, 11.47f, 13.78f, 11.3f, 13.94f)
                curveTo(11.13f, 14.11f, 10.91f, 14.19f, 10.68f, 14.19f)
                curveTo(10.46f, 14.19f, 10.23f, 14.11f, 10.06f, 13.94f)
                curveTo(8.75f, 12.63f, 8.75f, 10.5f, 10.06f, 9.19f)
                lineTo(12.27f, 7.0f)
                curveTo(13.58f, 5.67f, 15.71f, 5.68f, 17.0f, 7.0f)
                curveTo(17.65f, 7.62f, 18.0f, 8.46f, 18.0f, 9.36f)
                curveTo(18.0f, 10.26f, 17.65f, 11.1f, 17.0f, 11.74f)
                close()
            }
        }
        .build()
        return _linkBoxVariant!!
    }

private var _linkBoxVariant: ImageVector? = null
