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

public val SolidGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(309.0f, 106.0f)
                curveToRelative(11.4f, -7.0f, 19.0f, -19.7f, 19.0f, -34.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 17.9f, -40.0f, 40.0f)
                curveToRelative(0.0f, 14.4f, 7.6f, 27.0f, 19.0f, 34.0f)
                lineTo(209.7f, 220.6f)
                curveToRelative(-9.1f, 18.2f, -32.7f, 23.4f, -48.6f, 10.7f)
                lineTo(72.0f, 160.0f)
                curveToRelative(5.0f, -6.7f, 8.0f, -15.0f, 8.0f, -24.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveTo(0.0f, 113.9f, 0.0f, 136.0f)
                reflectiveCurveToRelative(17.9f, 40.0f, 40.0f, 40.0f)
                curveToRelative(0.2f, 0.0f, 0.5f, 0.0f, 0.7f, 0.0f)
                lineTo(86.4f, 427.4f)
                curveToRelative(5.5f, 30.4f, 32.0f, 52.6f, 63.0f, 52.6f)
                horizontalLineTo(426.6f)
                curveToRelative(30.9f, 0.0f, 57.4f, -22.1f, 63.0f, -52.6f)
                lineTo(535.3f, 176.0f)
                curveToRelative(0.2f, 0.0f, 0.5f, 0.0f, 0.7f, 0.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                reflectiveCurveToRelative(-17.9f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 17.9f, -40.0f, 40.0f)
                curveToRelative(0.0f, 9.0f, 3.0f, 17.3f, 8.0f, 24.0f)
                lineToRelative(-89.1f, 71.3f)
                curveToRelative(-15.9f, 12.7f, -39.5f, 7.5f, -48.6f, -10.7f)
                lineTo(309.0f, 106.0f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
