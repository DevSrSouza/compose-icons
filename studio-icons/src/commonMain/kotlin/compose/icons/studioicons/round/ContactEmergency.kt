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

public val RoundGroup.ContactEmergency: ImageVector
    get() {
        if (_contactEmergency != null) {
            return _contactEmergency!!
        }
        _contactEmergency = Builder(name = "ContactEmergency", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                horizontalLineTo(2.0f)
                curveTo(0.9f, 3.0f, 0.0f, 3.9f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f)
                lineTo(24.0f, 5.0f)
                curveTo(24.0f, 3.9f, 23.1f, 3.0f, 22.0f, 3.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveTo(7.35f, 8.0f, 9.0f, 8.0f)
                close()
                moveTo(2.08f, 19.0f)
                curveToRelative(1.38f, -2.39f, 3.96f, -4.0f, 6.92f, -4.0f)
                reflectiveCurveToRelative(5.54f, 1.61f, 6.92f, 4.0f)
                horizontalLineTo(2.08f)
                close()
                moveTo(20.6f, 10.5f)
                lineTo(20.6f, 10.5f)
                curveToRelative(-0.21f, 0.36f, -0.67f, 0.48f, -1.02f, 0.27f)
                lineToRelative(-0.82f, -0.48f)
                verticalLineToRelative(0.95f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(10.3f)
                lineToRelative(-0.82f, 0.48f)
                curveToRelative(-0.36f, 0.21f, -0.82f, 0.08f, -1.02f, -0.27f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.21f, -0.36f, -0.08f, -0.82f, 0.27f, -1.02f)
                lineTo(16.5f, 9.0f)
                lineToRelative(-0.82f, -0.48f)
                curveToRelative(-0.36f, -0.21f, -0.48f, -0.67f, -0.27f, -1.02f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.21f, -0.36f, 0.67f, -0.48f, 1.02f, -0.27f)
                lineToRelative(0.82f, 0.48f)
                verticalLineTo(6.75f)
                curveTo(17.25f, 6.34f, 17.59f, 6.0f, 18.0f, 6.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(7.7f)
                lineToRelative(0.82f, -0.48f)
                curveToRelative(0.36f, -0.21f, 0.82f, -0.08f, 1.02f, 0.27f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.21f, 0.36f, 0.08f, 0.82f, -0.27f, 1.02f)
                lineTo(19.5f, 9.0f)
                lineToRelative(0.82f, 0.48f)
                curveTo(20.68f, 9.68f, 20.81f, 10.14f, 20.6f, 10.5f)
                close()
            }
        }
        .build()
        return _contactEmergency!!
    }

private var _contactEmergency: ImageVector? = null
