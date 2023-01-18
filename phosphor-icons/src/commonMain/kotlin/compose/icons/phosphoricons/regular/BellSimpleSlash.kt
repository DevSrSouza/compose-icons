package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) {
            return _bellSimpleSlash!!
        }
        _bellSimpleSlash = Builder(name = "BellSimpleSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.9f, 34.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.1f, 45.4f)
                lineTo(58.9f, 63.9f)
                arcTo(80.2f, 80.2f, 0.0f, false, false, 48.2f, 104.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 34.3f, -7.1f, 53.7f, -13.0f, 63.9f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 49.0f, 200.0f)
                lineTo(182.6f, 200.0f)
                lineToRelative(19.5f, 21.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.5f, -11.3f)
                close()
                moveTo(49.0f, 184.0f)
                curveToRelative(6.9f, -12.0f, 15.2f, -34.1f, 15.2f, -72.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(63.2f, 63.2f, 0.0f, false, true, 6.2f, -27.5f)
                lineTo(168.1f, 184.0f)
                close()
                moveTo(168.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f)
                close()
                moveTo(85.6f, 45.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 2.9f, -11.0f)
                arcTo(80.2f, 80.2f, 0.0f, false, true, 128.6f, 24.0f)
                curveToRelative(43.7f, 0.3f, 79.2f, 36.6f, 79.2f, 80.9f)
                lineTo(207.8f, 112.0f)
                curveToRelative(0.0f, 21.8f, 2.9f, 40.2f, 8.5f, 54.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.5f, 10.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -10.4f, -4.5f)
                curveToRelative(-6.4f, -16.2f, -9.6f, -36.4f, -9.6f, -60.3f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -35.5f, -28.4f, -64.7f, -63.3f, -64.9f)
                arcToRelative(63.7f, 63.7f, 0.0f, false, false, -32.0f, 8.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 85.6f, 45.4f)
                close()
            }
        }
        .build()
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
