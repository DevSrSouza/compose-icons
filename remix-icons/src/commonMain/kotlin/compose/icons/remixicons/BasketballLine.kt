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

public val RemixIcons.BasketballLine: ImageVector
    get() {
        if (_basketballLine != null) {
            return _basketballLine!!
        }
        _basketballLine = Builder(name = "BasketballLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.366f, 13.366f)
                lineToRelative(-3.469f, 6.01f)
                arcToRelative(8.053f, 8.053f, 0.0f, false, false, 4.459f, 0.51f)
                arcToRelative(9.937f, 9.937f, 0.0f, false, true, 0.784f, -5.494f)
                lineToRelative(-1.774f, -1.026f)
                close()
                moveTo(15.884f, 15.397f)
                arcToRelative(7.956f, 7.956f, 0.0f, false, false, -0.587f, 3.894f)
                arcToRelative(8.022f, 8.022f, 0.0f, false, false, 3.077f, -2.456f)
                lineToRelative(-2.49f, -1.438f)
                close()
                moveTo(8.859f, 11.342f)
                arcToRelative(9.95f, 9.95f, 0.0f, false, true, -4.365f, 3.428f)
                arcToRelative(8.01f, 8.01f, 0.0f, false, false, 2.671f, 3.604f)
                lineToRelative(3.469f, -6.008f)
                lineToRelative(-1.775f, -1.024f)
                close()
                moveTo(19.962f, 11.212f)
                lineToRelative(-0.258f, 0.12f)
                arcToRelative(7.947f, 7.947f, 0.0f, false, false, -2.82f, 2.333f)
                lineToRelative(2.492f, 1.439f)
                arcToRelative(7.975f, 7.975f, 0.0f, false, false, 0.586f, -3.893f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, 0.266f, 0.013f, 0.53f, 0.038f, 0.789f)
                arcToRelative(7.95f, 7.95f, 0.0f, false, false, 3.078f, -2.454f)
                lineTo(4.624f, 8.897f)
                arcTo(7.975f, 7.975f, 0.0f, false, false, 4.0f, 12.0f)
                close()
                moveTo(16.835f, 5.626f)
                lineToRelative(-3.469f, 6.008f)
                lineToRelative(1.775f, 1.025f)
                arcToRelative(9.95f, 9.95f, 0.0f, false, true, 4.366f, -3.43f)
                arcToRelative(8.015f, 8.015f, 0.0f, false, false, -2.419f, -3.402f)
                lineToRelative(-0.253f, -0.201f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-0.463f, 0.0f, -0.916f, 0.04f, -1.357f, 0.115f)
                arcToRelative(9.928f, 9.928f, 0.0f, false, true, -0.784f, 5.494f)
                lineToRelative(1.775f, 1.025f)
                lineToRelative(3.469f, -6.01f)
                arcTo(7.975f, 7.975f, 0.0f, false, false, 12.0f, 4.0f)
                close()
                moveTo(8.703f, 4.71f)
                lineToRelative(-0.191f, 0.088f)
                arcToRelative(8.033f, 8.033f, 0.0f, false, false, -2.886f, 2.367f)
                lineToRelative(2.49f, 1.438f)
                arcToRelative(7.956f, 7.956f, 0.0f, false, false, 0.587f, -3.893f)
                close()
            }
        }
        .build()
        return _basketballLine!!
    }

private var _basketballLine: ImageVector? = null
