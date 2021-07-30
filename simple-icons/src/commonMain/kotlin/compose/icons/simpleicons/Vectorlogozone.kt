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

public val SimpleIcons.Vectorlogozone: ImageVector
    get() {
        if (_vectorlogozone != null) {
            return _vectorlogozone!!
        }
        _vectorlogozone = Builder(name = "Vectorlogozone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.458f, 0.0f)
                lineToRelative(-5.311f, 2.024f)
                lineToRelative(1.989f, 0.534f)
                lineToRelative(-4.847f, 16.085f)
                lineToRelative(-4.867f, -16.25f)
                horizontalLineTo(1.48f)
                lineTo(8.974f, 24.0f)
                horizontalLineToRelative(4.645f)
                lineToRelative(7.043f, -20.226f)
                lineToRelative(1.858f, 0.499f)
                close()
            }
        }
        .build()
        return _vectorlogozone!!
    }

private var _vectorlogozone: ImageVector? = null
