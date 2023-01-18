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

public val RegularGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.8f, 51.5f)
                arcToRelative(221.5f, 221.5f, 0.0f, false, false, -41.7f, -34.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.2f, 0.0f)
                arcTo(221.5f, 221.5f, 0.0f, false, false, 82.2f, 51.5f)
                curveTo(54.6f, 80.5f, 40.0f, 112.5f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 112.5f, 201.4f, 80.5f, 173.8f, 51.5f)
                close()
                moveTo(96.0f, 184.0f)
                curveToRelative(0.0f, -27.7f, 22.5f, -47.3f, 32.0f, -54.3f)
                curveToRelative(9.5f, 7.0f, 32.0f, 26.6f, 32.0f, 54.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f)
                close()
                moveTo(173.3f, 199.9f)
                arcTo(49.1f, 49.1f, 0.0f, false, false, 176.0f, 184.0f)
                curveToRelative(0.0f, -44.0f, -42.1f, -69.8f, -43.9f, -70.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.2f, 0.0f)
                curveTo(122.1f, 114.2f, 80.0f, 140.0f, 80.0f, 184.0f)
                arcToRelative(49.1f, 49.1f, 0.0f, false, false, 2.7f, 15.9f)
                arcTo(71.7f, 71.7f, 0.0f, false, true, 56.0f, 144.0f)
                curveToRelative(0.0f, -34.4f, 20.4f, -63.1f, 37.5f, -81.2f)
                arcTo(223.2f, 223.2f, 0.0f, false, true, 128.0f, 33.5f)
                arcToRelative(223.2f, 223.2f, 0.0f, false, true, 34.5f, 29.3f)
                curveTo(193.5f, 95.5f, 200.0f, 125.0f, 200.0f, 144.0f)
                arcTo(71.7f, 71.7f, 0.0f, false, true, 173.3f, 199.9f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
