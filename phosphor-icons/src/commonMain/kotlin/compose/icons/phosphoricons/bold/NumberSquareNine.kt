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

public val BoldGroup.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) {
            return _numberSquareNine!!
        }
        _numberSquareNine = Builder(name = "NumberSquareNine", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(122.9f, 151.7f)
                lineTo(109.7f, 173.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 4.1f, 16.5f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 120.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.3f, -5.8f)
                lineToRelative(32.3f, -54.0f)
                curveToRelative(0.1f, -0.2f, 0.1f, -0.4f, 0.2f, -0.6f)
                arcTo(39.6f, 39.6f, 0.0f, false, false, 168.0f, 112.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -45.1f, 39.7f)
                close()
                moveTo(128.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 96.0f)
                close()
            }
        }
        .build()
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
