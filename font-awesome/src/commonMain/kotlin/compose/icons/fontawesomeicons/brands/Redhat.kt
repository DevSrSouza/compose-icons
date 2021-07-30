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

public val BrandsGroup.Redhat: ImageVector
    get() {
        if (_redhat != null) {
            return _redhat!!
        }
        _redhat = Builder(name = "Redhat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(341.52f, 285.56f)
                curveToRelative(33.65f, 0.0f, 82.34f, -6.94f, 82.34f, -47.0f)
                curveToRelative(0.22f, -6.74f, 0.86f, -1.82f, -20.88f, -96.24f)
                curveToRelative(-4.62f, -19.15f, -8.68f, -27.84f, -42.31f, -44.65f)
                curveToRelative(-26.09f, -13.34f, -82.92f, -35.37f, -99.73f, -35.37f)
                curveToRelative(-15.66f, 0.0f, -20.2f, 20.17f, -38.87f, 20.17f)
                curveToRelative(-18.0f, 0.0f, -31.31f, -15.06f, -48.12f, -15.06f)
                curveToRelative(-16.14f, 0.0f, -26.66f, 11.0f, -34.78f, 33.62f)
                curveToRelative(-27.5f, 77.55f, -26.28f, 74.27f, -26.12f, 78.27f)
                curveToRelative(0.0f, 24.8f, 97.64f, 106.11f, 228.47f, 106.11f)
                moveTo(429.0f, 254.84f)
                curveToRelative(4.65f, 22.0f, 4.65f, 24.35f, 4.65f, 27.25f)
                curveToRelative(0.0f, 37.66f, -42.33f, 58.56f, -98.0f, 58.56f)
                curveToRelative(-125.74f, 0.08f, -235.91f, -73.65f, -235.91f, -122.33f)
                arcToRelative(49.55f, 49.55f, 0.0f, false, true, 4.06f, -19.72f)
                curveTo(58.56f, 200.86f, 0.0f, 208.93f, 0.0f, 260.63f)
                curveToRelative(0.0f, 84.67f, 200.63f, 189.0f, 359.49f, 189.0f)
                curveToRelative(121.79f, 0.0f, 152.51f, -55.08f, 152.51f, -98.58f)
                curveToRelative(0.0f, -34.21f, -29.59f, -73.05f, -82.93f, -96.24f)
            }
        }
        .build()
        return _redhat!!
    }

private var _redhat: ImageVector? = null
