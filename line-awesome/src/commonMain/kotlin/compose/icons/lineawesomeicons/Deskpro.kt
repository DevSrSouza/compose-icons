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

public val LineAwesomeIcons.Deskpro: ImageVector
    get() {
        if (_deskpro != null) {
            return _deskpro!!
        }
        _deskpro = Builder(name = "Deskpro", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.699f, 5.0f)
                curveTo(6.451f, 5.01f, 6.006f, 5.039f, 6.006f, 5.783f)
                lineTo(6.006f, 15.703f)
                curveTo(5.827f, 19.76f, 9.795f, 21.0f, 10.975f, 21.0f)
                lineTo(15.211f, 21.0f)
                curveTo(14.388f, 20.206f, 14.073f, 19.246f, 14.004f, 18.512f)
                curveTo(13.944f, 17.887f, 14.887f, 17.809f, 14.936f, 18.424f)
                curveTo(14.946f, 18.533f, 15.191f, 21.0f, 17.631f, 21.0f)
                lineTo(17.93f, 21.0f)
                lineTo(19.447f, 18.422f)
                lineTo(19.693f, 18.0f)
                lineTo(23.0f, 18.0f)
                lineTo(23.0f, 10.596f)
                curveTo(23.0f, 8.701f, 22.166f, 4.99f, 17.117f, 5.01f)
                lineTo(13.068f, 5.01f)
                curveTo(13.544f, 5.516f, 13.934f, 6.157f, 13.934f, 7.0f)
                curveTo(13.933f, 7.625f, 13.0f, 7.625f, 13.0f, 7.0f)
                curveTo(13.0f, 4.877f, 10.737f, 4.99f, 10.539f, 5.01f)
                curveTo(10.529f, 5.01f, 10.52f, 5.0f, 10.51f, 5.0f)
                lineTo(6.699f, 5.0f)
                close()
                moveTo(18.514f, 12.004f)
                curveTo(19.441f, 12.064f, 20.284f, 13.012f, 19.908f, 14.303f)
                lineTo(17.0f, 12.975f)
                curveTo(17.371f, 12.251f, 17.957f, 11.968f, 18.514f, 12.004f)
                close()
                moveTo(20.445f, 19.0f)
                lineTo(19.354f, 21.0f)
                lineTo(24.0f, 21.0f)
                curveTo(25.794f, 21.0f, 28.0f, 20.0f, 29.0f, 19.0f)
                lineTo(20.445f, 19.0f)
                close()
                moveTo(19.0f, 22.0f)
                curveTo(20.0f, 23.0f, 20.593f, 23.552f, 20.594f, 23.797f)
                curveTo(20.604f, 23.889f, 20.623f, 25.796f, 18.766f, 26.684f)
                curveTo(18.245f, 26.929f, 18.072f, 26.99f, 17.49f, 27.0f)
                lineTo(16.0f, 29.0f)
                curveTo(17.0f, 29.0f, 17.541f, 29.0f, 17.959f, 28.949f)
                curveTo(20.408f, 28.632f, 22.061f, 26.754f, 22.51f, 25.621f)
                curveTo(22.643f, 25.285f, 22.99f, 24.398f, 23.0f, 22.0f)
                lineTo(19.0f, 22.0f)
                close()
            }
        }
        .build()
        return _deskpro!!
    }

private var _deskpro: ImageVector? = null
