package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Autotask: ImageVector
    get() {
        if (_autotask != null) {
            return _autotask!!
        }
        _autotask = Builder(name = "Autotask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.93f, 11.626f)
                lineToRelative(2.782f, 6.988f)
                horizontalLineToRelative(-4.298f)
                lineToRelative(-1.825f, -4.736f)
                lineToRelative(-9.885f, 6.667f)
                lineTo(1.0f, 12.6f)
                horizontalLineToRelative(0.815f)
                lineToRelative(4.39f, 3.418f)
                lineToRelative(7.61f, -4.148f)
                lineToRelative(-1.085f, -2.82f)
                lineToRelative(-1.168f, 2.481f)
                lineToRelative(-4.938f, 2.716f)
                lineToRelative(3.553f, -9.342f)
                horizontalLineToRelative(5.077f)
                lineToRelative(2.022f, 5.08f)
                lineTo(24.0f, 6.32f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(7.532f)
                close()
            }
        }
        .build()
        return _autotask!!
    }

private var _autotask: ImageVector? = null
