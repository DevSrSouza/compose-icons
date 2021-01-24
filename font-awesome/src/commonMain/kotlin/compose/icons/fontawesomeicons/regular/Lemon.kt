package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Lemon: ImageVector
    get() {
        if (_lemon != null) {
            return _lemon!!
        }
        _lemon = Builder(name = "Lemon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(484.112f, 27.889f)
                curveTo(455.989f, -0.233f, 416.108f, -8.057f, 387.059f, 8.865f)
                curveTo(347.604f, 31.848f, 223.504f, -41.111f, 91.196f, 91.197f)
                curveTo(-41.277f, 223.672f, 31.923f, 347.472f, 8.866f, 387.058f)
                curveToRelative(-16.922f, 29.051f, -9.1f, 68.932f, 19.022f, 97.054f)
                curveToRelative(28.135f, 28.135f, 68.011f, 35.938f, 97.057f, 19.021f)
                curveToRelative(39.423f, -22.97f, 163.557f, 49.969f, 295.858f, -82.329f)
                curveToRelative(132.474f, -132.477f, 59.273f, -256.277f, 82.331f, -295.861f)
                curveToRelative(16.922f, -29.05f, 9.1f, -68.931f, -19.022f, -97.054f)
                close()
                moveTo(461.707f, 100.783f)
                curveToRelative(-38.8f, 66.609f, 45.6f, 165.635f, -74.845f, 286.08f)
                curveToRelative(-120.44f, 120.443f, -219.475f, 36.048f, -286.076f, 74.843f)
                curveToRelative(-22.679f, 13.207f, -64.035f, -27.241f, -50.493f, -50.488f)
                curveToRelative(38.8f, -66.609f, -45.6f, -165.635f, 74.845f, -286.08f)
                curveTo(245.573f, 4.702f, 344.616f, 89.086f, 411.219f, 50.292f)
                curveToRelative(22.73f, -13.24f, 64.005f, 27.288f, 50.488f, 50.491f)
                close()
                moveTo(291.846f, 109.519f)
                curveToRelative(1.37f, 10.96f, -6.404f, 20.957f, -17.365f, 22.327f)
                curveToRelative(-54.846f, 6.855f, -135.779f, 87.787f, -142.635f, 142.635f)
                curveToRelative(-1.373f, 10.989f, -11.399f, 18.734f, -22.326f, 17.365f)
                curveToRelative(-10.961f, -1.37f, -18.735f, -11.366f, -17.365f, -22.326f)
                curveToRelative(9.162f, -73.286f, 104.167f, -168.215f, 177.365f, -177.365f)
                curveToRelative(10.953f, -1.368f, 20.956f, 6.403f, 22.326f, 17.364f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null
