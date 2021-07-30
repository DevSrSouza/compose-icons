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

public val SimpleIcons.Marriott: ImageVector
    get() {
        if (_marriott != null) {
            return _marriott!!
        }
        _marriott = Builder(name = "Marriott", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.802f, 11.083f)
                lineToRelative(-1.178f, 2.41f)
                curveToRelative(-0.8f, 1.425f, -1.931f, 3.167f, -3.646f, 3.603f)
                curveToRelative(-0.668f, 0.232f, -1.255f, 0.023f, -1.9f, -0.023f)
                lineTo(0.0f, 20.476f)
                arcToRelative(1.626f, 1.626f, 0.0f, false, false, 0.59f, 0.386f)
                curveToRelative(3.647f, 1.39f, 5.122f, -0.1f, 8.722f, -8.238f)
                lineToRelative(3.403f, 7.249f)
                horizontalLineToRelative(4.53f)
                lineToRelative(-2.14f, -4.893f)
                lineToRelative(1.213f, -2.53f)
                lineToRelative(3.345f, 7.311f)
                lineToRelative(4.337f, 0.027f)
                lineToRelative(-7.59f, -16.677f)
                lineToRelative(-3.475f, 1.738f)
                lineToRelative(2.738f, 6.222f)
                lineToRelative(-1.201f, 2.445f)
                lineTo(9.45f, 2.678f)
                lineToRelative(-3.7f, 1.877f)
                close()
            }
        }
        .build()
        return _marriott!!
    }

private var _marriott: ImageVector? = null
