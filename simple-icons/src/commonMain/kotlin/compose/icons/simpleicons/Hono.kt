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

public val SimpleIcons.Hono: ImageVector
    get() {
        if (_hono != null) {
            return _hono!!
        }
        _hono = Builder(name = "Hono", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.445f, 0.002f)
                arcToRelative(45.529f, 45.529f, 0.0f, false, false, -5.252f, 8.146f)
                arcToRelative(8.595f, 8.595f, 0.0f, false, true, -0.555f, -0.53f)
                arcToRelative(27.796f, 27.796f, 0.0f, false, false, -1.205f, -1.542f)
                arcToRelative(8.762f, 8.762f, 0.0f, false, false, -1.251f, 2.12f)
                arcToRelative(20.743f, 20.743f, 0.0f, false, false, -1.448f, 5.88f)
                arcToRelative(8.867f, 8.867f, 0.0f, false, false, 0.338f, 3.468f)
                curveToRelative(1.312f, 3.48f, 3.794f, 5.593f, 7.445f, 6.337f)
                curveToRelative(3.055f, 0.438f, 5.755f, -0.333f, 8.097f, -2.312f)
                curveToRelative(2.677f, -2.59f, 3.359f, -5.634f, 2.047f, -9.132f)
                arcToRelative(33.287f, 33.287f, 0.0f, false, false, -2.988f, -5.59f)
                arcTo(91.34f, 91.34f, 0.0f, false, false, 12.615f, 0.053f)
                arcToRelative(0.216f, 0.216f, 0.0f, false, false, -0.17f, -0.051f)
                close()
                moveTo(12.109f, 3.908f)
                arcToRelative(50.93f, 50.93f, 0.0f, false, true, 4.794f, 6.552f)
                curveToRelative(0.448f, 0.767f, 0.817f, 1.57f, 1.108f, 2.41f)
                curveToRelative(0.606f, 2.386f, -0.044f, 4.354f, -1.951f, 5.904f)
                curveToRelative(-1.845f, 1.298f, -3.87f, 1.683f, -6.072f, 1.156f)
                curveToRelative(-2.376f, -0.737f, -3.75f, -2.335f, -4.121f, -4.794f)
                arcToRelative(5.107f, 5.107f, 0.0f, false, true, 0.242f, -2.266f)
                curveToRelative(0.358f, -0.908f, 0.79f, -1.774f, 1.3f, -2.601f)
                lineToRelative(1.446f, -2.121f)
                arcToRelative(397.33f, 397.33f, 0.0f, false, false, 3.254f, -4.24f)
                close()
            }
        }
        .build()
        return _hono!!
    }

private var _hono: ImageVector? = null
