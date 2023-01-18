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

public val ThinGroup.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) {
            return _bellSimpleSlash!!
        }
        _bellSimpleSlash = Builder(name = "BellSimpleSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, 5.4f)
                lineTo(63.9f, 63.4f)
                arcTo(75.6f, 75.6f, 0.0f, false, false, 52.2f, 104.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 35.2f, -7.4f, 55.3f, -13.6f, 65.9f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 49.0f, 196.0f)
                lineTo(184.4f, 196.0f)
                lineTo(205.0f, 218.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.7f, 0.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.3f, -5.7f)
                close()
                moveTo(49.0f, 188.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.5f, -2.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.1f, -4.1f)
                curveTo(52.2f, 170.5f, 60.2f, 149.0f, 60.2f, 112.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(67.8f, 67.8f, 0.0f, false, true, 9.3f, -34.4f)
                lineTo(177.1f, 188.0f)
                close()
                moveTo(164.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 224.0f)
                close()
                moveTo(89.0f, 43.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.5f, -5.5f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 128.6f, 28.0f)
                curveToRelative(41.5f, 0.3f, 75.2f, 34.8f, 75.2f, 76.9f)
                lineTo(203.8f, 112.0f)
                curveToRelative(0.0f, 22.3f, 2.9f, 41.2f, 8.7f, 55.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.2f, 5.2f)
                lineToRelative(-1.5f, 0.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.7f, -2.5f)
                curveToRelative(-6.2f, -15.7f, -9.3f, -35.4f, -9.3f, -58.8f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -37.7f, -30.2f, -68.6f, -67.3f, -68.9f)
                lineTo(128.0f, 36.0f)
                arcToRelative(66.7f, 66.7f, 0.0f, false, false, -33.5f, 8.9f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 89.0f, 43.4f)
                close()
            }
        }
        .build()
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
