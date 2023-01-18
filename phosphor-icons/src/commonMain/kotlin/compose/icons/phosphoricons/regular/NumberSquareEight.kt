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

public val RegularGroup.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) {
            return _numberSquareEight!!
        }
        _numberSquareEight = Builder(name = "NumberSquareEight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.1f, 123.3f)
                horizontalLineToRelative(0.1f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -42.4f, 0.0f)
                horizontalLineToRelative(0.1f)
                arcTo(24.4f, 24.4f, 0.0f, false, false, 104.0f, 126.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, true, false, 48.0f, 48.0f)
                arcToRelative(33.8f, 33.8f, 0.0f, false, false, 0.0f, -48.0f)
                arcTo(24.4f, 24.4f, 0.0f, false, false, 149.1f, 123.3f)
                close()
                moveTo(118.1f, 111.9f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 128.0f, 116.0f)
                arcTo(14.1f, 14.1f, 0.0f, false, true, 118.1f, 111.9f)
                close()
                moveTo(140.7f, 162.7f)
                arcTo(17.9f, 17.9f, 0.0f, true, true, 146.0f, 150.0f)
                arcTo(17.9f, 17.9f, 0.0f, false, true, 140.7f, 162.7f)
                close()
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 48.0f)
                lineTo(208.0f, 48.0f)
                lineTo(208.0f, 208.0f)
                close()
            }
        }
        .build()
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
