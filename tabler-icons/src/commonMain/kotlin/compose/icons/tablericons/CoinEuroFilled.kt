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

public val TablerIcons.CoinEuroFilled: ImageVector
    get() {
        if (_coinEuroFilled != null) {
            return _coinEuroFilled!!
        }
        _coinEuroFilled = Builder(name = "CoinEuroFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-2.052f, 0.0f, -3.768f, 1.449f, -4.549f, 3.5f)
                horizontalLineToRelative(-0.451f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.134f, 0.007f)
                arcToRelative(7.298f, 7.298f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(-0.017f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.452f)
                curveToRelative(0.78f, 2.053f, 2.496f, 3.5f, 4.548f, 3.5f)
                curveToRelative(1.141f, 0.0f, 2.217f, -0.457f, 3.084f, -1.27f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.368f, -1.46f)
                curveToRelative(-0.509f, 0.478f, -1.102f, 0.73f, -1.716f, 0.73f)
                curveToRelative(-0.922f, 0.0f, -1.776f, -0.578f, -2.335f, -1.499f)
                lineToRelative(1.335f, -0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-1.977f)
                arcToRelative(5.342f, 5.342f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(1.977f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-1.336f)
                curveToRelative(0.56f, -0.921f, 1.414f, -1.5f, 2.336f, -1.5f)
                curveToRelative(0.615f, 0.0f, 1.208f, 0.252f, 1.717f, 0.73f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.368f, -1.46f)
                curveToRelative(-0.867f, -0.812f, -1.943f, -1.27f, -3.085f, -1.27f)
                close()
            }
        }
        .build()
        return _coinEuroFilled!!
    }

private var _coinEuroFilled: ImageVector? = null
