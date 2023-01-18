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

public val LightGroup.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) {
            return _bracketsCurly!!
        }
        _bracketsCurly = Builder(name = "BracketsCurly", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.9f, 128.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, true, 9.5f, 11.1f)
                curveTo(54.0f, 148.6f, 54.0f, 160.5f, 54.0f, 172.0f)
                curveToRelative(0.0f, 24.3f, 1.2f, 38.0f, 26.0f, 38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                curveToRelative(-16.9f, 0.0f, -27.8f, -5.6f, -33.4f, -17.1f)
                curveTo(42.0f, 195.4f, 42.0f, 183.5f, 42.0f, 172.0f)
                curveToRelative(0.0f, -24.3f, -1.2f, -38.0f, -26.0f, -38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                curveToRelative(24.8f, 0.0f, 26.0f, -13.7f, 26.0f, -38.0f)
                curveToRelative(0.0f, -11.5f, 0.0f, -23.4f, 4.6f, -32.9f)
                curveTo(52.2f, 39.6f, 63.1f, 34.0f, 80.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                curveTo(55.2f, 46.0f, 54.0f, 59.7f, 54.0f, 84.0f)
                curveToRelative(0.0f, 11.5f, 0.0f, 23.4f, -4.6f, 32.9f)
                arcTo(27.8f, 27.8f, 0.0f, false, true, 39.9f, 128.0f)
                close()
                moveTo(240.0f, 122.0f)
                curveToRelative(-24.8f, 0.0f, -26.0f, -13.7f, -26.0f, -38.0f)
                curveToRelative(0.0f, -11.5f, 0.0f, -23.4f, -4.6f, -32.9f)
                curveTo(203.8f, 39.6f, 192.9f, 34.0f, 176.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(24.8f, 0.0f, 26.0f, 13.7f, 26.0f, 38.0f)
                curveToRelative(0.0f, 11.5f, 0.0f, 23.4f, 4.6f, 32.9f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, false, 9.5f, 11.1f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, false, -9.5f, 11.1f)
                curveToRelative(-4.6f, 9.5f, -4.6f, 21.4f, -4.6f, 32.9f)
                curveToRelative(0.0f, 24.3f, -1.2f, 38.0f, -26.0f, 38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(16.9f, 0.0f, 27.8f, -5.6f, 33.4f, -17.1f)
                curveToRelative(4.6f, -9.5f, 4.6f, -21.4f, 4.6f, -32.9f)
                curveToRelative(0.0f, -24.3f, 1.2f, -38.0f, 26.0f, -38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
