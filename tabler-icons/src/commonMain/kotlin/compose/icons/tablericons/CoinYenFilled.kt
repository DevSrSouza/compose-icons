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

public val TablerIcons.CoinYenFilled: ImageVector
    get() {
        if (_coinYenFilled != null) {
            return _coinYenFilled!!
        }
        _coinYenFilled = Builder(name = "CoinYenFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
                moveTo(15.555f, 7.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.387f, 0.277f)
                lineToRelative(-2.168f, 3.251f)
                lineToRelative(-2.168f, -3.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.286f, -0.337f)
                lineToRelative(-0.1f, 0.059f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.278f, 1.387f)
                lineToRelative(1.63f, 2.445f)
                horizontalLineToRelative(-0.798f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-0.799f)
                lineToRelative(1.631f, -2.445f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.184f, -1.317f)
                lineToRelative(-0.093f, -0.07f)
                close()
            }
        }
        .build()
        return _coinYenFilled!!
    }

private var _coinYenFilled: ImageVector? = null
