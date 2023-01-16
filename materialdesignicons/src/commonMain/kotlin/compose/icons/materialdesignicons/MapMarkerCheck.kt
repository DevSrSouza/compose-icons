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

public val MaterialDesignIcons.MapMarkerCheck: ImageVector
    get() {
        if (_mapMarkerCheck != null) {
            return _mapMarkerCheck!!
        }
        _mapMarkerCheck = Builder(name = "MapMarkerCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(15.86f, 2.0f, 19.0f, 5.14f, 19.0f, 9.0f)
                curveTo(19.0f, 14.25f, 12.0f, 22.0f, 12.0f, 22.0f)
                curveTo(12.0f, 22.0f, 5.0f, 14.25f, 5.0f, 9.0f)
                curveTo(5.0f, 5.14f, 8.14f, 2.0f, 12.0f, 2.0f)
                moveTo(10.47f, 14.0f)
                lineTo(17.0f, 7.41f)
                lineTo(15.6f, 6.0f)
                lineTo(10.47f, 11.18f)
                lineTo(8.4f, 9.09f)
                lineTo(7.0f, 10.5f)
                lineTo(10.47f, 14.0f)
                close()
            }
        }
        .build()
        return _mapMarkerCheck!!
    }

private var _mapMarkerCheck: ImageVector? = null
