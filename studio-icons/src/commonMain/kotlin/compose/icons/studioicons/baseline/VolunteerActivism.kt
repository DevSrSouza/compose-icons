package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.VolunteerActivism: ImageVector
    get() {
        if (_volunteerActivism != null) {
            return _volunteerActivism!!
        }
        _volunteerActivism = Builder(name = "VolunteerActivism", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.25f)
                curveTo(16.65f, 2.49f, 17.66f, 2.0f, 18.7f, 2.0f)
                curveTo(20.55f, 2.0f, 22.0f, 3.45f, 22.0f, 5.3f)
                curveToRelative(0.0f, 2.27f, -2.91f, 4.9f, -6.0f, 7.7f)
                curveToRelative(-3.09f, -2.81f, -6.0f, -5.44f, -6.0f, -7.7f)
                curveTo(10.0f, 3.45f, 11.45f, 2.0f, 13.3f, 2.0f)
                curveTo(14.34f, 2.0f, 15.35f, 2.49f, 16.0f, 3.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 17.0f)
                horizontalLineToRelative(-7.0f)
                lineToRelative(-2.09f, -0.73f)
                lineToRelative(0.33f, -0.94f)
                lineTo(13.0f, 16.0f)
                horizontalLineToRelative(2.82f)
                curveToRelative(0.65f, 0.0f, 1.18f, -0.53f, 1.18f, -1.18f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f)
                lineTo(8.97f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(9.02f)
                lineTo(14.0f, 22.0f)
                lineToRelative(8.01f, -3.0f)
                verticalLineToRelative(0.0f)
                curveTo(22.0f, 17.9f, 21.11f, 17.0f, 20.0f, 17.0f)
                close()
            }
        }
        .build()
        return _volunteerActivism!!
    }

private var _volunteerActivism: ImageVector? = null
