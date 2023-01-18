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

public val RegularGroup.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) {
            return _numberSquareNine!!
        }
        _numberSquareNine = Builder(name = "NumberSquareNine", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(128.0f, 76.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 72.0f)
                horizontalLineToRelative(1.8f)
                lineToRelative(-16.7f, 27.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.8f, 11.0f)
                arcTo(8.7f, 8.7f, 0.0f, false, false, 120.0f, 188.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 6.9f, -3.9f)
                lineToRelative(32.2f, -54.0f)
                lineToRelative(0.3f, -0.5f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 76.0f)
                close()
                moveTo(108.0f, 112.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 108.0f, 112.0f)
                close()
            }
        }
        .build()
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
