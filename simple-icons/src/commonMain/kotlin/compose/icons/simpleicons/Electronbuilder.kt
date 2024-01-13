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

public val SimpleIcons.Electronbuilder: ImageVector
    get() {
        if (_electronbuilder != null) {
            return _electronbuilder!!
        }
        _electronbuilder = Builder(name = "Electronbuilder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.01f)
                arcToRelative(3.506f, 3.506f, 0.0f, false, false, 3.506f, -3.505f)
                arcTo(3.506f, 3.506f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(3.506f, 3.506f, 0.0f, false, false, -3.506f, 3.506f)
                arcTo(3.506f, 3.506f, 0.0f, false, false, 12.0f, 7.01f)
                moveToRelative(0.0f, 4.137f)
                curveTo(9.243f, 8.588f, 5.574f, 7.01f, 1.484f, 7.01f)
                verticalLineToRelative(12.852f)
                curveTo(5.574f, 19.863f, 9.243f, 21.44f, 12.0f, 24.0f)
                curveToRelative(2.757f, -2.56f, 6.426f, -4.137f, 10.516f, -4.137f)
                verticalLineTo(7.01f)
                curveToRelative(-4.09f, 0.0f, -7.759f, 1.578f, -10.516f, 4.137f)
                close()
            }
        }
        .build()
        return _electronbuilder!!
    }

private var _electronbuilder: ImageVector? = null
