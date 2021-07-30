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
                moveTo(13.272f, 10.083f)
                curveToRelative(-0.531f, 1.828f, -0.977f, 3.588f, -1.508f, 5.31f)
                arcToRelative(9.623f, 9.623f, 0.0f, false, true, -1.052f, 2.488f)
                arcToRelative(2.952f, 2.952f, 0.0f, false, true, -2.351f, 1.294f)
                curveToRelative(-0.73f, 0.0f, -1.45f, -0.35f, -1.45f, -1.138f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, 0.872f, -0.943f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, 0.398f, 0.233f)
                curveToRelative(0.36f, 0.662f, 0.701f, 1.05f, 0.863f, 1.05f)
                curveToRelative(0.16f, 0.0f, 0.285f, -0.224f, 0.55f, -1.177f)
                lineToRelative(1.887f, -7.117f)
                horizontalLineToRelative(-1.347f)
                arcToRelative(0.699f, 0.699f, 0.0f, false, true, 0.218f, -0.768f)
                horizontalLineToRelative(1.346f)
                arcToRelative(12.251f, 12.251f, 0.0f, false, true, 0.996f, -2.49f)
                curveToRelative(0.644f, -1.195f, 1.677f, -2.139f, 3.1f, -2.139f)
                curveToRelative(1.08f, 0.0f, 1.526f, 0.535f, 1.526f, 1.206f)
                arcToRelative(1.109f, 1.109f, 0.0f, false, true, -0.92f, 1.089f)
                curveToRelative(-0.227f, 0.0f, -0.34f, -0.175f, -0.417f, -0.429f)
                curveToRelative(-0.246f, -0.943f, -0.56f, -1.225f, -0.749f, -1.225f)
                curveToRelative(-0.19f, 0.0f, -0.476f, 0.35f, -0.787f, 1.09f)
                arcToRelative(18.332f, 18.332f, 0.0f, false, false, -0.948f, 2.888f)
                horizontalLineToRelative(1.64f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, -0.227f, 0.768f)
                horizontalLineToRelative(-1.64f)
                close()
                moveTo(0.0f, 0.553f)
                verticalLineToRelative(22.893f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.554f)
                lineTo(0.0f, 0.554f)
                close()
                moveTo(1.12f, 1.506f)
                horizontalLineToRelative(21.928f)
                verticalLineToRelative(20.988f)
                lineTo(1.12f, 22.494f)
                close()
            }
        }
        .build()
        return _adobefonts!!
    }

private var _adobefonts: ImageVector? = null
