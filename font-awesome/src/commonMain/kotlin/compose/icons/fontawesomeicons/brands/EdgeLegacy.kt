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

public val BrandsGroup.EdgeLegacy: ImageVector
    get() {
        if (_edgeLegacy != null) {
            return _edgeLegacy!!
        }
        _edgeLegacy = Builder(name = "EdgeLegacy", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.71f, 228.16f)
                lineToRelative(0.35f, -0.48f)
                curveToRelative(0.0f, 0.16f, 0.0f, 0.32f, -0.07f, 0.48f)
                close()
                moveTo(486.29f, 243.67f)
                curveToRelative(0.0f, -44.0f, -7.76f, -84.46f, -28.81f, -122.4f)
                curveTo(416.5f, 47.88f, 343.91f, 8.0f, 258.89f, 8.0f)
                curveTo(119.0f, 7.72f, 40.62f, 113.21f, 26.06f, 227.68f)
                curveToRelative(42.42f, -61.31f, 117.07f, -121.38f, 220.37f, -125.0f)
                curveToRelative(0.0f, 0.0f, 109.67f, 0.0f, 99.42f, 105.0f)
                lineTo(170.0f, 207.68f)
                curveToRelative(6.37f, -37.39f, 18.55f, -59.0f, 34.34f, -78.93f)
                curveToRelative(-75.05f, 34.9f, -121.85f, 96.1f, -120.75f, 188.32f)
                curveToRelative(0.83f, 71.45f, 50.13f, 144.84f, 120.75f, 172.0f)
                curveToRelative(83.35f, 31.84f, 192.77f, 7.2f, 240.13f, -21.33f)
                lineTo(444.47f, 363.31f)
                curveTo(363.6f, 419.8f, 173.6f, 424.23f, 172.21f, 295.74f)
                lineTo(486.29f, 295.74f)
                lineTo(486.29f, 243.67f)
                close()
            }
        }
        .build()
        return _edgeLegacy!!
    }

private var _edgeLegacy: ImageVector? = null
