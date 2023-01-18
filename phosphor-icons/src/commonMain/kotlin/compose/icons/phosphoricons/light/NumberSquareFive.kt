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

public val LightGroup.NumberSquareFive: ImageVector
    get() {
        if (_numberSquareFive != null) {
            return _numberSquareFive!!
        }
        _numberSquareFive = Builder(name = "NumberSquareFive", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.9f, 86.0f)
                lineTo(112.0f, 116.1f)
                arcToRelative(34.3f, 34.3f, 0.0f, false, true, 11.9f, -2.1f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 158.0f, 148.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -34.1f, 34.0f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, true, -24.1f, -10.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -0.1f, -8.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, -0.1f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 15.7f, 6.5f)
                arcToRelative(21.7f, 21.7f, 0.0f, false, false, 15.6f, -6.5f)
                arcToRelative(21.7f, 21.7f, 0.0f, false, false, 0.0f, -31.0f)
                arcToRelative(21.7f, 21.7f, 0.0f, false, false, -15.6f, -6.5f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, -15.7f, 6.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -6.9f, 1.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.2f, -6.3f)
                lineTo(105.9f, 79.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.9f, -5.0f)
                lineTo(152.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
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
        return _numberSquareFive!!
    }

private var _numberSquareFive: ImageVector? = null
