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

public val SimpleIcons.Micropython: ImageVector
    get() {
        if (_micropython != null) {
            return _micropython!!
        }
        _micropython = Builder(name = "Micropython", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(11.509f)
                verticalLineToRelative(18.737f)
                horizontalLineToRelative(0.982f)
                lineTo(12.491f, 0.0f)
                lineTo(24.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-5.263f)
                lineTo(18.737f, 5.263f)
                horizontalLineToRelative(-0.983f)
                lineTo(17.754f, 24.0f)
                lineTo(6.246f, 24.0f)
                lineTo(6.246f, 5.263f)
                lineToRelative(-0.983f, 0.035f)
                lineTo(5.263f, 24.0f)
                lineTo(0.0f, 24.0f)
                close()
                moveTo(22.246f, 19.509f)
                horizontalLineToRelative(-1.404f)
                verticalLineToRelative(2.386f)
                horizontalLineToRelative(1.404f)
                close()
            }
        }
        .build()
        return _micropython!!
    }

private var _micropython: ImageVector? = null
