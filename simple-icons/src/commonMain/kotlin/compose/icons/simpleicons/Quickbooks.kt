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

public val SimpleIcons.Quickbooks: ImageVector
    get() {
        if (_quickbooks != null) {
            return _quickbooks!!
        }
        _quickbooks = Builder(name = "Quickbooks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.642f, 4.134f)
                curveToRelative(0.955f, 0.0f, 1.73f, 0.776f, 1.73f, 1.733f)
                verticalLineToRelative(9.067f)
                horizontalLineToRelative(1.6f)
                curveToRelative(1.614f, 0.0f, 2.928f, -1.316f, 2.928f, -2.933f)
                curveToRelative(0.0f, -1.617f, -1.314f, -2.933f, -2.928f, -2.933f)
                horizontalLineToRelative(-0.665f)
                lineTo(15.306f, 7.333f)
                horizontalLineToRelative(0.665f)
                curveToRelative(2.572f, 0.0f, 4.658f, 2.09f, 4.658f, 4.667f)
                curveToRelative(0.0f, 2.577f, -2.086f, 4.667f, -4.658f, 4.667f)
                lineTo(12.642f, 16.667f)
                close()
                moveTo(7.984f, 7.333f)
                horizontalLineToRelative(3.329f)
                verticalLineToRelative(12.533f)
                curveToRelative(-0.956f, 0.0f, -1.73f, -0.776f, -1.73f, -1.733f)
                lineTo(9.583f, 9.066f)
                lineTo(7.984f, 9.066f)
                curveToRelative(-1.615f, 0.0f, -2.928f, 1.316f, -2.928f, 2.933f)
                curveToRelative(0.0f, 1.617f, 1.313f, 2.933f, 2.928f, 2.933f)
                horizontalLineToRelative(0.665f)
                verticalLineToRelative(1.733f)
                horizontalLineToRelative(-0.665f)
                curveToRelative(-2.572f, 0.0f, -4.658f, -2.089f, -4.658f, -4.667f)
                curveToRelative(0.0f, -2.577f, 2.085f, -4.667f, 4.658f, -4.667f)
                close()
            }
        }
        .build()
        return _quickbooks!!
    }

private var _quickbooks: ImageVector? = null
