package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.GoogleFill: ImageVector
    get() {
        if (_googleFill != null) {
            return _googleFill!!
        }
        _googleFill = Builder(name = "GoogleFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.064f, 7.51f)
                arcTo(9.996f, 9.996f, 0.0f, false, true, 12.0f, 2.0f)
                curveToRelative(2.695f, 0.0f, 4.959f, 0.99f, 6.69f, 2.605f)
                lineToRelative(-2.867f, 2.868f)
                curveTo(14.786f, 6.482f, 13.468f, 5.977f, 12.0f, 5.977f)
                curveToRelative(-2.605f, 0.0f, -4.81f, 1.76f, -5.595f, 4.123f)
                curveToRelative(-0.2f, 0.6f, -0.314f, 1.24f, -0.314f, 1.9f)
                curveToRelative(0.0f, 0.66f, 0.114f, 1.3f, 0.314f, 1.9f)
                curveToRelative(0.786f, 2.364f, 2.99f, 4.123f, 5.595f, 4.123f)
                curveToRelative(1.345f, 0.0f, 2.49f, -0.355f, 3.386f, -0.955f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 1.996f, -3.018f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-3.868f)
                horizontalLineToRelative(9.418f)
                curveToRelative(0.118f, 0.654f, 0.182f, 1.336f, 0.182f, 2.045f)
                curveToRelative(0.0f, 3.046f, -1.09f, 5.61f, -2.982f, 7.35f)
                curveTo(16.964f, 21.105f, 14.7f, 22.0f, 12.0f, 22.0f)
                arcTo(9.996f, 9.996f, 0.0f, false, true, 2.0f, 12.0f)
                curveToRelative(0.0f, -1.614f, 0.386f, -3.14f, 1.064f, -4.49f)
                close()
            }
        }
        .build()
        return _googleFill!!
    }

private var _googleFill: ImageVector? = null
