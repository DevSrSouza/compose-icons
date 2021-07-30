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

public val SimpleIcons.Nintendogamecube: ImageVector
    get() {
        if (_nintendogamecube != null) {
            return _nintendogamecube!!
        }
        _nintendogamecube = Builder(name = "Nintendogamecube", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.816f, 15.126f)
                lineToRelative(4.703f, 2.715f)
                verticalLineToRelative(-5.433f)
                lineTo(6.814f, 9.695f)
                verticalLineToRelative(5.432f)
                close()
                moveTo(4.791f, 16.294f)
                lineToRelative(6.73f, 3.882f)
                verticalLineToRelative(3.82f)
                lineTo(1.481f, 18.206f)
                lineTo(1.481f, 6.616f)
                lineToRelative(3.31f, 1.91f)
                verticalLineToRelative(7.769f)
                close()
                moveTo(12.0f, 6.145f)
                lineTo(7.298f, 8.863f)
                lineTo(12.0f, 11.579f)
                lineToRelative(4.704f, -2.717f)
                lineTo(12.0f, 6.146f)
                close()
                moveTo(12.0f, 3.813f)
                lineToRelative(5.659f, 3.274f)
                lineToRelative(3.31f, -1.91f)
                lineTo(12.0f, 0.0f)
                lineTo(1.975f, 5.79f)
                lineTo(5.28f, 7.695f)
                close()
                moveTo(19.207f, 16.293f)
                verticalLineToRelative(-3.947f)
                lineToRelative(-2.023f, 1.167f)
                verticalLineToRelative(1.614f)
                lineToRelative(-4.703f, 2.715f)
                verticalLineToRelative(0.005f)
                verticalLineToRelative(-5.436f)
                lineTo(22.518f, 6.62f)
                verticalLineToRelative(11.587f)
                lineTo(12.48f, 24.0f)
                verticalLineToRelative(-3.817f)
                lineToRelative(6.727f, -3.887f)
                close()
            }
        }
        .build()
        return _nintendogamecube!!
    }

private var _nintendogamecube: ImageVector? = null
