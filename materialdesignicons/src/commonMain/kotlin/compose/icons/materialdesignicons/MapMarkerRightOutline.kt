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

public val MaterialDesignIcons.MapMarkerRightOutline: ImageVector
    get() {
        if (_mapMarkerRightOutline != null) {
            return _mapMarkerRightOutline!!
        }
        _mapMarkerRightOutline = Builder(name = "MapMarkerRightOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.5f)
                curveTo(10.38f, 6.5f, 11.5f, 7.62f, 11.5f, 9.0f)
                reflectiveCurveTo(10.38f, 11.5f, 9.0f, 11.5f)
                reflectiveCurveTo(6.5f, 10.38f, 6.5f, 9.0f)
                reflectiveCurveTo(7.62f, 6.5f, 9.0f, 6.5f)
                moveTo(9.0f, 2.0f)
                curveTo(12.87f, 2.0f, 16.0f, 5.13f, 16.0f, 9.0f)
                curveTo(16.0f, 14.25f, 9.0f, 22.0f, 9.0f, 22.0f)
                reflectiveCurveTo(2.0f, 14.25f, 2.0f, 9.0f)
                curveTo(2.0f, 5.13f, 5.13f, 2.0f, 9.0f, 2.0f)
                moveTo(9.0f, 4.0f)
                curveTo(6.24f, 4.0f, 4.0f, 6.24f, 4.0f, 9.0f)
                curveTo(4.0f, 10.0f, 4.0f, 12.0f, 9.0f, 18.71f)
                curveTo(14.0f, 12.0f, 14.0f, 10.0f, 14.0f, 9.0f)
                curveTo(14.0f, 6.24f, 11.76f, 4.0f, 9.0f, 4.0f)
                moveTo(18.0f, 17.0f)
                lineTo(23.0f, 12.0f)
                lineTo(18.0f, 7.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _mapMarkerRightOutline!!
    }

private var _mapMarkerRightOutline: ImageVector? = null
