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

public val LightGroup.Popcorn: ImageVector
    get() {
        if (_popcorn != null) {
            return _popcorn!!
        }
        _popcorn = Builder(name = "Popcorn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.8f, 81.3f)
                lineToRelative(-1.0f, -0.8f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 180.0f, 42.0f)
                arcToRelative(41.3f, 41.3f, 0.0f, false, false, -13.1f, 2.1f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -77.8f, 0.0f)
                arcTo(41.3f, 41.3f, 0.0f, false, false, 76.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 34.2f, 80.5f)
                lineToRelative(-1.0f, 0.8f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -3.9f, 13.3f)
                horizontalLineToRelative(0.0f)
                lineTo(56.7f, 211.2f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 70.3f, 222.0f)
                lineTo(185.7f, 222.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 13.6f, -10.8f)
                lineTo(226.7f, 94.6f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 222.8f, 81.3f)
                close()
                moveTo(76.0f, 54.0f)
                arcToRelative(29.4f, 29.4f, 0.0f, false, true, 14.0f, 3.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.4f, 0.1f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 3.3f, -4.1f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 58.6f, 0.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 3.3f, 4.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.4f, -0.1f)
                arcTo(29.4f, 29.4f, 0.0f, false, true, 180.0f, 54.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 29.4f, 23.9f)
                horizontalLineToRelative(-0.2f)
                lineTo(168.3f, 89.7f)
                lineTo(133.2f, 75.6f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, -10.4f, 0.0f)
                lineTo(87.7f, 89.7f)
                lineTo(46.8f, 78.0f)
                horizontalLineToRelative(-0.2f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 76.0f, 54.0f)
                close()
                moveTo(161.4f, 99.8f)
                lineTo(146.7f, 210.0f)
                lineTo(109.3f, 210.0f)
                lineTo(94.6f, 99.8f)
                lineToRelative(32.7f, -13.0f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, 1.4f, 0.0f)
                close()
                moveTo(68.4f, 208.5f)
                lineTo(41.0f, 91.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.5f, -1.9f)
                lineToRelative(0.5f, -0.3f)
                lineToRelative(0.4f, -0.2f)
                horizontalLineToRelative(1.1f)
                lineToRelative(39.1f, 11.2f)
                lineTo(97.1f, 210.0f)
                lineTo(70.3f, 210.0f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 68.4f, 208.5f)
                close()
                moveTo(215.0f, 91.9f)
                lineTo(187.6f, 208.5f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.9f, 1.5f)
                lineTo(158.9f, 210.0f)
                lineToRelative(14.5f, -109.3f)
                lineToRelative(39.1f, -11.2f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.4f, 0.2f)
                lineToRelative(0.5f, 0.3f)
                arcTo(1.8f, 1.8f, 0.0f, false, true, 215.0f, 91.9f)
                close()
            }
        }
        .build()
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
