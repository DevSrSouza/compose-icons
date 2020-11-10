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

public val SimpleIcons.Sentry: VectorAsset
    get() {
        if (_sentry != null) {
            return _sentry!!
        }
        _sentry = VectorAssetBuilder(name = "Sentry", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.663f, 21.572f)
                curveToRelative(0.449f, -0.748f, 0.449f, -1.496f, 0.0f, -2.244f)
                lineToRelative(-9.72f, -16.897f)
                curveToRelative(-0.447f, -0.747f, -1.195f, -1.048f, -1.943f, -1.048f)
                reflectiveCurveToRelative(-1.495f, 0.449f, -1.943f, 1.048f)
                lineTo(6.916f, 7.963f)
                lineToRelative(0.748f, 0.449f)
                curveToRelative(2.393f, 1.346f, 4.336f, 3.289f, 5.682f, 5.682f)
                curveToRelative(1.197f, 2.094f, 1.944f, 4.336f, 2.094f, 6.73f)
                horizontalLineToRelative(-2.243f)
                curveToRelative(-0.149f, -1.945f, -0.748f, -3.889f, -1.794f, -5.684f)
                curveToRelative(-1.047f, -2.093f, -2.692f, -3.738f, -4.785f, -4.935f)
                lineToRelative(-0.749f, -0.447f)
                lineToRelative(-2.99f, 5.084f)
                lineToRelative(0.747f, 0.449f)
                curveToRelative(1.944f, 1.195f, 3.29f, 3.139f, 3.589f, 5.383f)
                horizontalLineTo(2.28f)
                curveToRelative(-0.149f, 0.0f, -0.3f, -0.15f, -0.3f, -0.15f)
                reflectiveCurveToRelative(-0.148f, -0.15f, 0.0f, -0.299f)
                lineToRelative(1.348f, -2.393f)
                curveToRelative(-0.449f, -0.447f, -1.048f, -0.748f, -1.646f, -0.896f)
                lineTo(0.336f, 19.329f)
                curveToRelative(-0.449f, 0.748f, -0.449f, 1.496f, 0.0f, 2.244f)
                curveToRelative(0.448f, 0.746f, 1.046f, 1.045f, 1.943f, 1.045f)
                horizontalLineToRelative(6.879f)
                verticalLineToRelative(-0.896f)
                curveToRelative(0.0f, -1.645f, -0.449f, -3.141f, -1.196f, -4.637f)
                curveToRelative(-0.599f, -1.195f, -1.496f, -2.093f, -2.542f, -2.84f)
                lineTo(6.467f, 12.3f)
                curveToRelative(1.347f, 1.046f, 2.543f, 2.243f, 3.439f, 3.739f)
                curveToRelative(1.047f, 1.793f, 1.496f, 3.738f, 1.496f, 5.682f)
                verticalLineToRelative(0.896f)
                horizontalLineToRelative(5.831f)
                verticalLineToRelative(-0.896f)
                curveToRelative(0.0f, -2.99f, -0.747f, -5.982f, -2.392f, -8.673f)
                curveToRelative(-1.197f, -2.394f, -3.141f, -4.337f, -5.385f, -5.833f)
                lineTo(11.7f, 3.328f)
                curveToRelative(0.151f, -0.15f, 0.3f, -0.15f, 0.3f, -0.15f)
                curveToRelative(0.15f, 0.0f, 0.15f, 0.0f, 0.299f, 0.15f)
                lineToRelative(9.721f, 16.896f)
                curveToRelative(0.148f, 0.148f, 0.0f, 0.299f, 0.0f, 0.299f)
                reflectiveCurveToRelative(-0.15f, 0.15f, -0.3f, 0.15f)
                horizontalLineToRelative(-2.243f)
                verticalLineToRelative(1.795f)
                horizontalLineToRelative(2.243f)
                curveToRelative(0.896f, 0.149f, 1.495f, -0.15f, 1.943f, -0.896f)
                close()
            }
        }
        .build()
        return _sentry!!
    }

private var _sentry: VectorAsset? = null
