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

public val LightGroup.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.5f, 49.1f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, false, -41.1f, -38.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -6.8f, 0.0f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, false, -41.1f, 38.0f)
                curveTo(56.3f, 80.3f, 42.0f, 113.1f, 42.0f, 144.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 113.1f, 199.7f, 80.3f, 172.5f, 49.1f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, true, -74.0f, -74.0f)
                curveToRelative(0.0f, -59.6f, 59.0f, -108.9f, 74.0f, -120.5f)
                curveToRelative(15.0f, 11.6f, 74.0f, 60.9f, 74.0f, 120.5f)
                arcTo(74.1f, 74.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(181.2f, 153.1f)
                arcToRelative(53.8f, 53.8f, 0.0f, false, true, -44.1f, 44.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.0f, -11.9f)
                arcToRelative(41.9f, 41.9f, 0.0f, false, false, 34.3f, -34.2f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 6.9f, -5.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 181.2f, 153.1f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null
