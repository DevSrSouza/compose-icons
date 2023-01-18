package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) {
            return _numberSquareEight!!
        }
        _numberSquareEight = Builder(name = "NumberSquareEight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(118.1f, 111.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 19.8f, 0.0f)
                arcTo(14.3f, 14.3f, 0.0f, false, true, 118.1f, 111.9f)
                close()
                moveTo(128.0f, 132.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -12.7f, 30.7f)
                arcToRelative(18.4f, 18.4f, 0.0f, false, false, 25.4f, 0.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 128.0f, 132.0f)
                close()
                moveTo(224.0f, 48.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(162.0f, 150.0f)
                arcToRelative(33.3f, 33.3f, 0.0f, false, false, -10.0f, -24.0f)
                arcToRelative(26.6f, 26.6f, 0.0f, false, false, -3.1f, -2.6f)
                lineToRelative(0.3f, -0.2f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, 0.0f, -42.4f)
                curveToRelative(-11.3f, -11.3f, -31.1f, -11.3f, -42.4f, 0.0f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, 0.0f, 42.4f)
                lineToRelative(0.3f, 0.2f)
                arcTo(26.6f, 26.6f, 0.0f, false, false, 104.0f, 126.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, true, false, 48.0f, 48.0f)
                arcTo(33.3f, 33.3f, 0.0f, false, false, 162.0f, 150.0f)
                close()
            }
        }
        .build()
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
