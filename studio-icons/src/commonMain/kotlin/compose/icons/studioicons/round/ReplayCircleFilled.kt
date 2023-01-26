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

public val RoundGroup.ReplayCircleFilled: ImageVector
    get() {
        if (_replayCircleFilled != null) {
            return _replayCircleFilled!!
        }
        _replayCircleFilled = Builder(name = "ReplayCircleFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(18.0f, 12.74f)
                curveToRelative(-0.12f, 3.09f, -2.67f, 5.64f, -5.76f, 5.76f)
                curveToRelative(-3.01f, 0.12f, -5.56f, -1.99f, -6.12f, -4.82f)
                curveTo(5.99f, 13.07f, 6.48f, 12.5f, 7.1f, 12.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.47f, 0.0f, 0.88f, 0.33f, 0.98f, 0.8f)
                curveToRelative(0.42f, 2.07f, 2.44f, 3.57f, 4.72f, 3.12f)
                curveToRelative(1.56f, -0.3f, 2.82f, -1.56f, 3.12f, -3.12f)
                curveToRelative(0.5f, -2.56f, -1.45f, -4.8f, -3.92f, -4.8f)
                verticalLineToRelative(1.79f)
                curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f)
                lineTo(8.35f, 7.85f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(2.79f, -2.79f)
                curveTo(11.46f, 4.04f, 12.0f, 4.26f, 12.0f, 4.71f)
                verticalLineTo(6.5f)
                curveTo(15.39f, 6.5f, 18.13f, 9.32f, 18.0f, 12.74f)
                close()
            }
        }
        .build()
        return _replayCircleFilled!!
    }

private var _replayCircleFilled: ImageVector? = null
