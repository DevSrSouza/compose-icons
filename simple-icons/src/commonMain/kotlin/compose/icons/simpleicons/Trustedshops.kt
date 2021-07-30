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

public val SimpleIcons.Trustedshops: ImageVector
    get() {
        if (_trustedshops != null) {
            return _trustedshops!!
        }
        _trustedshops = Builder(name = "Trustedshops", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.187f, 14.332f)
                curveToRelative(-1.1f, 1.626f, -2.63f, 3.108f, -4.687f, 3.108f)
                curveToRelative(-2.175f, 0.0f, -3.442f, -1.362f, -3.442f, -3.562f)
                curveToRelative(0.0f, -3.561f, 2.63f, -7.052f, 6.335f, -7.052f)
                curveToRelative(1.242f, 0.0f, 2.916f, 0.502f, 2.916f, 2.009f)
                curveToRelative(0.0f, 2.7f, -4.231f, 3.609f, -6.311f, 4.135f)
                curveToRelative(-0.072f, 0.457f, -0.143f, 0.908f, -0.143f, 1.362f)
                curveToRelative(0.0f, 0.933f, 0.501f, 1.793f, 1.53f, 1.793f)
                curveToRelative(1.338f, 0.0f, 2.412f, -1.29f, 3.203f, -2.247f)
                close()
                moveTo(14.039f, 8.524f)
                curveToRelative(0.0f, -0.55f, -0.31f, -0.978f, -0.884f, -0.978f)
                curveToRelative(-1.722f, 0.0f, -2.608f, 3.346f, -2.94f, 4.66f)
                curveToRelative(1.601f, -0.48f, 3.824f, -1.794f, 3.824f, -3.682f)
                close()
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 11.997f)
                arcTo(11.997f, 11.997f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(11.9f, 19.523f)
                arcToRelative(7.563f, 7.563f, 0.0f, true, true, 7.564f, -7.563f)
                arcToRelative(7.563f, 7.563f, 0.0f, false, true, -7.563f, 7.56f)
                close()
            }
        }
        .build()
        return _trustedshops!!
    }

private var _trustedshops: ImageVector? = null
