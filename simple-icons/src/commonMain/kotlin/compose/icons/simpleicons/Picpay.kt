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

public val SimpleIcons.Picpay: ImageVector
    get() {
        if (_picpay != null) {
            return _picpay!!
        }
        _picpay = Builder(name = "Picpay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.463f, 1.587f)
                verticalLineToRelative(7.537f)
                lineTo(24.0f, 9.124f)
                lineTo(24.0f, 1.587f)
                close()
                moveTo(17.719f, 2.843f)
                horizontalLineToRelative(5.025f)
                verticalLineToRelative(5.025f)
                horizontalLineToRelative(-5.025f)
                close()
                moveTo(18.975f, 4.099f)
                verticalLineToRelative(2.513f)
                horizontalLineToRelative(2.513f)
                lineTo(21.488f, 4.099f)
                close()
                moveTo(3.77f, 5.355f)
                lineTo(3.77f, 8.53f)
                horizontalLineToRelative(3.376f)
                curveToRelative(2.142f, 0.0f, 3.358f, 1.04f, 3.358f, 2.939f)
                curveToRelative(0.0f, 1.947f, -1.216f, 3.011f, -3.358f, 3.011f)
                lineTo(3.769f, 14.48f)
                lineTo(3.769f, 8.53f)
                lineTo(0.0f, 8.53f)
                verticalLineToRelative(13.884f)
                horizontalLineToRelative(3.769f)
                verticalLineToRelative(-4.76f)
                horizontalLineToRelative(3.57f)
                curveToRelative(4.333f, 0.0f, 6.815f, -2.352f, 6.815f, -6.32f)
                curveToRelative(0.0f, -3.771f, -2.482f, -5.978f, -6.814f, -5.978f)
                close()
            }
        }
        .build()
        return _picpay!!
    }

private var _picpay: ImageVector? = null
