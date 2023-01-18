package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.9f, 6.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.8f, 0.0f)
                arcTo(264.8f, 264.8f, 0.0f, false, false, 78.9f, 45.1f)
                curveTo(50.9f, 77.4f, 36.0f, 111.6f, 36.0f, 144.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 66.6f, 138.4f, 8.6f, 134.9f, 6.2f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, -68.0f, -68.0f)
                curveToRelative(0.0f, -33.3f, 20.0f, -63.4f, 36.7f, -82.7f)
                arcTo(247.8f, 247.8f, 0.0f, false, true, 128.0f, 31.1f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, true, 31.3f, 30.2f)
                curveTo(176.0f, 80.6f, 196.0f, 110.7f, 196.0f, 144.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(174.8f, 154.7f)
                arcToRelative(48.2f, 48.2f, 0.0f, false, true, -36.1f, 36.1f)
                lineToRelative(-2.7f, 0.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.7f, -23.7f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, 18.1f, -18.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.4f, 5.4f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null
