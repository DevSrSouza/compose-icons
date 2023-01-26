package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.MicOff: ImageVector
    get() {
        if (_micOff != null) {
            return _micOff!!
        }
        _micOff = Builder(name = "MicOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.7f)
                curveToRelative(-0.66f, 0.0f, -1.2f, 0.54f, -1.2f, 1.2f)
                verticalLineToRelative(1.51f)
                lineToRelative(2.39f, 2.39f)
                lineToRelative(0.01f, -3.9f)
                curveToRelative(0.0f, -0.66f, -0.54f, -1.2f, -1.2f, -1.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(0.0f, 0.58f, -0.1f, 1.13f, -0.27f, 1.64f)
                lineToRelative(1.27f, 1.27f)
                curveToRelative(0.44f, -0.88f, 0.7f, -1.87f, 0.7f, -2.91f)
                close()
                moveTo(4.41f, 2.86f)
                lineTo(3.0f, 4.27f)
                lineToRelative(6.0f, 6.0f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.23f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f)
                lineToRelative(1.66f, 1.66f)
                curveToRelative(-0.71f, 0.33f, -1.5f, 0.52f, -2.31f, 0.52f)
                curveToRelative(-2.76f, 0.0f, -5.3f, -2.1f, -5.3f, -5.1f)
                horizontalLineTo(5.0f)
                curveToRelative(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.28f)
                curveToRelative(0.91f, -0.13f, 1.77f, -0.45f, 2.55f, -0.9f)
                lineToRelative(4.2f, 4.2f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.41f, 2.86f)
                close()
                moveTo(10.8f, 4.9f)
                curveToRelative(0.0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f)
                reflectiveCurveToRelative(1.2f, 0.54f, 1.2f, 1.2f)
                lineToRelative(-0.01f, 3.91f)
                lineTo(15.0f, 10.6f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.54f, 0.0f, -2.79f, 1.16f, -2.96f, 2.65f)
                lineToRelative(1.76f, 1.76f)
                verticalLineTo(4.9f)
                close()
            }
        }
        .build()
        return _micOff!!
    }

private var _micOff: ImageVector? = null
