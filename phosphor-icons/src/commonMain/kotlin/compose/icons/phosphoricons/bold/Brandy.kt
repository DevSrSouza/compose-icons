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

public val BoldGroup.Brandy: ImageVector
    get() {
        if (_brandy != null) {
            return _brandy!!
        }
        _brandy = Builder(name = "Brandy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 88.0f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, -16.2f, -54.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -10.0f, -5.4f)
                lineTo(54.2f, 28.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -10.0f, 5.4f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 116.0f, 187.3f)
                lineTo(116.0f, 212.0f)
                lineTo(88.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(140.0f, 212.0f)
                lineTo(140.0f, 187.3f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 228.0f, 88.0f)
                close()
                moveTo(61.0f, 52.0f)
                lineTo(195.0f, 52.0f)
                arcToRelative(78.3f, 78.3f, 0.0f, false, true, 8.1f, 24.0f)
                lineTo(52.9f, 76.0f)
                arcTo(78.3f, 78.3f, 0.0f, false, true, 61.0f, 52.0f)
                close()
                moveTo(53.0f, 100.0f)
                lineTo(203.0f, 100.0f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, true, -150.0f, 0.0f)
                close()
            }
        }
        .build()
        return _brandy!!
    }

private var _brandy: ImageVector? = null
