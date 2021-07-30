package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Gratipay: ImageVector
    get() {
        if (_gratipay != null) {
            return _gratipay!!
        }
        _gratipay = Builder(name = "Gratipay", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5352f, 21.5352f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(12.5f, 12.0f)
                curveTo(11.1172f, 12.0f, 10.0f, 13.1172f, 10.0f, 14.5f)
                curveTo(10.0f, 15.0273f, 10.1563f, 15.5352f, 10.4375f, 15.9375f)
                curveTo(10.4375f, 15.9414f, 10.4688f, 15.9375f, 10.4688f, 15.9375f)
                lineTo(16.0f, 22.25f)
                lineTo(21.5313f, 15.9375f)
                curveTo(21.5313f, 15.9375f, 21.5625f, 15.9063f, 21.5625f, 15.9063f)
                curveTo(21.8438f, 15.5039f, 22.0f, 15.0273f, 22.0f, 14.5f)
                curveTo(22.0f, 13.1172f, 20.8828f, 12.0f, 19.5f, 12.0f)
                curveTo(17.7344f, 12.0f, 17.3125f, 13.6875f, 16.0f, 13.6875f)
                curveTo(14.6875f, 13.6875f, 14.2656f, 12.0f, 12.5f, 12.0f)
                close()
            }
        }
        .build()
        return _gratipay!!
    }

private var _gratipay: ImageVector? = null
