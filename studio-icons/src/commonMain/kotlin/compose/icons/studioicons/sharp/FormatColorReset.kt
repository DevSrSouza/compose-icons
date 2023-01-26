package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FormatColorReset: ImageVector
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
                curveToRelative(0.0f, -3.98f, -6.0f, -10.8f, -6.0f, -10.8f)
                reflectiveCurveToRelative(-1.18f, 1.35f, -2.5f, 3.19f)
                lineToRelative(8.44f, 8.44f)
                curveToRelative(0.03f, -0.27f, 0.06f, -0.55f, 0.06f, -0.83f)
                close()
                moveTo(5.41f, 5.14f)
                lineTo(4.0f, 6.55f)
                lineToRelative(3.32f, 3.32f)
                curveTo(6.55f, 11.33f, 6.0f, 12.79f, 6.0f, 14.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.52f, 0.0f, 2.9f, -0.57f, 3.95f, -1.5f)
                lineToRelative(2.63f, 2.63f)
                lineTo(20.0f, 19.72f)
                lineTo(5.41f, 5.14f)
                close()
            }
        }
        .build()
        return _formatColorReset!!
    }

private var _formatColorReset: ImageVector? = null
