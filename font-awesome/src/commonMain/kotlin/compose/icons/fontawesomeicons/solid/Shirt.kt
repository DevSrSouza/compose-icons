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

public val SolidGroup.Shirt: ImageVector
    get() {
        if (_shirt != null) {
            return _shirt!!
        }
        _shirt = Builder(name = "Shirt", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.8f, 0.0f)
                curveToRelative(7.8f, 0.0f, 14.3f, 5.7f, 16.7f, 13.2f)
                curveTo(240.8f, 51.9f, 277.1f, 80.0f, 320.0f, 80.0f)
                reflectiveCurveToRelative(79.2f, -28.1f, 91.5f, -66.8f)
                curveTo(413.9f, 5.7f, 420.4f, 0.0f, 428.2f, 0.0f)
                horizontalLineToRelative(12.6f)
                curveToRelative(22.5f, 0.0f, 44.2f, 7.9f, 61.5f, 22.3f)
                lineTo(628.5f, 127.4f)
                curveToRelative(6.6f, 5.5f, 10.7f, 13.5f, 11.4f, 22.1f)
                reflectiveCurveToRelative(-2.1f, 17.1f, -7.8f, 23.6f)
                lineToRelative(-56.0f, 64.0f)
                curveToRelative(-11.4f, 13.1f, -31.2f, 14.6f, -44.6f, 3.5f)
                lineTo(480.0f, 197.7f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                horizontalLineTo(224.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(197.7f)
                lineToRelative(-51.5f, 42.9f)
                curveToRelative(-13.3f, 11.1f, -33.1f, 9.6f, -44.6f, -3.5f)
                lineToRelative(-56.0f, -64.0f)
                curveToRelative(-5.7f, -6.5f, -8.5f, -15.0f, -7.8f, -23.6f)
                reflectiveCurveToRelative(4.8f, -16.6f, 11.4f, -22.1f)
                lineTo(137.7f, 22.3f)
                curveTo(155.0f, 7.9f, 176.7f, 0.0f, 199.2f, 0.0f)
                horizontalLineToRelative(12.6f)
                close()
            }
        }
        .build()
        return _shirt!!
    }

private var _shirt: ImageVector? = null
