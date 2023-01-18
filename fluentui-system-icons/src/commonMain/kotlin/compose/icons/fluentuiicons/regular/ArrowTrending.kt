package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowTrending: ImageVector
    get() {
        if (_arrowTrending != null) {
            return _arrowTrending!!
        }
        _arrowTrending = Builder(name = "ArrowTrending", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7489f, 5.5f)
                lineTo(21.3027f, 5.5005f)
                lineTo(21.403f, 5.5144f)
                lineTo(21.5018f, 5.542f)
                lineTo(21.5621f, 5.5676f)
                curveTo(21.6413f, 5.6025f, 21.7155f, 5.6532f, 21.7808f, 5.7184f)
                lineTo(21.8215f, 5.7624f)
                lineTo(21.865f, 5.8188f)
                lineTo(21.9192f, 5.9089f)
                lineTo(21.9579f, 5.9992f)
                lineTo(21.977f, 6.0633f)
                lineTo(21.9906f, 6.1273f)
                lineTo(22.0f, 6.2215f)
                lineTo(22.0004f, 13.7539f)
                curveTo(22.0004f, 14.1681f, 21.6647f, 14.5039f, 21.2504f, 14.5039f)
                curveTo(20.8708f, 14.5039f, 20.557f, 14.2217f, 20.5073f, 13.8557f)
                lineTo(20.5004f, 13.7539f)
                lineTo(20.5f, 8.059f)
                lineTo(12.7812f, 15.7793f)
                curveTo(12.5149f, 16.0455f, 12.0982f, 16.0698f, 11.8046f, 15.8519f)
                lineTo(11.7205f, 15.7793f)
                lineTo(8.75f, 12.8089f)
                lineTo(3.2803f, 18.2786f)
                curveTo(2.9874f, 18.5715f, 2.5126f, 18.5715f, 2.2197f, 18.2786f)
                curveTo(1.9534f, 18.0123f, 1.9292f, 17.5957f, 2.147f, 17.3021f)
                lineTo(2.2197f, 17.2179f)
                lineTo(8.2197f, 11.2179f)
                curveTo(8.4859f, 10.9517f, 8.9026f, 10.9275f, 9.1962f, 11.1453f)
                lineTo(9.2803f, 11.2179f)
                lineTo(12.2508f, 14.1883f)
                lineTo(19.438f, 7.0f)
                horizontalLineTo(13.7489f)
                curveTo(13.3692f, 7.0f, 13.0554f, 6.7179f, 13.0058f, 6.3518f)
                lineTo(12.9989f, 6.25f)
                curveTo(12.9989f, 5.8703f, 13.2811f, 5.5565f, 13.6472f, 5.5068f)
                lineTo(13.7489f, 5.5f)
                close()
            }
        }
        .build()
        return _arrowTrending!!
    }

private var _arrowTrending: ImageVector? = null
