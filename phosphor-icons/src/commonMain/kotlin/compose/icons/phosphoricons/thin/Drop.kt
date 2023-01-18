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

public val ThinGroup.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.0f, 50.4f)
                arcToRelative(255.4f, 255.4f, 0.0f, false, false, -40.7f, -37.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -4.6f, 0.0f)
                arcTo(255.4f, 255.4f, 0.0f, false, false, 85.0f, 50.4f)
                curveTo(58.2f, 81.2f, 44.0f, 113.6f, 44.0f, 144.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveTo(212.0f, 113.6f, 197.8f, 81.2f, 171.0f, 50.4f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, true, -76.0f, -76.0f)
                curveToRelative(0.0f, -35.9f, 21.2f, -67.8f, 38.9f, -88.2f)
                arcTo(247.5f, 247.5f, 0.0f, false, true, 128.0f, 21.0f)
                arcToRelative(247.5f, 247.5f, 0.0f, false, true, 37.1f, 34.8f)
                curveTo(182.8f, 76.2f, 204.0f, 108.1f, 204.0f, 144.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(179.3f, 152.7f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -42.5f, 42.5f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, -3.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.3f, -4.6f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, false, 35.9f, -35.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.6f, -3.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 179.3f, 152.7f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null
