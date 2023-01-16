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

public val MaterialDesignIcons.MapMarkerAccountOutline: ImageVector
    get() {
        if (_mapMarkerAccountOutline != null) {
            return _mapMarkerAccountOutline!!
        }
        _mapMarkerAccountOutline = Builder(name = "MapMarkerAccountOutline", defaultWidth = 24.0.dp,
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
                moveTo(12.0f, 10.0f)
                curveTo(13.33f, 10.0f, 16.0f, 10.67f, 16.0f, 12.0f)
                verticalLineTo(12.16f)
                curveTo(15.03f, 13.28f, 13.6f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(8.97f, 13.28f, 8.0f, 12.16f)
                verticalLineTo(12.0f)
                curveTo(8.0f, 10.67f, 10.67f, 10.0f, 12.0f, 10.0f)
                moveTo(12.0f, 9.0f)
                curveTo(10.9f, 9.0f, 10.0f, 8.1f, 10.0f, 7.0f)
                reflectiveCurveTo(10.9f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(14.0f, 5.9f, 14.0f, 7.0f)
                reflectiveCurveTo(13.1f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _mapMarkerAccountOutline!!
    }

private var _mapMarkerAccountOutline: ImageVector? = null
