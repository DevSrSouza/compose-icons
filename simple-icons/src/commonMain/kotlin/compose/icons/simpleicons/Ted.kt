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

public val SimpleIcons.Ted: ImageVector
    get() {
        if (_ted != null) {
            return _ted!!
        }
        _ted = Builder(name = "Ted", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.664f)
                verticalLineToRelative(2.223f)
                horizontalLineToRelative(2.43f)
                verticalLineToRelative(6.449f)
                lineTo(5.1f, 16.336f)
                verticalLineToRelative(-6.45f)
                horizontalLineToRelative(2.43f)
                lineTo(7.53f, 7.665f)
                close()
                moveTo(7.945f, 7.664f)
                verticalLineToRelative(8.672f)
                horizontalLineToRelative(7.31f)
                verticalLineToRelative(-2.223f)
                horizontalLineToRelative(-4.638f)
                verticalLineToRelative(-1.08f)
                horizontalLineToRelative(4.637f)
                verticalLineToRelative(-2.066f)
                horizontalLineToRelative(-4.637f)
                verticalLineToRelative(-1.08f)
                horizontalLineToRelative(4.637f)
                lineTo(15.254f, 7.664f)
                close()
                moveTo(15.704f, 7.664f)
                verticalLineToRelative(8.672f)
                horizontalLineToRelative(3.863f)
                curveToRelative(3.024f, 0.0f, 4.433f, -1.688f, 4.433f, -4.349f)
                curveToRelative(0.0f, -2.185f, -1.021f, -4.323f, -3.912f, -4.323f)
                close()
                moveTo(18.376f, 9.887f)
                horizontalLineToRelative(0.85f)
                curveToRelative(1.931f, 0.0f, 2.102f, 1.518f, 2.102f, 2.063f)
                curveToRelative(0.0f, 0.815f, -0.243f, 2.163f, -1.907f, 2.163f)
                horizontalLineToRelative(-1.045f)
                close()
            }
        }
        .build()
        return _ted!!
    }

private var _ted: ImageVector? = null
