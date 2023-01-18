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

public val RemixIcons.FootballFill: ImageVector
    get() {
        if (_footballFill != null) {
            return _footballFill!!
        }
        _footballFill = Builder(name = "FootballFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(13.67f, 16.0f)
                horizontalLineToRelative(-3.34f)
                lineToRelative(-1.38f, 1.897f)
                lineToRelative(0.554f, 1.706f)
                arcTo(7.993f, 7.993f, 0.0f, false, false, 12.0f, 20.0f)
                curveToRelative(0.871f, 0.0f, 1.71f, -0.14f, 2.496f, -0.397f)
                lineToRelative(0.553f, -1.706f)
                lineTo(13.669f, 16.0f)
                close()
                moveTo(5.294f, 10.872f)
                lineToRelative(-1.292f, 0.937f)
                lineTo(4.0f, 12.0f)
                curveToRelative(0.0f, 1.73f, 0.549f, 3.331f, 1.482f, 4.64f)
                horizontalLineToRelative(1.91f)
                lineToRelative(1.323f, -1.82f)
                lineToRelative(-1.028f, -3.17f)
                lineToRelative(-2.393f, -0.778f)
                close()
                moveTo(18.706f, 10.872f)
                lineToRelative(-2.393f, 0.778f)
                lineToRelative(-1.028f, 3.17f)
                lineToRelative(1.322f, 1.82f)
                horizontalLineToRelative(1.91f)
                arcTo(7.964f, 7.964f, 0.0f, false, false, 20.0f, 12.0f)
                lineToRelative(-0.003f, -0.191f)
                lineToRelative(-1.291f, -0.937f)
                close()
                moveTo(14.29f, 4.333f)
                lineTo(13.0f, 5.273f)
                lineTo(13.0f, 7.79f)
                lineToRelative(2.694f, 1.957f)
                lineToRelative(2.239f, -0.727f)
                lineToRelative(0.554f, -1.703f)
                arcToRelative(8.014f, 8.014f, 0.0f, false, false, -4.196f, -2.984f)
                close()
                moveTo(9.708f, 4.333f)
                arcToRelative(8.014f, 8.014f, 0.0f, false, false, -4.196f, 2.985f)
                lineToRelative(0.554f, 1.702f)
                lineToRelative(2.239f, 0.727f)
                lineTo(11.0f, 7.79f)
                lineTo(11.0f, 5.273f)
                lineToRelative(-1.291f, -0.94f)
                close()
            }
        }
        .build()
        return _footballFill!!
    }

private var _footballFill: ImageVector? = null
