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

public val LightGroup.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) {
            return _circleNotch!!
        }
        _circleNotch = Builder(name = "CircleNotch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 128.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 85.5f, 35.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.0f, 2.9f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -3.0f, 8.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, false, 75.0f, 0.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -3.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.0f, -2.9f)
                arcTo(102.2f, 102.2f, 0.0f, false, true, 230.0f, 128.0f)
                close()
            }
        }
        .build()
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
