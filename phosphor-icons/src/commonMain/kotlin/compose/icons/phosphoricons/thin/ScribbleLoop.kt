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

public val ThinGroup.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) {
            return _scribbleLoop!!
        }
        _scribbleLoop = Builder(name = "ScribbleLoop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.1f, 157.4f)
                arcToRelative(155.1f, 155.1f, 0.0f, false, false, -60.5f, -41.0f)
                curveToRelative(-1.7f, -18.0f, -8.2f, -34.4f, -18.9f, -46.9f)
                curveTo(149.4f, 52.8f, 128.8f, 44.0f, 104.0f, 44.0f)
                curveTo(54.5f, 44.0f, 22.1f, 88.6f, 20.7f, 90.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.6f, 4.6f)
                curveTo(27.6f, 94.7f, 58.7f, 52.0f, 104.0f, 52.0f)
                curveToRelative(22.4f, 0.0f, 40.9f, 7.9f, 53.6f, 22.7f)
                curveToRelative(8.9f, 10.4f, 14.6f, 24.0f, 16.6f, 38.9f)
                arcTo(134.4f, 134.4f, 0.0f, false, false, 136.0f, 108.0f)
                curveToRelative(-25.1f, 0.0f, -46.1f, 6.5f, -60.7f, 18.8f)
                curveToRelative(-12.6f, 10.6f, -19.9f, 25.3f, -19.9f, 40.4f)
                arcToRelative(43.8f, 43.8f, 0.0f, false, false, 12.7f, 31.3f)
                curveTo(77.0f, 207.3f, 89.4f, 212.0f, 104.0f, 212.0f)
                curveToRelative(24.0f, 0.0f, 44.4f, -9.5f, 59.0f, -27.4f)
                curveToRelative(12.7f, -15.6f, 20.0f, -37.1f, 20.0f, -59.0f)
                verticalLineToRelative(-0.3f)
                curveToRelative(33.7f, 13.4f, 53.7f, 36.9f, 53.9f, 37.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.2f, -5.2f)
                close()
                moveTo(104.0f, 204.0f)
                curveToRelative(-27.9f, 0.0f, -40.6f, -19.1f, -40.6f, -36.8f)
                curveToRelative(0.0f, -24.6f, 22.7f, -51.2f, 72.6f, -51.2f)
                arcToRelative(125.5f, 125.5f, 0.0f, false, true, 39.0f, 6.3f)
                verticalLineToRelative(3.3f)
                curveTo(175.0f, 177.1f, 139.3f, 204.0f, 104.0f, 204.0f)
                close()
            }
        }
        .build()
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
