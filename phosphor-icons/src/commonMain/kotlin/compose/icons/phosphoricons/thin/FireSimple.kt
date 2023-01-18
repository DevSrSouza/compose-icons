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

public val ThinGroup.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) {
            return _fireSimple!!
        }
        _fireSimple = Builder(name = "FireSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.6f, 16.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -3.5f, -1.1f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -2.9f, 2.3f)
                lineTo(110.4f, 86.1f)
                lineTo(74.3f, 62.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.1f, -0.6f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -2.5f, 1.7f)
                curveTo(49.7f, 91.9f, 40.0f, 117.7f, 40.0f, 140.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 89.3f, 184.1f, 50.4f, 149.6f, 16.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(80.1f, 80.1f, 0.0f, false, true, -80.0f, -80.0f)
                curveToRelative(0.0f, -19.8f, 8.5f, -43.1f, 25.2f, -69.1f)
                lineToRelative(36.6f, 24.4f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.3f, 0.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.5f, -2.2f)
                lineToRelative(32.4f, -68.0f)
                curveToRelative(31.7f, 32.2f, 60.0f, 68.4f, 60.0f, 114.3f)
                arcTo(80.1f, 80.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
