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

public val BoldGroup.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.4f, 227.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 236.0f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, true, -3.6f, -0.6f)
                lineTo(128.0f, 208.6f)
                lineTo(43.6f, 235.4f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, true, -3.6f, 0.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.6f, -23.4f)
                lineToRelative(52.0f, -16.6f)
                lineToRelative(-52.0f, -16.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.2f, -22.8f)
                lineTo(128.0f, 183.4f)
                lineToRelative(84.4f, -26.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.2f, 22.8f)
                lineToRelative(-52.0f, 16.6f)
                lineToRelative(52.0f, 16.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 227.4f, 227.6f)
                close()
                moveTo(64.0f, 108.0f)
                curveToRelative(0.0f, -50.1f, 55.4f, -84.8f, 57.7f, -86.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 12.6f, 0.0f)
                curveTo(136.6f, 23.2f, 192.0f, 57.9f, 192.0f, 108.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -128.0f, 0.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                curveToRelative(0.0f, -10.3f, -6.6f, -19.0f, -12.0f, -24.3f)
                curveToRelative(-5.4f, 5.3f, -12.0f, 14.0f, -12.0f, 24.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(88.0f, 108.0f)
                arcToRelative(41.0f, 41.0f, 0.0f, false, false, 4.8f, 19.1f)
                curveToRelative(4.7f, -24.9f, 27.5f, -40.4f, 28.5f, -41.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 13.4f, 0.0f)
                curveToRelative(1.0f, 0.7f, 23.8f, 16.2f, 28.5f, 41.1f)
                arcTo(41.0f, 41.0f, 0.0f, false, false, 168.0f, 108.0f)
                curveToRelative(0.0f, -10.3f, -3.9f, -26.7f, -22.6f, -46.2f)
                arcTo(160.6f, 160.6f, 0.0f, false, false, 128.0f, 46.6f)
                curveTo(115.4f, 56.0f, 88.0f, 79.7f, 88.0f, 108.0f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
