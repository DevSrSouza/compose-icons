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

public val LightGroup.Ladder: ImageVector
    get() {
        if (_ladder != null) {
            return _ladder!!
        }
        _ladder = Builder(name = "Ladder", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.6f, 213.9f)
                lineTo(162.4f, 73.0f)
                lineToRelative(9.8f, -27.0f)
                lineTo(184.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(88.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(7.4f)
                lineToRelative(-61.0f, 167.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 3.5f, 7.7f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, 2.1f, 0.4f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 5.6f, -3.9f)
                lineTo(55.8f, 190.0f)
                horizontalLineToRelative(51.3f)
                lineToRelative(-8.7f, 23.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 3.5f, 7.7f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, 2.1f, 0.4f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 5.6f, -3.9f)
                lineToRelative(19.0f, -52.1f)
                horizontalLineToRelative(54.8f)
                lineToRelative(19.0f, 52.1f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 208.0f, 222.0f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, 2.1f, -0.4f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 213.6f, 213.9f)
                close()
                moveTo(128.9f, 130.0f)
                lineTo(77.7f, 130.0f)
                lineToRelative(13.0f, -36.0f)
                lineTo(142.0f, 94.0f)
                close()
                moveTo(159.4f, 46.0f)
                lineTo(146.3f, 82.0f)
                lineTo(95.1f, 82.0f)
                lineToRelative(13.1f, -36.0f)
                close()
                moveTo(60.2f, 178.0f)
                lineToRelative(13.1f, -36.0f)
                horizontalLineToRelative(51.2f)
                lineToRelative(-13.1f, 36.0f)
                close()
                moveTo(132.9f, 154.0f)
                lineTo(156.0f, 90.6f)
                lineTo(179.1f, 154.0f)
                close()
            }
        }
        .build()
        return _ladder!!
    }

private var _ladder: ImageVector? = null
