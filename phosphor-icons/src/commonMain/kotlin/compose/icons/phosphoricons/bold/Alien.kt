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

public val BoldGroup.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 12.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 28.0f, 112.0f)
                curveToRelative(0.0f, 24.9f, 12.9f, 56.8f, 34.4f, 85.4f)
                curveToRelative(8.2f, 11.0f, 37.2f, 46.6f, 65.6f, 46.6f)
                reflectiveCurveToRelative(57.4f, -35.6f, 65.6f, -46.6f)
                curveTo(215.1f, 168.8f, 228.0f, 136.9f, 228.0f, 112.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 12.0f)
                close()
                moveTo(174.4f, 183.0f)
                curveToRelative(-13.8f, 18.4f, -34.2f, 37.0f, -46.4f, 37.0f)
                reflectiveCurveToRelative(-32.6f, -18.6f, -46.4f, -37.0f)
                curveTo(63.3f, 158.8f, 52.0f, 131.5f, 52.0f, 112.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f)
                curveTo(204.0f, 131.5f, 192.7f, 158.8f, 174.4f, 183.0f)
                close()
                moveTo(104.0f, 152.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                verticalLineToRelative(4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 152.0f)
                close()
                moveTo(188.0f, 112.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                lineToRelative(-2.0f, -0.2f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 140.0f, 140.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 112.0f)
                close()
                moveTo(152.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(116.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 184.0f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
