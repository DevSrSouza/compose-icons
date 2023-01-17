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

public val SolidGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.5f, 440.6f)
                curveToRelative(-9.5f, 7.9f, -22.8f, 9.7f, -34.1f, 4.4f)
                reflectiveCurveTo(0.0f, 428.4f, 0.0f, 416.0f)
                verticalLineTo(96.0f)
                curveTo(0.0f, 83.6f, 7.2f, 72.3f, 18.4f, 67.0f)
                reflectiveCurveToRelative(24.5f, -3.6f, 34.1f, 4.4f)
                lineTo(224.0f, 214.3f)
                verticalLineTo(256.0f)
                verticalLineToRelative(41.7f)
                lineTo(52.5f, 440.6f)
                close()
                moveTo(256.0f, 352.0f)
                verticalLineTo(256.0f)
                verticalLineTo(128.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -12.4f, 7.2f, -23.7f, 18.4f, -29.0f)
                reflectiveCurveToRelative(24.5f, -3.6f, 34.1f, 4.4f)
                lineToRelative(192.0f, 160.0f)
                curveToRelative(7.3f, 6.1f, 11.5f, 15.1f, 11.5f, 24.6f)
                reflectiveCurveToRelative(-4.2f, 18.5f, -11.5f, 24.6f)
                lineToRelative(-192.0f, 160.0f)
                curveToRelative(-9.5f, 7.9f, -22.8f, 9.7f, -34.1f, 4.4f)
                reflectiveCurveToRelative(-18.4f, -16.6f, -18.4f, -29.0f)
                verticalLineTo(352.0f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
