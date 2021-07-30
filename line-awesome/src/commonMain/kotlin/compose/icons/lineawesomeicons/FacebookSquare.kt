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

public val LineAwesomeIcons.FacebookSquare: ImageVector
    get() {
        if (_facebookSquare != null) {
            return _facebookSquare!!
        }
        _facebookSquare = Builder(name = "FacebookSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(5.9063f, 5.0f, 5.0f, 5.9063f, 5.0f, 7.0f)
                lineTo(5.0f, 25.0f)
                curveTo(5.0f, 26.0938f, 5.9063f, 27.0f, 7.0f, 27.0f)
                lineTo(25.0f, 27.0f)
                curveTo(26.0938f, 27.0f, 27.0f, 26.0938f, 27.0f, 25.0f)
                lineTo(27.0f, 7.0f)
                curveTo(27.0f, 5.9063f, 26.0938f, 5.0f, 25.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(19.8125f, 25.0f)
                lineTo(19.8125f, 18.25f)
                lineTo(22.4063f, 18.25f)
                lineTo(22.7813f, 15.25f)
                lineTo(19.8125f, 15.25f)
                lineTo(19.8125f, 13.3125f)
                curveTo(19.8125f, 12.4375f, 20.0273f, 11.8438f, 21.2813f, 11.8438f)
                lineTo(22.9063f, 11.8438f)
                lineTo(22.9063f, 9.125f)
                curveTo(22.6289f, 9.0898f, 21.668f, 9.0313f, 20.5625f, 9.0313f)
                curveTo(18.2578f, 9.0313f, 16.6875f, 10.418f, 16.6875f, 13.0f)
                lineTo(16.6875f, 15.25f)
                lineTo(14.0625f, 15.25f)
                lineTo(14.0625f, 18.25f)
                lineTo(16.6875f, 18.25f)
                lineTo(16.6875f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
            }
        }
        .build()
        return _facebookSquare!!
    }

private var _facebookSquare: ImageVector? = null
