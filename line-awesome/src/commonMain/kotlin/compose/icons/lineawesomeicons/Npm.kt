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

public val LineAwesomeIcons.Npm: ImageVector
    get() {
        if (_npm != null) {
            return _npm!!
        }
        _npm = Builder(name = "Npm", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 10.0f)
                lineTo(0.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                lineTo(9.0f, 23.0f)
                lineTo(16.0f, 23.0f)
                lineTo(16.0f, 21.0f)
                lineTo(32.0f, 21.0f)
                lineTo(32.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                close()
                moveTo(1.777f, 11.777f)
                lineTo(8.889f, 11.777f)
                lineTo(8.891f, 11.777f)
                lineTo(8.891f, 19.445f)
                lineTo(7.111f, 19.445f)
                lineTo(7.111f, 13.557f)
                lineTo(5.334f, 13.557f)
                lineTo(5.334f, 19.445f)
                lineTo(1.777f, 19.445f)
                lineTo(1.777f, 11.777f)
                close()
                moveTo(10.668f, 11.777f)
                lineTo(17.777f, 11.777f)
                lineTo(17.779f, 11.777f)
                lineTo(17.779f, 19.443f)
                lineTo(14.223f, 19.443f)
                lineTo(14.223f, 21.223f)
                lineTo(10.668f, 21.223f)
                lineTo(10.668f, 11.777f)
                close()
                moveTo(19.557f, 11.777f)
                lineTo(30.223f, 11.777f)
                lineTo(30.225f, 11.777f)
                lineTo(30.225f, 19.445f)
                lineTo(28.445f, 19.445f)
                lineTo(28.445f, 13.557f)
                lineTo(26.668f, 13.557f)
                lineTo(26.668f, 19.445f)
                lineTo(24.891f, 19.445f)
                lineTo(24.891f, 13.557f)
                lineTo(23.111f, 13.557f)
                lineTo(23.111f, 19.445f)
                lineTo(19.557f, 19.445f)
                lineTo(19.557f, 11.777f)
                close()
                moveTo(14.223f, 13.557f)
                lineTo(14.223f, 17.668f)
                lineTo(16.0f, 17.668f)
                lineTo(16.0f, 13.557f)
                lineTo(14.223f, 13.557f)
                close()
            }
        }
        .build()
        return _npm!!
    }

private var _npm: ImageVector? = null
