package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Tape: ImageVector
    get() {
        if (_tape != null) {
            return _tape!!
        }
        _tape = Builder(name = "Tape", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 192.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(624.0f, 416.0f)
                lineTo(380.6f, 416.0f)
                curveToRelative(41.5f, -40.7f, 67.4f, -97.3f, 67.4f, -160.0f)
                curveToRelative(0.0f, -123.7f, -100.3f, -224.0f, -224.0f, -224.0f)
                reflectiveCurveTo(0.0f, 132.3f, 0.0f, 256.0f)
                reflectiveCurveToRelative(100.3f, 224.0f, 224.0f, 224.0f)
                horizontalLineToRelative(400.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(224.0f, 352.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(43.0f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 43.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(-43.0f, 96.0f, -96.0f, 96.0f)
                close()
            }
        }
        .build()
        return _tape!!
    }

private var _tape: ImageVector? = null
