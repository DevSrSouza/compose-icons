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

public val SimpleIcons.Googleanalytics: ImageVector
    get() {
        if (_googleanalytics != null) {
            return _googleanalytics!!
        }
        _googleanalytics = Builder(name = "Googleanalytics", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.84f, 2.9982f)
                verticalLineToRelative(17.9987f)
                curveToRelative(0.0086f, 1.6473f, -1.3197f, 2.9897f, -2.967f, 2.9984f)
                arcToRelative(2.9808f, 2.9808f, 0.0f, false, true, -0.3677f, -0.0208f)
                curveToRelative(-1.528f, -0.226f, -2.6477f, -1.5558f, -2.6105f, -3.1f)
                lineTo(16.8948f, 3.1204f)
                curveToRelative(-0.0369f, -1.5458f, 1.0856f, -2.8762f, 2.6157f, -3.1f)
                curveToRelative(1.6361f, -0.1915f, 3.1178f, 0.9796f, 3.3093f, 2.6158f)
                curveToRelative(0.014f, 0.1201f, 0.0208f, 0.241f, 0.0202f, 0.3619f)
                close()
                moveTo(4.1326f, 18.0548f)
                curveToRelative(-1.6417f, 0.0f, -2.9726f, 1.331f, -2.9726f, 2.9726f)
                curveTo(1.16f, 22.6691f, 2.4909f, 24.0f, 4.1326f, 24.0f)
                reflectiveCurveToRelative(2.9726f, -1.3309f, 2.9726f, -2.9726f)
                reflectiveCurveToRelative(-1.331f, -2.9726f, -2.9726f, -2.9726f)
                close()
                moveTo(12.0054f, 9.045f)
                curveToRelative(-0.0171f, 0.0f, -0.0342f, 0.0f, -0.0513f, 3.0E-4f)
                curveToRelative(-1.6495f, 0.0904f, -2.9293f, 1.474f, -2.891f, 3.1256f)
                verticalLineToRelative(7.9846f)
                curveToRelative(0.0f, 2.167f, 0.9535f, 3.4825f, 2.3505f, 3.763f)
                curveToRelative(1.6118f, 0.3266f, 3.1832f, -0.7152f, 3.5098f, -2.327f)
                curveToRelative(0.04f, -0.1974f, 0.06f, -0.3983f, 0.0593f, -0.5998f)
                verticalLineToRelative(-8.9585f)
                curveToRelative(0.003f, -1.6474f, -1.33f, -2.9852f, -2.9773f, -2.9882f)
                close()
            }
        }
        .build()
        return _googleanalytics!!
    }

private var _googleanalytics: ImageVector? = null
