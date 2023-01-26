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

public val BaselineGroup.ContactEmergency: ImageVector
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
                moveTo(20.97f, 9.85f)
                lineToRelative(-0.75f, 1.3f)
                lineToRelative(-1.47f, -0.85f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.7f)
                lineToRelative(-1.47f, 0.85f)
                lineToRelative(-0.75f, -1.3f)
                lineTo(16.5f, 9.0f)
                lineToRelative(-1.47f, -0.85f)
                lineToRelative(0.75f, -1.3f)
                lineToRelative(1.47f, 0.85f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.7f)
                lineToRelative(1.47f, -0.85f)
                lineToRelative(0.75f, 1.3f)
                lineTo(19.5f, 9.0f)
                lineTo(20.97f, 9.85f)
                close()
            }
        }
        .build()
        return _contactEmergency!!
    }

private var _contactEmergency: ImageVector? = null
