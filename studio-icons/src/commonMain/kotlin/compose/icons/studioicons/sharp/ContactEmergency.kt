package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ContactEmergency: ImageVector
    get() {
        if (_contactEmergency != null) {
            return _contactEmergency!!
        }
        _contactEmergency = Builder(name = "ContactEmergency", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.99f, 3.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(23.99f)
                verticalLineTo(3.0f)
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
