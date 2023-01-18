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

public val BoldGroup.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) {
            return _mapPinLine!!
        }
        _mapPinLine = Builder(name = "MapPinLine", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.1f, 220.0f)
                lineTo(160.9f, 220.0f)
                curveToRelative(5.1f, -5.0f, 10.7f, -10.7f, 16.3f, -17.1f)
                curveToRelative(28.1f, -32.3f, 42.9f, -66.5f, 42.9f, -98.9f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, -184.0f, 0.0f)
                curveToRelative(0.0f, 50.0f, 34.1f, 91.9f, 59.2f, 116.0f)
                lineTo(56.1f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, -24.0f)
                close()
                moveTo(60.1f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                curveToRelative(0.0f, 33.3f, -19.9f, 63.4f, -36.7f, 82.7f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, true, -31.3f, 30.2f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, true, -31.3f, -30.2f)
                curveTo(80.1f, 167.4f, 60.1f, 137.3f, 60.1f, 104.0f)
                close()
                moveTo(128.1f, 148.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -44.0f, -44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 128.1f, 148.0f)
                close()
                moveTo(128.1f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.1f, 84.0f)
                close()
            }
        }
        .build()
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
