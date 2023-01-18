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

public val ThinGroup.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) {
            return _numberSquareEight!!
        }
        _numberSquareEight = Builder(name = "NumberSquareEight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.4f, 123.7f)
                arcToRelative(41.2f, 41.2f, 0.0f, false, false, 4.0f, -3.3f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -36.8f, 0.0f)
                arcToRelative(41.2f, 41.2f, 0.0f, false, false, 4.0f, 3.3f)
                arcToRelative(25.8f, 25.8f, 0.0f, false, false, -6.8f, 5.1f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 42.4f, 0.0f)
                arcTo(25.8f, 25.8f, 0.0f, false, false, 142.4f, 123.7f)
                close()
                moveTo(115.3f, 114.7f)
                arcTo(17.9f, 17.9f, 0.0f, true, true, 128.0f, 120.0f)
                arcTo(17.9f, 17.9f, 0.0f, false, true, 115.3f, 114.7f)
                close()
                moveTo(143.6f, 165.6f)
                arcTo(22.2f, 22.2f, 0.0f, true, true, 150.0f, 150.0f)
                arcTo(22.2f, 22.2f, 0.0f, false, true, 143.6f, 165.6f)
                close()
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
