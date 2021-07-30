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

public val SimpleIcons.Rte: ImageVector
    get() {
        if (_rte != null) {
            return _rte!!
        }
        _rte = Builder(name = "Rte", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.983f, 12.857f)
                lineTo(1.983f, 9.038f)
                reflectiveCurveToRelative(0.734f, -0.018f, 1.615f, -0.018f)
                curveToRelative(0.131f, 0.0f, 0.258f, 0.01f, 0.373f, 0.016f)
                curveToRelative(1.41f, 0.115f, 1.992f, 0.883f, 1.992f, 1.807f)
                curveToRelative(0.0f, 1.036f, -0.82f, 1.819f, -1.992f, 1.986f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.474f, 0.028f)
                close()
                moveTo(4.823f, 14.101f)
                curveToRelative(1.736f, -0.168f, 3.197f, -1.446f, 3.197f, -3.102f)
                curveToRelative(0.0f, -1.763f, -1.018f, -3.324f, -4.049f, -3.45f)
                arcToRelative(9.497f, 9.497f, 0.0f, false, false, -0.393f, -0.01f)
                curveToRelative(-2.098f, 0.0f, -3.537f, 0.1f, -3.537f, 0.1f)
                reflectiveCurveToRelative(0.097f, 1.035f, 0.097f, 1.558f)
                verticalLineToRelative(7.624f)
                curveTo(0.138f, 17.522f, 0.0f, 18.26f, 0.0f, 18.26f)
                horizontalLineToRelative(2.118f)
                reflectiveCurveToRelative(-0.135f, -0.737f, -0.135f, -1.577f)
                verticalLineToRelative(-3.101f)
                lineToRelative(1.988f, 2.08f)
                lineToRelative(1.006f, 1.043f)
                curveToRelative(0.62f, 0.677f, 1.702f, 1.555f, 1.702f, 1.555f)
                horizontalLineToRelative(2.8f)
                reflectiveCurveToRelative(-1.253f, -0.878f, -1.835f, -1.438f)
                close()
                moveTo(23.878f, 6.903f)
                arcToRelative(8.123f, 8.123f, 0.0f, false, false, -2.036f, -0.284f)
                curveToRelative(-1.784f, 0.0f, -3.321f, 0.541f, -4.603f, 1.682f)
                lineToRelative(0.02f, -1.261f)
                curveToRelative(1.36f, -0.925f, 2.9f, -1.34f, 4.583f, -1.34f)
                curveToRelative(0.738f, 0.0f, 1.378f, 0.1f, 2.056f, 0.276f)
                lineToRelative(-0.02f, 0.927f)
                moveTo(11.282f, 18.259f)
                reflectiveCurveToRelative(0.117f, -0.778f, 0.117f, -1.458f)
                lineTo(11.399f, 9.402f)
                horizontalLineToRelative(-0.501f)
                curveToRelative(-0.68f, 0.0f, -1.736f, 0.0f, -2.516f, 0.077f)
                lineToRelative(-0.066f, -1.718f)
                horizontalLineToRelative(8.124f)
                lineToRelative(-0.041f, 1.718f)
                curveToRelative(-0.802f, -0.077f, -1.838f, -0.077f, -2.539f, -0.077f)
                horizontalLineToRelative(-0.617f)
                verticalLineToRelative(7.399f)
                curveToRelative(0.0f, 0.68f, 0.136f, 1.458f, 0.136f, 1.458f)
                horizontalLineToRelative(-2.097f)
                moveToRelative(10.419f, -1.524f)
                curveToRelative(-1.838f, 0.0f, -3.386f, -1.315f, -3.666f, -3.175f)
                horizontalLineToRelative(3.482f)
                curveToRelative(0.385f, 0.0f, 1.222f, 0.082f, 1.222f, 0.082f)
                lineTo(22.739f, 12.1f)
                reflectiveCurveToRelative(-0.822f, 0.061f, -1.28f, 0.061f)
                horizontalLineToRelative(-3.424f)
                curveToRelative(0.347f, -1.822f, 1.845f, -3.08f, 3.666f, -3.08f)
                curveToRelative(0.96f, 0.0f, 2.139f, 0.438f, 2.139f, 0.438f)
                lineToRelative(0.023f, -1.622f)
                reflectiveCurveToRelative(-0.84f, -0.318f, -2.162f, -0.318f)
                curveToRelative(-3.063f, 0.0f, -5.741f, 2.34f, -5.741f, 5.32f)
                curveToRelative(0.0f, 3.223f, 2.678f, 5.4f, 5.74f, 5.4f)
                curveToRelative(1.44f, 0.0f, 2.3f, -0.384f, 2.3f, -0.384f)
                lineToRelative(-0.04f, -1.676f)
                curveToRelative(-0.001f, 0.0f, -1.062f, 0.496f, -2.26f, 0.496f)
                close()
            }
        }
        .build()
        return _rte!!
    }

private var _rte: ImageVector? = null
