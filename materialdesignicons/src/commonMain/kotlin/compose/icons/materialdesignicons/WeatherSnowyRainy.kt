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

public val MaterialDesignIcons.WeatherSnowyRainy: ImageVector
    get() {
        if (_weatherSnowyRainy != null) {
            return _weatherSnowyRainy!!
        }
        _weatherSnowyRainy = Builder(name = "WeatherSnowyRainy", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 18.67f)
                curveTo(18.5f, 19.96f, 17.5f, 21.0f, 16.25f, 21.0f)
                curveTo(15.0f, 21.0f, 14.0f, 19.96f, 14.0f, 18.67f)
                curveTo(14.0f, 17.12f, 16.25f, 14.5f, 16.25f, 14.5f)
                curveTo(16.25f, 14.5f, 18.5f, 17.12f, 18.5f, 18.67f)
                moveTo(4.0f, 17.36f)
                curveTo(3.86f, 16.82f, 4.18f, 16.25f, 4.73f, 16.11f)
                lineTo(7.0f, 15.5f)
                lineTo(5.33f, 13.86f)
                curveTo(4.93f, 13.46f, 4.93f, 12.81f, 5.33f, 12.4f)
                curveTo(5.73f, 12.0f, 6.4f, 12.0f, 6.79f, 12.4f)
                lineTo(8.45f, 14.05f)
                lineTo(9.04f, 11.8f)
                curveTo(9.18f, 11.24f, 9.75f, 10.92f, 10.29f, 11.07f)
                curveTo(10.85f, 11.21f, 11.17f, 11.78f, 11.0f, 12.33f)
                lineTo(10.42f, 14.58f)
                lineTo(12.67f, 14.0f)
                curveTo(13.22f, 13.83f, 13.79f, 14.15f, 13.93f, 14.71f)
                curveTo(14.08f, 15.25f, 13.76f, 15.82f, 13.2f, 15.96f)
                lineTo(10.95f, 16.55f)
                lineTo(12.6f, 18.21f)
                curveTo(13.0f, 18.6f, 13.0f, 19.27f, 12.6f, 19.67f)
                curveTo(12.2f, 20.07f, 11.54f, 20.07f, 11.15f, 19.67f)
                lineTo(9.5f, 18.0f)
                lineTo(8.89f, 20.27f)
                curveTo(8.75f, 20.83f, 8.18f, 21.14f, 7.64f, 21.0f)
                curveTo(7.08f, 20.86f, 6.77f, 20.29f, 6.91f, 19.74f)
                lineTo(7.5f, 17.5f)
                lineTo(5.26f, 18.09f)
                curveTo(4.71f, 18.23f, 4.14f, 17.92f, 4.0f, 17.36f)
                moveTo(1.0f, 11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 6.0f, 6.0f)
                curveTo(7.0f, 3.65f, 9.3f, 2.0f, 12.0f, 2.0f)
                curveTo(15.43f, 2.0f, 18.24f, 4.66f, 18.5f, 8.03f)
                lineTo(19.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 23.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 19.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 4.0f)
                curveTo(9.5f, 4.0f, 7.45f, 5.82f, 7.06f, 8.19f)
                curveTo(6.73f, 8.07f, 6.37f, 8.0f, 6.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 11.0f)
                curveTo(3.0f, 11.85f, 3.35f, 12.61f, 3.91f, 13.16f)
                curveTo(4.27f, 13.55f, 4.26f, 14.16f, 3.88f, 14.54f)
                curveTo(3.5f, 14.93f, 2.85f, 14.93f, 2.47f, 14.54f)
                curveTo(1.56f, 13.63f, 1.0f, 12.38f, 1.0f, 11.0f)
                close()
            }
        }
        .build()
        return _weatherSnowyRainy!!
    }

private var _weatherSnowyRainy: ImageVector? = null
