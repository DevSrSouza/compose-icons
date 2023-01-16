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

public val MaterialDesignIcons.MapMarkerRemove: ImageVector
    get() {
        if (_mapMarkerRemove != null) {
            return _mapMarkerRemove!!
        }
        _mapMarkerRemove = Builder(name = "MapMarkerRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                curveTo(5.14f, 2.0f, 2.0f, 5.14f, 2.0f, 9.0f)
                curveTo(2.0f, 14.25f, 9.0f, 22.0f, 9.0f, 22.0f)
                curveTo(9.0f, 22.0f, 16.0f, 14.25f, 16.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 9.0f, 2.0f)
                moveTo(9.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.0f, 6.5f)
                moveTo(16.58f, 14.16f)
                lineTo(15.17f, 15.58f)
                lineTo(17.58f, 18.0f)
                lineTo(15.17f, 20.41f)
                lineTo(16.58f, 21.82f)
                lineTo(19.0f, 19.41f)
                lineTo(21.41f, 21.82f)
                lineTo(22.83f, 20.41f)
                lineTo(20.41f, 18.0f)
                lineTo(22.83f, 15.58f)
                lineTo(21.41f, 14.16f)
                lineTo(19.0f, 16.58f)
            }
        }
        .build()
        return _mapMarkerRemove!!
    }

private var _mapMarkerRemove: ImageVector? = null
