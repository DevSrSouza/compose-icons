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

public val BrandsGroup.Scribd: ImageVector
    get() {
        if (_scribd != null) {
            return _scribd!!
        }
        _scribd = Builder(name = "Scribd", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.3f, 252.7f)
                curveToRelative(-16.1f, -19.0f, -24.7f, -45.9f, -24.8f, -79.9f)
                curveToRelative(0.0f, -100.4f, 75.2f, -153.1f, 167.2f, -153.1f)
                curveToRelative(98.6f, -1.6f, 156.8f, 49.0f, 184.3f, 70.6f)
                lineToRelative(-50.5f, 72.1f)
                lineToRelative(-37.3f, -24.6f)
                lineToRelative(26.9f, -38.6f)
                curveToRelative(-36.5f, -24.0f, -79.4f, -36.5f, -123.0f, -35.8f)
                curveToRelative(-50.7f, -0.8f, -111.7f, 27.2f, -111.7f, 76.2f)
                curveToRelative(0.0f, 18.7f, 11.2f, 20.7f, 28.6f, 15.6f)
                curveToRelative(23.3f, -5.3f, 41.9f, 0.6f, 55.8f, 14.0f)
                curveToRelative(26.4f, 24.3f, 23.2f, 67.6f, -0.7f, 91.9f)
                curveToRelative(-29.2f, 29.5f, -85.2f, 27.3f, -114.8f, -8.4f)
                close()
                moveTo(360.0f, 258.6f)
                curveToRelative(-15.5f, -18.8f, -38.9f, -29.4f, -63.2f, -28.6f)
                curveToRelative(-38.1f, -2.0f, -71.1f, 28.0f, -70.5f, 67.2f)
                curveToRelative(-0.7f, 16.8f, 6.0f, 33.0f, 18.4f, 44.3f)
                curveToRelative(14.1f, 13.9f, 33.0f, 19.7f, 56.3f, 14.4f)
                curveToRelative(17.4f, -5.1f, 28.6f, -3.1f, 28.6f, 15.6f)
                curveToRelative(0.0f, 4.3f, -0.5f, 8.5f, -1.4f, 12.7f)
                curveToRelative(-16.7f, 40.9f, -59.5f, 64.4f, -121.4f, 64.4f)
                curveToRelative(-51.9f, 0.2f, -102.4f, -16.4f, -144.1f, -47.3f)
                lineToRelative(33.7f, -39.4f)
                lineToRelative(-35.6f, -27.4f)
                lineTo(0.0f, 406.3f)
                lineToRelative(15.4f, 13.8f)
                curveToRelative(52.5f, 46.8f, 120.4f, 72.5f, 190.7f, 72.2f)
                curveToRelative(51.4f, 0.0f, 94.4f, -10.5f, 133.6f, -44.1f)
                curveToRelative(57.1f, -51.4f, 54.2f, -149.2f, 20.3f, -189.6f)
                close()
            }
        }
        .build()
        return _scribd!!
    }

private var _scribd: ImageVector? = null
