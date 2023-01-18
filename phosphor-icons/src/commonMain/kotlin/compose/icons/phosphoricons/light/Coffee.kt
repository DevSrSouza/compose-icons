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

public val LightGroup.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(82.0f, 56.0f)
                lineTo(82.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(94.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(120.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(126.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(114.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 120.0f, 62.0f)
                close()
                moveTo(152.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(158.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(146.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 62.0f)
                close()
                moveTo(246.0f, 120.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, false, true, -36.9f, 38.0f)
                arcToRelative(95.0f, 95.0f, 0.0f, false, true, -31.2f, 44.0f)
                lineTo(208.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(32.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(62.1f, 210.0f)
                arcTo(94.3f, 94.3f, 0.0f, false, true, 26.0f, 136.0f)
                lineTo(26.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(208.0f, 82.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 246.0f, 120.0f)
                close()
                moveTo(198.8f, 158.7f)
                curveToRelative(0.0f, -0.2f, 0.1f, -0.4f, 0.1f, -0.6f)
                arcTo(81.4f, 81.4f, 0.0f, false, false, 202.0f, 136.0f)
                lineTo(202.0f, 94.0f)
                lineTo(38.0f, 94.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(82.3f, 82.3f, 0.0f, false, false, 46.7f, 74.0f)
                horizontalLineToRelative(70.6f)
                arcTo(82.4f, 82.4f, 0.0f, false, false, 198.8f, 158.7f)
                close()
                moveTo(234.0f, 120.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -20.0f, -25.3f)
                lineTo(214.0f, 136.0f)
                arcToRelative(92.9f, 92.9f, 0.0f, false, true, -1.7f, 17.6f)
                arcTo(25.9f, 25.9f, 0.0f, false, false, 234.0f, 128.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
