package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.FormatColorReset: ImageVector
    get() {
        if (_formatColorReset != null) {
            return _formatColorReset!!
        }
        _formatColorReset = Builder(name = "FormatColorReset", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.0f)
                curveToRelative(0.0f, -4.0f, -6.0f, -10.8f, -6.0f, -10.8f)
                reflectiveCurveToRelative(-1.33f, 1.51f, -2.73f, 3.52f)
                lineToRelative(8.59f, 8.59f)
                curveToRelative(0.09f, -0.42f, 0.14f, -0.86f, 0.14f, -1.31f)
                close()
                moveTo(17.12f, 17.12f)
                lineTo(12.5f, 12.5f)
                lineTo(5.27f, 5.27f)
                lineTo(4.0f, 6.55f)
                lineToRelative(3.32f, 3.32f)
                curveTo(6.55f, 11.32f, 6.0f, 12.79f, 6.0f, 14.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.52f, 0.0f, 2.9f, -0.57f, 3.96f, -1.5f)
                lineToRelative(2.63f, 2.63f)
                lineToRelative(1.27f, -1.27f)
                lineToRelative(-2.74f, -2.74f)
                close()
            }
        }
        .build()
        return _formatColorReset!!
    }

private var _formatColorReset: ImageVector? = null
