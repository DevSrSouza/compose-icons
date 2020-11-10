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

public val SimpleIcons.Renren: VectorAsset
    get() {
        if (_renren != null) {
            return _renren!!
        }
        _renren = VectorAssetBuilder(name = "Renren", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.661f, 9.601f)
                verticalLineTo(5.303f)
                arcToRelative(6.793f, 6.793f, 0.0f, false, false, -4.053f, 11.084f)
                curveToRelative(2.378f, -1.152f, 4.041f, -3.755f, 4.053f, -6.786f)
                close()
                moveTo(6.793f, 13.715f)
                curveToRelative(-0.423f, 1.752f, -1.687f, 3.249f, -3.262f, 4.244f)
                arcToRelative(6.759f, 6.759f, 0.0f, false, false, 3.261f, 0.833f)
                arcToRelative(6.771f, 6.771f, 0.0f, false, false, 3.262f, -0.833f)
                curveToRelative(-1.575f, -0.995f, -2.838f, -2.493f, -3.261f, -4.244f)
                close()
                moveTo(11.977f, 7.613f)
                arcToRelative(6.789f, 6.789f, 0.0f, false, false, -4.052f, -2.31f)
                verticalLineToRelative(4.265f)
                curveToRelative(0.0f, 3.044f, 1.666f, 5.662f, 4.051f, 6.817f)
                arcToRelative(6.766f, 6.766f, 0.0f, false, true, -1.607f, -4.386f)
                arcToRelative(6.754f, 6.754f, 0.0f, false, true, 1.608f, -4.386f)
                close()
                moveTo(11.977f, 7.613f)
                curveToRelative(1.003f, 1.183f, 1.655f, 2.714f, 1.655f, 4.387f)
                reflectiveCurveToRelative(-0.652f, 3.202f, -1.655f, 4.387f)
                lineToRelative(-0.001f, -0.001f)
                lineToRelative(0.001f, 0.001f)
                curveToRelative(2.378f, -1.151f, 4.087f, -3.755f, 4.099f, -6.786f)
                verticalLineTo(5.303f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, -4.099f, 2.31f)
                close()
                moveTo(18.34f, 9.568f)
                curveToRelative(0.0f, 3.045f, 1.666f, 5.662f, 4.052f, 6.818f)
                arcTo(6.792f, 6.792f, 0.0f, false, false, 18.34f, 5.304f)
                verticalLineToRelative(4.264f)
                close()
                moveTo(17.208f, 13.715f)
                curveToRelative(-0.423f, 1.752f, -1.687f, 3.249f, -3.262f, 4.244f)
                arcToRelative(6.759f, 6.759f, 0.0f, false, false, 3.261f, 0.833f)
                arcToRelative(6.771f, 6.771f, 0.0f, false, false, 3.262f, -0.833f)
                curveToRelative(-1.574f, -0.995f, -2.838f, -2.493f, -3.261f, -4.244f)
                close()
            }
        }
        .build()
        return _renren!!
    }

private var _renren: VectorAsset? = null
