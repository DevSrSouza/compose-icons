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

public val ThinGroup.BellZ: ImageVector
    get() {
        if (_bellZ != null) {
            return _bellZ!!
        }
        _bellZ = Builder(name = "BellZ", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.4f, 177.9f)
                curveToRelative(-6.2f, -10.6f, -13.6f, -30.7f, -13.6f, -65.9f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -42.1f, -33.7f, -76.6f, -75.2f, -76.9f)
                lineTo(128.0f, 28.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -75.8f, 76.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 35.2f, -7.4f, 55.3f, -13.6f, 65.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, 12.1f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 49.0f, 196.0f)
                lineTo(92.0f, 196.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(43.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 10.4f, -6.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 217.4f, 177.9f)
                close()
                moveTo(156.0f, 200.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(210.5f, 186.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.5f, 2.0f)
                lineTo(49.0f, 188.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.5f, -2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.1f, -4.0f)
                curveToRelative(6.6f, -11.5f, 14.6f, -33.0f, 14.6f, -70.0f)
                verticalLineToRelative(-8.0f)
                arcTo(67.9f, 67.9f, 0.0f, false, true, 128.0f, 36.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(37.1f, 0.3f, 67.3f, 31.2f, 67.3f, 68.9f)
                lineTo(195.8f, 112.0f)
                curveToRelative(0.0f, 37.0f, 8.0f, 58.5f, 14.6f, 70.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 210.5f, 186.0f)
                close()
                moveTo(152.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(108.0f, 148.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.6f, -2.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.5f, -4.3f)
                lineTo(139.5f, 100.0f)
                lineTo(108.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.6f, 2.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.5f, 4.3f)
                lineTo(116.5f, 140.0f)
                lineTo(148.0f, 140.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 152.0f, 144.0f)
                close()
            }
        }
        .build()
        return _bellZ!!
    }

private var _bellZ: ImageVector? = null
