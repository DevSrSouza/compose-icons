package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ColorPaletteSharp: ImageVector
    get() {
        if (_colorPaletteSharp != null) {
            return _colorPaletteSharp!!
        }
        _colorPaletteSharp = Builder(name = "ColorPaletteSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 352.0f)
                curveToRelative(-12.6f, -0.84f, -21.0f, -4.0f, -28.0f, -12.0f)
                curveToRelative(-14.0f, -16.0f, -14.0f, -36.0f, 5.49f, -52.48f)
                lineToRelative(32.82f, -29.14f)
                curveToRelative(50.27f, -44.41f, 50.27f, -117.21f, 0.0f, -161.63f)
                curveTo(389.26f, 64.14f, 339.54f, 48.0f, 287.86f, 48.0f)
                curveToRelative(-60.34f, 0.0f, -123.39f, 22.0f, -172.0f, 65.11f)
                curveToRelative(-90.46f, 80.0f, -90.46f, 210.92f, 0.0f, 290.87f)
                curveToRelative(45.0f, 39.76f, 105.63f, 59.59f, 165.64f, 60.0f)
                horizontalLineToRelative(1.84f)
                curveToRelative(60.0f, 0.0f, 119.07f, -19.5f, 161.2f, -56.77f)
                curveTo(464.0f, 390.0f, 464.0f, 385.0f, 444.62f, 355.56f)
                curveTo(440.0f, 348.0f, 431.0f, 353.0f, 416.0f, 352.0f)
                close()
                moveTo(112.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 112.0f, 208.0f)
                close()
                moveTo(152.0f, 343.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 152.0f, 343.0f)
                close()
                moveTo(192.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 192.0f, 144.0f)
                close()
                moveTo(256.0f, 415.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 256.0f, 415.0f)
                close()
                moveTo(328.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 328.0f, 176.0f)
                close()
            }
        }
        .build()
        return _colorPaletteSharp!!
    }

private var _colorPaletteSharp: ImageVector? = null
