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

public val MaterialDesignIcons.MapMarkerOffOutline: ImageVector
    get() {
        if (_mapMarkerOffOutline != null) {
            return _mapMarkerOffOutline!!
        }
        _mapMarkerOffOutline = Builder(name = "MapMarkerOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.7f)
                lineTo(3.3f, 3.0f)
                lineTo(2.0f, 4.3f)
                lineTo(5.2f, 7.5f)
                curveTo(5.1f, 8.0f, 5.0f, 8.5f, 5.0f, 9.0f)
                curveTo(5.0f, 14.2f, 12.0f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(13.7f, 20.1f, 15.4f, 17.6f)
                lineTo(18.8f, 21.0f)
                lineTo(20.0f, 19.7f)
                moveTo(12.0f, 18.7f)
                curveTo(7.4f, 12.5f, 7.0f, 10.4f, 7.0f, 9.3f)
                lineTo(13.8f, 16.1f)
                curveTo(13.3f, 16.9f, 12.7f, 17.7f, 12.0f, 18.7f)
                moveTo(8.4f, 5.6f)
                lineTo(7.0f, 4.2f)
                curveTo(8.2f, 2.8f, 10.0f, 2.0f, 12.0f, 2.0f)
                curveTo(15.9f, 2.0f, 19.0f, 5.1f, 19.0f, 9.0f)
                curveTo(19.0f, 10.7f, 18.3f, 12.6f, 17.3f, 14.5f)
                lineTo(15.8f, 13.0f)
                curveTo(17.0f, 10.6f, 17.0f, 9.6f, 17.0f, 9.0f)
                curveTo(17.0f, 6.2f, 14.8f, 4.0f, 12.0f, 4.0f)
                curveTo(10.6f, 4.0f, 9.3f, 4.6f, 8.4f, 5.6f)
                moveTo(12.0f, 6.5f)
                curveTo(13.4f, 6.5f, 14.5f, 7.6f, 14.5f, 9.0f)
                curveTo(14.5f, 9.7f, 14.2f, 10.4f, 13.7f, 10.9f)
                lineTo(10.2f, 7.4f)
                curveTo(10.6f, 6.8f, 11.3f, 6.5f, 12.0f, 6.5f)
                close()
            }
        }
        .build()
        return _mapMarkerOffOutline!!
    }

private var _mapMarkerOffOutline: ImageVector? = null
