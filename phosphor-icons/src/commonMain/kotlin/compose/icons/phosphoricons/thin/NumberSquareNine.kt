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

public val ThinGroup.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) {
            return _numberSquareNine!!
        }
        _numberSquareNine = Builder(name = "NumberSquareNine", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(128.0f, 80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 9.8f, 62.5f)
                lineToRelative(-21.2f, 35.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.3f, 5.5f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.1f, 0.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.4f, -1.9f)
                lineToRelative(32.3f, -54.0f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.2f, 0.1f, -0.2f)
                arcTo(31.7f, 31.7f, 0.0f, false, false, 160.0f, 112.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 128.0f, 80.0f)
                close()
                moveTo(104.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 104.0f, 112.0f)
                close()
            }
        }
        .build()
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
