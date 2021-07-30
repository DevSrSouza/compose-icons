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

public val SimpleIcons.Clickup: ImageVector
    get() {
        if (_clickup != null) {
            return _clickup!!
        }
        _clickup = Builder(name = "Clickup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 18.439f)
                lineToRelative(3.69f, -2.828f)
                curveToRelative(1.961f, 2.56f, 4.044f, 3.739f, 6.363f, 3.739f)
                curveToRelative(2.307f, 0.0f, 4.33f, -1.166f, 6.203f, -3.704f)
                lineTo(22.0f, 18.405f)
                curveTo(19.298f, 22.065f, 15.941f, 24.0f, 12.053f, 24.0f)
                curveTo(8.178f, 24.0f, 4.788f, 22.078f, 2.0f, 18.439f)
                close()
                moveTo(12.04f, 6.15f)
                lineToRelative(-6.568f, 5.66f)
                lineToRelative(-3.036f, -3.52f)
                lineTo(12.055f, 0.0f)
                lineToRelative(9.543f, 8.296f)
                lineToRelative(-3.05f, 3.509f)
                close()
            }
        }
        .build()
        return _clickup!!
    }

private var _clickup: ImageVector? = null
