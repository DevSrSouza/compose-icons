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

public val SolidGroup.Trowel: ImageVector
    get() {
        if (_trowel != null) {
            return _trowel!!
        }
        _trowel = Builder(name = "Trowel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(343.9f, 213.4f)
                lineTo(245.3f, 312.0f)
                lineToRelative(65.4f, 65.4f)
                curveToRelative(7.9f, 7.9f, 11.1f, 19.4f, 8.4f, 30.3f)
                reflectiveCurveToRelative(-10.8f, 19.6f, -21.5f, 22.9f)
                lineToRelative(-256.0f, 80.0f)
                curveToRelative(-11.4f, 3.5f, -23.8f, 0.5f, -32.2f, -7.9f)
                reflectiveCurveTo(-2.1f, 481.8f, 1.5f, 470.5f)
                lineToRelative(80.0f, -256.0f)
                curveToRelative(3.3f, -10.7f, 12.0f, -18.9f, 22.9f, -21.5f)
                reflectiveCurveToRelative(22.4f, 0.5f, 30.3f, 8.4f)
                lineTo(200.0f, 266.7f)
                lineToRelative(98.6f, -98.6f)
                curveToRelative(-14.3f, -14.6f, -14.2f, -38.0f, 0.3f, -52.5f)
                lineToRelative(95.4f, -95.4f)
                curveToRelative(26.9f, -26.9f, 70.5f, -26.9f, 97.5f, 0.0f)
                reflectiveCurveToRelative(26.9f, 70.5f, 0.0f, 97.5f)
                lineToRelative(-95.4f, 95.4f)
                curveToRelative(-14.5f, 14.5f, -37.9f, 14.6f, -52.5f, 0.3f)
                close()
            }
        }
        .build()
        return _trowel!!
    }

private var _trowel: ImageVector? = null
