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

public val BoldGroup.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) {
            return _numberSquareEight!!
        }
        _numberSquareEight = Builder(name = "NumberSquareEight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.0f, 150.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 64.9f, -26.9f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, false, 7.3f, -21.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, false, -58.0f, -24.0f)
                arcToRelative(33.3f, 33.3f, 0.0f, false, false, -10.0f, 24.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, false, 7.3f, 21.0f)
                horizontalLineToRelative(-0.2f)
                arcTo(38.1f, 38.1f, 0.0f, false, false, 90.0f, 150.0f)
                close()
                moveTo(137.9f, 159.9f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 142.0f, 150.0f)
                arcTo(14.1f, 14.1f, 0.0f, false, true, 137.9f, 159.9f)
                close()
                moveTo(120.9f, 109.1f)
                arcTo(10.1f, 10.1f, 0.0f, true, true, 128.0f, 112.0f)
                arcTo(9.9f, 9.9f, 0.0f, false, true, 120.9f, 109.1f)
                close()
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 52.0f)
                lineTo(204.0f, 52.0f)
                close()
            }
        }
        .build()
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
