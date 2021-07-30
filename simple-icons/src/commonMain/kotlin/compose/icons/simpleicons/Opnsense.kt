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

public val SimpleIcons.Opnsense: ImageVector
    get() {
        if (_opnsense != null) {
            return _opnsense!!
        }
        _opnsense = Builder(name = "Opnsense", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.419f, 11.08f)
                horizontalLineToRelative(5.259f)
                verticalLineToRelative(1.847f)
                horizontalLineToRelative(-5.254f)
                lineToRelative(1.66f, 0.885f)
                verticalLineToRelative(1.847f)
                lineToRelative(-5.111f, -2.732f)
                horizontalLineToRelative(-0.005f)
                lineTo(14.968f, 11.08f)
                lineToRelative(5.111f, -2.737f)
                verticalLineToRelative(1.847f)
                lineToRelative(-1.66f, 0.89f)
                close()
                moveTo(18.424f, 16.62f)
                lineToRelative(5.255f, 2.808f)
                verticalLineToRelative(1.841f)
                curveToRelative(0.01f, 1.453f, -1.176f, 2.744f, -2.655f, 2.731f)
                lineTo(0.322f, 24.0f)
                verticalLineToRelative(-4.573f)
                lineToRelative(5.252f, -2.808f)
                lineTo(2.119f, 16.619f)
                verticalLineToRelative(-1.847f)
                horizontalLineToRelative(1.297f)
                verticalLineToRelative(1.719f)
                lineToRelative(3.216f, -1.719f)
                horizontalLineToRelative(2.395f)
                verticalLineToRelative(1.846f)
                lineToRelative(-3.453f, 1.847f)
                horizontalLineToRelative(12.85f)
                lineToRelative(-3.455f, -1.847f)
                verticalLineToRelative(-1.846f)
                horizontalLineToRelative(2.4f)
                lineToRelative(3.216f, 1.719f)
                verticalLineToRelative(-1.719f)
                horizontalLineToRelative(1.297f)
                verticalLineToRelative(1.847f)
                horizontalLineToRelative(-3.458f)
                close()
                moveTo(3.949f, 20.307f)
                verticalLineToRelative(-0.972f)
                lineToRelative(-1.83f, 0.979f)
                verticalLineToRelative(1.84f)
                horizontalLineToRelative(18.905f)
                curveToRelative(0.481f, -0.004f, 0.848f, -0.393f, 0.857f, -0.879f)
                verticalLineToRelative(-0.96f)
                lineToRelative(-1.764f, -0.943f)
                verticalLineToRelative(0.936f)
                lineTo(3.949f, 20.308f)
                close()
                moveTo(3.916f, 13.811f)
                verticalLineToRelative(1.847f)
                lineToRelative(5.111f, -2.732f)
                lineTo(9.027f, 11.08f)
                lineTo(3.916f, 8.343f)
                verticalLineToRelative(1.847f)
                lineToRelative(1.665f, 0.89f)
                lineTo(0.322f, 11.08f)
                verticalLineToRelative(1.847f)
                horizontalLineToRelative(5.254f)
                lineToRelative(-1.66f, 0.884f)
                close()
                moveTo(23.679f, 0.0f)
                verticalLineToRelative(4.572f)
                lineTo(18.42f, 7.386f)
                horizontalLineToRelative(3.462f)
                verticalLineToRelative(1.847f)
                horizontalLineToRelative(-1.303f)
                lineTo(20.579f, 7.508f)
                lineToRelative(-3.222f, 1.725f)
                horizontalLineToRelative(-2.39f)
                lineTo(14.967f, 7.386f)
                lineToRelative(3.451f, -1.847f)
                lineTo(5.578f, 5.539f)
                lineToRelative(3.449f, 1.847f)
                verticalLineToRelative(1.847f)
                lineTo(6.638f, 9.233f)
                lineTo(3.416f, 7.508f)
                verticalLineToRelative(1.725f)
                lineTo(2.119f, 9.233f)
                lineTo(2.119f, 7.386f)
                horizontalLineToRelative(3.459f)
                lineTo(0.322f, 4.572f)
                lineTo(0.322f, 2.731f)
                curveTo(0.3f, 1.291f, 1.495f, -0.012f, 2.976f, 0.0f)
                horizontalLineToRelative(20.703f)
                close()
                moveTo(21.881f, 1.846f)
                lineTo(2.976f, 1.846f)
                curveToRelative(-0.488f, 0.009f, -0.847f, 0.394f, -0.857f, 0.88f)
                verticalLineToRelative(0.962f)
                lineToRelative(1.797f, 0.962f)
                verticalLineToRelative(-0.957f)
                horizontalLineToRelative(16.168f)
                verticalLineToRelative(0.956f)
                lineToRelative(1.797f, -0.962f)
                lineTo(21.881f, 1.846f)
                close()
            }
        }
        .build()
        return _opnsense!!
    }

private var _opnsense: ImageVector? = null
