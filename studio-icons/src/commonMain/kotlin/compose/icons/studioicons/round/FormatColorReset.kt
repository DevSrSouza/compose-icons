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

public val RoundGroup.FormatColorReset: ImageVector
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
                curveToRelative(0.0f, -3.09f, -3.6f, -7.88f, -5.23f, -9.87f)
                curveToRelative(-0.4f, -0.49f, -1.15f, -0.49f, -1.55f, 0.0f)
                curveToRelative(-0.46f, 0.57f, -1.08f, 1.36f, -1.73f, 2.27f)
                lineToRelative(8.44f, 8.44f)
                curveToRelative(0.04f, -0.28f, 0.07f, -0.56f, 0.07f, -0.84f)
                close()
                moveTo(19.29f, 19.01f)
                lineTo(6.12f, 5.84f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.61f, 2.61f)
                curveTo(6.55f, 11.33f, 6.0f, 12.79f, 6.0f, 14.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.52f, 0.0f, 2.9f, -0.57f, 3.95f, -1.5f)
                lineToRelative(1.92f, 1.92f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.01f, -1.41f)
                close()
            }
        }
        .build()
        return _formatColorReset!!
    }

private var _formatColorReset: ImageVector? = null
