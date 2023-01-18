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

public val LightGroup.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) {
            return _numberSquareEight!!
        }
        _numberSquareEight = Builder(name = "NumberSquareEight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(145.9f, 123.5f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 1.9f, -1.7f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -39.6f, 0.0f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 1.9f, 1.7f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, -4.7f, 3.9f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 45.2f, 0.0f)
                arcTo(25.0f, 25.0f, 0.0f, false, false, 145.9f, 123.5f)
                close()
                moveTo(116.7f, 113.3f)
                arcTo(15.9f, 15.9f, 0.0f, true, true, 128.0f, 118.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 116.7f, 113.3f)
                close()
                moveTo(142.1f, 164.1f)
                arcTo(19.8f, 19.8f, 0.0f, true, true, 148.0f, 150.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 142.1f, 164.1f)
                close()
                moveTo(208.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
