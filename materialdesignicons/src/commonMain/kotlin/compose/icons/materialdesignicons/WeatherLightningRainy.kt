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

public val MaterialDesignIcons.WeatherLightningRainy: ImageVector
    get() {
        if (_weatherLightningRainy != null) {
            return _weatherLightningRainy!!
        }
        _weatherLightningRainy = Builder(name = "WeatherLightningRainy", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 13.59f)
                curveTo(5.0f, 13.87f, 5.14f, 14.5f, 4.87f, 14.96f)
                curveTo(4.59f, 15.44f, 4.0f, 15.6f, 3.5f, 15.33f)
                verticalLineTo(15.33f)
                curveTo(2.0f, 14.47f, 1.0f, 12.85f, 1.0f, 11.0f)
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
                curveTo(3.0f, 12.11f, 3.6f, 13.08f, 4.5f, 13.6f)
                verticalLineTo(13.59f)
                moveTo(9.5f, 11.0f)
                horizontalLineTo(12.5f)
                lineTo(10.5f, 15.0f)
                horizontalLineTo(12.5f)
                lineTo(8.75f, 22.0f)
                lineTo(9.5f, 17.0f)
                horizontalLineTo(7.0f)
                lineTo(9.5f, 11.0f)
                moveTo(17.5f, 18.67f)
                curveTo(17.5f, 19.96f, 16.5f, 21.0f, 15.25f, 21.0f)
                curveTo(14.0f, 21.0f, 13.0f, 19.96f, 13.0f, 18.67f)
                curveTo(13.0f, 17.12f, 15.25f, 14.5f, 15.25f, 14.5f)
                curveTo(15.25f, 14.5f, 17.5f, 17.12f, 17.5f, 18.67f)
                close()
            }
        }
        .build()
        return _weatherLightningRainy!!
    }

private var _weatherLightningRainy: ImageVector? = null
