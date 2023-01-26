package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.FormatClear: ImageVector
    get() {
        if (_formatClear != null) {
            return _formatClear!!
        }
        _formatClear = Builder(name = "FormatClear", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 8.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(19.33f, 5.0f, 18.5f, 5.0f)
                lineTo(6.39f, 5.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(1.83f)
                lineToRelative(-0.55f, 1.28f)
                lineToRelative(2.09f, 2.09f)
                lineTo(14.21f, 8.0f)
                horizontalLineToRelative(4.29f)
                close()
                moveTo(17.44f, 18.88f)
                lineTo(4.12f, 5.56f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(6.26f, 6.26f)
                lineToRelative(-1.65f, 3.84f)
                curveToRelative(-0.39f, 0.92f, 0.28f, 1.93f, 1.27f, 1.93f)
                curveToRelative(0.55f, 0.0f, 1.05f, -0.33f, 1.27f, -0.84f)
                lineToRelative(1.21f, -2.83f)
                lineToRelative(4.95f, 4.95f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.4f, -0.38f, 0.4f, -1.01f, 0.01f, -1.4f)
                close()
            }
        }
        .build()
        return _formatClear!!
    }

private var _formatClear: ImageVector? = null
