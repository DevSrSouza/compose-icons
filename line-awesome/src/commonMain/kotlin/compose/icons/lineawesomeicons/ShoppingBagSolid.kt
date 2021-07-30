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

public val LineAwesomeIcons.ShoppingBagSolid: ImageVector
    get() {
        if (_shoppingBagSolid != null) {
            return _shoppingBagSolid!!
        }
        _shoppingBagSolid = Builder(name = "ShoppingBagSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(13.2539f, 3.0f, 11.0f, 5.2539f, 11.0f, 8.0f)
                lineTo(11.0f, 9.0f)
                lineTo(6.0625f, 9.0f)
                lineTo(6.0f, 9.9375f)
                lineTo(5.0f, 27.9375f)
                lineTo(4.9375f, 29.0f)
                lineTo(27.0625f, 29.0f)
                lineTo(27.0f, 27.9375f)
                lineTo(26.0f, 9.9375f)
                lineTo(25.9375f, 9.0f)
                lineTo(21.0f, 9.0f)
                lineTo(21.0f, 8.0f)
                curveTo(21.0f, 5.2539f, 18.7461f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(17.6563f, 5.0f, 19.0f, 6.3438f, 19.0f, 8.0f)
                lineTo(19.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                lineTo(13.0f, 8.0f)
                curveTo(13.0f, 6.3438f, 14.3438f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(7.9375f, 11.0f)
                lineTo(11.0f, 11.0f)
                lineTo(11.0f, 14.0f)
                lineTo(13.0f, 14.0f)
                lineTo(13.0f, 11.0f)
                lineTo(19.0f, 11.0f)
                lineTo(19.0f, 14.0f)
                lineTo(21.0f, 14.0f)
                lineTo(21.0f, 11.0f)
                lineTo(24.0625f, 11.0f)
                lineTo(24.9375f, 27.0f)
                lineTo(7.0625f, 27.0f)
                close()
            }
        }
        .build()
        return _shoppingBagSolid!!
    }

private var _shoppingBagSolid: ImageVector? = null
