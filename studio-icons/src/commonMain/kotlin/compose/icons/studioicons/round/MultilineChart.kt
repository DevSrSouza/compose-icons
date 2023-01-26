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

public val RoundGroup.MultilineChart: ImageVector
    get() {
        if (_multilineChart != null) {
            return _multilineChart!!
        }
        _multilineChart = Builder(name = "MultilineChart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.36f, 6.28f)
                lineToRelative(-0.06f, -0.06f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.37f, -1.39f, 0.04f)
                lineToRelative(-2.18f, 2.45f)
                curveTo(15.68f, 6.4f, 12.83f, 5.0f, 9.61f, 5.0f)
                curveToRelative(-2.5f, 0.0f, -4.83f, 0.87f, -6.75f, 2.3f)
                curveToRelative(-0.47f, 0.35f, -0.52f, 1.04f, -0.11f, 1.45f)
                lineToRelative(0.06f, 0.06f)
                curveToRelative(0.33f, 0.33f, 0.86f, 0.39f, 1.23f, 0.11f)
                curveTo(5.63f, 7.72f, 7.54f, 7.0f, 9.61f, 7.0f)
                curveToRelative(2.74f, 0.0f, 5.09f, 1.26f, 6.77f, 3.24f)
                lineToRelative(-2.88f, 3.24f)
                lineToRelative(-3.29f, -3.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-6.12f, 6.13f)
                curveToRelative(-0.37f, 0.37f, -0.37f, 0.98f, 0.0f, 1.35f)
                lineToRelative(0.15f, 0.15f)
                curveToRelative(0.37f, 0.37f, 0.98f, 0.37f, 1.35f, 0.0f)
                lineToRelative(5.32f, -5.33f)
                lineToRelative(3.25f, 3.25f)
                curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f)
                lineToRelative(3.35f, -3.76f)
                curveToRelative(0.62f, 1.12f, 1.08f, 2.39f, 1.32f, 3.73f)
                curveToRelative(0.08f, 0.47f, 0.47f, 0.82f, 0.95f, 0.82f)
                horizontalLineToRelative(0.09f)
                curveToRelative(0.6f, 0.0f, 1.05f, -0.55f, 0.94f, -1.14f)
                curveToRelative(-0.32f, -1.85f, -0.98f, -3.54f, -1.89f, -5.0f)
                lineTo(21.4f, 7.6f)
                curveToRelative(0.34f, -0.38f, 0.32f, -0.96f, -0.04f, -1.32f)
                close()
            }
        }
        .build()
        return _multilineChart!!
    }

private var _multilineChart: ImageVector? = null
