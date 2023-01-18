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

public val BoldGroup.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 76.0f)
                lineTo(32.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 88.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(100.4f, 100.4f, 0.0f, false, false, 26.7f, 68.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(193.3f, 204.0f)
                arcToRelative(101.5f, 101.5f, 0.0f, false, false, 20.0f, -32.0f)
                arcTo(44.1f, 44.1f, 0.0f, false, false, 256.0f, 128.0f)
                verticalLineToRelative(-8.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 212.0f, 76.0f)
                close()
                moveTo(86.0f, 204.0f)
                arcToRelative(76.2f, 76.2f, 0.0f, false, true, -42.0f, -68.0f)
                lineTo(44.0f, 100.0f)
                lineTo(196.0f, 100.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, true, -2.8f, 20.3f)
                curveToRelative(-0.1f, 0.2f, -0.1f, 0.5f, -0.2f, 0.7f)
                arcToRelative(76.3f, 76.3f, 0.0f, false, true, -39.0f, 47.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -12.6f, 18.6f)
                arcTo(94.2f, 94.2f, 0.0f, false, false, 220.0f, 136.0f)
                lineTo(220.0f, 101.7f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 232.0f, 120.0f)
                close()
                moveTo(68.0f, 48.0f)
                lineTo(68.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(92.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(108.0f, 48.0f)
                lineTo(108.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(132.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(148.0f, 48.0f)
                lineTo(148.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(172.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
