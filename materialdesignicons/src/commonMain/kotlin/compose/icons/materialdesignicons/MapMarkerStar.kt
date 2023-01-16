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

public val MaterialDesignIcons.MapMarkerStar: ImageVector
    get() {
        if (_mapMarkerStar != null) {
            return _mapMarkerStar!!
        }
        _mapMarkerStar = Builder(name = "MapMarkerStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.1f, 2.0f, 5.0f, 5.1f, 5.0f, 9.0f)
                curveTo(5.0f, 14.2f, 12.0f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(19.0f, 14.2f, 19.0f, 9.0f)
                curveTo(19.0f, 5.1f, 15.9f, 2.0f, 12.0f, 2.0f)
                moveTo(14.5f, 13.0f)
                lineTo(12.0f, 11.5f)
                lineTo(9.5f, 13.0f)
                lineTo(10.2f, 10.2f)
                lineTo(8.0f, 8.3f)
                lineTo(10.9f, 8.1f)
                lineTo(12.0f, 5.4f)
                lineTo(13.1f, 8.0f)
                lineTo(16.0f, 8.3f)
                lineTo(13.8f, 10.2f)
                lineTo(14.5f, 13.0f)
                close()
            }
        }
        .build()
        return _mapMarkerStar!!
    }

private var _mapMarkerStar: ImageVector? = null
