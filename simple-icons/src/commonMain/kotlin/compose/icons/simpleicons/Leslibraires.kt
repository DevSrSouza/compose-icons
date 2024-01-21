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

public val SimpleIcons.Leslibraires: ImageVector
    get() {
        if (_leslibraires != null) {
            return _leslibraires!!
        }
        _leslibraires = Builder(name = "Leslibraires", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.79f, 0.002f)
                arcToRelative(10.579f, 10.579f, 0.0f, false, false, -7.735f, 3.575f)
                curveTo(0.18f, 7.958f, 0.593f, 14.647f, 4.981f, 18.518f)
                arcToRelative(10.557f, 10.557f, 0.0f, false, false, 5.3f, 2.51f)
                lineTo(12.002f, 24.0f)
                lineToRelative(1.717f, -2.971f)
                arcToRelative(10.56f, 10.56f, 0.0f, false, false, 6.227f, -3.437f)
                curveToRelative(3.876f, -4.38f, 3.461f, -11.07f, -0.926f, -14.94f)
                arcToRelative(10.567f, 10.567f, 0.0f, false, false, -7.23f, -2.65f)
                close()
                moveTo(11.277f, 7.5f)
                lineToRelative(0.613f, 0.512f)
                lineToRelative(-1.862f, 2.444f)
                curveToRelative(-0.005f, 0.007f, -0.048f, 0.06f, -0.048f, 0.115f)
                curveToRelative(0.0f, 0.056f, 0.045f, 0.112f, 0.045f, 0.113f)
                lineToRelative(1.866f, 2.461f)
                lineToRelative(-0.615f, 0.502f)
                lineToRelative(-2.573f, -2.403f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, true, -0.3f, -0.667f)
                curveToRelative(0.0f, -0.38f, 0.22f, -0.596f, 0.304f, -0.678f)
                close()
                moveTo(14.542f, 7.5f)
                lineTo(15.155f, 8.012f)
                lineTo(13.292f, 10.456f)
                curveToRelative(-0.005f, 0.007f, -0.048f, 0.06f, -0.048f, 0.115f)
                curveToRelative(0.0f, 0.056f, 0.045f, 0.112f, 0.046f, 0.113f)
                lineToRelative(1.866f, 2.461f)
                lineToRelative(-0.615f, 0.502f)
                lineToRelative(-2.573f, -2.403f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, true, -0.301f, -0.667f)
                curveToRelative(0.0f, -0.38f, 0.222f, -0.596f, 0.305f, -0.678f)
                close()
            }
        }
        .build()
        return _leslibraires!!
    }

private var _leslibraires: ImageVector? = null
