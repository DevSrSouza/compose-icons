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

public val OutlineGroup.ContactEmergency: ImageVector
    get() {
        if (_contactEmergency != null) {
            return _contactEmergency!!
        }
        _contactEmergency = Builder(name = "ContactEmergency", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveTo(7.35f, 14.0f, 9.0f, 14.0f)
                close()
                moveTo(9.0f, 10.0f)
                curveToRelative(0.54f, 0.0f, 1.0f, 0.46f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.46f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.46f, -1.0f, -1.0f)
                reflectiveCurveTo(8.46f, 10.0f, 9.0f, 10.0f)
                close()
            }
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
                moveTo(4.54f, 19.0f)
                curveToRelative(1.1f, -1.22f, 2.69f, -2.0f, 4.46f, -2.0f)
                reflectiveCurveToRelative(3.36f, 0.78f, 4.46f, 2.0f)
                horizontalLineTo(4.54f)
                close()
                moveTo(22.0f, 19.0f)
                horizontalLineToRelative(-6.08f)
                curveToRelative(-1.38f, -2.39f, -3.96f, -4.0f, -6.92f, -4.0f)
                reflectiveCurveToRelative(-5.54f, 1.61f, -6.92f, 4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.78f, 11.15f)
                lineToRelative(1.47f, -0.85f)
                lineToRelative(0.0f, 1.7f)
                lineToRelative(1.5f, 0.0f)
                lineToRelative(0.0f, -1.7f)
                lineToRelative(1.47f, 0.85f)
                lineToRelative(0.75f, -1.3f)
                lineToRelative(-1.47f, -0.85f)
                lineToRelative(1.47f, -0.85f)
                lineToRelative(-0.75f, -1.3f)
                lineToRelative(-1.47f, 0.85f)
                lineToRelative(0.0f, -1.7f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(0.0f, 1.7f)
                lineToRelative(-1.47f, -0.85f)
                lineToRelative(-0.75f, 1.3f)
                lineToRelative(1.47f, 0.85f)
                lineToRelative(-1.47f, 0.85f)
                close()
            }
        }
        .build()
        return _contactEmergency!!
    }

private var _contactEmergency: ImageVector? = null
