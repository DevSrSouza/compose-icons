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
                moveTo(462.8f, 322.37f)
                curveTo(519.01f, 386.68f, 466.96f, 480.0f, 370.94f, 480.0f)
                curveToRelative(-39.6f, 0.0f, -78.82f, -17.69f, -100.14f, -50.04f)
                curveToRelative(-6.89f, 0.36f, -22.7f, 0.36f, -29.59f, 0.0f)
                curveTo(219.85f, 462.38f, 180.59f, 480.0f, 141.07f, 480.0f)
                curveToRelative(-95.49f, 0.0f, -148.35f, -93.0f, -91.86f, -157.63f)
                curveTo(-29.92f, 190.52f, 80.48f, 32.0f, 256.01f, 32.0f)
                curveToRelative(175.63f, 0.0f, 285.87f, 158.63f, 206.79f, 290.37f)
                close()
                moveTo(123.15f, 239.4f)
                horizontalLineToRelative(41.53f)
                verticalLineToRelative(-58.08f)
                horizontalLineToRelative(-41.53f)
                verticalLineToRelative(58.08f)
                close()
                moveTo(340.33f, 325.47f)
                verticalLineToRelative(-23.84f)
                curveToRelative(-60.51f, 20.92f, -132.35f, 9.2f, -187.59f, -33.97f)
                lineToRelative(0.25f, 24.9f)
                curveToRelative(51.1f, 46.37f, 131.75f, 57.88f, 187.34f, 32.91f)
                close()
                moveTo(189.58f, 239.4f)
                horizontalLineToRelative(166.06f)
                verticalLineToRelative(-58.08f)
                lineTo(189.58f, 181.33f)
                verticalLineToRelative(58.08f)
                close()
            }
        }
        .build()
        return _wpbeginner!!
    }

private var _wpbeginner: ImageVector? = null
