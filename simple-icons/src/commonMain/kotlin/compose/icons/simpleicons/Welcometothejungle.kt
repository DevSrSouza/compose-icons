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

public val SimpleIcons.Welcometothejungle: ImageVector
    get() {
        if (_welcometothejungle != null) {
            return _welcometothejungle!!
        }
        _welcometothejungle = Builder(name = "Welcometothejungle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.62f, 3.783f)
                curveToRelative(-1.115f, -1.811f, -4.355f, -2.604f, -6.713f, -0.265f)
                curveToRelative(-0.132f, 0.135f, -0.306f, 0.548f, 0.218f, 1.104f)
                curveToRelative(1.097f, 1.149f, 6.819f, 7.046f, 4.702f, 12.196f)
                curveToRelative(-1.028f, 2.504f, -3.953f, 2.073f, -5.052f, -2.076f)
                arcToRelative(23.184f, 23.184f, 0.0f, false, true, -0.473f, -9.367f)
                reflectiveCurveToRelative(0.105f, -0.394f, -0.065f, -0.52f)
                curveToRelative(-0.117f, -0.087f, -0.305f, -0.05f, -0.547f, 0.33f)
                curveToRelative(-0.06f, 0.096f, -0.048f, 0.076f, -0.106f, 0.178f)
                lineToRelative(-0.003f, 0.002f)
                curveToRelative(-1.622f, 2.688f, -3.272f, 5.874f, -4.049f, 7.07f)
                curveToRelative(0.38f, -1.803f, -0.101f, -4.283f, -0.85f, -6.359f)
                lineToRelative(-0.142f, -0.375f)
                curveToRelative(-0.692f, -1.776f, -1.524f, -2.974f, -1.776f, -3.245f)
                curveToRelative(-0.03f, -0.033f, -0.105f, -0.094f, -0.353f, -0.094f)
                horizontalLineTo(0.398f)
                curveToRelative(-0.49f, 0.0f, -0.448f, 0.412f, -0.293f, 0.561f)
                curveToRelative(1.862f, 2.178f, 7.289f, 10.343f, 4.773f, 18.355f)
                curveToRelative(-0.194f, 0.619f, 0.11f, 0.944f, 0.612f, 0.305f)
                curveToRelative(2.206f, -2.81f, 4.942f, -7.598f, 6.925f, -11.187f)
                curveToRelative(-0.437f, 1.245f, -0.822f, 2.63f, -1.028f, 4.083f)
                curveToRelative(-0.435f, 3.064f, 0.487f, 5.37f, 1.162f, 6.58f)
                curveToRelative(0.345f, 0.619f, 0.803f, 0.998f, 1.988f, 0.824f)
                curveToRelative(6.045f, -0.885f, 8.06f, -6.117f, 8.805f, -8.77f)
                curveToRelative(1.357f, -4.839f, 0.363f, -7.568f, -0.722f, -9.33f)
            }
        }
        .build()
        return _welcometothejungle!!
    }

private var _welcometothejungle: ImageVector? = null
