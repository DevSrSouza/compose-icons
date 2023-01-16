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

public val MaterialDesignIcons.Mapbox: ImageVector
    get() {
        if (_mapbox != null) {
            return _mapbox!!
        }
        _mapbox = Builder(name = "Mapbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(16.75f, 14.45f)
                curveTo(18.65f, 12.55f, 18.58f, 9.39f, 16.59f, 7.41f)
                curveTo(14.6f, 5.43f, 11.45f, 5.35f, 9.55f, 7.25f)
                curveTo(6.12f, 10.68f, 7.22f, 16.78f, 7.22f, 16.78f)
                curveTo(7.22f, 16.78f, 13.33f, 17.87f, 16.75f, 14.45f)
                moveTo(13.15f, 7.86f)
                lineTo(14.13f, 9.87f)
                lineTo(16.14f, 10.85f)
                lineTo(14.13f, 11.83f)
                lineTo(13.15f, 13.84f)
                lineTo(12.17f, 11.83f)
                lineTo(10.16f, 10.85f)
                lineTo(12.17f, 9.87f)
                lineTo(13.15f, 7.86f)
                close()
            }
        }
        .build()
        return _mapbox!!
    }

private var _mapbox: ImageVector? = null
