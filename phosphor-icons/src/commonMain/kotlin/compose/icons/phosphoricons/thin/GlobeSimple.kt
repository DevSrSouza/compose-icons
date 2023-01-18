package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) {
            return _globeSimple!!
        }
        _globeSimple = Builder(name = "GlobeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(219.9f, 124.0f)
                horizontalLineToRelative(-48.0f)
                curveTo(171.0f, 89.8f, 158.0f, 58.4f, 135.8f, 36.3f)
                arcTo(92.2f, 92.2f, 0.0f, false, true, 219.9f, 124.0f)
                close()
                moveTo(128.0f, 216.0f)
                curveToRelative(-21.7f, -20.3f, -34.9f, -51.2f, -35.9f, -84.0f)
                horizontalLineToRelative(71.8f)
                curveTo(162.9f, 164.8f, 149.7f, 195.7f, 128.0f, 216.0f)
                close()
                moveTo(92.1f, 124.0f)
                curveToRelative(1.0f, -32.7f, 14.2f, -63.7f, 35.9f, -84.0f)
                curveToRelative(21.7f, 20.3f, 34.9f, 51.3f, 35.9f, 84.0f)
                close()
                moveTo(120.3f, 36.3f)
                curveTo(98.0f, 58.4f, 85.0f, 89.8f, 84.1f, 124.0f)
                horizontalLineToRelative(-48.0f)
                arcTo(92.2f, 92.2f, 0.0f, false, true, 120.3f, 36.3f)
                close()
                moveTo(36.1f, 132.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(0.9f, 34.3f, 13.9f, 65.7f, 36.2f, 87.7f)
                arcTo(92.2f, 92.2f, 0.0f, false, true, 36.1f, 132.0f)
                close()
                moveTo(135.8f, 219.7f)
                curveToRelative(22.2f, -22.0f, 35.2f, -53.4f, 36.1f, -87.7f)
                horizontalLineToRelative(48.0f)
                arcTo(92.2f, 92.2f, 0.0f, false, true, 135.8f, 219.7f)
                close()
            }
        }
        .build()
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
