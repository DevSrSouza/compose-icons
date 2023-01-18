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

public val BoldGroup.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) {
            return _shuffleAngular!!
        }
        _shuffleAngular = Builder(name = "ShuffleAngular", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.5f, 175.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(203.0f, 196.0f)
                lineTo(172.1f, 196.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -16.3f, -8.4f)
                lineTo(81.8f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(83.9f, 60.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 16.3f, 8.4f)
                lineToRelative(74.0f, 103.6f)
                lineTo(203.0f, 172.0f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                close()
                moveTo(110.4f, 152.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.7f, 2.8f)
                lineTo(81.8f, 172.0f)
                lineTo(32.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(83.9f, 196.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 16.3f, -8.4f)
                lineToRelative(13.0f, -18.2f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 110.4f, 152.6f)
                close()
                moveTo(145.6f, 103.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.7f, -2.8f)
                lineTo(174.2f, 84.0f)
                lineTo(203.0f, 84.0f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(203.0f, 60.0f)
                lineTo(172.1f, 60.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -16.3f, 8.4f)
                lineToRelative(-13.0f, 18.2f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 145.6f, 103.4f)
                close()
            }
        }
        .build()
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
