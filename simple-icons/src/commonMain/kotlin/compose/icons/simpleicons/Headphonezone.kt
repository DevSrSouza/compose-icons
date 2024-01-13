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

public val SimpleIcons.Headphonezone: ImageVector
    get() {
        if (_headphonezone != null) {
            return _headphonezone!!
        }
        _headphonezone = Builder(name = "Headphonezone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.63f, 4.702f)
                lineTo(17.96f, 0.0f)
                lineTo(9.086f, 2.484f)
                curveToRelative(-0.463f, 1.754f, -0.694f, 4.139f, 0.133f, 6.655f)
                curveToRelative(0.232f, -0.067f, 0.463f, -0.1f, 0.695f, -0.133f)
                arcToRelative(4.724f, 4.724f, 0.0f, false, true, 5.133f, 4.305f)
                arcToRelative(4.724f, 4.724f, 0.0f, false, true, -4.305f, 5.133f)
                arcToRelative(4.724f, 4.724f, 0.0f, false, true, -5.132f, -4.305f)
                arcToRelative(4.618f, 4.618f, 0.0f, false, true, 1.159f, -3.543f)
                curveToRelative(-0.86f, -1.325f, -1.987f, -3.609f, -1.954f, -6.49f)
                curveTo(1.107f, 6.623f, -0.847f, 11.258f, 0.378f, 15.86f)
                curveToRelative(1.49f, 5.828f, 7.45f, 9.305f, 13.245f, 7.782f)
                curveToRelative(4.603f, -1.192f, 7.748f, -5.198f, 8.113f, -9.702f)
                lineToRelative(2.251f, -1.622f)
                lineToRelative(-6.358f, -7.616f)
                close()
            }
        }
        .build()
        return _headphonezone!!
    }

private var _headphonezone: ImageVector? = null
