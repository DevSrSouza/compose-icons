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

public val FillGroup.NumberSquareFive: ImageVector
    get() {
        if (_numberSquareFive != null) {
            return _numberSquareFive!!
        }
        _numberSquareFive = Builder(name = "NumberSquareFive", defaultWidth = 256.0.dp,
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
                moveTo(123.9f, 112.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -25.5f, 61.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.2f, -11.4f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 14.3f, 5.9f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 14.2f, -5.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, -28.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -14.2f, -5.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -14.3f, 5.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.5f, -7.0f)
                lineToRelative(7.8f, -48.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.9f, -6.7f)
                lineTo(152.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(118.6f, 88.0f)
                lineToRelative(-4.1f, 25.2f)
                arcTo(37.3f, 37.3f, 0.0f, false, true, 123.9f, 112.0f)
                close()
            }
        }
        .build()
        return _numberSquareFive!!
    }

private var _numberSquareFive: ImageVector? = null
