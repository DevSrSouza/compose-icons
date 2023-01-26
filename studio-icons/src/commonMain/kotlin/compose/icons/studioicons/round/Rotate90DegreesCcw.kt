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

public val RoundGroup.Rotate90DegreesCcw: ImageVector
    get() {
        if (_rotate90DegreesCcw != null) {
            return _rotate90DegreesCcw!!
        }
        _rotate90DegreesCcw = Builder(name = "Rotate90DegreesCcw", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.93f, 7.83f)
                lineToRelative(-3.65f, 3.66f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(3.66f, 3.66f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f)
                lineToRelative(3.66f, -3.65f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineTo(8.76f, 7.82f)
                curveToRelative(-0.79f, -0.78f, -2.05f, -0.78f, -2.83f, 0.01f)
                close()
                moveTo(4.4f, 12.19f)
                lineToRelative(2.25f, -2.25f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.42f, 0.0f)
                lineToRelative(2.24f, 2.24f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-2.25f, 2.25f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0.0f)
                lineTo(4.4f, 13.61f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.03f, 0.0f, -1.42f)
                close()
                moveTo(19.36f, 6.64f)
                curveTo(17.61f, 4.88f, 15.3f, 4.0f, 13.0f, 4.0f)
                verticalLineToRelative(-0.83f)
                curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                lineTo(9.47f, 4.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.83f, 1.83f)
                curveToRelative(0.62f, 0.63f, 1.7f, 0.19f, 1.7f, -0.7f)
                lineTo(13.0f, 6.0f)
                curveToRelative(2.02f, 0.0f, 4.03f, 0.86f, 5.45f, 2.61f)
                curveToRelative(2.05f, 2.52f, 2.05f, 6.27f, 0.0f, 8.79f)
                curveTo(17.03f, 19.14f, 15.02f, 20.0f, 13.0f, 20.0f)
                curveToRelative(-0.78f, 0.0f, -1.55f, -0.13f, -2.29f, -0.39f)
                curveToRelative(-0.36f, -0.12f, -0.75f, -0.01f, -1.02f, 0.26f)
                curveToRelative(-0.5f, 0.5f, -0.34f, 1.39f, 0.34f, 1.62f)
                curveToRelative(0.96f, 0.34f, 1.96f, 0.51f, 2.97f, 0.51f)
                curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f)
                curveToRelative(3.52f, -3.51f, 3.52f, -9.21f, 0.0f, -12.72f)
                close()
            }
        }
        .build()
        return _rotate90DegreesCcw!!
    }

private var _rotate90DegreesCcw: ImageVector? = null
