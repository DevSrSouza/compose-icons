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

public val LightGroup.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) {
            return _numberSquareNine!!
        }
        _numberSquareNine = Builder(name = "NumberSquareNine", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(128.0f, 78.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 5.6f, 67.5f)
                lineToRelative(-18.8f, 31.4f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.1f, 8.3f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, 3.1f, 0.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.2f, -2.9f)
                lineToRelative(32.2f, -54.0f)
                curveToRelative(0.1f, -0.2f, 0.2f, -0.3f, 0.2f, -0.5f)
                arcTo(33.4f, 33.4f, 0.0f, false, false, 162.0f, 112.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 128.0f, 78.0f)
                close()
                moveTo(106.0f, 112.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, 22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 106.0f, 112.0f)
                close()
            }
        }
        .build()
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
