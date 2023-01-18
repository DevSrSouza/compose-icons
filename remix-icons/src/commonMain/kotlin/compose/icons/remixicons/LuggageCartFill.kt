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

public val RemixIcons.LuggageCartFill: ImageVector
    get() {
        if (_luggageCartFill != null) {
            return _luggageCartFill!!
        }
        _luggageCartFill = Builder(name = "LuggageCartFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 20.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveTo(6.328f, 23.0f, 5.5f, 23.0f)
                reflectiveCurveTo(4.0f, 22.328f, 4.0f, 21.5f)
                reflectiveCurveTo(4.672f, 20.0f, 5.5f, 20.0f)
                close()
                moveTo(18.5f, 20.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(2.172f, 1.757f)
                lineToRelative(3.827f, 3.828f)
                lineTo(5.999f, 17.0f)
                lineTo(20.0f, 17.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 19.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(4.0f, 6.413f)
                lineTo(0.756f, 3.172f)
                lineToRelative(1.415f, -1.415f)
                close()
                moveTo(16.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.993f)
                curveTo(20.55f, 6.0f, 21.0f, 6.456f, 21.0f, 6.995f)
                verticalLineToRelative(8.01f)
                curveToRelative(0.0f, 0.55f, -0.45f, 0.995f, -1.007f, 0.995f)
                lineTo(8.007f, 16.0f)
                curveTo(7.45f, 16.0f, 7.0f, 15.544f, 7.0f, 15.005f)
                verticalLineToRelative(-8.01f)
                curveTo(7.0f, 6.445f, 7.45f, 6.0f, 8.007f, 6.0f)
                horizontalLineToRelative(2.992f)
                lineTo(11.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 8.0f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(18.0f, 8.0f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 5.0f)
                close()
            }
        }
        .build()
        return _luggageCartFill!!
    }

private var _luggageCartFill: ImageVector? = null
