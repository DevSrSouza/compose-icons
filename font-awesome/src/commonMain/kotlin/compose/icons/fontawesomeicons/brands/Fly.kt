package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Fly: ImageVector
    get() {
        if (_fly != null) {
            return _fly!!
        }
        _fly = Builder(name = "Fly", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.8f, 427.8f)
                curveToRelative(12.9f, 11.7f, 33.7f, 33.3f, 33.2f, 50.7f)
                curveToRelative(0.0f, 0.8f, -0.1f, 1.6f, -0.1f, 2.5f)
                curveToRelative(-1.8f, 19.8f, -18.8f, 31.1f, -39.1f, 31.0f)
                curveToRelative(-25.0f, -0.1f, -39.9f, -16.8f, -38.7f, -35.8f)
                curveToRelative(1.0f, -16.2f, 20.5f, -36.7f, 32.4f, -47.6f)
                curveToRelative(2.3f, -2.1f, 2.7f, -2.7f, 5.6f, -3.6f)
                curveToRelative(3.4f, 0.0f, 3.9f, 0.3f, 6.7f, 2.8f)
                close()
                moveTo(331.9f, 67.3f)
                curveToRelative(-16.3f, -25.7f, -38.6f, -40.6f, -63.3f, -52.1f)
                curveTo(243.1f, 4.5f, 214.0f, -0.2f, 192.0f, 0.0f)
                curveToRelative(-44.1f, 0.0f, -71.2f, 13.2f, -81.1f, 17.3f)
                curveTo(57.3f, 45.2f, 26.5f, 87.2f, 28.0f, 158.6f)
                curveToRelative(7.1f, 82.2f, 97.0f, 176.0f, 155.8f, 233.8f)
                curveToRelative(1.7f, 1.6f, 4.5f, 4.5f, 6.2f, 5.1f)
                lineToRelative(3.3f, 0.1f)
                curveToRelative(2.1f, -0.7f, 1.8f, -0.5f, 3.5f, -2.1f)
                curveToRelative(52.3f, -49.2f, 140.7f, -145.8f, 155.9f, -215.7f)
                curveToRelative(7.0f, -39.2f, 3.1f, -72.5f, -20.8f, -112.5f)
                close()
                moveTo(186.8f, 351.9f)
                curveToRelative(-28.0f, -51.1f, -65.2f, -130.7f, -69.3f, -189.0f)
                curveToRelative(-3.4f, -47.5f, 11.4f, -131.2f, 69.3f, -136.7f)
                verticalLineToRelative(325.7f)
                close()
                moveTo(328.7f, 180.0f)
                curveToRelative(-16.4f, 56.8f, -77.3f, 128.0f, -118.9f, 170.3f)
                curveTo(237.6f, 298.4f, 275.0f, 217.0f, 277.0f, 158.4f)
                curveToRelative(1.6f, -45.9f, -9.8f, -105.8f, -48.0f, -131.4f)
                curveToRelative(88.8f, 18.3f, 115.5f, 98.1f, 99.7f, 153.0f)
                close()
            }
        }
        .build()
        return _fly!!
    }

private var _fly: ImageVector? = null
