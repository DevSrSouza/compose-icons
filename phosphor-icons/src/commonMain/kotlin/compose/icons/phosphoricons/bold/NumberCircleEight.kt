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

public val BoldGroup.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) {
            return _numberCircleEight!!
        }
        _numberCircleEight = Builder(name = "NumberCircleEight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(154.7f, 123.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, false, 7.3f, -21.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, false, -58.0f, -24.0f)
                arcToRelative(33.3f, 33.3f, 0.0f, false, false, -10.0f, 24.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, false, 7.3f, 21.0f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 53.8f, 0.0f)
                close()
                moveTo(120.9f, 109.1f)
                arcTo(10.1f, 10.1f, 0.0f, true, true, 128.0f, 112.0f)
                arcTo(9.9f, 9.9f, 0.0f, false, true, 120.9f, 109.1f)
                close()
                moveTo(137.9f, 159.9f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 142.0f, 150.0f)
                arcTo(14.1f, 14.1f, 0.0f, false, true, 137.9f, 159.9f)
                close()
            }
        }
        .build()
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
