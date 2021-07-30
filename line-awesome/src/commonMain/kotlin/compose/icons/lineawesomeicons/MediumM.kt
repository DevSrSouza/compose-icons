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

public val LineAwesomeIcons.MediumM: ImageVector
    get() {
        if (_mediumM != null) {
            return _mediumM!!
        }
        _mediumM = Builder(name = "MediumM", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 10.3594f)
                lineTo(25.2109f, 10.3594f)
                curveTo(24.9141f, 10.3594f, 24.5f, 10.7852f, 24.5f, 11.0586f)
                lineTo(24.5f, 20.9922f)
                curveTo(24.5f, 21.2695f, 24.9141f, 21.6406f, 25.2109f, 21.6406f)
                lineTo(26.0f, 21.6406f)
                lineTo(26.0f, 24.0f)
                lineTo(18.832f, 24.0f)
                lineTo(18.832f, 21.6406f)
                lineTo(20.332f, 21.6406f)
                lineTo(20.332f, 11.1992f)
                lineTo(20.2617f, 11.1992f)
                lineTo(16.7578f, 24.0f)
                lineTo(14.0469f, 24.0f)
                lineTo(10.5859f, 11.1992f)
                lineTo(10.5f, 11.1992f)
                lineTo(10.5f, 21.6406f)
                lineTo(12.0f, 21.6406f)
                lineTo(12.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                lineTo(6.0f, 21.6406f)
                lineTo(6.7695f, 21.6406f)
                curveTo(7.0859f, 21.6406f, 7.5f, 21.2695f, 7.5f, 20.9922f)
                lineTo(7.5f, 11.0586f)
                curveTo(7.5f, 10.7852f, 7.0859f, 10.3594f, 6.7695f, 10.3594f)
                lineTo(6.0f, 10.3594f)
                lineTo(6.0f, 8.0f)
                lineTo(13.5039f, 8.0f)
                lineTo(15.9648f, 17.2617f)
                lineTo(16.0352f, 17.2617f)
                lineTo(18.5195f, 8.0f)
                lineTo(26.0f, 8.0f)
                close()
            }
        }
        .build()
        return _mediumM!!
    }

private var _mediumM: ImageVector? = null
