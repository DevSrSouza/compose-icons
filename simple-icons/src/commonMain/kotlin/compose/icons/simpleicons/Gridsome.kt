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

public val SimpleIcons.Gridsome: ImageVector
    get() {
        if (_gridsome != null) {
            return _gridsome!!
        }
        _gridsome = Builder(name = "Gridsome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.026f, 0.017f)
                lineToRelative(-0.108f, 0.001f)
                curveTo(4.905f, 0.135f, -0.102f, 5.975f, 0.002f, 11.956f)
                curveTo(0.025f, 19.286f, 6.02f, 24.13f, 12.083f, 23.98f)
                curveToRelative(7.208f, -0.2f, 12.323f, -6.461f, 11.892f, -12.05f)
                arcToRelative(2.197f, 2.197f, 0.0f, false, false, -2.192f, -2.001f)
                horizontalLineToRelative(-3.15f)
                arcToRelative(2.155f, 2.155f, 0.0f, false, false, -2.161f, 2.147f)
                curveToRelative(0.0f, 1.187f, 0.967f, 2.148f, 2.16f, 2.148f)
                horizontalLineToRelative(0.788f)
                curveToRelative(-0.87f, 2.791f, -3.62f, 5.455f, -7.44f, 5.56f)
                curveToRelative(-3.803f, 0.095f, -7.61f, -2.904f, -7.768f, -7.569f)
                arcToRelative(2.173f, 2.173f, 0.0f, false, false, 0.0f, -0.159f)
                curveToRelative(-0.148f, -3.72f, 2.895f, -7.637f, 7.88f, -7.845f)
                arcToRelative(2.096f, 2.096f, 0.0f, false, false, 2.003f, -2.183f)
                arcToRelative(2.095f, 2.095f, 0.0f, false, false, -2.07f, -2.011f)
                close()
                moveTo(12.008f, 9.928f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, false, -2.146f, 2.151f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, false, 2.146f, 2.152f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, false, 2.147f, -2.152f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, false, -2.147f, -2.15f)
                close()
            }
        }
        .build()
        return _gridsome!!
    }

private var _gridsome: ImageVector? = null
