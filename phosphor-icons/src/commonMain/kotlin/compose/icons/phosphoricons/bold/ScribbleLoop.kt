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

public val BoldGroup.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) {
            return _scribbleLoop!!
        }
        _scribbleLoop = Builder(name = "ScribbleLoop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.2f, 152.3f)
                curveToRelative(-1.2f, -1.5f, -22.7f, -26.7f, -59.2f, -41.6f)
                curveToRelative(-2.5f, -17.7f, -9.5f, -33.8f, -20.2f, -46.4f)
                curveTo(153.9f, 45.8f, 131.2f, 36.0f, 104.0f, 36.0f)
                curveTo(50.4f, 36.0f, 15.7f, 83.8f, 14.2f, 85.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.6f, 14.0f)
                curveTo(34.0f, 99.4f, 62.7f, 60.0f, 104.0f, 60.0f)
                curveToRelative(20.0f, 0.0f, 36.4f, 6.9f, 47.5f, 19.9f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 12.3f, 22.9f)
                arcTo(137.2f, 137.2f, 0.0f, false, false, 136.0f, 100.0f)
                curveToRelative(-27.0f, 0.0f, -49.8f, 7.1f, -65.8f, 20.6f)
                curveToRelative(-14.5f, 12.2f, -22.8f, 29.2f, -22.8f, 46.6f)
                curveToRelative(0.0f, 26.3f, 19.4f, 52.8f, 56.6f, 52.8f)
                curveToRelative(26.5f, 0.0f, 49.0f, -10.5f, 65.2f, -30.3f)
                curveToRelative(11.6f, -14.2f, 19.0f, -32.8f, 21.2f, -52.3f)
                curveToRelative(25.3f, 12.7f, 40.2f, 30.0f, 40.4f, 30.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 18.4f, -15.4f)
                close()
                moveTo(104.0f, 196.0f)
                curveToRelative(-22.5f, 0.0f, -32.6f, -14.4f, -32.6f, -28.8f)
                curveToRelative(0.0f, -20.8f, 20.2f, -43.2f, 64.6f, -43.2f)
                arcToRelative(113.3f, 113.3f, 0.0f, false, true, 31.0f, 4.3f)
                curveTo(165.9f, 162.4f, 144.3f, 196.0f, 104.0f, 196.0f)
                close()
            }
        }
        .build()
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
