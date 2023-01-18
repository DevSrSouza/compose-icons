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

public val FillGroup.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) {
            return _numberCircleEight!!
        }
        _numberCircleEight = Builder(name = "NumberCircleEight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(152.0f, 174.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, true, true, -48.0f, -48.0f)
                arcToRelative(26.6f, 26.6f, 0.0f, false, true, 3.1f, -2.6f)
                lineToRelative(-0.3f, -0.2f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, true, 0.0f, -42.4f)
                curveToRelative(11.3f, -11.3f, 31.1f, -11.3f, 42.4f, 0.0f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, true, 0.0f, 42.4f)
                lineToRelative(-0.3f, 0.2f)
                arcTo(26.6f, 26.6f, 0.0f, false, true, 152.0f, 126.0f)
                arcToRelative(33.8f, 33.8f, 0.0f, false, true, 0.0f, 48.0f)
                close()
                moveTo(118.1f, 111.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 19.8f, 0.0f)
                arcTo(14.3f, 14.3f, 0.0f, false, true, 118.1f, 111.9f)
                close()
                moveTo(140.7f, 137.3f)
                arcToRelative(17.9f, 17.9f, 0.0f, false, true, 0.0f, 25.4f)
                arcToRelative(18.4f, 18.4f, 0.0f, false, true, -25.4f, 0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 25.4f, -25.4f)
                close()
            }
        }
        .build()
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
