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

public val RoundGroup.Snooze: ImageVector
    get() {
        if (_snooze != null) {
            return _snooze!!
        }
        _snooze = Builder(name = "Snooze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                horizontalLineToRelative(2.63f)
                lineToRelative(-3.72f, 4.35f)
                curveTo(8.36f, 16.0f, 8.82f, 17.0f, 9.67f, 17.0f)
                lineTo(14.0f, 17.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.63f)
                lineToRelative(3.72f, -4.35f)
                curveToRelative(0.55f, -0.65f, 0.09f, -1.65f, -0.76f, -1.65f)
                lineTo(10.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(21.3f, 6.42f)
                curveToRelative(-0.35f, 0.42f, -0.98f, 0.48f, -1.41f, 0.13f)
                lineToRelative(-3.07f, -2.56f)
                curveToRelative(-0.42f, -0.36f, -0.48f, -0.99f, -0.12f, -1.41f)
                curveToRelative(0.35f, -0.42f, 0.98f, -0.48f, 1.41f, -0.13f)
                lineToRelative(3.07f, 2.56f)
                curveToRelative(0.42f, 0.36f, 0.48f, 0.99f, 0.12f, 1.41f)
                close()
                moveTo(2.7f, 6.42f)
                curveToRelative(0.35f, 0.43f, 0.98f, 0.48f, 1.4f, 0.13f)
                lineToRelative(3.07f, -2.56f)
                curveToRelative(0.43f, -0.36f, 0.49f, -0.99f, 0.13f, -1.41f)
                curveToRelative(-0.35f, -0.43f, -0.98f, -0.48f, -1.4f, -0.13f)
                lineTo(2.82f, 5.01f)
                curveToRelative(-0.42f, 0.36f, -0.48f, 0.99f, -0.12f, 1.41f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                moveToRelative(0.0f, -2.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _snooze!!
    }

private var _snooze: ImageVector? = null
