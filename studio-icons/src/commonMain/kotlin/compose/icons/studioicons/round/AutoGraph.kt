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

public val RoundGroup.AutoGraph: ImageVector
    get() {
        if (_autoGraph != null) {
            return _autoGraph!!
        }
        _autoGraph = Builder(name = "AutoGraph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.06f, 9.94f)
                lineTo(13.0f, 9.45f)
                curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f)
                lineToRelative(1.06f, -0.49f)
                lineTo(14.55f, 7.0f)
                curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f)
                lineToRelative(0.49f, 1.06f)
                lineTo(17.0f, 8.55f)
                curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f)
                lineToRelative(-1.06f, 0.49f)
                lineTo(15.45f, 11.0f)
                curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0.0f)
                lineTo(14.06f, 9.94f)
                close()
                moveTo(4.45f, 13.0f)
                lineToRelative(0.49f, -1.06f)
                lineTo(6.0f, 11.45f)
                curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f)
                lineToRelative(-1.06f, -0.49f)
                lineTo(4.45f, 9.0f)
                curveTo(4.28f, 8.61f, 3.72f, 8.61f, 3.55f, 9.0f)
                lineToRelative(-0.49f, 1.06f)
                lineTo(2.0f, 10.55f)
                curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f)
                lineToRelative(1.06f, 0.49f)
                lineTo(3.55f, 13.0f)
                curveTo(3.72f, 13.39f, 4.28f, 13.39f, 4.45f, 13.0f)
                close()
                moveTo(8.96f, 7.99f)
                lineToRelative(0.63f, -1.4f)
                lineToRelative(1.4f, -0.63f)
                curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f)
                lineToRelative(-1.4f, -0.63f)
                lineToRelative(-0.63f, -1.4f)
                curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f)
                lineToRelative(-0.63f, 1.4f)
                lineToRelative(-1.4f, 0.63f)
                curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f)
                lineToRelative(1.4f, 0.63f)
                lineToRelative(0.63f, 1.4f)
                curveTo(8.22f, 8.38f, 8.78f, 8.38f, 8.96f, 7.99f)
                close()
                moveTo(22.34f, 8.27f)
                curveToRelative(-0.4f, -0.4f, -1.07f, -0.39f, -1.45f, 0.04f)
                lineToRelative(-6.39f, 7.18f)
                lineToRelative(-3.29f, -3.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-6.04f, 6.05f)
                curveToRelative(-0.41f, 0.41f, -0.41f, 1.09f, 0.0f, 1.5f)
                curveToRelative(0.41f, 0.41f, 1.09f, 0.41f, 1.5f, 0.0f)
                lineToRelative(5.25f, -5.26f)
                lineToRelative(3.25f, 3.25f)
                curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f)
                lineToRelative(7.17f, -8.07f)
                curveTo(22.73f, 9.24f, 22.71f, 8.64f, 22.34f, 8.27f)
                close()
            }
        }
        .build()
        return _autoGraph!!
    }

private var _autoGraph: ImageVector? = null
