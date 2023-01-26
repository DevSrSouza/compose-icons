package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.VolunteerActivism: ImageVector
    get() {
        if (_volunteerActivism != null) {
            return _volunteerActivism!!
        }
        _volunteerActivism = Builder(name = "VolunteerActivism", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                curveToRelative(3.09f, -2.81f, 6.0f, -5.44f, 6.0f, -7.7f)
                curveTo(22.0f, 3.45f, 20.55f, 2.0f, 18.7f, 2.0f)
                curveToRelative(-1.04f, 0.0f, -2.05f, 0.49f, -2.7f, 1.25f)
                curveTo(15.34f, 2.49f, 14.34f, 2.0f, 13.3f, 2.0f)
                curveTo(11.45f, 2.0f, 10.0f, 3.45f, 10.0f, 5.3f)
                curveTo(10.0f, 7.56f, 12.91f, 10.19f, 16.0f, 13.0f)
                close()
                moveTo(13.3f, 4.0f)
                curveToRelative(0.44f, 0.0f, 0.89f, 0.21f, 1.18f, 0.55f)
                lineTo(16.0f, 6.34f)
                lineToRelative(1.52f, -1.79f)
                curveTo(17.81f, 4.21f, 18.26f, 4.0f, 18.7f, 4.0f)
                curveTo(19.44f, 4.0f, 20.0f, 4.56f, 20.0f, 5.3f)
                curveToRelative(0.0f, 1.12f, -2.04f, 3.17f, -4.0f, 4.99f)
                curveToRelative(-1.96f, -1.82f, -4.0f, -3.88f, -4.0f, -4.99f)
                curveTo(12.0f, 4.56f, 12.56f, 4.0f, 13.3f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.2f, -0.75f, -2.28f, -1.87f, -2.7f)
                lineTo(8.97f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.44f)
                lineToRelative(7.0f, 1.94f)
                lineToRelative(8.0f, -2.5f)
                verticalLineToRelative(-1.0f)
                curveTo(22.0f, 17.34f, 20.66f, 16.0f, 19.0f, 16.0f)
                close()
                moveTo(3.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(13.97f, 20.41f)
                lineTo(7.0f, 18.48f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(1.61f)
                lineToRelative(5.82f, 2.17f)
                curveTo(14.77f, 15.3f, 15.0f, 15.63f, 15.0f, 16.0f)
                curveToRelative(0.0f, 0.0f, -1.99f, -0.05f, -2.3f, -0.15f)
                lineToRelative(-2.38f, -0.79f)
                lineToRelative(-0.63f, 1.9f)
                lineToRelative(2.38f, 0.79f)
                curveToRelative(0.51f, 0.17f, 1.04f, 0.26f, 1.58f, 0.26f)
                horizontalLineTo(19.0f)
                curveToRelative(0.39f, 0.0f, 0.74f, 0.23f, 0.9f, 0.56f)
                lineTo(13.97f, 20.41f)
                close()
            }
        }
        .build()
        return _volunteerActivism!!
    }

private var _volunteerActivism: ImageVector? = null
