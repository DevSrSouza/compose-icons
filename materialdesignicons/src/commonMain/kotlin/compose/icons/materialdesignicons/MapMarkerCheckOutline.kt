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

public val MaterialDesignIcons.MapMarkerCheckOutline: ImageVector
    get() {
        if (_mapMarkerCheckOutline != null) {
            return _mapMarkerCheckOutline!!
        }
        _mapMarkerCheckOutline = Builder(name = "MapMarkerCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(14.8f, 4.0f, 17.0f, 6.2f, 17.0f, 9.0f)
                curveTo(17.0f, 11.9f, 14.1f, 16.2f, 12.0f, 18.9f)
                curveTo(9.9f, 16.2f, 7.0f, 11.9f, 7.0f, 9.0f)
                curveTo(7.0f, 6.2f, 9.2f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(8.1f, 2.0f, 5.0f, 5.1f, 5.0f, 9.0f)
                curveTo(5.0f, 14.2f, 12.0f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(19.0f, 14.2f, 19.0f, 9.0f)
                curveTo(19.0f, 5.1f, 15.9f, 2.0f, 12.0f, 2.0f)
                moveTo(11.3f, 14.0f)
                lineTo(16.2f, 9.0f)
                lineTo(14.8f, 7.6f)
                lineTo(11.3f, 11.2f)
                lineTo(9.7f, 9.6f)
                lineTo(8.3f, 11.0f)
                lineTo(11.3f, 14.0f)
                close()
            }
        }
        .build()
        return _mapMarkerCheckOutline!!
    }

private var _mapMarkerCheckOutline: ImageVector? = null
