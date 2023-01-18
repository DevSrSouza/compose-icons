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

public val RegularGroup.Popcorn: ImageVector
    get() {
        if (_popcorn != null) {
            return _popcorn!!
        }
        _popcorn = Builder(name = "Popcorn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.1f, 79.9f)
                lineToRelative(-0.3f, -0.4f)
                arcTo(43.9f, 43.9f, 0.0f, false, false, 168.0f, 41.7f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -80.0f, 0.0f)
                arcTo(43.9f, 43.9f, 0.0f, false, false, 32.2f, 79.5f)
                lineToRelative(-0.3f, 0.4f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, -4.6f, 15.2f)
                horizontalLineToRelative(0.0f)
                lineTo(54.8f, 211.7f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 70.3f, 224.0f)
                lineTo(185.7f, 224.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 15.5f, -12.3f)
                lineTo(228.7f, 95.1f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 224.1f, 79.9f)
                close()
                moveTo(76.0f, 56.0f)
                arcToRelative(27.4f, 27.4f, 0.0f, false, true, 13.1f, 3.3f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 7.1f, 0.2f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 4.5f, -5.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 54.6f, 0.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 4.5f, 5.6f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 7.1f, -0.2f)
                arcTo(27.4f, 27.4f, 0.0f, false, true, 180.0f, 56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 27.0f, 20.5f)
                lineTo(168.4f, 87.6f)
                lineTo(133.9f, 73.8f)
                arcToRelative(15.1f, 15.1f, 0.0f, false, false, -11.8f, 0.0f)
                lineTo(87.6f, 87.6f)
                lineTo(49.0f, 76.5f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 76.0f, 56.0f)
                close()
                moveTo(111.0f, 208.0f)
                lineTo(96.8f, 101.1f)
                lineTo(128.0f, 88.6f)
                lineToRelative(31.2f, 12.5f)
                lineTo(145.0f, 208.0f)
                close()
                moveTo(42.9f, 91.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(37.9f, 10.9f)
                lineTo(94.9f, 208.0f)
                lineTo(70.3f, 208.0f)
                close()
                moveTo(185.7f, 208.0f)
                lineTo(161.1f, 208.0f)
                lineToRelative(14.1f, -105.7f)
                lineToRelative(37.9f, -10.9f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
