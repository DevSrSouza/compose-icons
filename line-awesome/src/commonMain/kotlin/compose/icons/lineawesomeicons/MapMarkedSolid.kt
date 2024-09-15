package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.MapMarkedSolid: ImageVector
    get() {
        if (_mapMarkedSolid != null) {
            return _mapMarkedSolid!!
        }
        _mapMarkedSolid = Builder(name = "MapMarkedSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                curveTo(18.699f, 3.0f, 16.0f, 5.699f, 16.0f, 9.0f)
                curveTo(16.0f, 9.992f, 16.383f, 11.004f, 16.875f, 12.125f)
                curveTo(17.367f, 13.246f, 17.988f, 14.434f, 18.625f, 15.531f)
                curveTo(19.898f, 17.726f, 21.188f, 19.563f, 21.188f, 19.563f)
                lineTo(22.0f, 20.75f)
                lineTo(22.813f, 19.563f)
                curveTo(22.813f, 19.563f, 24.101f, 17.726f, 25.375f, 15.531f)
                curveTo(26.012f, 14.433f, 26.633f, 13.246f, 27.125f, 12.125f)
                curveTo(27.617f, 11.004f, 28.0f, 9.992f, 28.0f, 9.0f)
                curveTo(28.0f, 5.699f, 25.301f, 3.0f, 22.0f, 3.0f)
                close()
                moveTo(11.969f, 4.938f)
                lineTo(4.0f, 8.344f)
                lineTo(4.0f, 27.531f)
                lineTo(12.031f, 24.063f)
                lineTo(20.031f, 27.063f)
                lineTo(28.0f, 23.656f)
                lineTo(28.0f, 14.938f)
                curveTo(27.363f, 16.16f, 26.656f, 17.332f, 26.0f, 18.375f)
                lineTo(26.0f, 22.344f)
                lineTo(21.0f, 24.469f)
                lineTo(21.0f, 22.844f)
                lineTo(19.531f, 20.719f)
                curveTo(19.375f, 20.492f, 19.191f, 20.222f, 19.0f, 19.938f)
                lineTo(19.0f, 24.563f)
                lineTo(13.0f, 22.313f)
                lineTo(13.0f, 7.438f)
                lineTo(14.094f, 7.844f)
                curveTo(14.192f, 7.168f, 14.367f, 6.516f, 14.625f, 5.906f)
                lineTo(11.969f, 4.938f)
                close()
                moveTo(22.0f, 5.0f)
                curveTo(24.219f, 5.0f, 26.0f, 6.781f, 26.0f, 9.0f)
                curveTo(26.0f, 9.387f, 25.758f, 10.3f, 25.313f, 11.313f)
                curveTo(24.868f, 12.325f, 24.238f, 13.472f, 23.625f, 14.531f)
                curveTo(22.809f, 15.937f, 22.457f, 16.439f, 22.0f, 17.127f)
                curveTo(21.543f, 16.439f, 21.191f, 15.937f, 20.375f, 14.531f)
                curveTo(19.762f, 13.472f, 19.133f, 12.325f, 18.688f, 11.313f)
                curveTo(18.243f, 10.3f, 18.0f, 9.387f, 18.0f, 9.0f)
                curveTo(18.0f, 6.781f, 19.781f, 5.0f, 22.0f, 5.0f)
                close()
                moveTo(11.0f, 7.5f)
                lineTo(11.0f, 22.344f)
                lineTo(6.0f, 24.469f)
                lineTo(6.0f, 9.656f)
                lineTo(11.0f, 7.5f)
                close()
            }
        }
        .build()
        return _mapMarkedSolid!!
    }

private var _mapMarkedSolid: ImageVector? = null
