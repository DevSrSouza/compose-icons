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

public val BoldGroup.NumberSquareFive: ImageVector
    get() {
        if (_numberSquareFive != null) {
            return _numberSquareFive!!
        }
        _numberSquareFive = Builder(name = "NumberSquareFive", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.2f, 126.3f)
                lineTo(100.0f, 78.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 111.8f, 68.0f)
                lineTo(152.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(122.0f, 92.0f)
                lineToRelative(-2.6f, 16.2f)
                lineToRelative(4.5f, -0.2f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, 80.0f)
                arcToRelative(40.3f, 40.3f, 0.0f, false, true, -28.4f, -11.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 22.8f, 0.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 0.0f, -22.6f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -22.8f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.3f, -10.4f)
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
        return _numberSquareFive!!
    }

private var _numberSquareFive: ImageVector? = null
