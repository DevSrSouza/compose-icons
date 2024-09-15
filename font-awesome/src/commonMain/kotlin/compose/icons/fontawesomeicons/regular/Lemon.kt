package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                moveTo(484.11f, 27.89f)
                curveTo(455.99f, -0.23f, 416.11f, -8.06f, 387.06f, 8.86f)
                curveTo(347.6f, 31.85f, 223.5f, -41.11f, 91.2f, 91.2f)
                curveTo(-41.28f, 223.67f, 31.92f, 347.47f, 8.87f, 387.06f)
                curveToRelative(-16.92f, 29.05f, -9.1f, 68.93f, 19.02f, 97.05f)
                curveToRelative(28.14f, 28.14f, 68.01f, 35.94f, 97.06f, 19.02f)
                curveToRelative(39.42f, -22.97f, 163.56f, 49.97f, 295.86f, -82.33f)
                curveToRelative(132.47f, -132.48f, 59.27f, -256.28f, 82.33f, -295.86f)
                curveToRelative(16.92f, -29.05f, 9.1f, -68.93f, -19.02f, -97.05f)
                close()
                moveTo(461.71f, 100.78f)
                curveToRelative(-38.8f, 66.61f, 45.6f, 165.63f, -74.85f, 286.08f)
                curveToRelative(-120.44f, 120.44f, -219.48f, 36.05f, -286.08f, 74.84f)
                curveToRelative(-22.68f, 13.21f, -64.04f, -27.24f, -50.49f, -50.49f)
                curveToRelative(38.8f, -66.61f, -45.6f, -165.63f, 74.85f, -286.08f)
                curveTo(245.57f, 4.7f, 344.62f, 89.09f, 411.22f, 50.29f)
                curveToRelative(22.73f, -13.24f, 64.0f, 27.29f, 50.49f, 50.49f)
                close()
                moveTo(291.85f, 109.52f)
                curveToRelative(1.37f, 10.96f, -6.4f, 20.96f, -17.36f, 22.33f)
                curveToRelative(-54.85f, 6.86f, -135.78f, 87.79f, -142.63f, 142.63f)
                curveToRelative(-1.37f, 10.99f, -11.4f, 18.73f, -22.33f, 17.36f)
                curveToRelative(-10.96f, -1.37f, -18.74f, -11.37f, -17.36f, -22.33f)
                curveToRelative(9.16f, -73.29f, 104.17f, -168.21f, 177.37f, -177.37f)
                curveToRelative(10.95f, -1.37f, 20.96f, 6.4f, 22.33f, 17.36f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null
