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

public val RoundGroup.FitnessCenter: ImageVector
    get() {
        if (_fitnessCenter != null) {
            return _fitnessCenter!!
        }
        _fitnessCenter = Builder(name = "FitnessCenter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.57f, 14.86f)
                lineToRelative(0.72f, -0.72f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-0.02f, -0.02f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineTo(17.0f, 15.57f)
                lineTo(8.43f, 7.0f)
                lineToRelative(2.86f, -2.86f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-0.02f, -0.02f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-0.72f, 0.72f)
                lineToRelative(-0.72f, -0.72f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f)
                lineTo(5.57f, 4.14f)
                lineToRelative(-0.72f, -0.72f)
                curveToRelative(-0.39f, -0.39f, -1.04f, -0.39f, -1.43f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.04f, 0.0f, 1.43f)
                lineToRelative(0.72f, 0.72f)
                lineTo(2.71f, 7.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.72f, 0.72f)
                lineToRelative(-0.72f, 0.73f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineTo(7.0f, 8.43f)
                lineTo(15.57f, 17.0f)
                lineToRelative(-2.86f, 2.86f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.72f, -0.72f)
                lineToRelative(0.72f, 0.72f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(1.43f, -1.43f)
                lineToRelative(0.72f, 0.72f)
                curveToRelative(0.39f, 0.39f, 1.04f, 0.39f, 1.43f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.04f, 0.0f, -1.43f)
                lineToRelative(-0.72f, -0.72f)
                lineTo(21.29f, 17.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-0.72f, -0.73f)
                close()
            }
        }
        .build()
        return _fitnessCenter!!
    }

private var _fitnessCenter: ImageVector? = null
