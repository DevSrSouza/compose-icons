package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.ScheduleSend: ImageVector
    get() {
        if (_scheduleSend != null) {
            return _scheduleSend!!
        }
        _scheduleSend = Builder(name = "ScheduleSend", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 12.5f)
                lineTo(15.0f, 12.5f)
                verticalLineToRelative(4.0f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(0.75f, -1.23f)
                lineToRelative(-2.25f, -1.52f)
                lineTo(16.5f, 12.5f)
                close()
                moveTo(16.0f, 9.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(9.0f, 2.0f)
                lineToRelative(-9.0f, 2.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(7.27f, -3.11f)
                curveTo(10.09f, 20.83f, 12.79f, 23.0f, 16.0f, 23.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(16.0f, 21.0f)
                curveToRelative(-2.75f, 0.0f, -4.98f, -2.22f, -5.0f, -4.97f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.02f, -2.74f, 2.25f, -4.97f, 5.0f, -4.97f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f)
                close()
            }
        }
        .build()
        return _scheduleSend!!
    }

private var _scheduleSend: ImageVector? = null
