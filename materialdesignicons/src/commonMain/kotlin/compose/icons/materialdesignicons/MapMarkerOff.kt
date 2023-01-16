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

public val MaterialDesignIcons.MapMarkerOff: ImageVector
    get() {
        if (_mapMarkerOff != null) {
            return _mapMarkerOff!!
        }
        _mapMarkerOff = Builder(name = "MapMarkerOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.37f, 16.1f)
                lineTo(11.75f, 11.47f)
                lineTo(11.64f, 11.36f)
                lineTo(3.27f, 3.0f)
                lineTo(2.0f, 4.27f)
                lineTo(5.18f, 7.45f)
                curveTo(5.06f, 7.95f, 5.0f, 8.46f, 5.0f, 9.0f)
                curveTo(5.0f, 14.25f, 12.0f, 22.0f, 12.0f, 22.0f)
                curveTo(12.0f, 22.0f, 13.67f, 20.15f, 15.37f, 17.65f)
                lineTo(18.73f, 21.0f)
                lineTo(20.0f, 19.72f)
                moveTo(12.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 9.0f)
                curveTo(14.5f, 9.73f, 14.17f, 10.39f, 13.67f, 10.85f)
                lineTo(17.3f, 14.5f)
                curveTo(18.28f, 12.62f, 19.0f, 10.68f, 19.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 2.0f)
                curveTo(10.0f, 2.0f, 8.24f, 2.82f, 6.96f, 4.14f)
                lineTo(10.15f, 7.33f)
                curveTo(10.61f, 6.82f, 11.26f, 6.5f, 12.0f, 6.5f)
                close()
            }
        }
        .build()
        return _mapMarkerOff!!
    }

private var _mapMarkerOff: ImageVector? = null
