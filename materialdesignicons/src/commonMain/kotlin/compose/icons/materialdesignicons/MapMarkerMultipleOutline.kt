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

public val MaterialDesignIcons.MapMarkerMultipleOutline: ImageVector
    get() {
        if (_mapMarkerMultipleOutline != null) {
            return _mapMarkerMultipleOutline!!
        }
        _mapMarkerMultipleOutline = Builder(name = "MapMarkerMultipleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 9.0f)
                curveTo(11.5f, 7.62f, 12.62f, 6.5f, 14.0f, 6.5f)
                curveTo(15.1f, 6.5f, 16.03f, 7.21f, 16.37f, 8.19f)
                curveTo(16.45f, 8.45f, 16.5f, 8.72f, 16.5f, 9.0f)
                curveTo(16.5f, 10.38f, 15.38f, 11.5f, 14.0f, 11.5f)
                curveTo(12.91f, 11.5f, 12.0f, 10.81f, 11.64f, 9.84f)
                curveTo(11.55f, 9.58f, 11.5f, 9.29f, 11.5f, 9.0f)
                moveTo(5.0f, 9.0f)
                curveTo(5.0f, 13.5f, 10.08f, 19.66f, 11.0f, 20.81f)
                lineTo(10.0f, 22.0f)
                curveTo(10.0f, 22.0f, 3.0f, 14.25f, 3.0f, 9.0f)
                curveTo(3.0f, 5.83f, 5.11f, 3.15f, 8.0f, 2.29f)
                curveTo(6.16f, 3.94f, 5.0f, 6.33f, 5.0f, 9.0f)
                moveTo(14.0f, 2.0f)
                curveTo(17.86f, 2.0f, 21.0f, 5.13f, 21.0f, 9.0f)
                curveTo(21.0f, 14.25f, 14.0f, 22.0f, 14.0f, 22.0f)
                curveTo(14.0f, 22.0f, 7.0f, 14.25f, 7.0f, 9.0f)
                curveTo(7.0f, 5.13f, 10.14f, 2.0f, 14.0f, 2.0f)
                moveTo(14.0f, 4.0f)
                curveTo(11.24f, 4.0f, 9.0f, 6.24f, 9.0f, 9.0f)
                curveTo(9.0f, 10.0f, 9.0f, 12.0f, 14.0f, 18.71f)
                curveTo(19.0f, 12.0f, 19.0f, 10.0f, 19.0f, 9.0f)
                curveTo(19.0f, 6.24f, 16.76f, 4.0f, 14.0f, 4.0f)
                close()
            }
        }
        .build()
        return _mapMarkerMultipleOutline!!
    }

private var _mapMarkerMultipleOutline: ImageVector? = null
