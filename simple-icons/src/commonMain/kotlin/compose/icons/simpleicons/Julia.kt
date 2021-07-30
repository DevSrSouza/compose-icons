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

public val SimpleIcons.Julia: ImageVector
    get() {
        if (_julia != null) {
            return _julia!!
        }
        _julia = Builder(name = "Julia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.138f, 17.569f)
                arcToRelative(5.569f, 5.569f, 0.0f, true, true, -11.138f, 0.0f)
                arcToRelative(5.569f, 5.569f, 0.0f, true, true, 11.138f, 0.0f)
                close()
                moveTo(17.569f, 6.431f)
                arcToRelative(5.569f, 5.569f, 0.0f, true, true, -11.138f, 0.0f)
                arcToRelative(5.569f, 5.569f, 0.0f, true, true, 11.138f, 0.0f)
                close()
                moveTo(24.0f, 17.569f)
                arcToRelative(5.569f, 5.569f, 0.0f, true, true, -11.138f, 0.0f)
                arcToRelative(5.569f, 5.569f, 0.0f, true, true, 11.138f, 0.0f)
                close()
            }
        }
        .build()
        return _julia!!
    }

private var _julia: ImageVector? = null
