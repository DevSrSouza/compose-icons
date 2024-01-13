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

public val TablerIcons.CoinTakaFilled: ImageVector
    get() {
        if (_coinTakaFilled != null) {
            return _coinTakaFilled!!
        }
        _coinTakaFilled = Builder(name = "CoinTakaFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
                moveTo(10.789f, 7.724f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.683f, -0.895f)
                lineToRelative(-0.553f, 0.277f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.894f, 1.788f)
                lineToRelative(0.553f, -0.276f)
                lineToRelative(-0.001f, 1.382f)
                horizontalLineToRelative(-0.999f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(0.999f)
                lineToRelative(0.001f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.824f, 2.995f)
                lineToRelative(0.176f, 0.005f)
                horizontalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.876f, 0.876f)
                lineToRelative(0.032f, 0.002f)
                lineToRelative(-0.02f, 0.057f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.395f, 0.948f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineToRelative(-0.001f, -3.0f)
                horizontalLineToRelative(4.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-4.001f)
                lineToRelative(0.001f, -1.382f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.136f, -0.725f)
                lineToRelative(-0.075f, -0.17f)
                close()
            }
        }
        .build()
        return _coinTakaFilled!!
    }

private var _coinTakaFilled: ImageVector? = null
