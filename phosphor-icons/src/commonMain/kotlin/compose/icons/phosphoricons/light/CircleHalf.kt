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

public val LightGroup.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) {
            return _circleHalf!!
        }
        _circleHalf = Builder(name = "CircleHalf", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(134.0f, 38.2f)
                arcToRelative(94.1f, 94.1f, 0.0f, false, true, 20.0f, 3.6f)
                lineTo(154.0f, 214.2f)
                arcToRelative(94.1f, 94.1f, 0.0f, false, true, -20.0f, 3.6f)
                close()
                moveTo(166.0f, 46.4f)
                arcToRelative(90.8f, 90.8f, 0.0f, false, true, 20.0f, 12.8f)
                lineTo(186.0f, 196.8f)
                arcToRelative(90.8f, 90.8f, 0.0f, false, true, -20.0f, 12.8f)
                close()
                moveTo(38.0f, 128.0f)
                arcToRelative(90.2f, 90.2f, 0.0f, false, true, 84.0f, -89.8f)
                lineTo(122.0f, 217.8f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 38.0f, 128.0f)
                close()
                moveTo(198.0f, 184.5f)
                lineTo(198.0f, 71.5f)
                arcToRelative(89.8f, 89.8f, 0.0f, false, true, 0.0f, 113.0f)
                close()
            }
        }
        .build()
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
