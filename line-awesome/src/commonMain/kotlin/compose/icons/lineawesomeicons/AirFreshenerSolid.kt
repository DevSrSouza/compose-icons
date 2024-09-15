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

public val LineAwesomeIcons.AirFreshenerSolid: ImageVector
    get() {
        if (_airFreshenerSolid != null) {
            return _airFreshenerSolid!!
        }
        _airFreshenerSolid = Builder(name = "AirFreshenerSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(14.346f, 2.0f, 13.0f, 3.346f, 13.0f, 5.0f)
                curveTo(13.0f, 5.854f, 13.363f, 6.621f, 13.938f, 7.168f)
                lineTo(9.057f, 14.0f)
                lineTo(11.133f, 14.0f)
                lineTo(7.133f, 20.0f)
                lineTo(15.0f, 20.0f)
                lineTo(15.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                lineTo(9.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 20.0f)
                lineTo(24.867f, 20.0f)
                lineTo(20.867f, 14.0f)
                lineTo(22.943f, 14.0f)
                lineTo(18.064f, 7.168f)
                curveTo(18.639f, 6.621f, 19.0f, 5.853f, 19.0f, 5.0f)
                curveTo(19.0f, 3.346f, 17.654f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(16.552f, 4.0f, 17.0f, 4.449f, 17.0f, 5.0f)
                curveTo(17.0f, 5.404f, 16.756f, 5.749f, 16.41f, 5.906f)
                lineTo(16.334f, 5.934f)
                curveTo(16.228f, 5.972f, 16.119f, 6.0f, 16.0f, 6.0f)
                curveTo(15.881f, 6.0f, 15.772f, 5.972f, 15.666f, 5.934f)
                lineTo(15.59f, 5.906f)
                curveTo(15.244f, 5.749f, 15.0f, 5.404f, 15.0f, 5.0f)
                curveTo(15.0f, 4.449f, 15.448f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(15.807f, 7.992f)
                curveTo(15.845f, 7.995f, 15.883f, 7.991f, 15.922f, 7.992f)
                curveTo(15.948f, 7.993f, 15.973f, 8.0f, 16.0f, 8.0f)
                curveTo(16.027f, 8.0f, 16.052f, 7.993f, 16.078f, 7.992f)
                curveTo(16.117f, 7.991f, 16.156f, 7.995f, 16.195f, 7.992f)
                lineTo(19.057f, 12.0f)
                lineTo(17.133f, 12.0f)
                lineTo(21.133f, 18.0f)
                lineTo(10.867f, 18.0f)
                lineTo(14.867f, 12.0f)
                lineTo(12.943f, 12.0f)
                lineTo(15.807f, 7.992f)
                close()
                moveTo(11.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                lineTo(11.0f, 24.0f)
                close()
            }
        }
        .build()
        return _airFreshenerSolid!!
    }

private var _airFreshenerSolid: ImageVector? = null
