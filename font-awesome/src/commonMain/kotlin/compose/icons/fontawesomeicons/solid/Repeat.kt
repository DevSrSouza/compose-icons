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

public val SolidGroup.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat = Builder(name = "Repeat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 224.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                lineTo(320.0f, 128.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 12.9f, 7.8f, 24.6f, 19.8f, 29.6f)
                reflectiveCurveToRelative(25.7f, 2.2f, 34.9f, -6.9f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-9.2f, -9.2f, -22.9f, -11.9f, -34.9f, -6.9f)
                reflectiveCurveTo(320.0f, 19.1f, 320.0f, 32.0f)
                lineTo(320.0f, 64.0f)
                lineTo(160.0f, 64.0f)
                curveTo(71.6f, 64.0f, 0.0f, 135.6f, 0.0f, 224.0f)
                close()
                moveTo(512.0f, 288.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                lineTo(192.0f, 384.0f)
                lineTo(192.0f, 352.0f)
                curveToRelative(0.0f, -12.9f, -7.8f, -24.6f, -19.8f, -29.6f)
                reflectiveCurveToRelative(-25.7f, -2.2f, -34.9f, 6.9f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(9.2f, 9.2f, 22.9f, 11.9f, 34.9f, 6.9f)
                reflectiveCurveToRelative(19.8f, -16.6f, 19.8f, -29.6f)
                lineTo(192.0f, 448.0f)
                lineTo(352.0f, 448.0f)
                curveToRelative(88.4f, 0.0f, 160.0f, -71.6f, 160.0f, -160.0f)
                close()
            }
        }
        .build()
        return _repeat!!
    }

private var _repeat: ImageVector? = null
