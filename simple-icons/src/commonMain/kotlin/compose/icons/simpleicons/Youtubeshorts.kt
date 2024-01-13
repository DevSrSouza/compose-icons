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

public val SimpleIcons.Youtubeshorts: ImageVector
    get() {
        if (_youtubeshorts != null) {
            return _youtubeshorts!!
        }
        _youtubeshorts = Builder(name = "Youtubeshorts", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.931f, 9.99f)
                lineToRelative(-1.441f, -0.601f)
                lineToRelative(1.717f, -0.913f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, false, 1.874f, -6.078f)
                arcToRelative(4.506f, 4.506f, 0.0f, false, false, -6.09f, -1.874f)
                lineTo(4.792f, 5.929f)
                arcToRelative(4.504f, 4.504f, 0.0f, false, false, -2.402f, 4.193f)
                arcToRelative(4.521f, 4.521f, 0.0f, false, false, 2.666f, 3.904f)
                curveToRelative(0.036f, 0.012f, 1.442f, 0.6f, 1.442f, 0.6f)
                lineToRelative(-1.706f, 0.901f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, false, -2.369f, 3.967f)
                arcTo(4.528f, 4.528f, 0.0f, false, false, 6.93f, 24.0f)
                curveToRelative(0.725f, 0.0f, 1.437f, -0.174f, 2.08f, -0.508f)
                lineToRelative(10.21f, -5.406f)
                arcToRelative(4.494f, 4.494f, 0.0f, false, false, 2.39f, -4.192f)
                arcToRelative(4.525f, 4.525f, 0.0f, false, false, -2.678f, -3.904f)
                close()
                moveTo(9.597f, 15.19f)
                verticalLineTo(8.824f)
                lineToRelative(6.007f, 3.184f)
                close()
            }
        }
        .build()
        return _youtubeshorts!!
    }

private var _youtubeshorts: ImageVector? = null
