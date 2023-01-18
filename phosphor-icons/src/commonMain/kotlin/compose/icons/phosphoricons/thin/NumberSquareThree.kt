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

public val ThinGroup.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) {
            return _numberSquareThree!!
        }
        _numberSquareThree = Builder(name = "NumberSquareThree", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.6f, 129.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -45.2f, 45.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 107.0f, 169.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 17.0f, -41.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -3.5f, -2.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.2f, -4.2f)
                lineTo(144.3f, 88.0f)
                lineTo(104.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 3.5f, 2.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.2f, 4.1f)
                lineToRelative(-24.2f, 34.5f)
                arcTo(31.4f, 31.4f, 0.0f, false, true, 146.6f, 129.4f)
                close()
                moveTo(220.0f, 48.0f)
                lineTo(220.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(48.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(36.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 36.0f)
                lineTo(208.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 48.0f)
                close()
                moveTo(212.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(48.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(44.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
