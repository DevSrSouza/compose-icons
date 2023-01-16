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

public val MaterialDesignIcons.MapMarkerMultiple: ImageVector
    get() {
        if (_mapMarkerMultiple != null) {
            return _mapMarkerMultiple!!
        }
        _mapMarkerMultiple = Builder(name = "MapMarkerMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.0f, 11.5f)
                moveTo(14.0f, 2.0f)
                curveTo(17.86f, 2.0f, 21.0f, 5.13f, 21.0f, 9.0f)
                curveTo(21.0f, 14.25f, 14.0f, 22.0f, 14.0f, 22.0f)
                curveTo(14.0f, 22.0f, 7.0f, 14.25f, 7.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 14.0f, 2.0f)
                moveTo(5.0f, 9.0f)
                curveTo(5.0f, 13.5f, 10.08f, 19.66f, 11.0f, 20.81f)
                lineTo(10.0f, 22.0f)
                curveTo(10.0f, 22.0f, 3.0f, 14.25f, 3.0f, 9.0f)
                curveTo(3.0f, 5.83f, 5.11f, 3.15f, 8.0f, 2.29f)
                curveTo(6.16f, 3.94f, 5.0f, 6.33f, 5.0f, 9.0f)
                close()
            }
        }
        .build()
        return _mapMarkerMultiple!!
    }

private var _mapMarkerMultiple: ImageVector? = null
