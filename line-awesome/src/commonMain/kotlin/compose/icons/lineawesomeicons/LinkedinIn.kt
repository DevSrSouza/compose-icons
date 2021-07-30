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
                moveTo(8.6426f, 4.0f)
                curveTo(7.1836f, 4.0f, 6.0f, 5.1816f, 6.0f, 6.6406f)
                curveTo(6.0f, 8.0996f, 7.1826f, 9.3086f, 8.6406f, 9.3086f)
                curveTo(10.0986f, 9.3086f, 11.2832f, 8.0996f, 11.2832f, 6.6406f)
                curveTo(11.2832f, 5.1826f, 10.1016f, 4.0f, 8.6426f, 4.0f)
                close()
                moveTo(21.5352f, 11.0f)
                curveTo(19.3162f, 11.0f, 18.0465f, 12.1605f, 17.4375f, 13.3145f)
                lineTo(17.373f, 13.3145f)
                lineTo(17.373f, 11.3105f)
                lineTo(13.0f, 11.3105f)
                lineTo(13.0f, 26.0f)
                lineTo(17.5566f, 26.0f)
                lineTo(17.5566f, 18.7285f)
                curveTo(17.5566f, 16.8125f, 17.7013f, 14.9609f, 20.0723f, 14.9609f)
                curveTo(22.4093f, 14.9609f, 22.4434f, 17.1456f, 22.4434f, 18.8496f)
                lineTo(22.4434f, 26.0f)
                lineTo(26.9941f, 26.0f)
                lineTo(27.0f, 26.0f)
                lineTo(27.0f, 17.9316f)
                curveTo(27.0f, 13.9836f, 26.1512f, 11.0f, 21.5352f, 11.0f)
                close()
                moveTo(6.3633f, 11.3105f)
                lineTo(6.3633f, 26.0f)
                lineTo(10.9238f, 26.0f)
                lineTo(10.9238f, 11.3105f)
                lineTo(6.3633f, 11.3105f)
                close()
            }
        }
        .build()
        return _linkedinIn!!
    }

private var _linkedinIn: ImageVector? = null
