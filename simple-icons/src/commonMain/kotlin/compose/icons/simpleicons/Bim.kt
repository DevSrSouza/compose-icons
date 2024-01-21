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

public val SimpleIcons.Bim: ImageVector
    get() {
        if (_bim != null) {
            return _bim!!
        }
        _bim = Builder(name = "Bim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.327f, 6.3015f)
                curveToRelative(-1.8378f, 0.0f, -3.3266f, 1.4908f, -3.3266f, 3.3283f)
                verticalLineToRelative(4.7424f)
                curveToRelative(0.0f, 1.8375f, 1.4888f, 3.3263f, 3.3265f, 3.3263f)
                horizontalLineToRelative(17.347f)
                curveToRelative(1.8376f, 0.0f, 3.3265f, -1.4888f, 3.3265f, -3.3263f)
                lineTo(24.0004f, 9.6298f)
                curveToRelative(0.0f, -1.8375f, -1.4889f, -3.3283f, -3.3265f, -3.3283f)
                lineTo(12.353f, 6.3015f)
                lineTo(11.06f, 8.1922f)
                lineTo(9.7863f, 6.3015f)
                close()
                moveTo(4.9012f, 8.4911f)
                curveToRelative(0.8137f, -0.0085f, 1.57f, 0.0699f, 2.01f, 0.2422f)
                curveToRelative(0.7978f, 0.3017f, 1.254f, 0.96f, 1.293f, 1.8067f)
                curveToRelative(0.0294f, 0.612f, -0.2962f, 1.1623f, -0.791f, 1.5801f)
                curveToRelative(0.5608f, 0.3311f, 0.9783f, 0.8269f, 0.9649f, 1.5392f)
                curveToRelative(-0.0257f, 1.2596f, -1.2067f, 2.0391f, -3.3362f, 1.9903f)
                curveToRelative(-1.1473f, -0.0269f, -1.7047f, -0.0285f, -2.3694f, -0.1739f)
                lineTo(2.6725f, 8.6395f)
                curveToRelative(1.1595f, -0.1564f, 1.288f, -0.14f, 2.2287f, -0.1484f)
                close()
                moveTo(14.4235f, 8.6024f)
                horizontalLineToRelative(1.9903f)
                lineToRelative(1.2833f, 3.2247f)
                lineToRelative(1.2735f, -3.2247f)
                horizontalLineToRelative(2.0511f)
                lineToRelative(0.5507f, 6.8675f)
                horizontalLineToRelative(-1.9707f)
                lineToRelative(-0.1446f, -3.9123f)
                lineToRelative(-1.7716f, 3.8986f)
                lineToRelative(-1.6466f, -3.885f)
                lineToRelative(-0.3418f, 3.8987f)
                horizontalLineToRelative(-2.0158f)
                close()
                moveTo(9.9503f, 8.6258f)
                horizontalLineToRelative(2.0901f)
                verticalLineToRelative(6.8675f)
                horizontalLineToRelative(-2.09f)
                close()
                moveTo(4.7156f, 10.0556f)
                verticalLineToRelative(1.4532f)
                horizontalLineToRelative(0.8086f)
                arcToRelative(0.7257f, 0.7257f, 0.0f, false, false, 0.7266f, -0.7266f)
                curveToRelative(0.0f, -0.4008f, -0.2965f, -0.7266f, -0.7266f, -0.7266f)
                close()
                moveTo(4.7156f, 12.8428f)
                verticalLineToRelative(1.1973f)
                horizontalLineToRelative(0.7793f)
                curveToRelative(0.4105f, 0.0232f, 0.9576f, -0.1498f, 0.963f, -0.586f)
                curveToRelative(-0.0245f, -0.4923f, -0.5244f, -0.637f, -0.9337f, -0.6113f)
                close()
            }
        }
        .build()
        return _bim!!
    }

private var _bim: ImageVector? = null
