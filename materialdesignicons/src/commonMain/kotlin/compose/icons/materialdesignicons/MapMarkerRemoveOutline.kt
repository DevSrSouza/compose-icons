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

public val MaterialDesignIcons.MapMarkerRemoveOutline: ImageVector
    get() {
        if (_mapMarkerRemoveOutline != null) {
            return _mapMarkerRemoveOutline!!
        }
        _mapMarkerRemoveOutline = Builder(name = "MapMarkerRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6f, 14.2f)
                lineTo(15.2f, 15.6f)
                lineTo(17.6f, 18.0f)
                lineTo(15.2f, 20.4f)
                lineTo(16.6f, 21.8f)
                lineTo(19.0f, 19.4f)
                lineTo(21.4f, 21.8f)
                lineTo(22.8f, 20.4f)
                lineTo(20.4f, 18.0f)
                lineTo(22.8f, 15.6f)
                lineTo(21.4f, 14.2f)
                lineTo(19.0f, 16.6f)
                moveTo(9.0f, 6.5f)
                curveTo(10.4f, 6.5f, 11.5f, 7.6f, 11.5f, 9.0f)
                reflectiveCurveTo(10.4f, 11.5f, 9.0f, 11.5f)
                reflectiveCurveTo(6.5f, 10.4f, 6.5f, 9.0f)
                reflectiveCurveTo(7.6f, 6.5f, 9.0f, 6.5f)
                moveTo(9.0f, 2.0f)
                curveTo(12.9f, 2.0f, 16.0f, 5.1f, 16.0f, 9.0f)
                curveTo(16.0f, 14.2f, 9.0f, 22.0f, 9.0f, 22.0f)
                reflectiveCurveTo(2.0f, 14.2f, 2.0f, 9.0f)
                curveTo(2.0f, 5.1f, 5.1f, 2.0f, 9.0f, 2.0f)
                moveTo(9.0f, 4.0f)
                curveTo(6.2f, 4.0f, 4.0f, 6.2f, 4.0f, 9.0f)
                curveTo(4.0f, 10.0f, 4.0f, 12.0f, 9.0f, 18.7f)
                curveTo(14.0f, 12.0f, 14.0f, 10.0f, 14.0f, 9.0f)
                curveTo(14.0f, 6.2f, 11.8f, 4.0f, 9.0f, 4.0f)
                close()
            }
        }
        .build()
        return _mapMarkerRemoveOutline!!
    }

private var _mapMarkerRemoveOutline: ImageVector? = null
