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

public val ThinGroup.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) {
            return _globeStand!!
        }
        _globeStand = Builder(name = "GlobeStand", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 172.0f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 52.0f, 96.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, false, 128.0f, 172.0f)
                close()
                moveTo(128.0f, 28.0f)
                arcTo(68.0f, 68.0f, 0.0f, true, true, 60.0f, 96.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 128.0f, 28.0f)
                close()
                moveTo(132.0f, 203.9f)
                lineTo(132.0f, 228.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(96.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(28.0f)
                lineTo(124.0f, 203.9f)
                arcTo(108.0f, 108.0f, 0.0f, false, true, 51.6f, 19.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 5.7f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.7f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 198.7f, 166.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.7f, 0.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.0f, 5.7f)
                arcTo(107.7f, 107.7f, 0.0f, false, true, 132.0f, 203.9f)
                close()
            }
        }
        .build()
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
