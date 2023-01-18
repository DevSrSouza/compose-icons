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

public val LightGroup.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) {
            return _globeStand!!
        }
        _globeStand = Builder(name = "GlobeStand", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 174.0f)
                arcTo(78.0f, 78.0f, 0.0f, true, false, 50.0f, 96.0f)
                arcTo(78.1f, 78.1f, 0.0f, false, false, 128.0f, 174.0f)
                close()
                moveTo(128.0f, 30.0f)
                arcTo(66.0f, 66.0f, 0.0f, true, true, 62.0f, 96.0f)
                arcTo(66.1f, 66.1f, 0.0f, false, true, 128.0f, 30.0f)
                close()
                moveTo(134.0f, 205.8f)
                lineTo(134.0f, 226.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(96.0f, 238.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(26.0f)
                lineTo(122.0f, 205.8f)
                arcTo(110.0f, 110.0f, 0.0f, false, true, 50.2f, 18.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, 8.5f)
                arcTo(98.0f, 98.0f, 0.0f, false, false, 128.0f, 194.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(97.3f, 97.3f, 0.0f, false, false, 69.3f, -28.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.5f, 0.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                arcTo(109.4f, 109.4f, 0.0f, false, true, 134.0f, 205.8f)
                close()
            }
        }
        .build()
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
