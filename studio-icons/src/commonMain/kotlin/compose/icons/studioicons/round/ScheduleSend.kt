package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ScheduleSend: ImageVector
    get() {
        if (_scheduleSend != null) {
            return _scheduleSend!!
        }
        _scheduleSend = Builder(name = "ScheduleSend", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                curveToRelative(0.1f, 0.0f, 0.19f, 0.01f, 0.28f, 0.01f)
                lineTo(4.39f, 4.58f)
                curveTo(3.73f, 4.31f, 3.0f, 4.79f, 3.0f, 5.51f)
                verticalLineToRelative(3.71f)
                curveToRelative(0.0f, 0.46f, 0.31f, 0.86f, 0.76f, 0.97f)
                lineTo(11.0f, 12.0f)
                lineToRelative(-7.24f, 1.81f)
                curveTo(3.31f, 13.92f, 3.0f, 14.32f, 3.0f, 14.78f)
                verticalLineToRelative(3.71f)
                curveToRelative(0.0f, 0.72f, 0.73f, 1.2f, 1.39f, 0.92f)
                lineTo(10.0f, 17.05f)
                curveToRelative(0.0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.05f)
                curveTo(10.0f, 13.14f, 13.14f, 10.0f, 17.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f)
                close()
                moveTo(18.29f, 19.0f)
                lineToRelative(-1.65f, -1.65f)
                curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.29f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f)
                lineToRelative(0.0f, 0.0f)
                curveTo(18.8f, 19.2f, 18.49f, 19.2f, 18.29f, 19.0f)
                close()
            }
        }
        .build()
        return _scheduleSend!!
    }

private var _scheduleSend: ImageVector? = null
