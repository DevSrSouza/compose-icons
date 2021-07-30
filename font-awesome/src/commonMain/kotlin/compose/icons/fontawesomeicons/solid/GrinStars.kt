package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.GrinStars: ImageVector
    get() {
        if (_grinStars != null) {
            return _grinStars!!
        }
        _grinStars = Builder(name = "GrinStars", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(94.6f, 168.9f)
                lineToRelative(34.9f, -5.0f)
                lineToRelative(15.5f, -31.6f)
                curveToRelative(2.9f, -5.8f, 11.0f, -5.8f, 13.9f, 0.0f)
                lineToRelative(15.5f, 31.6f)
                lineToRelative(34.9f, 5.0f)
                curveToRelative(6.2f, 1.0f, 8.9f, 8.6f, 4.3f, 13.2f)
                lineToRelative(-25.4f, 24.6f)
                lineToRelative(6.0f, 34.9f)
                curveToRelative(1.0f, 6.2f, -5.3f, 11.0f, -11.0f, 7.9f)
                lineTo(152.0f, 233.3f)
                lineToRelative(-31.3f, 16.3f)
                curveToRelative(-5.7f, 3.1f, -12.0f, -1.7f, -11.0f, -7.9f)
                lineToRelative(6.0f, -34.9f)
                lineToRelative(-25.4f, -24.6f)
                curveToRelative(-4.6f, -4.7f, -1.9f, -12.3f, 4.3f, -13.3f)
                close()
                moveTo(248.0f, 432.0f)
                curveToRelative(-60.6f, 0.0f, -134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2.0f, -11.8f, 9.3f, -21.5f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200.0f, 336.0f, 248.0f, 336.0f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.5f, -3.7f, 22.6f, 6.1f, 20.7f, 17.9f)
                curveToRelative(-9.3f, 55.0f, -83.2f, 93.3f, -143.8f, 93.3f)
                close()
                moveTo(405.7f, 182.1f)
                lineToRelative(-25.4f, 24.6f)
                lineToRelative(6.0f, 34.9f)
                curveToRelative(1.0f, 6.2f, -5.3f, 11.0f, -11.0f, 7.9f)
                lineTo(344.0f, 233.3f)
                lineToRelative(-31.3f, 16.3f)
                curveToRelative(-5.7f, 3.1f, -12.0f, -1.7f, -11.0f, -7.9f)
                lineToRelative(6.0f, -34.9f)
                lineToRelative(-25.4f, -24.6f)
                curveToRelative(-4.5f, -4.6f, -1.9f, -12.2f, 4.3f, -13.2f)
                lineToRelative(34.9f, -5.0f)
                lineToRelative(15.5f, -31.6f)
                curveToRelative(2.9f, -5.8f, 11.0f, -5.8f, 13.9f, 0.0f)
                lineToRelative(15.5f, 31.6f)
                lineToRelative(34.9f, 5.0f)
                curveToRelative(6.3f, 0.9f, 9.0f, 8.5f, 4.4f, 13.1f)
                close()
            }
        }
        .build()
        return _grinStars!!
    }

private var _grinStars: ImageVector? = null
