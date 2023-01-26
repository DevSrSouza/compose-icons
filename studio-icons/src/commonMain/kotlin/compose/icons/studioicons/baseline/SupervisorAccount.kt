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

public val BaselineGroup.SupervisorAccount: ImageVector
    get() {
        if (_supervisorAccount != null) {
            return _supervisorAccount!!
        }
        _supervisorAccount = Builder(name = "SupervisorAccount", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 12.0f)
                curveToRelative(1.38f, 0.0f, 2.49f, -1.12f, 2.49f, -2.5f)
                reflectiveCurveTo(17.88f, 7.0f, 16.5f, 7.0f)
                curveTo(15.12f, 7.0f, 14.0f, 8.12f, 14.0f, 9.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(9.0f, 11.0f)
                curveToRelative(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f)
                reflectiveCurveTo(10.66f, 5.0f, 9.0f, 5.0f)
                curveTo(7.34f, 5.0f, 6.0f, 6.34f, 6.0f, 8.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(16.5f, 14.0f)
                curveToRelative(-1.83f, 0.0f, -5.5f, 0.92f, -5.5f, 2.75f)
                lineTo(11.0f, 19.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0.0f, -1.83f, -3.67f, -2.75f, -5.5f, -2.75f)
                close()
                moveTo(9.0f, 13.0f)
                curveToRelative(-2.33f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f)
                lineTo(2.0f, 19.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0.0f, -0.85f, 0.33f, -2.34f, 2.37f, -3.47f)
                curveTo(10.5f, 13.1f, 9.66f, 13.0f, 9.0f, 13.0f)
                close()
            }
        }
        .build()
        return _supervisorAccount!!
    }

private var _supervisorAccount: ImageVector? = null
