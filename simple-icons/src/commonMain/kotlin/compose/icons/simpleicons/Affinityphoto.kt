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

public val SimpleIcons.Affinityphoto: ImageVector
    get() {
        if (_affinityphoto != null) {
            return _affinityphoto!!
        }
        _affinityphoto = Builder(name = "Affinityphoto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.344f)
                verticalLineToRelative(19.312f)
                arcTo(2.345f, 2.345f, 0.0f, false, true, 21.656f, 24.0f)
                lineTo(2.344f, 24.0f)
                arcTo(2.345f, 2.345f, 0.0f, false, true, 0.0f, 21.656f)
                lineTo(0.0f, 2.344f)
                arcTo(2.345f, 2.345f, 0.0f, false, true, 2.344f, 0.0f)
                horizontalLineToRelative(19.312f)
                arcTo(2.345f, 2.345f, 0.0f, false, true, 24.0f, 2.344f)
                close()
                moveTo(10.672f, 1.758f)
                lineTo(10.262f, 2.467f)
                lineTo(15.283f, 11.16f)
                lineTo(20.713f, 1.758f)
                lineTo(10.672f, 1.758f)
                close()
                moveTo(12.885f, 9.46f)
                lineTo(11.12f, 9.46f)
                arcToRelative(0.901f, 0.901f, 0.0f, false, false, -0.75f, 0.446f)
                lineToRelative(-0.925f, 1.605f)
                lineToRelative(-0.007f, 0.011f)
                arcToRelative(0.901f, 0.901f, 0.0f, false, false, 0.0f, 0.872f)
                lineToRelative(0.924f, 1.599f)
                lineToRelative(0.01f, 0.017f)
                arcToRelative(0.893f, 0.893f, 0.0f, false, false, 0.755f, 0.428f)
                curveToRelative(0.002f, 0.0f, 1.178f, 0.001f, 1.765f, -0.002f)
                arcToRelative(0.888f, 0.888f, 0.0f, false, false, 0.75f, -0.436f)
                curveToRelative(0.311f, -0.539f, 0.624f, -1.077f, 0.933f, -1.617f)
                arcToRelative(0.879f, 0.879f, 0.0f, false, false, -0.006f, -0.863f)
                lineToRelative(-0.008f, -0.013f)
                lineToRelative(-0.921f, -1.595f)
                lineToRelative(-0.005f, -0.008f)
                arcToRelative(0.897f, 0.897f, 0.0f, false, false, -0.75f, -0.444f)
                close()
                moveTo(2.36f, 22.18f)
                lineTo(9.699f, 9.475f)
                lineTo(6.215f, 9.475f)
                lineToRelative(-4.457f, 7.717f)
                lineToRelative(0.002f, 4.182f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, false, 0.6f, 0.806f)
                close()
                moveTo(14.204f, 22.242f)
                lineTo(8.725f, 12.756f)
                lineTo(3.24f, 22.242f)
                horizontalLineToRelative(10.964f)
                close()
                moveTo(12.926f, 8.676f)
                lineToRelative(-3.125f, -5.41f)
                lineToRelative(-3.125f, 5.41f)
                horizontalLineToRelative(6.25f)
                close()
                moveTo(22.242f, 15.236f)
                lineTo(11.08f, 15.236f)
                lineToRelative(4.046f, 7.006f)
                horizontalLineToRelative(6.197f)
                arcToRelative(0.938f, 0.938f, 0.0f, false, false, 0.919f, -0.937f)
                verticalLineToRelative(-6.069f)
                close()
                moveTo(21.607f, 1.808f)
                lineTo(14.312f, 14.438f)
                horizontalLineToRelative(7.93f)
                lineTo(22.242f, 2.695f)
                arcToRelative(0.938f, 0.938f, 0.0f, false, false, -0.635f, -0.887f)
                close()
            }
        }
        .build()
        return _affinityphoto!!
    }

private var _affinityphoto: ImageVector? = null
