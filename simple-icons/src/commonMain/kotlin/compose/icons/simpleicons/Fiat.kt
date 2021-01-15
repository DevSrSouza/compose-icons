package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Fiat: ImageVector
    get() {
        if (_fiat != null) {
            return _fiat!!
        }
        _fiat = Builder(name = "Fiat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.572f, 11.348f)
                lineToRelative(0.027f, -5.957f)
                horizontalLineToRelative(1.34f)
                curveToRelative(0.608f, 1.327f, 0.998f, 3.081f, 1.304f, 5.957f)
                close()
                moveTo(10.431f, 20.768f)
                horizontalLineToRelative(2.222f)
                lineToRelative(0.025f, -7.252f)
                horizontalLineToRelative(2.663f)
                curveToRelative(0.209f, 1.28f, 0.26f, 5.231f, 0.273f, 7.252f)
                horizontalLineToRelative(2.155f)
                curveToRelative(0.204f, -8.953f, -0.428f, -14.014f, -2.174f, -17.537f)
                horizontalLineToRelative(-5.367f)
                close()
                moveTo(19.304f, 20.768f)
                horizontalLineToRelative(2.322f)
                lineToRelative(0.493f, -15.327f)
                lineTo(24.0f, 5.441f)
                lineToRelative(-0.014f, -2.21f)
                horizontalLineToRelative(-6.524f)
                verticalLineToRelative(2.213f)
                horizontalLineToRelative(1.896f)
                close()
                moveTo(8.952f, 3.233f)
                lineTo(6.21f, 3.233f)
                lineToRelative(0.294f, 17.537f)
                horizontalLineToRelative(2.4f)
                close()
                moveTo(2.752f, 13.497f)
                horizontalLineToRelative(1.95f)
                lineTo(4.702f, 11.23f)
                horizontalLineToRelative(-1.95f)
                lineToRelative(0.007f, -5.706f)
                horizontalLineToRelative(2.545f)
                lineTo(5.29f, 3.232f)
                lineTo(0.0f, 3.232f)
                lineToRelative(0.478f, 17.537f)
                horizontalLineToRelative(2.325f)
                close()
            }
        }
        .build()
        return _fiat!!
    }

private var _fiat: ImageVector? = null
