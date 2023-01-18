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

public val BoldGroup.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.5f, 175.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(203.0f, 196.0f)
                horizontalLineToRelative(-2.1f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, true, -61.8f, -31.8f)
                lineTo(97.4f, 105.8f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 55.1f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(55.1f, 60.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, true, 61.8f, 31.8f)
                lineToRelative(41.7f, 58.4f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 200.9f, 172.0f)
                lineTo(203.0f, 172.0f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                close()
                moveTo(144.9f, 102.9f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 7.9f, 3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.0f, -4.1f)
                arcTo(51.9f, 51.9f, 0.0f, false, true, 200.9f, 84.0f)
                lineTo(203.0f, 84.0f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(203.0f, 60.0f)
                horizontalLineToRelative(-2.1f)
                arcToRelative(76.2f, 76.2f, 0.0f, false, false, -57.2f, 26.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.9f, 102.9f)
                close()
                moveTo(111.1f, 153.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.9f, 1.1f)
                arcTo(51.9f, 51.9f, 0.0f, false, true, 55.1f, 172.0f)
                lineTo(32.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(55.1f, 196.0f)
                arcToRelative(76.2f, 76.2f, 0.0f, false, false, 57.2f, -26.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 111.1f, 153.1f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
