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

public val TablerIcons.CoinMoneroFilled: ImageVector
    get() {
        if (_coinMoneroFilled != null) {
            return _coinMoneroFilled!!
        }
        _coinMoneroFilled = Builder(name = "CoinMoneroFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 11.414f)
                verticalLineToRelative(4.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineToRelative(4.66f, 0.001f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -17.32f, 0.0f)
                lineToRelative(4.66f, -0.001f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-4.585f)
                lineToRelative(2.293f, 2.292f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, -0.083f)
                lineToRelative(2.293f, -2.293f)
                close()
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 4.54f, 11.66f)
                horizontalLineToRelative(-4.54f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.89f, -1.077f, -1.337f, -1.707f, -0.707f)
                lineToRelative(-3.293f, 3.292f)
                lineToRelative(-3.293f, -3.292f)
                lineToRelative(-0.084f, -0.076f)
                curveToRelative(-0.637f, -0.514f, -1.623f, -0.07f, -1.623f, 0.783f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-4.54f)
                arcToRelative(9.991f, 9.991f, 0.0f, false, true, -0.46f, -3.0f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
            }
        }
        .build()
        return _coinMoneroFilled!!
    }

private var _coinMoneroFilled: ImageVector? = null
