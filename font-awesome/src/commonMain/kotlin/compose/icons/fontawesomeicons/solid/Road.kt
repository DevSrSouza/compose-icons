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

public val SolidGroup.Road: ImageVector
    get() {
        if (_road != null) {
            return _road!!
        }
        _road = Builder(name = "Road", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                lineTo(181.2f, 32.0f)
                curveToRelative(-27.1f, 0.0f, -51.3f, 17.1f, -60.3f, 42.6f)
                lineTo(3.1f, 407.2f)
                curveTo(1.1f, 413.0f, 0.0f, 419.2f, 0.0f, 425.4f)
                curveTo(0.0f, 455.5f, 24.5f, 480.0f, 54.6f, 480.0f)
                lineTo(256.0f, 480.0f)
                lineTo(256.0f, 416.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                lineTo(521.4f, 480.0f)
                curveToRelative(30.2f, 0.0f, 54.6f, -24.5f, 54.6f, -54.6f)
                curveToRelative(0.0f, -6.2f, -1.1f, -12.4f, -3.1f, -18.2f)
                lineTo(455.1f, 74.6f)
                curveTo(446.0f, 49.1f, 421.9f, 32.0f, 394.8f, 32.0f)
                lineTo(320.0f, 32.0f)
                lineTo(320.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(256.0f, 32.0f)
                close()
                moveTo(320.0f, 224.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(256.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _road!!
    }

private var _road: ImageVector? = null
