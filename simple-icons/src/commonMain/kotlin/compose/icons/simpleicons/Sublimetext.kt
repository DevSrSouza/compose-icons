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

public val SimpleIcons.Sublimetext: ImageVector
    get() {
        if (_sublimetext != null) {
            return _sublimetext!!
        }
        _sublimetext = Builder(name = "Sublimetext", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.953f, 0.004f)
                arcToRelative(0.397f, 0.397f, 0.0f, false, false, -0.18f, 0.017f)
                lineTo(3.225f, 5.585f)
                curveToRelative(-0.175f, 0.055f, -0.323f, 0.214f, -0.402f, 0.398f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.06f, 0.22f)
                verticalLineToRelative(5.726f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.06f, 0.22f)
                curveToRelative(0.079f, 0.183f, 0.227f, 0.341f, 0.402f, 0.397f)
                lineToRelative(7.454f, 2.364f)
                lineToRelative(-7.454f, 2.363f)
                curveToRelative(-0.255f, 0.08f, -0.463f, 0.374f, -0.463f, 0.655f)
                verticalLineToRelative(5.688f)
                curveToRelative(0.0f, 0.282f, 0.208f, 0.444f, 0.463f, 0.363f)
                lineToRelative(17.55f, -5.565f)
                curveToRelative(0.237f, -0.075f, 0.426f, -0.336f, 0.452f, -0.6f)
                curveToRelative(0.003f, -0.022f, 0.013f, -0.04f, 0.013f, -0.065f)
                verticalLineTo(12.06f)
                curveToRelative(0.0f, -0.281f, -0.208f, -0.575f, -0.463f, -0.656f)
                lineTo(13.4f, 9.065f)
                lineToRelative(7.375f, -2.339f)
                curveToRelative(0.255f, -0.08f, 0.462f, -0.375f, 0.462f, -0.656f)
                verticalLineTo(0.384f)
                curveToRelative(0.0f, -0.211f, -0.117f, -0.355f, -0.283f, -0.38f)
                close()
            }
        }
        .build()
        return _sublimetext!!
    }

private var _sublimetext: ImageVector? = null
