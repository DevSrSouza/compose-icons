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

public val LightGroup.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) {
            return _numberCircleFive!!
        }
        _numberCircleFive = Builder(name = "NumberCircleFive", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(116.9f, 90.0f)
                lineTo(112.0f, 120.1f)
                arcToRelative(34.3f, 34.3f, 0.0f, false, true, 11.9f, -2.1f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 158.0f, 152.0f)
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
                lineTo(105.9f, 83.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.9f, -5.0f)
                lineTo(152.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null
