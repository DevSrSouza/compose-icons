package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Wpbeginner: ImageVector
    get() {
        if (_wpbeginner != null) {
            return _wpbeginner!!
        }
        _wpbeginner = Builder(name = "Wpbeginner", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(462.799f, 322.374f)
                curveTo(519.01f, 386.682f, 466.961f, 480.0f, 370.944f, 480.0f)
                curveToRelative(-39.602f, 0.0f, -78.824f, -17.687f, -100.142f, -50.04f)
                curveToRelative(-6.887f, 0.356f, -22.702f, 0.356f, -29.59f, 0.0f)
                curveTo(219.848f, 462.381f, 180.588f, 480.0f, 141.069f, 480.0f)
                curveToRelative(-95.49f, 0.0f, -148.348f, -92.996f, -91.855f, -157.626f)
                curveTo(-29.925f, 190.523f, 80.479f, 32.0f, 256.006f, 32.0f)
                curveToRelative(175.632f, 0.0f, 285.87f, 158.626f, 206.793f, 290.374f)
                close()
                moveTo(123.152f, 239.402f)
                horizontalLineToRelative(41.529f)
                verticalLineToRelative(-58.075f)
                horizontalLineToRelative(-41.529f)
                verticalLineToRelative(58.075f)
                close()
                moveTo(340.332f, 325.474f)
                verticalLineToRelative(-23.839f)
                curveToRelative(-60.506f, 20.915f, -132.355f, 9.198f, -187.589f, -33.971f)
                lineToRelative(0.246f, 24.897f)
                curveToRelative(51.101f, 46.367f, 131.746f, 57.875f, 187.343f, 32.913f)
                close()
                moveTo(189.579f, 239.402f)
                horizontalLineToRelative(166.058f)
                verticalLineToRelative(-58.075f)
                lineTo(189.579f, 181.327f)
                verticalLineToRelative(58.075f)
                close()
            }
        }
        .build()
        return _wpbeginner!!
    }

private var _wpbeginner: ImageVector? = null
