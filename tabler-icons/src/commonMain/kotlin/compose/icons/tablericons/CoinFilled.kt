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

public val TablerIcons.CoinFilled: ImageVector
    get() {
        if (_coinFilled != null) {
            return _coinFilled!!
        }
        _coinFilled = Builder(name = "CoinFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.024f, 1.024f, 0.0f, false, true, -0.866f, -0.398f)
                lineToRelative(-0.068f, -0.101f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.732f, 0.998f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.505f, 1.5f)
                horizontalLineToRelative(0.161f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, 0.994f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineToRelative(0.176f, -0.005f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.176f, -5.995f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.358f, -0.012f, 0.671f, 0.14f, 0.866f, 0.398f)
                lineToRelative(0.068f, 0.101f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.732f, -0.998f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.505f, -1.501f)
                horizontalLineToRelative(-0.161f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(13.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 9.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _coinFilled!!
    }

private var _coinFilled: ImageVector? = null
