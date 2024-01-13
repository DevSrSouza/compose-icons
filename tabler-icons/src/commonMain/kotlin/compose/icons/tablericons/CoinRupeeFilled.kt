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

public val TablerIcons.CoinRupeeFilled: ImageVector
    get() {
        if (_coinRupeeFilled != null) {
            return _coinRupeeFilled!!
        }
        _coinRupeeFilled = Builder(name = "CoinRupeeFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.287f, 0.0f, -1.332f, 1.864f, -0.133f, 1.993f)
                lineToRelative(0.133f, 0.007f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.732f, 1.0f)
                horizontalLineToRelative(-2.732f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineToRelative(2.732f, 0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.732f, 0.999f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.89f, 0.0f, -1.337f, 1.077f, -0.707f, 1.707f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.083f, -1.32f)
                lineToRelative(-1.484f, -1.485f)
                lineToRelative(0.113f, -0.037f)
                arcToRelative(4.009f, 4.009f, 0.0f, false, false, 2.538f, -2.77f)
                lineToRelative(1.126f, -0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-1.126f)
                arcToRelative(3.973f, 3.973f, 0.0f, false, false, -0.33f, -0.855f)
                lineToRelative(-0.079f, -0.145f)
                horizontalLineToRelative(1.535f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
            }
        }
        .build()
        return _coinRupeeFilled!!
    }

private var _coinRupeeFilled: ImageVector? = null
