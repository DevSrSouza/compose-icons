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

public val LightGroup.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) {
            return _bellSimpleSlash!!
        }
        _bellSimpleSlash = Builder(name = "BellSimpleSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.4f, 36.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.8f, 8.0f)
                lineTo(61.4f, 63.7f)
                arcTo(77.7f, 77.7f, 0.0f, false, false, 50.2f, 104.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 34.8f, -7.2f, 54.5f, -13.3f, 64.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 14.1f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 49.0f, 198.0f)
                lineTo(183.5f, 198.0f)
                lineToRelative(20.1f, 22.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.4f, 2.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.0f, -1.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.4f, -8.4f)
                close()
                moveTo(49.0f, 186.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.7f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.0f)
                curveToRelative(6.8f, -11.8f, 14.9f, -33.6f, 14.9f, -71.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(65.3f, 65.3f, 0.0f, false, true, 7.7f, -31.0f)
                lineTo(172.6f, 186.0f)
                close()
                moveTo(166.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 224.0f)
                close()
                moveTo(87.3f, 44.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 2.2f, -8.2f)
                arcTo(77.7f, 77.7f, 0.0f, false, true, 128.6f, 26.0f)
                curveToRelative(42.6f, 0.3f, 77.2f, 35.7f, 77.2f, 78.9f)
                lineTo(205.8f, 112.0f)
                curveToRelative(0.0f, 22.1f, 2.9f, 40.7f, 8.6f, 55.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.4f, 7.8f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -2.2f, 0.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.6f, -3.8f)
                curveToRelative(-6.2f, -15.9f, -9.4f, -35.9f, -9.4f, -59.5f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -36.6f, -29.3f, -66.7f, -65.3f, -66.9f)
                arcToRelative(65.6f, 65.6f, 0.0f, false, false, -33.0f, 8.6f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 87.3f, 44.4f)
                close()
            }
        }
        .build()
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
