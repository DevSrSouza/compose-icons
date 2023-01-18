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

public val BoldGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 66.3f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, -6.9f, -6.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -9.5f, 0.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -3.2f, 2.2f)
                lineTo(173.0f, 99.9f)
                lineToRelative(-14.1f, -2.8f)
                lineTo(156.1f, 83.0f)
                lineToRelative(37.4f, -37.4f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 2.2f, -3.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.6f, -9.5f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, -6.6f, -6.9f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 89.3f, 123.8f)
                lineTo(31.2f, 173.9f)
                lineToRelative(-0.7f, 0.6f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, 51.0f, 51.0f)
                lineToRelative(0.6f, -0.7f)
                lineToRelative(50.1f, -58.1f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 230.0f, 66.3f)
                close()
                moveTo(196.8f, 132.8f)
                arcToRelative(52.5f, 52.5f, 0.0f, false, true, -61.7f, 8.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -15.1f, 2.5f)
                lineTo(64.2f, 208.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.9f, -16.9f)
                lineTo(111.8f, 136.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 2.7f, -14.9f)
                arcTo(51.9f, 51.9f, 0.0f, false, true, 161.1f, 44.0f)
                lineTo(134.5f, 70.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -3.2f, 10.9f)
                lineToRelative(5.6f, 28.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 9.4f, 9.4f)
                lineToRelative(28.3f, 5.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 10.9f, -3.2f)
                lineTo(212.0f, 94.9f)
                arcTo(51.8f, 51.8f, 0.0f, false, true, 196.8f, 132.8f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
