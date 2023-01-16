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

public val MaterialDesignIcons.MapMarkerRadiusOutline: ImageVector
    get() {
        if (_mapMarkerRadiusOutline != null) {
            return _mapMarkerRadiusOutline!!
        }
        _mapMarkerRadiusOutline = Builder(name = "MapMarkerRadiusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(14.2f, 4.0f, 16.0f, 5.8f, 16.0f, 8.0f)
                curveTo(16.0f, 10.1f, 13.9f, 13.5f, 12.0f, 15.9f)
                curveTo(10.1f, 13.4f, 8.0f, 10.1f, 8.0f, 8.0f)
                curveTo(8.0f, 5.8f, 9.8f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(8.7f, 2.0f, 6.0f, 4.7f, 6.0f, 8.0f)
                curveTo(6.0f, 12.5f, 12.0f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveTo(18.0f, 12.4f, 18.0f, 8.0f)
                curveTo(18.0f, 4.7f, 15.3f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 6.0f)
                curveTo(10.9f, 6.0f, 10.0f, 6.9f, 10.0f, 8.0f)
                reflectiveCurveTo(10.9f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(14.0f, 9.1f, 14.0f, 8.0f)
                reflectiveCurveTo(13.1f, 6.0f, 12.0f, 6.0f)
                moveTo(20.0f, 19.0f)
                curveTo(20.0f, 21.2f, 16.4f, 23.0f, 12.0f, 23.0f)
                reflectiveCurveTo(4.0f, 21.2f, 4.0f, 19.0f)
                curveTo(4.0f, 17.7f, 5.2f, 16.6f, 7.1f, 15.8f)
                lineTo(7.7f, 16.7f)
                curveTo(6.7f, 17.2f, 6.0f, 17.8f, 6.0f, 18.5f)
                curveTo(6.0f, 19.9f, 8.7f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveTo(18.0f, 19.9f, 18.0f, 18.5f)
                curveTo(18.0f, 17.8f, 17.3f, 17.2f, 16.2f, 16.7f)
                lineTo(16.8f, 15.8f)
                curveTo(18.8f, 16.6f, 20.0f, 17.7f, 20.0f, 19.0f)
                close()
            }
        }
        .build()
        return _mapMarkerRadiusOutline!!
    }

private var _mapMarkerRadiusOutline: ImageVector? = null
