package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.DirectionSignFilled: ImageVector
    get() {
        if (_directionSignFilled != null) {
            return _directionSignFilled!!
        }
        _directionSignFilled = Builder(name = "DirectionSignFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.52f, 2.614f)
                arcToRelative(2.095f, 2.095f, 0.0f, false, true, 2.835f, -0.117f)
                lineToRelative(0.126f, 0.117f)
                lineToRelative(7.905f, 7.905f)
                curveToRelative(0.777f, 0.777f, 0.816f, 2.013f, 0.117f, 2.836f)
                lineToRelative(-0.117f, 0.126f)
                lineToRelative(-7.905f, 7.905f)
                arcToRelative(2.094f, 2.094f, 0.0f, false, true, -2.836f, 0.117f)
                lineToRelative(-0.126f, -0.117f)
                lineToRelative(-7.907f, -7.906f)
                arcToRelative(2.096f, 2.096f, 0.0f, false, true, -0.115f, -2.835f)
                lineToRelative(0.117f, -0.126f)
                lineToRelative(7.905f, -7.905f)
                close()
                moveTo(16.489f, 12.149f)
                lineToRelative(0.01f, -0.116f)
                lineToRelative(-0.003f, -0.12f)
                lineToRelative(-0.016f, -0.114f)
                lineToRelative(-0.03f, -0.11f)
                lineToRelative(-0.044f, -0.112f)
                lineToRelative(-0.052f, -0.098f)
                lineToRelative(-0.076f, -0.105f)
                lineToRelative(-0.07f, -0.081f)
                lineToRelative(-3.5f, -3.5f)
                lineToRelative(-0.095f, -0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.226f, 0.0f)
                lineToRelative(-0.094f, 0.083f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.226f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(1.792f, 1.793f)
                horizontalLineToRelative(-5.085f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(5.085f)
                lineToRelative(-1.792f, 1.793f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.403f, 1.403f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(0.097f, -0.112f)
                lineToRelative(0.05f, -0.074f)
                lineToRelative(0.037f, -0.067f)
                lineToRelative(0.05f, -0.112f)
                lineToRelative(0.023f, -0.076f)
                lineToRelative(0.025f, -0.117f)
                close()
            }
        }
        .build()
        return _directionSignFilled!!
    }

private var _directionSignFilled: ImageVector? = null
