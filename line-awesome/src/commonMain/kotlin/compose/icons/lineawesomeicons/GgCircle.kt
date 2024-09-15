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

public val LineAwesomeIcons.GgCircle: ImageVector
    get() {
        if (_ggCircle != null) {
            return _ggCircle!!
        }
        _ggCircle = Builder(name = "GgCircle", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(18.545f, 9.486f)
                lineTo(14.691f, 13.34f)
                lineTo(18.656f, 17.307f)
                lineTo(19.91f, 16.053f)
                lineTo(17.182f, 13.336f)
                lineTo(18.543f, 11.975f)
                lineTo(22.51f, 15.941f)
                lineTo(18.543f, 19.906f)
                lineTo(17.973f, 19.338f)
                lineTo(16.734f, 20.59f)
                lineTo(18.543f, 22.398f)
                lineTo(25.0f, 15.945f)
                lineTo(18.545f, 9.486f)
                close()
                moveTo(13.457f, 9.598f)
                lineTo(7.0f, 16.055f)
                lineTo(13.457f, 22.512f)
                lineTo(17.309f, 18.65f)
                lineTo(13.344f, 14.684f)
                lineTo(12.09f, 15.938f)
                lineTo(14.818f, 18.654f)
                lineTo(13.451f, 20.02f)
                lineTo(9.486f, 16.055f)
                lineTo(13.451f, 12.088f)
                lineTo(14.021f, 12.658f)
                lineTo(15.266f, 11.414f)
                lineTo(13.457f, 9.598f)
                close()
            }
        }
        .build()
        return _ggCircle!!
    }

private var _ggCircle: ImageVector? = null
