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

public val RoundGroup.VolunteerActivism: ImageVector
    get() {
        if (_volunteerActivism != null) {
            return _volunteerActivism!!
        }
        _volunteerActivism = Builder(name = "VolunteerActivism", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-7.0f)
                curveTo(5.0f, 11.9f, 4.1f, 11.0f, 3.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.3f)
                curveTo(10.0f, 3.45f, 11.45f, 2.0f, 13.3f, 2.0f)
                curveToRelative(1.04f, 0.0f, 2.05f, 0.49f, 2.7f, 1.25f)
                curveTo(16.65f, 2.49f, 17.66f, 2.0f, 18.7f, 2.0f)
                curveTo(20.55f, 2.0f, 22.0f, 3.45f, 22.0f, 5.3f)
                curveToRelative(0.0f, 2.1f, -2.5f, 4.51f, -5.33f, 7.09f)
                curveToRelative(-0.38f, 0.35f, -0.97f, 0.35f, -1.35f, 0.0f)
                curveTo(12.5f, 9.81f, 10.0f, 7.4f, 10.0f, 5.3f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.99f, 17.0f)
                horizontalLineToRelative(-6.83f)
                curveToRelative(-0.11f, 0.0f, -0.22f, -0.02f, -0.33f, -0.06f)
                lineToRelative(-1.47f, -0.51f)
                curveToRelative(-0.26f, -0.09f, -0.39f, -0.37f, -0.3f, -0.63f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.09f, -0.26f, 0.38f, -0.4f, 0.64f, -0.3f)
                lineToRelative(1.12f, 0.43f)
                curveToRelative(0.11f, 0.04f, 0.24f, 0.07f, 0.36f, 0.07f)
                horizontalLineToRelative(2.63f)
                curveToRelative(0.65f, 0.0f, 1.18f, -0.53f, 1.18f, -1.18f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f)
                lineTo(9.3f, 11.13f)
                curveTo(9.08f, 11.04f, 8.84f, 11.0f, 8.6f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(9.02f)
                lineToRelative(6.37f, 1.81f)
                curveToRelative(0.41f, 0.12f, 0.85f, 0.1f, 1.25f, -0.05f)
                lineTo(22.0f, 19.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(22.0f, 17.89f, 21.1f, 17.0f, 19.99f, 17.0f)
                close()
            }
        }
        .build()
        return _volunteerActivism!!
    }

private var _volunteerActivism: ImageVector? = null
