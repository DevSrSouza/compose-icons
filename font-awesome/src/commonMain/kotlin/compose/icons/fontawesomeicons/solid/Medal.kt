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

public val SolidGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                horizontalLineTo(144.0f)
                curveToRelative(5.3f, 0.0f, 10.3f, 2.7f, 13.3f, 7.1f)
                lineToRelative(81.1f, 121.6f)
                curveToRelative(-49.5f, 4.1f, -94.0f, 25.6f, -127.6f, 58.3f)
                lineTo(2.7f, 24.9f)
                curveTo(-0.6f, 20.0f, -0.9f, 13.7f, 1.9f, 8.5f)
                reflectiveCurveTo(10.1f, 0.0f, 16.0f, 0.0f)
                close()
                moveTo(509.3f, 24.9f)
                lineTo(401.2f, 187.1f)
                curveToRelative(-33.5f, -32.7f, -78.1f, -54.2f, -127.6f, -58.3f)
                lineTo(354.7f, 7.1f)
                curveToRelative(3.0f, -4.5f, 8.0f, -7.1f, 13.3f, -7.1f)
                horizontalLineTo(496.0f)
                curveToRelative(5.9f, 0.0f, 11.3f, 3.2f, 14.1f, 8.5f)
                reflectiveCurveToRelative(2.5f, 11.5f, -0.8f, 16.4f)
                close()
                moveTo(432.0f, 336.0f)
                curveToRelative(0.0f, 97.2f, -78.8f, 176.0f, -176.0f, 176.0f)
                reflectiveCurveToRelative(-176.0f, -78.8f, -176.0f, -176.0f)
                reflectiveCurveToRelative(78.8f, -176.0f, 176.0f, -176.0f)
                reflectiveCurveToRelative(176.0f, 78.8f, 176.0f, 176.0f)
                close()
                moveTo(264.4f, 241.1f)
                curveToRelative(-3.4f, -7.0f, -13.3f, -7.0f, -16.8f, 0.0f)
                lineToRelative(-22.4f, 45.4f)
                curveToRelative(-1.4f, 2.8f, -4.0f, 4.7f, -7.0f, 5.1f)
                lineTo(168.0f, 298.9f)
                curveToRelative(-7.7f, 1.1f, -10.7f, 10.5f, -5.2f, 16.0f)
                lineToRelative(36.3f, 35.4f)
                curveToRelative(2.2f, 2.2f, 3.2f, 5.2f, 2.7f, 8.3f)
                lineToRelative(-8.6f, 49.9f)
                curveToRelative(-1.3f, 7.6f, 6.7f, 13.5f, 13.6f, 9.9f)
                lineToRelative(44.8f, -23.6f)
                curveToRelative(2.7f, -1.4f, 6.0f, -1.4f, 8.7f, 0.0f)
                lineToRelative(44.8f, 23.6f)
                curveToRelative(6.9f, 3.6f, 14.9f, -2.2f, 13.6f, -9.9f)
                lineToRelative(-8.6f, -49.9f)
                curveToRelative(-0.5f, -3.0f, 0.5f, -6.1f, 2.7f, -8.3f)
                lineToRelative(36.3f, -35.4f)
                curveToRelative(5.6f, -5.4f, 2.5f, -14.8f, -5.2f, -16.0f)
                lineToRelative(-50.1f, -7.3f)
                curveToRelative(-3.0f, -0.4f, -5.7f, -2.4f, -7.0f, -5.1f)
                lineToRelative(-22.4f, -45.4f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
