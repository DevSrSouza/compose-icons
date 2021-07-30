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

public val SimpleIcons.Citrix: ImageVector
    get() {
        if (_citrix != null) {
            return _citrix!!
        }
        _citrix = Builder(name = "Citrix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.983f, 0.0f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, false, -1.78f, 1.78f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, false, 1.78f, 1.78f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, false, 1.78f, -1.78f)
                arcTo(1.78f, 1.78f, 0.0f, false, false, 11.983f, 0.0f)
                close()
                moveTo(5.17f, 5.991f)
                arcToRelative(1.026f, 1.026f, 0.0f, false, false, -1.095f, 1.027f)
                curveToRelative(0.0f, 0.308f, 0.136f, 0.616f, 0.376f, 0.822f)
                lineToRelative(6.162f, 7.086f)
                lineToRelative(-6.401f, 7.258f)
                arcToRelative(1.084f, 1.084f, 0.0f, false, false, -0.309f, 0.787f)
                curveToRelative(0.0f, 0.582f, 0.48f, 1.027f, 1.062f, 1.027f)
                curveToRelative(0.342f, 0.0f, 0.684f, -0.17f, 0.89f, -0.444f)
                lineToRelative(6.128f, -7.19f)
                lineToRelative(6.162f, 7.19f)
                curveToRelative(0.205f, 0.274f, 0.547f, 0.444f, 0.89f, 0.444f)
                curveToRelative(0.582f, 0.035f, 1.062f, -0.445f, 1.062f, -1.027f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, -0.309f, -0.787f)
                lineToRelative(-6.402f, -7.258f)
                lineToRelative(6.162f, -7.086f)
                curveToRelative(0.24f, -0.206f, 0.377f, -0.514f, 0.377f, -0.822f)
                verticalLineToRelative(-0.034f)
                curveToRelative(0.0f, -0.582f, -0.513f, -1.027f, -1.095f, -0.993f)
                curveToRelative(-0.343f, 0.0f, -0.65f, 0.171f, -0.856f, 0.445f)
                lineToRelative(-5.957f, 7.018f)
                lineTo(6.06f, 6.436f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, -0.855f, -0.445f)
                close()
            }
        }
        .build()
        return _citrix!!
    }

private var _citrix: ImageVector? = null
