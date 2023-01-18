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

public val LightGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.3f, 52.9f)
                arcToRelative(216.8f, 216.8f, 0.0f, false, false, -41.2f, -34.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -6.2f, 0.0f)
                arcToRelative(216.8f, 216.8f, 0.0f, false, false, -41.2f, 34.0f)
                curveTo(56.4f, 81.5f, 42.0f, 113.0f, 42.0f, 144.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 113.0f, 199.6f, 81.5f, 172.3f, 52.9f)
                close()
                moveTo(94.0f, 184.0f)
                curveToRelative(0.0f, -29.8f, 25.1f, -50.4f, 34.0f, -56.8f)
                curveToRelative(8.9f, 6.4f, 34.0f, 26.9f, 34.0f, 56.8f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, true, -32.3f, 34.0f)
                horizontalLineToRelative(-3.4f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 94.0f, 184.0f)
                close()
                moveTo(168.4f, 205.9f)
                arcTo(45.1f, 45.1f, 0.0f, false, false, 174.0f, 184.0f)
                curveToRelative(0.0f, -42.9f, -41.2f, -68.1f, -42.9f, -69.1f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -6.2f, 0.0f)
                curveToRelative(-1.7f, 1.0f, -42.9f, 26.2f, -42.9f, 69.1f)
                arcToRelative(45.1f, 45.1f, 0.0f, false, false, 5.6f, 21.9f)
                arcTo(73.9f, 73.9f, 0.0f, false, true, 54.0f, 144.0f)
                curveToRelative(0.0f, -59.8f, 59.6f, -103.3f, 74.0f, -112.9f)
                curveToRelative(14.4f, 9.6f, 74.0f, 53.1f, 74.0f, 112.9f)
                arcTo(73.9f, 73.9f, 0.0f, false, true, 168.4f, 205.9f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
