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

public val BoldGroup.Ladder: ImageVector
    get() {
        if (_ladder != null) {
            return _ladder!!
        }
        _ladder = Builder(name = "Ladder", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.3f, 211.9f)
                lineTo(168.8f, 73.0f)
                lineToRelative(7.6f, -21.0f)
                lineTo(184.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(88.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 40.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 86.9f, 51.9f)
                lineToRelative(-58.2f, 160.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 7.2f, 15.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 4.1f, 0.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.3f, -7.9f)
                lineTo(60.0f, 196.0f)
                lineTo(98.5f, 196.0f)
                lineToRelative(-5.8f, 15.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 7.2f, 15.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 4.1f, 0.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.3f, -7.9f)
                lineTo(132.8f, 172.0f)
                horizontalLineToRelative(46.4f)
                lineToRelative(17.5f, 48.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 228.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 4.1f, -0.7f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 219.3f, 211.9f)
                close()
                moveTo(124.7f, 124.0f)
                lineTo(86.2f, 124.0f)
                lineTo(95.0f, 100.0f)
                horizontalLineToRelative(38.4f)
                close()
                moveTo(142.1f, 76.0f)
                lineTo(103.7f, 76.0f)
                lineToRelative(8.7f, -24.0f)
                horizontalLineToRelative(38.5f)
                close()
                moveTo(68.8f, 172.0f)
                lineToRelative(8.7f, -24.0f)
                lineTo(116.0f, 148.0f)
                lineToRelative(-8.8f, 24.0f)
                close()
                moveTo(141.5f, 148.0f)
                lineTo(156.0f, 108.1f)
                lineTo(170.5f, 148.0f)
                close()
            }
        }
        .build()
        return _ladder!!
    }

private var _ladder: ImageVector? = null
