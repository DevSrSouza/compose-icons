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

public val RoundGroup.PsychologyAlt: ImageVector
    get() {
        if (_psychologyAlt != null) {
            return _psychologyAlt!!
        }
        _psychologyAlt = Builder(name = "PsychologyAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.94f, 9.06f)
                curveTo(19.5f, 5.73f, 16.57f, 3.0f, 13.0f, 3.0f)
                curveTo(9.47f, 3.0f, 6.57f, 5.61f, 6.08f, 9.0f)
                lineToRelative(-1.93f, 3.48f)
                curveTo(3.74f, 13.14f, 4.22f, 14.0f, 5.0f, 14.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineToRelative(0.0f, -3.68f)
                curveTo(18.62f, 15.07f, 20.35f, 12.24f, 19.94f, 9.06f)
                close()
                moveTo(12.5f, 14.0f)
                curveToRelative(-0.41f, 0.0f, -0.74f, -0.33f, -0.74f, -0.74f)
                curveToRelative(0.0f, -0.41f, 0.33f, -0.73f, 0.74f, -0.73f)
                curveToRelative(0.41f, 0.0f, 0.73f, 0.32f, 0.73f, 0.73f)
                curveTo(13.23f, 13.67f, 12.92f, 14.0f, 12.5f, 14.0f)
                close()
                moveTo(14.26f, 9.68f)
                curveToRelative(-0.44f, 0.65f, -0.86f, 0.85f, -1.09f, 1.27f)
                curveToRelative(-0.09f, 0.17f, -0.13f, 0.28f, -0.13f, 0.82f)
                horizontalLineToRelative(-1.06f)
                curveToRelative(0.0f, -0.29f, -0.04f, -0.75f, 0.18f, -1.16f)
                curveToRelative(0.28f, -0.51f, 0.83f, -0.81f, 1.14f, -1.26f)
                curveToRelative(0.33f, -0.47f, 0.15f, -1.36f, -0.8f, -1.36f)
                curveToRelative(-0.62f, 0.0f, -0.92f, 0.47f, -1.05f, 0.86f)
                lineToRelative(-0.96f, -0.4f)
                curveTo(10.76f, 7.67f, 11.46f, 7.0f, 12.5f, 7.0f)
                curveToRelative(0.86f, 0.0f, 1.45f, 0.39f, 1.75f, 0.88f)
                curveTo(14.51f, 8.31f, 14.66f, 9.1f, 14.26f, 9.68f)
                close()
            }
        }
        .build()
        return _psychologyAlt!!
    }

private var _psychologyAlt: ImageVector? = null
