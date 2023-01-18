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

public val BoldGroup.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) {
            return _fireSimple!!
        }
        _fireSimple = Builder(name = "FireSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.5f, 64.5f)
                curveToRelative(-13.3f, -21.2f, -30.3f, -39.2f, -45.2f, -54.1f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 136.0f, 13.7f)
                lineTo(107.1f, 74.3f)
                lineTo(78.7f, 55.4f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 62.0f, 58.7f)
                curveTo(42.1f, 88.8f, 32.0f, 116.1f, 32.0f, 140.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 192.0f, 0.0f)
                curveTo(224.0f, 114.3f, 216.3f, 89.6f, 200.5f, 64.5f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -72.0f, -72.0f)
                curveToRelative(0.0f, -16.6f, 6.6f, -36.0f, 19.6f, -57.8f)
                lineTo(105.3f, 102.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.5f, -4.8f)
                lineToRelative(27.4f, -57.6f)
                curveTo(177.3f, 68.5f, 200.0f, 100.7f, 200.0f, 140.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
