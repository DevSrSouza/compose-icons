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

public val SolidGroup.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 160.0f)
                curveToRelative(-52.9f, 0.0f, -96.0f, 43.1f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.1f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.1f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.1f, -96.0f, -96.0f, -96.0f)
                close()
                moveTo(502.4f, 240.5f)
                lineToRelative(-94.7f, -47.3f)
                lineToRelative(33.5f, -100.4f)
                curveToRelative(4.5f, -13.6f, -8.4f, -26.5f, -21.9f, -21.9f)
                lineToRelative(-100.4f, 33.5f)
                lineToRelative(-47.4f, -94.8f)
                curveToRelative(-6.4f, -12.8f, -24.6f, -12.8f, -31.0f, 0.0f)
                lineToRelative(-47.3f, 94.7f)
                lineTo(92.7f, 70.8f)
                curveToRelative(-13.6f, -4.5f, -26.5f, 8.4f, -21.9f, 21.9f)
                lineToRelative(33.5f, 100.4f)
                lineToRelative(-94.7f, 47.4f)
                curveToRelative(-12.8f, 6.4f, -12.8f, 24.6f, 0.0f, 31.0f)
                lineToRelative(94.7f, 47.3f)
                lineToRelative(-33.5f, 100.5f)
                curveToRelative(-4.5f, 13.6f, 8.4f, 26.5f, 21.9f, 21.9f)
                lineToRelative(100.4f, -33.5f)
                lineToRelative(47.3f, 94.7f)
                curveToRelative(6.4f, 12.8f, 24.6f, 12.8f, 31.0f, 0.0f)
                lineToRelative(47.3f, -94.7f)
                lineToRelative(100.4f, 33.5f)
                curveToRelative(13.6f, 4.5f, 26.5f, -8.4f, 21.9f, -21.9f)
                lineToRelative(-33.5f, -100.4f)
                lineToRelative(94.7f, -47.3f)
                curveToRelative(13.0f, -6.5f, 13.0f, -24.7f, 0.2f, -31.1f)
                close()
                moveTo(346.5f, 346.5f)
                curveToRelative(-49.9f, 49.9f, -131.1f, 49.9f, -181.0f, 0.0f)
                curveToRelative(-49.9f, -49.9f, -49.9f, -131.1f, 0.0f, -181.0f)
                curveToRelative(49.9f, -49.9f, 131.1f, -49.9f, 181.0f, 0.0f)
                curveToRelative(49.9f, 49.9f, 49.9f, 131.1f, 0.0f, 181.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
