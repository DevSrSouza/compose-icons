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

public val BoldGroup.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) {
            return _bellSimpleSlash!!
        }
        _bellSimpleSlash = Builder(name = "BellSimpleSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 228.0f)
                close()
                moveTo(216.1f, 224.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, -0.8f)
                lineTo(177.2f, 200.0f)
                lineTo(49.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -17.3f, -30.1f)
                curveToRelative(5.7f, -9.8f, 12.5f, -28.5f, 12.5f, -61.9f)
                verticalLineToRelative(-4.0f)
                arcTo(84.3f, 84.3f, 0.0f, false, true, 54.0f, 64.5f)
                lineTo(39.1f, 48.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.9f, 31.9f)
                lineToRelative(160.0f, 176.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 216.1f, 224.9f)
                close()
                moveTo(155.4f, 176.0f)
                lineTo(71.6f, 83.9f)
                arcTo(61.5f, 61.5f, 0.0f, false, false, 68.2f, 104.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 19.5f, -2.3f, 46.4f, -12.6f, 68.0f)
                close()
                moveTo(104.7f, 48.7f)
                arcTo(59.5f, 59.5f, 0.0f, false, true, 128.0f, 44.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(32.7f, 0.2f, 59.3f, 27.5f, 59.3f, 60.9f)
                lineTo(187.8f, 108.0f)
                curveToRelative(0.0f, 18.0f, 1.8f, 34.2f, 5.5f, 48.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.6f, 9.0f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, false, 3.0f, -0.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.6f, -14.6f)
                curveToRelative(-3.1f, -12.0f, -4.7f, -26.1f, -4.7f, -42.1f)
                verticalLineToRelative(-3.1f)
                curveToRelative(0.0f, -46.5f, -37.3f, -84.6f, -83.2f, -84.9f)
                lineTo(128.0f, 20.0f)
                arcToRelative(83.6f, 83.6f, 0.0f, false, false, -32.8f, 6.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.5f, 22.1f)
                close()
            }
        }
        .build()
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
