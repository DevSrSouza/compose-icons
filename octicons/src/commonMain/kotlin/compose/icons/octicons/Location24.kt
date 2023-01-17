package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                    pathFillType = NonZero) {
                moveTo(19.071f, 3.429f)
                horizontalLineToRelative(0.001f)
                curveToRelative(3.905f, 3.905f, 3.905f, 10.237f, 0.0f, 14.142f)
                lineToRelative(-5.403f, 5.403f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, true, -3.336f, 0.0f)
                lineToRelative(-5.375f, -5.375f)
                lineToRelative(-0.028f, -0.028f)
                curveToRelative(-3.905f, -3.905f, -3.905f, -10.237f, 0.0f, -14.142f)
                curveToRelative(3.904f, -3.905f, 10.236f, -3.905f, 14.141f, 0.0f)
                close()
                moveTo(5.99f, 4.489f)
                verticalLineToRelative(0.001f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, 12.02f)
                lineToRelative(0.023f, 0.024f)
                lineToRelative(0.002f, 0.002f)
                lineToRelative(5.378f, 5.378f)
                arcToRelative(0.859f, 0.859f, 0.0f, false, false, 1.214f, 0.0f)
                lineToRelative(5.403f, -5.404f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -0.043f, -11.977f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 5.99f, 4.489f)
                close()
            }
        }
        .build()
        return _location24!!
    }

private var _location24: ImageVector? = null
