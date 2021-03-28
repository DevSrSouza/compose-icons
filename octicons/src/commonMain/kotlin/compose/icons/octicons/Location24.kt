package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Location24: ImageVector
    get() {
        if (_location24 != null) {
            return _location24!!
        }
        _location24 = Builder(name = "Location24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.071f, 3.429f)
                curveTo(15.166f, -0.476f, 8.834f, -0.476f, 4.93f, 3.429f)
                curveToRelative(-3.905f, 3.905f, -3.905f, 10.237f, 0.0f, 14.142f)
                lineToRelative(0.028f, 0.028f)
                lineToRelative(5.375f, 5.375f)
                arcToRelative(2.359f, 2.359f, 0.0f, false, false, 3.336f, 0.0f)
                lineToRelative(5.403f, -5.403f)
                curveToRelative(3.905f, -3.905f, 3.905f, -10.237f, 0.0f, -14.142f)
                close()
                moveTo(5.99f, 4.489f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 18.01f, 16.51f)
                lineToRelative(-5.403f, 5.404f)
                arcToRelative(0.859f, 0.859f, 0.0f, false, true, -1.214f, 0.0f)
                lineToRelative(-5.378f, -5.378f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-0.023f, -0.024f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 0.0f, -12.02f)
                close()
            }
        }
        .build()
        return _location24!!
    }

private var _location24: ImageVector? = null
