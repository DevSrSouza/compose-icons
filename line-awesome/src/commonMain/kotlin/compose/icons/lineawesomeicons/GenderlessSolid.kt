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

public val LineAwesomeIcons.GenderlessSolid: ImageVector
    get() {
        if (_genderlessSolid != null) {
            return _genderlessSolid!!
        }
        _genderlessSolid = Builder(name = "GenderlessSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(11.5938f, 4.0f, 8.0f, 7.5938f, 8.0f, 12.0f)
                curveTo(8.0f, 16.0664f, 11.0664f, 19.4375f, 15.0f, 19.9375f)
                lineTo(15.0f, 28.0f)
                lineTo(17.0f, 28.0f)
                lineTo(17.0f, 19.9375f)
                curveTo(20.9336f, 19.4375f, 24.0f, 16.0664f, 24.0f, 12.0f)
                curveTo(24.0f, 7.5938f, 20.4063f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(19.3242f, 6.0f, 22.0f, 8.6758f, 22.0f, 12.0f)
                curveTo(22.0f, 15.3242f, 19.3242f, 18.0f, 16.0f, 18.0f)
                curveTo(12.6758f, 18.0f, 10.0f, 15.3242f, 10.0f, 12.0f)
                curveTo(10.0f, 8.6758f, 12.6758f, 6.0f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _genderlessSolid!!
    }

private var _genderlessSolid: ImageVector? = null
