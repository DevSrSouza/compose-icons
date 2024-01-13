package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Cloud16: ImageVector
    get() {
        if (_cloud16 != null) {
            return _cloud16!!
        }
        _cloud16 = Builder(name = "Cloud16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.25f)
                arcTo(5.225f, 5.225f, 0.0f, false, true, 7.25f, 2.0f)
                arcToRelative(5.222f, 5.222f, 0.0f, false, true, 4.767f, 3.029f)
                arcTo(4.472f, 4.472f, 0.0f, false, true, 16.0f, 9.5f)
                curveToRelative(0.0f, 2.505f, -1.995f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-8.0f)
                arcTo(3.474f, 3.474f, 0.0f, false, true, 0.0f, 10.5f)
                curveToRelative(0.0f, -1.41f, 0.809f, -2.614f, 2.001f, -3.17f)
                close()
                moveTo(3.54f, 7.732f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.556f, 0.832f)
                curveToRelative(-0.86f, 0.22f, -1.484f, 0.987f, -1.484f, 1.936f)
                curveToRelative(0.0f, 1.124f, 0.876f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.676f, 0.0f, 3.0f, -1.324f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.324f, -3.0f, -3.0f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.709f, -0.504f)
                arcTo(3.72f, 3.72f, 0.0f, false, false, 7.25f, 3.5f)
                curveTo(5.16f, 3.5f, 3.5f, 5.16f, 3.5f, 7.25f)
                curveToRelative(0.002f, 0.146f, 0.014f, 0.292f, 0.035f, 0.436f)
                lineToRelative(0.004f, 0.036f)
                lineToRelative(0.001f, 0.008f)
                close()
            }
        }
        .build()
        return _cloud16!!
    }

private var _cloud16: ImageVector? = null
