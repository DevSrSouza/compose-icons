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

public val ThinGroup.BellSimpleZ: ImageVector
    get() {
        if (_bellSimpleZ != null) {
            return _bellSimpleZ!!
        }
        _bellSimpleZ = Builder(name = "BellSimpleZ", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 224.0f)
                close()
                moveTo(217.4f, 190.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -10.4f, 6.0f)
                lineTo(49.0f, 196.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -10.4f, -6.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 0.0f, -12.1f)
                curveToRelative(6.2f, -10.6f, 13.6f, -30.7f, 13.6f, -65.9f)
                verticalLineToRelative(-8.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 128.0f, 28.0f)
                horizontalLineToRelative(0.6f)
                curveToRelative(41.5f, 0.3f, 75.2f, 34.8f, 75.2f, 76.9f)
                lineTo(203.8f, 112.0f)
                curveToRelative(0.0f, 35.2f, 7.4f, 55.3f, 13.6f, 65.9f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 217.4f, 190.0f)
                close()
                moveTo(210.4f, 182.0f)
                curveToRelative(-6.6f, -11.5f, -14.6f, -33.0f, -14.6f, -70.0f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -37.7f, -30.2f, -68.6f, -67.3f, -68.9f)
                lineTo(128.0f, 36.0f)
                arcToRelative(67.9f, 67.9f, 0.0f, false, false, -67.8f, 68.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 37.0f, -8.0f, 58.5f, -14.6f, 70.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.1f, 4.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.5f, 2.0f)
                lineTo(207.0f, 188.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.5f, -2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.4f, 182.0f)
                close()
                moveTo(148.0f, 140.0f)
                lineTo(116.5f, 140.0f)
                lineToRelative(34.6f, -41.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.5f, -4.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 148.0f, 92.0f)
                lineTo(108.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(31.5f)
                lineToRelative(-34.6f, 41.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.5f, 4.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 108.0f, 148.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _bellSimpleZ!!
    }

private var _bellSimpleZ: ImageVector? = null
