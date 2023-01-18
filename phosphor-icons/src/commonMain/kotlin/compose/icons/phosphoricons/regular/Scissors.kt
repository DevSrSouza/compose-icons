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

public val RegularGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.7f, 113.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.1f, -11.1f)
                lineToRelative(67.7f, -46.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.1f, 2.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -2.1f, 11.1f)
                lineToRelative(-67.6f, 46.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -4.6f, 1.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 157.7f, 113.1f)
                close()
                moveTo(238.6f, 198.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.6f, 3.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -4.5f, -1.4f)
                lineTo(136.0f, 137.7f)
                lineTo(93.5f, 166.8f)
                arcTo(36.4f, 36.4f, 0.0f, false, true, 96.0f, 180.0f)
                arcToRelative(36.1f, 36.1f, 0.0f, true, true, -11.6f, -26.4f)
                lineTo(121.8f, 128.0f)
                lineTo(84.4f, 102.4f)
                arcTo(35.5f, 35.5f, 0.0f, false, true, 60.0f, 112.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, true, 93.5f, 89.2f)
                lineToRelative(143.0f, 97.9f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 238.6f, 198.2f)
                close()
                moveTo(80.0f, 180.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -5.9f, -14.1f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -28.2f, 0.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, 28.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 28.2f, 0.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 80.0f, 180.0f)
                close()
                moveTo(74.1f, 90.1f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, -28.2f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -28.2f, 0.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, 28.2f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 74.1f, 90.1f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
