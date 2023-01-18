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

public val BoldGroup.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.0f, 19.0f)
                curveToRelative(-22.3f, 0.0f, -47.2f, 12.1f, -73.8f, 36.0f)
                curveToRelative(-17.4f, 15.5f, -32.4f, 33.1f, -43.1f, 47.0f)
                arcTo(66.4f, 66.4f, 0.0f, false, false, 92.0f, 100.0f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, false, -64.0f, 64.0f)
                curveToRelative(0.0f, 28.6f, -14.3f, 41.6f, -15.5f, 42.7f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -4.0f, 13.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 228.0f)
                lineTo(92.0f, 228.0f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, false, 64.0f, -64.0f)
                arcToRelative(66.4f, 66.4f, 0.0f, false, false, -2.0f, -16.1f)
                curveToRelative(13.9f, -10.7f, 31.5f, -25.7f, 47.0f, -43.1f)
                curveToRelative(23.9f, -26.6f, 36.0f, -51.5f, 36.0f, -73.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 225.0f, 19.0f)
                close()
                moveTo(92.0f, 204.0f)
                lineTo(43.3f, 204.0f)
                arcTo(91.3f, 91.3f, 0.0f, false, false, 52.0f, 164.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, 40.0f)
                close()
                moveTo(130.2f, 112.7f)
                curveToRelative(3.0f, -3.8f, 6.5f, -8.0f, 10.2f, -12.4f)
                arcToRelative(78.2f, 78.2f, 0.0f, false, true, 15.2f, 15.2f)
                curveToRelative(-4.4f, 3.9f, -8.6f, 7.3f, -12.3f, 10.3f)
                arcTo(62.6f, 62.6f, 0.0f, false, false, 130.2f, 112.7f)
                close()
                moveTo(173.3f, 99.2f)
                arcToRelative(103.0f, 103.0f, 0.0f, false, false, -16.5f, -16.5f)
                curveToRelative(3.4f, -3.4f, 6.8f, -6.7f, 10.4f, -9.9f)
                curveToRelative(15.7f, -14.0f, 30.4f, -23.3f, 43.4f, -27.4f)
                curveTo(204.9f, 63.9f, 189.4f, 83.1f, 173.3f, 99.2f)
                close()
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
