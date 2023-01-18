package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) {
            return _globeSimple!!
        }
        _globeSimple = Builder(name = "GlobeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(217.8f, 122.0f)
                lineTo(173.9f, 122.0f)
                curveToRelative(-1.3f, -32.0f, -13.0f, -61.4f, -32.9f, -83.0f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 217.8f, 122.0f)
                close()
                moveTo(94.1f, 134.0f)
                horizontalLineToRelative(67.8f)
                curveToRelative(-1.5f, 30.8f, -13.8f, 59.7f, -33.9f, 79.3f)
                curveTo(107.9f, 193.7f, 95.6f, 164.8f, 94.1f, 134.0f)
                close()
                moveTo(94.1f, 122.0f)
                curveToRelative(1.5f, -30.8f, 13.8f, -59.7f, 33.9f, -79.3f)
                curveToRelative(20.1f, 19.6f, 32.4f, 48.5f, 33.9f, 79.3f)
                close()
                moveTo(115.0f, 39.0f)
                curveTo(95.1f, 60.6f, 83.4f, 90.0f, 82.1f, 122.0f)
                lineTo(38.2f, 122.0f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 115.0f, 39.0f)
                close()
                moveTo(38.2f, 134.0f)
                lineTo(82.1f, 134.0f)
                curveToRelative(1.3f, 32.0f, 13.0f, 61.4f, 32.9f, 83.1f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 38.2f, 134.0f)
                close()
                moveTo(141.0f, 217.1f)
                curveToRelative(19.9f, -21.7f, 31.6f, -51.1f, 32.9f, -83.1f)
                horizontalLineToRelative(43.9f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 141.0f, 217.1f)
                close()
            }
        }
        .build()
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
