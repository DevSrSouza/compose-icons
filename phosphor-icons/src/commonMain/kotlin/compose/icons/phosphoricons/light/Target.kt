package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.1f, 84.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, true, 55.9f, 200.1f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, true, 0.0f, -144.2f)
                curveToRelative(38.3f, -38.4f, 99.8f, -39.7f, 139.9f, -4.1f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, 8.4f, 8.4f)
                lineToRelative(-62.0f, 62.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-34.0f, 33.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineToRelative(29.3f, -29.4f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 16.8f, 31.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.7f, -6.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 6.3f, 5.6f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, true, -20.2f, -39.1f)
                lineToRelative(25.5f, -25.5f)
                arcToRelative(89.8f, 89.8f, 0.0f, true, false, 22.0f, 28.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 220.1f, 84.0f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
