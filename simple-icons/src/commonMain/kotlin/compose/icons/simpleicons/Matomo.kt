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

public val SimpleIcons.Matomo: ImageVector
    get() {
        if (_matomo != null) {
            return _matomo!!
        }
        _matomo = Builder(name = "Matomo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.664f, 15.37f)
                arcToRelative(3.336f, 3.336f, 0.0f, false, true, -3.332f, 3.332f)
                curveTo(1.495f, 18.702f, 0.0f, 17.208f, 0.0f, 15.37f)
                reflectiveCurveToRelative(1.495f, -3.333f, 3.332f, -3.333f)
                arcToRelative(3.338f, 3.338f, 0.0f, false, true, 3.332f, 3.333f)
                close()
                moveTo(18.229f, 11.726f)
                arcToRelative(3.658f, 3.658f, 0.0f, false, true, -1.987f, 0.591f)
                arcToRelative(3.642f, 3.642f, 0.0f, false, true, -1.872f, -0.529f)
                lineToRelative(0.008f, 0.012f)
                arcToRelative(3.728f, 3.728f, 0.0f, false, true, -1.235f, -1.19f)
                lineToRelative(-2.612f, -3.693f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, true, -0.027f, -0.033f)
                arcTo(3.312f, 3.312f, 0.0f, false, false, 7.67f, 5.298f)
                arcToRelative(3.318f, 3.318f, 0.0f, false, false, -2.848f, 1.586f)
                arcToRelative(0.146f, 0.146f, 0.0f, false, true, -0.021f, 0.028f)
                lineToRelative(-3.428f, 5.343f)
                arcToRelative(3.663f, 3.663f, 0.0f, false, true, 5.094f, 1.18f)
                arcToRelative(0.13f, 0.13f, 0.0f, false, true, 0.015f, 0.018f)
                lineToRelative(2.756f, 3.869f)
                arcToRelative(3.305f, 3.305f, 0.0f, false, false, 2.699f, 1.38f)
                arcToRelative(3.31f, 3.31f, 0.0f, false, false, 2.711f, -1.379f)
                lineToRelative(0.009f, -0.013f)
                curveToRelative(0.073f, -0.103f, 0.137f, -0.202f, 0.195f, -0.305f)
                lineToRelative(1.442f, -2.255f)
                lineToRelative(1.935f, -3.024f)
                close()
                moveTo(23.504f, 13.628f)
                lineToRelative(-0.014f, -0.028f)
                lineToRelative(-0.044f, -0.066f)
                arcToRelative(1.109f, 1.109f, 0.0f, false, false, -0.029f, -0.044f)
                lineToRelative(-3.525f, -5.37f)
                curveToRelative(0.024f, 0.168f, 0.052f, 0.335f, 0.052f, 0.51f)
                curveToRelative(0.0f, 0.741f, -0.219f, 1.457f, -0.634f, 2.068f)
                lineToRelative(-2.803f, 4.38f)
                lineToRelative(1.416f, 2.179f)
                lineToRelative(-0.002f, 0.002f)
                arcToRelative(0.131f, 0.131f, 0.0f, false, true, 0.024f, 0.028f)
                arcToRelative(3.338f, 3.338f, 0.0f, false, false, 2.723f, 1.415f)
                arcTo(3.335f, 3.335f, 0.0f, false, false, 24.0f, 15.37f)
                curveToRelative(0.0f, -0.613f, -0.171f, -1.216f, -0.496f, -1.742f)
                close()
                moveTo(16.242f, 11.962f)
                arcToRelative(3.336f, 3.336f, 0.0f, false, false, 3.332f, -3.333f)
                arcToRelative(3.336f, 3.336f, 0.0f, false, false, -3.332f, -3.332f)
                arcToRelative(3.336f, 3.336f, 0.0f, false, false, -3.332f, 3.332f)
                arcToRelative(3.338f, 3.338f, 0.0f, false, false, 3.332f, 3.333f)
                close()
            }
        }
        .build()
        return _matomo!!
    }

private var _matomo: ImageVector? = null
