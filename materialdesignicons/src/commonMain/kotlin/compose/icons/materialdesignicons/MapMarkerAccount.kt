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

public val MaterialDesignIcons.MapMarkerAccount: ImageVector
    get() {
        if (_mapMarkerAccount != null) {
            return _mapMarkerAccount!!
        }
        _mapMarkerAccount = Builder(name = "MapMarkerAccount", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f)
                curveTo(5.0f, 14.25f, 12.0f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(19.0f, 14.25f, 19.0f, 9.0f)
                curveTo(19.0f, 5.14f, 15.86f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                curveTo(13.1f, 4.0f, 14.0f, 4.9f, 14.0f, 6.0f)
                curveTo(14.0f, 7.11f, 13.1f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(10.0f, 7.11f, 10.0f, 6.0f)
                curveTo(10.0f, 4.9f, 10.9f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 14.0f)
                curveTo(10.33f, 14.0f, 8.86f, 13.15f, 8.0f, 11.85f)
                curveTo(8.0f, 10.53f, 10.67f, 9.8f, 12.0f, 9.8f)
                reflectiveCurveTo(16.0f, 10.53f, 16.0f, 11.85f)
                curveTo(15.14f, 13.15f, 13.67f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _mapMarkerAccount!!
    }

private var _mapMarkerAccount: ImageVector? = null
