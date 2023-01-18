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

public val BoldGroup.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) {
            return _bracketsCurly!!
        }
        _bracketsCurly = Builder(name = "BracketsCurly", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(54.8f, 119.5f)
                arcToRelative(39.5f, 39.5f, 0.0f, false, true, -5.7f, 8.5f)
                arcToRelative(39.5f, 39.5f, 0.0f, false, true, 5.7f, 8.5f)
                curveTo(60.0f, 147.2f, 60.0f, 159.8f, 60.0f, 172.0f)
                curveToRelative(0.0f, 25.9f, 1.8f, 32.0f, 20.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                curveToRelative(-19.1f, 0.0f, -32.2f, -6.9f, -38.8f, -20.5f)
                curveTo(36.0f, 196.8f, 36.0f, 184.2f, 36.0f, 172.0f)
                curveToRelative(0.0f, -25.9f, -1.8f, -32.0f, -20.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                curveToRelative(18.2f, 0.0f, 20.0f, -6.1f, 20.0f, -32.0f)
                curveToRelative(0.0f, -12.2f, 0.0f, -24.8f, 5.2f, -35.5f)
                curveTo(47.8f, 34.9f, 60.9f, 28.0f, 80.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                curveToRelative(-18.2f, 0.0f, -20.0f, 6.1f, -20.0f, 32.0f)
                curveTo(60.0f, 96.2f, 60.0f, 108.8f, 54.8f, 119.5f)
                close()
                moveTo(240.0f, 116.0f)
                curveToRelative(-18.2f, 0.0f, -20.0f, -6.1f, -20.0f, -32.0f)
                curveToRelative(0.0f, -12.2f, 0.0f, -24.8f, -5.2f, -35.5f)
                curveTo(208.2f, 34.9f, 195.1f, 28.0f, 176.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                curveToRelative(18.2f, 0.0f, 20.0f, 6.1f, 20.0f, 32.0f)
                curveToRelative(0.0f, 12.2f, 0.0f, 24.8f, 5.2f, 35.5f)
                arcToRelative(39.5f, 39.5f, 0.0f, false, false, 5.7f, 8.5f)
                arcToRelative(39.5f, 39.5f, 0.0f, false, false, -5.7f, 8.5f)
                curveTo(196.0f, 147.2f, 196.0f, 159.8f, 196.0f, 172.0f)
                curveToRelative(0.0f, 25.9f, -1.8f, 32.0f, -20.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                curveToRelative(19.1f, 0.0f, 32.2f, -6.9f, 38.8f, -20.5f)
                curveToRelative(5.2f, -10.7f, 5.2f, -23.3f, 5.2f, -35.5f)
                curveToRelative(0.0f, -25.9f, 1.8f, -32.0f, 20.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
