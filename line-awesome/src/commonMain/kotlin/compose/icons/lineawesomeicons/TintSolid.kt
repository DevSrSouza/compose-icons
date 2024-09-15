package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.TintSolid: ImageVector
    get() {
        if (_tintSolid != null) {
            return _tintSolid!!
        }
        _tintSolid = Builder(name = "TintSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.438f)
                lineTo(15.219f, 4.375f)
                curveTo(15.219f, 4.375f, 13.219f, 6.785f, 11.188f, 9.781f)
                curveTo(10.172f, 11.281f, 9.125f, 12.918f, 8.344f, 14.5f)
                curveTo(7.563f, 16.082f, 7.0f, 17.598f, 7.0f, 19.0f)
                curveTo(7.0f, 23.945f, 11.055f, 28.0f, 16.0f, 28.0f)
                curveTo(20.945f, 28.0f, 25.0f, 23.945f, 25.0f, 19.0f)
                curveTo(25.0f, 17.598f, 24.438f, 16.082f, 23.656f, 14.5f)
                curveTo(22.875f, 12.918f, 21.828f, 11.281f, 20.813f, 9.781f)
                curveTo(18.781f, 6.785f, 16.781f, 4.375f, 16.781f, 4.375f)
                close()
                moveTo(16.0f, 6.656f)
                curveTo(16.559f, 7.348f, 17.605f, 8.574f, 19.188f, 10.906f)
                curveTo(20.172f, 12.355f, 21.125f, 13.953f, 21.844f, 15.406f)
                curveTo(22.563f, 16.859f, 23.0f, 18.203f, 23.0f, 19.0f)
                curveTo(23.0f, 22.855f, 19.855f, 26.0f, 16.0f, 26.0f)
                curveTo(12.145f, 26.0f, 9.0f, 22.855f, 9.0f, 19.0f)
                curveTo(9.0f, 18.203f, 9.438f, 16.859f, 10.156f, 15.406f)
                curveTo(10.875f, 13.953f, 11.828f, 12.355f, 12.813f, 10.906f)
                curveTo(14.395f, 8.574f, 15.441f, 7.348f, 16.0f, 6.656f)
                close()
                moveTo(11.0f, 19.0f)
                curveTo(11.0f, 21.746f, 13.254f, 24.0f, 16.0f, 24.0f)
                lineTo(16.0f, 22.0f)
                curveTo(14.344f, 22.0f, 13.0f, 20.656f, 13.0f, 19.0f)
                close()
            }
        }
        .build()
        return _tintSolid!!
    }

private var _tintSolid: ImageVector? = null
