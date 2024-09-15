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

public val LineAwesomeIcons.LinkedinIn: ImageVector
    get() {
        if (_linkedinIn != null) {
            return _linkedinIn!!
        }
        _linkedinIn = Builder(name = "LinkedinIn", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.643f, 4.0f)
                curveTo(7.184f, 4.0f, 6.0f, 5.182f, 6.0f, 6.641f)
                curveTo(6.0f, 8.1f, 7.183f, 9.309f, 8.641f, 9.309f)
                curveTo(10.099f, 9.309f, 11.283f, 8.1f, 11.283f, 6.641f)
                curveTo(11.283f, 5.183f, 10.102f, 4.0f, 8.643f, 4.0f)
                close()
                moveTo(21.535f, 11.0f)
                curveTo(19.316f, 11.0f, 18.046f, 12.16f, 17.438f, 13.314f)
                lineTo(17.373f, 13.314f)
                lineTo(17.373f, 11.311f)
                lineTo(13.0f, 11.311f)
                lineTo(13.0f, 26.0f)
                lineTo(17.557f, 26.0f)
                lineTo(17.557f, 18.729f)
                curveTo(17.557f, 16.813f, 17.701f, 14.961f, 20.072f, 14.961f)
                curveTo(22.409f, 14.961f, 22.443f, 17.146f, 22.443f, 18.85f)
                lineTo(22.443f, 26.0f)
                lineTo(26.994f, 26.0f)
                lineTo(27.0f, 26.0f)
                lineTo(27.0f, 17.932f)
                curveTo(27.0f, 13.984f, 26.151f, 11.0f, 21.535f, 11.0f)
                close()
                moveTo(6.363f, 11.311f)
                lineTo(6.363f, 26.0f)
                lineTo(10.924f, 26.0f)
                lineTo(10.924f, 11.311f)
                lineTo(6.363f, 11.311f)
                close()
            }
        }
        .build()
        return _linkedinIn!!
    }

private var _linkedinIn: ImageVector? = null
