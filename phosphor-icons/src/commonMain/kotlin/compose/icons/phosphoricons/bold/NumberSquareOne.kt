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

public val BoldGroup.NumberSquareOne: ImageVector
    get() {
        if (_numberSquareOne != null) {
            return _numberSquareOne!!
        }
        _numberSquareOne = Builder(name = "NumberSquareOne", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.0f, 106.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 101.3f, 90.0f)
                lineToRelative(24.0f, -16.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 12.4f, -0.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 84.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(120.0f, 106.4f)
                lineToRelative(-5.3f, 3.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 98.0f, 106.6f)
                close()
                moveTo(228.0f, 48.0f)
                lineTo(228.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 28.0f)
                lineTo(208.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(204.0f, 52.0f)
                lineTo(52.0f, 52.0f)
                lineTo(52.0f, 204.0f)
                lineTo(204.0f, 204.0f)
                close()
            }
        }
        .build()
        return _numberSquareOne!!
    }

private var _numberSquareOne: ImageVector? = null
