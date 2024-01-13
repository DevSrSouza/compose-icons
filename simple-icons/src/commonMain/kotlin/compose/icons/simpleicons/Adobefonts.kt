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

public val SimpleIcons.Adobefonts: ImageVector
    get() {
        if (_adobefonts != null) {
            return _adobefonts!!
        }
        _adobefonts = Builder(name = "Adobefonts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.764f, 0.375f)
                lineTo(4.236f, 0.375f)
                arcTo(4.236f, 4.236f, 0.0f, false, false, 0.0f, 4.611f)
                lineTo(0.0f, 19.39f)
                arcToRelative(4.236f, 4.236f, 0.0f, false, false, 4.236f, 4.236f)
                horizontalLineToRelative(15.528f)
                arcTo(4.236f, 4.236f, 0.0f, false, false, 24.0f, 19.389f)
                lineTo(24.0f, 4.61f)
                arcTo(4.236f, 4.236f, 0.0f, false, false, 19.764f, 0.375f)
                close()
                moveTo(16.514f, 6.911f)
                curveToRelative(-0.242f, 0.0f, -0.364f, -0.181f, -0.44f, -0.439f)
                curveToRelative(-0.257f, -0.97f, -0.59f, -1.257f, -0.787f, -1.257f)
                reflectiveCurveToRelative(-0.5f, 0.364f, -0.833f, 1.12f)
                curveToRelative(-0.417f, 0.97f, -0.754f, 1.97f, -1.007f, 2.994f)
                lineToRelative(1.732f, -0.002f)
                curveToRelative(0.11f, 0.28f, 0.01f, 0.6f, -0.238f, 0.772f)
                lineTo(13.23f, 10.099f)
                curveToRelative(-0.56f, 1.878f, -1.031f, 3.688f, -1.592f, 5.46f)
                arcToRelative(9.676f, 9.676f, 0.0f, false, true, -1.105f, 2.56f)
                arcToRelative(3.144f, 3.144f, 0.0f, false, true, -2.484f, 1.332f)
                curveToRelative(-0.773f, 0.0f, -1.53f, -0.363f, -1.53f, -1.166f)
                curveToRelative(0.036f, -0.503f, 0.424f, -0.91f, 0.924f, -0.97f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, true, 0.424f, 0.243f)
                curveToRelative(0.379f, 0.682f, 0.742f, 1.075f, 0.909f, 1.075f)
                curveToRelative(0.166f, 0.0f, 0.303f, -0.227f, 0.575f, -1.211f)
                lineToRelative(1.988f, -7.322f)
                lineToRelative(-1.43f, -0.002f)
                arcToRelative(0.685f, 0.685f, 0.0f, false, true, 0.227f, -0.774f)
                horizontalLineToRelative(1.423f)
                curveToRelative(0.257f, -0.895f, 0.609f, -1.76f, 1.048f, -2.58f)
                arcToRelative(3.786f, 3.786f, 0.0f, false, true, 3.272f, -2.195f)
                curveToRelative(1.136f, 0.0f, 1.605f, 0.545f, 1.605f, 1.242f)
                arcToRelative(1.144f, 1.144f, 0.0f, false, true, -0.97f, 1.12f)
                close()
            }
        }
        .build()
        return _adobefonts!!
    }

private var _adobefonts: ImageVector? = null
