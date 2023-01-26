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

public val RoundGroup.NextPlan: ImageVector
    get() {
        if (_nextPlan != null) {
            return _nextPlan!!
        }
        _nextPlan = Builder(name = "NextPlan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(18.0f, 13.97f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(2.26f, -2.26f)
                curveToRelative(-0.91f, -1.06f, -2.25f, -1.74f, -3.76f, -1.74f)
                curveToRelative(-2.37f, 0.0f, -4.35f, 1.66f, -4.86f, 3.88f)
                lineToRelative(-0.96f, -0.32f)
                curveToRelative(0.64f, -2.62f, 3.0f, -4.56f, 5.82f, -4.56f)
                curveToRelative(1.78f, 0.0f, 3.37f, 0.79f, 4.47f, 2.03f)
                lineTo(18.0f, 8.97f)
                verticalLineTo(13.97f)
                close()
            }
        }
        .build()
        return _nextPlan!!
    }

private var _nextPlan: ImageVector? = null
