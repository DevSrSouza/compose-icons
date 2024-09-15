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

public val SolidGroup.ExclamationTriangle: ImageVector
    get() {
        if (_exclamationTriangle != null) {
            return _exclamationTriangle!!
        }
        _exclamationTriangle = Builder(name = "ExclamationTriangle", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(569.52f, 440.01f)
                curveTo(587.97f, 472.01f, 564.81f, 512.0f, 527.94f, 512.0f)
                lineTo(48.05f, 512.0f)
                curveToRelative(-36.94f, 0.0f, -60.0f, -40.06f, -41.58f, -71.99f)
                lineTo(246.42f, 23.99f)
                curveToRelative(18.47f, -32.01f, 64.72f, -31.95f, 83.15f, 0.0f)
                lineToRelative(239.94f, 416.03f)
                close()
                moveTo(288.0f, 354.0f)
                curveToRelative(-25.41f, 0.0f, -46.0f, 20.59f, -46.0f, 46.0f)
                reflectiveCurveToRelative(20.59f, 46.0f, 46.0f, 46.0f)
                reflectiveCurveToRelative(46.0f, -20.59f, 46.0f, -46.0f)
                reflectiveCurveToRelative(-20.59f, -46.0f, -46.0f, -46.0f)
                close()
                moveTo(244.33f, 188.65f)
                lineToRelative(7.42f, 136.0f)
                curveToRelative(0.35f, 6.36f, 5.61f, 11.35f, 11.98f, 11.35f)
                horizontalLineToRelative(48.55f)
                curveToRelative(6.37f, 0.0f, 11.64f, -4.98f, 11.98f, -11.35f)
                lineToRelative(7.42f, -136.0f)
                curveToRelative(0.38f, -6.87f, -5.1f, -12.65f, -11.98f, -12.65f)
                horizontalLineToRelative(-63.38f)
                curveToRelative(-6.88f, 0.0f, -12.36f, 5.78f, -11.98f, 12.65f)
                close()
            }
        }
        .build()
        return _exclamationTriangle!!
    }

private var _exclamationTriangle: ImageVector? = null
