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

public val MaterialDesignIcons.MapMarkerOutline: ImageVector
    get() {
        if (_mapMarkerOutline != null) {
            return _mapMarkerOutline!!
        }
        _mapMarkerOutline = Builder(name = "MapMarkerOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 6.5f)
                moveTo(12.0f, 2.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 9.0f)
                curveTo(19.0f, 14.25f, 12.0f, 22.0f, 12.0f, 22.0f)
                curveTo(12.0f, 22.0f, 5.0f, 14.25f, 5.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 9.0f)
                curveTo(7.0f, 10.0f, 7.0f, 12.0f, 12.0f, 18.71f)
                curveTo(17.0f, 12.0f, 17.0f, 10.0f, 17.0f, 9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _mapMarkerOutline!!
    }

private var _mapMarkerOutline: ImageVector? = null
