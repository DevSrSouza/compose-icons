package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ArrowForward: ImageVector
    get() {
        if (_arrowForward != null) {
            return _arrowForward!!
        }
        _arrowForward = Builder(name = "ArrowForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2958f, 16.2945f)
                curveTo(13.9055f, 16.6853f, 13.906f, 17.3184f, 14.2968f, 17.7087f)
                curveTo(14.6876f, 18.0989f, 15.3207f, 18.0985f, 15.711f, 17.7077f)
                lineTo(20.7076f, 12.7043f)
                curveTo(21.0976f, 12.3137f, 21.0974f, 11.681f, 20.7072f, 11.2906f)
                lineTo(15.7106f, 6.293f)
                curveTo(15.3201f, 5.9024f, 14.6869f, 5.9023f, 14.2964f, 6.2928f)
                curveTo(13.9058f, 6.6833f, 13.9057f, 7.3165f, 14.2962f, 7.707f)
                lineTo(17.589f, 11.0f)
                horizontalLineTo(11.0f)
                curveTo(6.6651f, 11.0f, 3.1355f, 14.4478f, 3.0038f, 18.7508f)
                lineTo(3.0f, 19.0f)
                curveTo(3.0f, 19.5523f, 3.4477f, 20.0f, 4.0f, 20.0f)
                curveTo(4.5523f, 20.0f, 5.0f, 19.5523f, 5.0f, 19.0f)
                curveTo(5.0f, 15.7616f, 7.5656f, 13.1224f, 10.7751f, 13.0041f)
                lineTo(11.0f, 13.0f)
                horizontalLineTo(17.586f)
                lineTo(14.2958f, 16.2945f)
                close()
            }
        }
        .build()
        return _arrowForward!!
    }

private var _arrowForward: ImageVector? = null
