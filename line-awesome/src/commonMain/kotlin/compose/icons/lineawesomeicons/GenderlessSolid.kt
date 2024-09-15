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
                curveTo(11.594f, 4.0f, 8.0f, 7.594f, 8.0f, 12.0f)
                curveTo(8.0f, 16.066f, 11.066f, 19.438f, 15.0f, 19.938f)
                lineTo(15.0f, 28.0f)
                lineTo(17.0f, 28.0f)
                lineTo(17.0f, 19.938f)
                curveTo(20.934f, 19.438f, 24.0f, 16.066f, 24.0f, 12.0f)
                curveTo(24.0f, 7.594f, 20.406f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(19.324f, 6.0f, 22.0f, 8.676f, 22.0f, 12.0f)
                curveTo(22.0f, 15.324f, 19.324f, 18.0f, 16.0f, 18.0f)
                curveTo(12.676f, 18.0f, 10.0f, 15.324f, 10.0f, 12.0f)
                curveTo(10.0f, 8.676f, 12.676f, 6.0f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _genderlessSolid!!
    }

private var _genderlessSolid: ImageVector? = null
