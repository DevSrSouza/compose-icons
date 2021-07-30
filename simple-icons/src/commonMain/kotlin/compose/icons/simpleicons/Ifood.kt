package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Ifood: ImageVector
    get() {
        if (_ifood != null) {
            return _ifood!!
        }
        _ifood = Builder(name = "Ifood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.428f, 1.67f)
                curveToRelative(-4.65f, 0.0f, -7.184f, 4.149f, -7.184f, 6.998f)
                curveToRelative(0.0f, 2.294f, 2.2f, 3.299f, 4.25f, 3.299f)
                lineToRelative(-0.006f, -0.006f)
                curveToRelative(4.244f, 0.0f, 7.184f, -3.854f, 7.184f, -6.998f)
                curveToRelative(0.0f, -2.29f, -2.175f, -3.293f, -4.244f, -3.293f)
                close()
                moveTo(19.756f, 1.67f)
                curveToRelative(-4.65f, 0.0f, -7.184f, 4.149f, -7.184f, 6.998f)
                curveToRelative(0.0f, 2.294f, 2.2f, 3.299f, 4.25f, 3.299f)
                lineToRelative(-0.006f, -0.006f)
                curveTo(21.061f, 11.96f, 24.0f, 8.107f, 24.0f, 4.963f)
                curveToRelative(0.0f, -2.29f, -2.18f, -3.293f, -4.244f, -3.293f)
                close()
                moveTo(14.172f, 14.52f)
                lineToRelative(2.435f, 1.834f)
                curveToRelative(-2.17f, 2.07f, -6.124f, 3.525f, -9.353f, 3.17f)
                arcTo(8.913f, 8.913f, 0.0f, false, true, 0.23f, 14.541f)
                lineTo(0.0f, 14.541f)
                arcToRelative(9.598f, 9.598f, 0.0f, false, false, 8.828f, 7.758f)
                curveToRelative(3.814f, 0.24f, 7.323f, -0.905f, 9.947f, -3.13f)
                lineToRelative(-0.004f, 0.007f)
                lineToRelative(1.08f, 2.988f)
                lineToRelative(1.555f, -7.623f)
                lineToRelative(-7.234f, -0.02f)
                close()
            }
        }
        .build()
        return _ifood!!
    }

private var _ifood: ImageVector? = null
