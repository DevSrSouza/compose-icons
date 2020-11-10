package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.NintendoGamecube: VectorAsset
    get() {
        if (_nintendoGamecube != null) {
            return _nintendoGamecube!!
        }
        _nintendoGamecube = VectorAssetBuilder(name = "NintendoGamecube", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.815f, 15.128f)
                lineToRelative(4.704f, 2.715f)
                lineTo(11.519f, 12.41f)
                lineTo(6.813f, 9.696f)
                verticalLineToRelative(5.433f)
                close()
                moveTo(4.79f, 16.296f)
                lineToRelative(6.73f, 3.883f)
                lineTo(11.52f, 24.0f)
                lineTo(1.48f, 18.207f)
                lineTo(1.48f, 6.617f)
                lineToRelative(3.31f, 1.91f)
                verticalLineToRelative(7.77f)
                close()
                moveTo(12.0f, 6.146f)
                lineTo(7.297f, 8.864f)
                lineTo(12.0f, 11.58f)
                lineToRelative(4.705f, -2.717f)
                lineTo(12.0f, 6.147f)
                close()
                moveTo(12.0f, 3.813f)
                lineToRelative(5.66f, 3.275f)
                lineToRelative(3.31f, -1.91f)
                lineTo(12.0f, 0.0f)
                lineTo(1.973f, 5.79f)
                lineTo(5.28f, 7.697f)
                lineTo(12.0f, 3.813f)
                close()
                moveTo(19.208f, 16.296f)
                verticalLineToRelative(-3.948f)
                lineToRelative(-2.023f, 1.167f)
                verticalLineToRelative(1.614f)
                lineToRelative(-4.704f, 2.715f)
                verticalLineToRelative(0.005f)
                verticalLineToRelative(-5.436f)
                lineTo(22.52f, 6.62f)
                verticalLineToRelative(11.588f)
                lineToRelative(-10.04f, 5.795f)
                verticalLineToRelative(-3.817f)
                lineToRelative(6.728f, -3.888f)
                close()
            }
        }
        .build()
        return _nintendoGamecube!!
    }

private var _nintendoGamecube: VectorAsset? = null
