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

public val SimpleIcons.Gatsby: VectorAsset
    get() {
        if (_gatsby != null) {
            return _gatsby!!
        }
        _gatsby = VectorAssetBuilder(name = "Gatsby", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 0.007f)
                curveTo(5.326f, 0.007f, 0.007f, 5.326f, 0.007f, 12.0f)
                reflectiveCurveTo(5.326f, 23.995f, 12.0f, 23.995f)
                reflectiveCurveToRelative(11.994f, -5.319f, 11.994f, -11.994f)
                reflectiveCurveTo(18.676f, 0.007f, 12.001f, 0.007f)
                close()
                moveTo(2.614f, 12.105f)
                lineToRelative(9.283f, 9.283f)
                curveToRelative(-5.111f, 0.0f, -9.283f, -4.172f, -9.283f, -9.283f)
                close()
                moveTo(14.087f, 21.179f)
                lineTo(2.823f, 9.915f)
                curveTo(3.76f, 5.743f, 7.516f, 2.614f, 12.0f, 2.614f)
                arcToRelative(9.476f, 9.476f, 0.0f, false, true, 7.614f, 3.86f)
                lineTo(18.259f, 7.62f)
                arcToRelative(7.657f, 7.657f, 0.0f, false, false, -6.362f, -3.337f)
                arcTo(7.555f, 7.555f, 0.0f, false, false, 4.7f, 9.393f)
                lineToRelative(9.804f, 9.805f)
                curveToRelative(2.4f, -0.835f, 4.276f, -2.92f, 4.798f, -5.424f)
                horizontalLineToRelative(-4.068f)
                verticalLineToRelative(-1.773f)
                horizontalLineToRelative(6.154f)
                curveToRelative(0.0f, 4.485f, -3.129f, 8.24f, -7.301f, 9.178f)
                close()
            }
        }
        .build()
        return _gatsby!!
    }

private var _gatsby: VectorAsset? = null
