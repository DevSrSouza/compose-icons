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

public val MaterialDesignIcons.MapMarkerLeft: ImageVector
    get() {
        if (_mapMarkerLeft != null) {
            return _mapMarkerLeft!!
        }
        _mapMarkerLeft = Builder(name = "MapMarkerLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 11.5f)
                curveTo(13.62f, 11.5f, 12.5f, 10.38f, 12.5f, 9.0f)
                reflectiveCurveTo(13.62f, 6.5f, 15.0f, 6.5f)
                reflectiveCurveTo(17.5f, 7.62f, 17.5f, 9.0f)
                reflectiveCurveTo(16.38f, 11.5f, 15.0f, 11.5f)
                moveTo(8.0f, 9.0f)
                curveTo(8.0f, 14.25f, 15.0f, 22.0f, 15.0f, 22.0f)
                reflectiveCurveTo(22.0f, 14.25f, 22.0f, 9.0f)
                curveTo(22.0f, 5.13f, 18.87f, 2.0f, 15.0f, 2.0f)
                reflectiveCurveTo(8.0f, 5.13f, 8.0f, 9.0f)
                moveTo(6.0f, 7.0f)
                lineTo(1.0f, 12.0f)
                lineTo(6.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _mapMarkerLeft!!
    }

private var _mapMarkerLeft: ImageVector? = null
