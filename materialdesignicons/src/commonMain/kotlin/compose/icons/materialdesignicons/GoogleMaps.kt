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

public val MaterialDesignIcons.GoogleMaps: ImageVector
    get() {
        if (_googleMaps != null) {
            return _googleMaps!!
        }
        _googleMaps = Builder(name = "GoogleMaps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.27f, 6.0f)
                curveTo(19.28f, 8.17f, 19.05f, 10.73f, 17.94f, 12.81f)
                curveTo(17.0f, 14.5f, 15.65f, 15.93f, 14.5f, 17.5f)
                curveTo(14.0f, 18.2f, 13.5f, 18.95f, 13.13f, 19.76f)
                curveTo(13.0f, 20.03f, 12.91f, 20.31f, 12.81f, 20.59f)
                curveTo(12.71f, 20.87f, 12.62f, 21.15f, 12.53f, 21.43f)
                curveTo(12.44f, 21.69f, 12.33f, 22.0f, 12.0f, 22.0f)
                horizontalLineTo(12.0f)
                curveTo(11.61f, 22.0f, 11.5f, 21.56f, 11.42f, 21.26f)
                curveTo(11.18f, 20.53f, 10.94f, 19.83f, 10.57f, 19.16f)
                curveTo(10.15f, 18.37f, 9.62f, 17.64f, 9.08f, 16.93f)
                lineTo(18.27f, 6.0f)
                moveTo(9.12f, 8.42f)
                lineTo(5.82f, 12.34f)
                curveTo(6.43f, 13.63f, 7.34f, 14.73f, 8.21f, 15.83f)
                curveTo(8.42f, 16.08f, 8.63f, 16.34f, 8.83f, 16.61f)
                lineTo(13.0f, 11.67f)
                lineTo(12.96f, 11.68f)
                curveTo(11.5f, 12.18f, 9.88f, 11.44f, 9.3f, 10.0f)
                curveTo(9.22f, 9.83f, 9.16f, 9.63f, 9.12f, 9.43f)
                curveTo(9.07f, 9.06f, 9.06f, 8.79f, 9.12f, 8.43f)
                lineTo(9.12f, 8.42f)
                moveTo(6.58f, 4.62f)
                lineTo(6.57f, 4.63f)
                curveTo(4.95f, 6.68f, 4.67f, 9.53f, 5.64f, 11.94f)
                lineTo(9.63f, 7.2f)
                lineTo(9.58f, 7.15f)
                lineTo(6.58f, 4.62f)
                moveTo(14.22f, 2.36f)
                lineTo(11.0f, 6.17f)
                lineTo(11.04f, 6.16f)
                curveTo(12.38f, 5.7f, 13.88f, 6.28f, 14.56f, 7.5f)
                curveTo(14.71f, 7.78f, 14.83f, 8.08f, 14.87f, 8.38f)
                curveTo(14.93f, 8.76f, 14.95f, 9.03f, 14.88f, 9.4f)
                lineTo(14.88f, 9.41f)
                lineTo(18.08f, 5.61f)
                curveTo(17.24f, 4.09f, 15.87f, 2.93f, 14.23f, 2.37f)
                lineTo(14.22f, 2.36f)
                moveTo(9.89f, 6.89f)
                lineTo(13.8f, 2.24f)
                lineTo(13.76f, 2.23f)
                curveTo(13.18f, 2.08f, 12.59f, 2.0f, 12.0f, 2.0f)
                curveTo(10.03f, 2.0f, 8.17f, 2.85f, 6.85f, 4.31f)
                lineTo(6.83f, 4.32f)
                lineTo(9.89f, 6.89f)
                close()
            }
        }
        .build()
        return _googleMaps!!
    }

private var _googleMaps: ImageVector? = null
