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

public val LightGroup.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) {
            return _numberCircleEight!!
        }
        _numberCircleEight = Builder(name = "NumberCircleEight", defaultWidth = 256.0.dp,
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
                moveTo(145.9f, 123.5f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 1.9f, -1.7f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -39.6f, 0.0f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 1.9f, 1.7f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, -4.7f, 3.9f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 45.2f, 0.0f)
                arcTo(25.0f, 25.0f, 0.0f, false, false, 145.9f, 123.5f)
                close()
                moveTo(116.7f, 113.3f)
                arcTo(15.9f, 15.9f, 0.0f, true, true, 128.0f, 118.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 116.7f, 113.3f)
                close()
                moveTo(142.1f, 164.1f)
                arcTo(19.8f, 19.8f, 0.0f, true, true, 148.0f, 150.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 142.1f, 164.1f)
                close()
            }
        }
        .build()
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
