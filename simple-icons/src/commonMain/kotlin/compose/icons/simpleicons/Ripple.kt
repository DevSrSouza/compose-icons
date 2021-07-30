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

public val SimpleIcons.Ripple: ImageVector
    get() {
        if (_ripple != null) {
            return _ripple!!
        }
        _ripple = Builder(name = "Ripple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.55f, 14.65f)
                curveToRelative(-0.846f, -0.486f, -1.805f, -0.632f, -2.752f, -0.666f)
                curveToRelative(-0.79f, -0.023f, -1.974f, -0.541f, -1.974f, -1.985f)
                curveToRelative(0.0f, -1.072f, 0.868f, -1.94f, 1.985f, -1.985f)
                curveToRelative(0.947f, -0.034f, 1.906f, -0.18f, 2.752f, -0.666f)
                arcTo(5.018f, 5.018f, 0.0f, false, false, 22.4f, 2.502f)
                arcTo(5.04f, 5.04f, 0.0f, false, false, 15.53f, 0.674f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, false, -2.504f, 4.343f)
                curveToRelative(0.0f, 0.97f, 0.35f, 1.861f, 0.79f, 2.696f)
                curveToRelative(0.372f, 0.699f, 0.553f, 1.996f, -0.71f, 2.73f)
                curveToRelative(-0.948f, 0.54f, -2.132f, 0.202f, -2.719f, -0.745f)
                curveToRelative(-0.496f, -0.801f, -1.094f, -1.545f, -1.94f, -2.03f)
                curveTo(6.045f, 6.28f, 2.977f, 7.104f, 1.6f, 9.495f)
                arcTo(5.018f, 5.018f, 0.0f, false, false, 3.44f, 16.34f)
                arcToRelative(5.025f, 5.025f, 0.0f, false, false, 5.008f, 0.0f)
                curveToRelative(0.846f, -0.485f, 1.444f, -1.23f, 1.94f, -2.03f)
                curveToRelative(0.406f, -0.654f, 1.433f, -1.489f, 2.718f, -0.744f)
                curveToRelative(0.948f, 0.541f, 1.241f, 1.737f, 0.711f, 2.73f)
                curveToRelative(-0.44f, 0.823f, -0.79f, 1.725f, -0.79f, 2.695f)
                arcTo(5.011f, 5.011f, 0.0f, false, false, 18.034f, 24.0f)
                arcToRelative(5.011f, 5.011f, 0.0f, false, false, 5.008f, -5.008f)
                arcToRelative(4.982f, 4.982f, 0.0f, false, false, -2.492f, -4.343f)
                close()
            }
        }
        .build()
        return _ripple!!
    }

private var _ripple: ImageVector? = null
