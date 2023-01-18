package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) {
            return _globeStand!!
        }
        _globeStand = Builder(name = "GlobeStand", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 176.0f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 48.0f, 96.0f)
                arcTo(80.1f, 80.1f, 0.0f, false, false, 128.0f, 176.0f)
                close()
                moveTo(128.0f, 32.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 64.0f, 96.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, true, 128.0f, 32.0f)
                close()
                moveTo(136.0f, 207.7f)
                lineTo(136.0f, 224.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(24.0f)
                lineTo(120.0f, 207.7f)
                arcTo(112.0f, 112.0f, 0.0f, false, true, 48.8f, 16.8f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 60.1f, 28.1f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 195.9f, 163.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, 11.3f)
                arcTo(111.6f, 111.6f, 0.0f, false, true, 136.0f, 207.7f)
                close()
            }
        }
        .build()
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
