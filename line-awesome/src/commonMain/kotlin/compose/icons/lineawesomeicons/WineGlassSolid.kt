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

public val LineAwesomeIcons.WineGlassSolid: ImageVector
    get() {
        if (_wineGlassSolid != null) {
            return _wineGlassSolid!!
        }
        _wineGlassSolid = Builder(name = "WineGlassSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.301f, 5.0f)
                lineTo(8.0f, 5.6f)
                curveTo(7.4f, 6.9f, 7.0f, 8.7f, 7.0f, 11.0f)
                curveTo(7.0f, 15.6f, 10.5f, 19.4f, 15.0f, 19.9f)
                lineTo(15.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                lineTo(10.0f, 28.0f)
                lineTo(22.0f, 28.0f)
                lineTo(22.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 19.9f)
                curveTo(21.5f, 19.4f, 25.0f, 15.6f, 25.0f, 11.0f)
                curveTo(25.0f, 8.7f, 24.6f, 6.9f, 24.0f, 5.6f)
                lineTo(23.801f, 5.0f)
                lineTo(8.301f, 5.0f)
                close()
                moveTo(9.6f, 7.0f)
                lineTo(22.4f, 7.0f)
                curveTo(22.8f, 8.2f, 23.0f, 9.6f, 23.0f, 11.0f)
                curveTo(23.0f, 13.1f, 22.099f, 14.899f, 20.699f, 16.199f)
                lineTo(20.6f, 16.301f)
                curveTo(20.5f, 16.401f, 20.401f, 16.5f, 20.301f, 16.5f)
                curveTo(20.201f, 16.6f, 20.1f, 16.599f, 20.1f, 16.699f)
                curveTo(20.0f, 16.799f, 19.901f, 16.8f, 19.801f, 16.9f)
                curveTo(19.701f, 17.0f, 19.6f, 17.0f, 19.5f, 17.1f)
                curveTo(19.4f, 17.1f, 19.301f, 17.199f, 19.301f, 17.199f)
                curveTo(19.201f, 17.299f, 19.1f, 17.3f, 18.9f, 17.4f)
                curveTo(18.8f, 17.4f, 18.699f, 17.5f, 18.699f, 17.5f)
                curveTo(18.599f, 17.6f, 18.401f, 17.6f, 18.301f, 17.6f)
                curveTo(18.201f, 17.6f, 18.2f, 17.699f, 18.1f, 17.699f)
                curveTo(18.0f, 17.699f, 17.799f, 17.801f, 17.699f, 17.801f)
                curveTo(17.599f, 17.801f, 17.6f, 17.8f, 17.5f, 17.9f)
                lineTo(16.9f, 17.9f)
                lineTo(16.699f, 17.9f)
                lineTo(16.0f, 17.9f)
                curveTo(12.1f, 17.9f, 9.0f, 14.8f, 9.0f, 10.9f)
                lineTo(9.0f, 9.801f)
                lineTo(9.0f, 9.4f)
                lineTo(9.6f, 7.0f)
                close()
            }
        }
        .build()
        return _wineGlassSolid!!
    }

private var _wineGlassSolid: ImageVector? = null
