package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.8f, 51.5f)
                arcToRelative(221.5f, 221.5f, 0.0f, false, false, -41.7f, -34.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.2f, 0.0f)
                arcTo(221.5f, 221.5f, 0.0f, false, false, 82.2f, 51.5f)
                curveTo(54.6f, 80.5f, 40.0f, 112.5f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 112.5f, 201.4f, 80.5f, 173.8f, 51.5f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, -32.0f)
                curveToRelative(0.0f, -27.7f, 22.5f, -47.3f, 32.0f, -54.3f)
                curveToRelative(9.5f, 7.0f, 32.0f, 26.6f, 32.0f, 54.3f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
