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

public val MaterialDesignIcons.MapMarkerLeftOutline: ImageVector
    get() {
        if (_mapMarkerLeftOutline != null) {
            return _mapMarkerLeftOutline!!
        }
        _mapMarkerLeftOutline = Builder(name = "MapMarkerLeftOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.5f)
                curveTo(16.38f, 6.5f, 17.5f, 7.62f, 17.5f, 9.0f)
                reflectiveCurveTo(16.38f, 11.5f, 15.0f, 11.5f)
                reflectiveCurveTo(12.5f, 10.38f, 12.5f, 9.0f)
                reflectiveCurveTo(13.62f, 6.5f, 15.0f, 6.5f)
                moveTo(15.0f, 2.0f)
                curveTo(18.87f, 2.0f, 22.0f, 5.13f, 22.0f, 9.0f)
                curveTo(22.0f, 14.25f, 15.0f, 22.0f, 15.0f, 22.0f)
                reflectiveCurveTo(8.0f, 14.25f, 8.0f, 9.0f)
                curveTo(8.0f, 5.13f, 11.13f, 2.0f, 15.0f, 2.0f)
                moveTo(10.0f, 9.0f)
                curveTo(10.0f, 10.0f, 10.0f, 12.0f, 15.0f, 18.71f)
                curveTo(20.0f, 12.0f, 20.0f, 10.0f, 20.0f, 9.0f)
                curveTo(20.0f, 6.24f, 17.76f, 4.0f, 15.0f, 4.0f)
                reflectiveCurveTo(10.0f, 6.24f, 10.0f, 9.0f)
                moveTo(6.0f, 7.0f)
                lineTo(1.0f, 12.0f)
                lineTo(6.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _mapMarkerLeftOutline!!
    }

private var _mapMarkerLeftOutline: ImageVector? = null
