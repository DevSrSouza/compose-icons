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

public val SolidGroup.StepBackward: ImageVector
    get() {
        if (_stepBackward != null) {
            return _stepBackward!!
        }
        _stepBackward = Builder(name = "StepBackward", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 468.0f)
                verticalLineTo(44.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                verticalLineToRelative(176.4f)
                lineToRelative(195.5f, -181.0f)
                curveTo(352.1f, 22.3f, 384.0f, 36.6f, 384.0f, 64.0f)
                verticalLineToRelative(384.0f)
                curveToRelative(0.0f, 27.4f, -31.9f, 41.7f, -52.5f, 24.6f)
                lineTo(136.0f, 292.7f)
                verticalLineTo(468.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineTo(76.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _stepBackward!!
    }

private var _stepBackward: ImageVector? = null
