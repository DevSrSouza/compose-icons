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

public val LightGroup.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) {
            return _numberSquareThree!!
        }
        _numberSquareThree = Builder(name = "NumberSquareThree", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 128.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, true, true, -48.0f, 48.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                arcTo(22.1f, 22.1f, 0.0f, true, false, 124.0f, 130.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -5.3f, -3.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.4f, -6.2f)
                lineTo(140.5f, 90.0f)
                lineTo(104.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 5.3f, 3.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.4f, 6.2f)
                lineToRelative(-22.5f, 32.2f)
                arcTo(32.8f, 32.8f, 0.0f, false, true, 148.0f, 128.0f)
                close()
                moveTo(222.0f, 48.0f)
                lineTo(222.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(48.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(34.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 48.0f, 34.0f)
                lineTo(208.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 48.0f)
                close()
                moveTo(210.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(48.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(46.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(208.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
