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

public val SolidGroup.StepForward: ImageVector
    get() {
        if (_stepForward != null) {
            return _stepForward!!
        }
        _stepForward = Builder(name = "StepForward", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 44.0f)
                verticalLineToRelative(424.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineTo(291.6f)
                lineToRelative(-195.5f, 181.0f)
                curveTo(95.9f, 489.7f, 64.0f, 475.4f, 64.0f, 448.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -27.4f, 31.9f, -41.7f, 52.5f, -24.6f)
                lineTo(312.0f, 219.3f)
                verticalLineTo(44.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _stepForward!!
    }

private var _stepForward: ImageVector? = null
