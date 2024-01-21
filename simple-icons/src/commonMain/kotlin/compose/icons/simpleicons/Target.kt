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

public val SimpleIcons.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0005f, 0.0f)
                curveTo(18.627f, 0.0f, 24.0f, 5.373f, 24.0f, 12.0005f)
                curveTo(24.0f, 18.627f, 18.627f, 24.0f, 11.9995f, 24.0f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 11.9995f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0005f, 0.0f)
                close()
                moveTo(12.0005f, 19.826f)
                arcToRelative(7.8265f, 7.8265f, 0.0f, true, false, -0.001f, -15.652f)
                curveTo(7.7133f, 4.2246f, 4.2653f, 7.7136f, 4.2653f, 12.0f)
                curveToRelative(0.0f, 4.2864f, 3.448f, 7.7754f, 7.7342f, 7.826f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(12.0005f, 15.8407f)
                arcToRelative(3.8402f, 3.8402f, 0.0f, true, true, 0.0f, -7.6803f)
                curveToRelative(2.1204f, 6.0E-4f, 3.839f, 1.7197f, 3.839f, 3.8401f)
                reflectiveCurveToRelative(-1.7186f, 3.8396f, -3.839f, 3.8402f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
