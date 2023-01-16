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

public val MaterialDesignIcons.MapMarkerRadius: ImageVector
    get() {
        if (_mapMarkerRadius != null) {
            return _mapMarkerRadius!!
        }
        _mapMarkerRadius = Builder(name = "MapMarkerRadius", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(15.31f, 2.0f, 18.0f, 4.66f, 18.0f, 7.95f)
                curveTo(18.0f, 12.41f, 12.0f, 19.0f, 12.0f, 19.0f)
                curveTo(12.0f, 19.0f, 6.0f, 12.41f, 6.0f, 7.95f)
                curveTo(6.0f, 4.66f, 8.69f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 6.0f)
                moveTo(20.0f, 19.0f)
                curveTo(20.0f, 21.21f, 16.42f, 23.0f, 12.0f, 23.0f)
                curveTo(7.58f, 23.0f, 4.0f, 21.21f, 4.0f, 19.0f)
                curveTo(4.0f, 17.71f, 5.22f, 16.56f, 7.11f, 15.83f)
                lineTo(7.75f, 16.74f)
                curveTo(6.67f, 17.19f, 6.0f, 17.81f, 6.0f, 18.5f)
                curveTo(6.0f, 19.88f, 8.69f, 21.0f, 12.0f, 21.0f)
                curveTo(15.31f, 21.0f, 18.0f, 19.88f, 18.0f, 18.5f)
                curveTo(18.0f, 17.81f, 17.33f, 17.19f, 16.25f, 16.74f)
                lineTo(16.89f, 15.83f)
                curveTo(18.78f, 16.56f, 20.0f, 17.71f, 20.0f, 19.0f)
                close()
            }
        }
        .build()
        return _mapMarkerRadius!!
    }

private var _mapMarkerRadius: ImageVector? = null
