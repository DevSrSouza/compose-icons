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

public val SimpleIcons.BmcSoftware: VectorAsset
    get() {
        if (_bmcSoftware != null) {
            return _bmcSoftware!!
        }
        _bmcSoftware = VectorAssetBuilder(name = "BmcSoftware", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.389f, 23.97f)
                curveToRelative(-0.948f, 0.0f, -1.946f, -0.747f, -1.946f, -2.194f)
                verticalLineToRelative(-3.392f)
                curveToRelative(0.0f, -1.346f, 0.848f, -2.892f, 2.045f, -3.54f)
                lineToRelative(4.739f, -2.794f)
                lineToRelative(-4.739f, -2.793f)
                curveToRelative(-1.147f, -0.749f, -2.045f, -2.245f, -2.045f, -3.592f)
                lineTo(4.443f, 2.224f)
                curveTo(4.443f, 0.777f, 5.441f, 0.029f, 6.44f, 0.029f)
                curveToRelative(0.399f, 0.0f, 0.847f, 0.1f, 1.246f, 0.35f)
                lineTo(18.36f, 6.712f)
                curveToRelative(0.748f, 0.449f, 1.147f, 1.147f, 1.147f, 1.845f)
                curveToRelative(0.0f, 0.749f, -0.45f, 1.447f, -1.147f, 1.846f)
                lineTo(15.816f, 11.9f)
                lineToRelative(2.544f, 1.497f)
                curveToRelative(0.748f, 0.449f, 1.197f, 1.147f, 1.197f, 1.845f)
                curveToRelative(0.0f, 0.748f, -0.45f, 1.447f, -1.197f, 1.846f)
                lineTo(7.685f, 23.622f)
                curveToRelative(-0.448f, 0.25f, -0.847f, 0.349f, -1.296f, 0.349f)
                close()
                moveTo(13.521f, 13.397f)
                lineToRelative(-5.836f, 3.441f)
                curveToRelative(-0.448f, 0.25f, -0.897f, 1.048f, -0.897f, 1.546f)
                verticalLineToRelative(3.043f)
                lineToRelative(10.125f, -5.985f)
                close()
                moveTo(6.788f, 2.623f)
                verticalLineToRelative(3.042f)
                curveToRelative(0.0f, 0.5f, 0.449f, 1.297f, 0.897f, 1.547f)
                lineToRelative(5.836f, 3.441f)
                lineToRelative(3.442f, -2.045f)
                close()
            }
        }
        .build()
        return _bmcSoftware!!
    }

private var _bmcSoftware: VectorAsset? = null
