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

public val SimpleIcons.Expedia: ImageVector
    get() {
        if (_expedia != null) {
            return _expedia!!
        }
        _expedia = Builder(name = "Expedia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.067f, 0.0f)
                lineTo(4.933f, 0.0f)
                arcTo(4.94f, 4.94f, 0.0f, false, false, 0.0f, 4.933f)
                verticalLineToRelative(14.134f)
                arcTo(4.932f, 4.932f, 0.0f, false, false, 4.933f, 24.0f)
                horizontalLineToRelative(14.134f)
                arcTo(4.932f, 4.932f, 0.0f, false, false, 24.0f, 19.067f)
                lineTo(24.0f, 4.933f)
                curveTo(24.01f, 2.213f, 21.797f, 0.0f, 19.067f, 0.0f)
                close()
                moveTo(7.336f, 19.341f)
                curveToRelative(0.0f, 0.19f, -0.148f, 0.337f, -0.337f, 0.337f)
                horizontalLineToRelative(-2.33f)
                arcToRelative(0.333f, 0.333f, 0.0f, false, true, -0.337f, -0.337f)
                verticalLineToRelative(-2.33f)
                curveToRelative(0.0f, -0.189f, 0.148f, -0.336f, 0.337f, -0.336f)
                lineTo(7.0f, 16.675f)
                curveToRelative(0.19f, 0.0f, 0.337f, 0.147f, 0.337f, 0.337f)
                close()
                moveTo(19.457f, 17.855f)
                lineTo(17.149f, 20.153f)
                curveToRelative(-0.169f, 0.168f, -0.422f, 0.053f, -0.422f, -0.2f)
                lineTo(16.727f, 9.57f)
                lineToRelative(-6.44f, 6.44f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, true, -0.421f, 0.17f)
                lineTo(8.169f, 16.18f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.338f, -0.338f)
                verticalLineToRelative(-1.697f)
                curveToRelative(0.0f, -0.2f, 0.053f, -0.316f, 0.169f, -0.422f)
                lineToRelative(6.44f, -6.44f)
                lineTo(4.058f, 7.283f)
                curveToRelative(-0.253f, 0.0f, -0.369f, -0.253f, -0.2f, -0.421f)
                lineToRelative(2.297f, -2.309f)
                curveToRelative(0.137f, -0.137f, 0.285f, -0.232f, 0.517f, -0.232f)
                lineTo(18.15f, 4.321f)
                curveToRelative(0.854f, 0.0f, 1.539f, 0.686f, 1.539f, 1.54f)
                verticalLineToRelative(11.478f)
                curveToRelative(-0.01f, 0.231f, -0.095f, 0.368f, -0.232f, 0.516f)
                close()
            }
        }
        .build()
        return _expedia!!
    }

private var _expedia: ImageVector? = null
