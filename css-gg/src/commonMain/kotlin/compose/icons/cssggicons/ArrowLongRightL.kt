package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowLongRightL: ImageVector
    get() {
        if (_arrowLongRightL != null) {
            return _arrowLongRightL!!
        }
        _arrowLongRightL = Builder(name = "ArrowLongRightL", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9164f, 7.7574f)
                lineTo(23.1662f, 11.9929f)
                lineTo(18.9305f, 16.2426f)
                lineTo(17.5139f, 14.8308f)
                lineTo(19.3325f, 13.0061f)
                lineTo(2.8338f, 13.0285f)
                verticalLineTo(15.0299f)
                horizontalLineTo(0.8338f)
                verticalLineTo(9.0299f)
                horizontalLineTo(2.8338f)
                verticalLineTo(11.0285f)
                lineTo(19.3429f, 11.0061f)
                lineTo(17.5046f, 9.174f)
                lineTo(18.9164f, 7.7574f)
                close()
            }
        }
        .build()
        return _arrowLongRightL!!
    }

private var _arrowLongRightL: ImageVector? = null
