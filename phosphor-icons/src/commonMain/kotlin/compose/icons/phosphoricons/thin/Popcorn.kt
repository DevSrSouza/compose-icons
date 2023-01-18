package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Popcorn: ImageVector
    get() {
        if (_popcorn != null) {
            return _popcorn!!
        }
        _popcorn = Builder(name = "Popcorn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.4f, 82.8f)
                lineToRelative(-1.5f, -1.2f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 180.0f, 44.0f)
                arcToRelative(40.7f, 40.7f, 0.0f, false, false, -14.3f, 2.6f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -75.4f, 0.0f)
                arcTo(40.7f, 40.7f, 0.0f, false, false, 76.0f, 44.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 36.1f, 81.6f)
                lineToRelative(-1.5f, 1.2f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -3.4f, 11.4f)
                lineTo(58.7f, 210.7f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 70.3f, 220.0f)
                lineTo(185.7f, 220.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 11.6f, -9.3f)
                lineTo(224.8f, 94.2f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 221.4f, 82.8f)
                close()
                moveTo(76.0f, 52.0f)
                arcToRelative(32.6f, 32.6f, 0.0f, false, true, 15.0f, 3.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.8f, -2.6f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 62.4f, 0.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.8f, 2.6f)
                arcTo(32.6f, 32.6f, 0.0f, false, true, 180.0f, 52.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 31.7f, 27.5f)
                lineToRelative(-1.9f, 0.4f)
                lineTo(168.2f, 91.8f)
                lineTo(132.5f, 77.5f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -9.0f, 0.0f)
                lineTo(87.8f, 91.8f)
                lineTo(46.2f, 79.9f)
                lineToRelative(-1.9f, -0.4f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 76.0f, 52.0f)
                close()
                moveTo(107.5f, 212.0f)
                lineTo(92.4f, 98.6f)
                lineToRelative(34.1f, -13.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.0f, 0.0f)
                lineToRelative(34.1f, 13.7f)
                lineTo(148.5f, 212.0f)
                close()
                moveTo(66.4f, 208.9f)
                lineTo(39.0f, 92.4f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 1.1f, -3.9f)
                lineToRelative(1.3f, -0.8f)
                curveToRelative(0.1f, 0.0f, 0.2f, 0.0f, 0.2f, -0.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.4f, 0.0f)
                lineTo(84.4f, 99.1f)
                lineTo(99.4f, 212.0f)
                lineTo(70.3f, 212.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 66.4f, 208.9f)
                close()
                moveTo(217.0f, 92.4f)
                lineTo(189.6f, 208.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.9f, 3.1f)
                lineTo(156.6f, 212.0f)
                lineToRelative(15.0f, -112.9f)
                lineTo(212.0f, 87.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.4f, 0.0f)
                curveToRelative(0.0f, 0.1f, 0.1f, 0.1f, 0.2f, 0.1f)
                lineToRelative(1.3f, 0.8f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 217.0f, 92.4f)
                close()
            }
        }
        .build()
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
