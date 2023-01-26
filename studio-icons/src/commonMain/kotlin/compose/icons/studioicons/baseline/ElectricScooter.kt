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

public val BaselineGroup.ElectricScooter: ImageVector
    get() {
        if (_electricScooter != null) {
            return _electricScooter!!
        }
        _electricScooter = Builder(name = "ElectricScooter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.82f, 16.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(0.74f)
                lineToRelative(-1.9f, -8.44f)
                curveTo(17.63f, 1.65f, 16.82f, 1.0f, 15.89f, 1.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.89f)
                lineToRelative(1.4f, 6.25f)
                curveToRelative(0.0f, 0.0f, -0.01f, 0.0f, -0.01f, 0.0f)
                curveToRelative(-2.16f, 0.65f, -3.81f, 2.48f, -4.19f, 4.75f)
                horizontalLineTo(7.82f)
                curveToRelative(-0.48f, -1.34f, -1.86f, -2.24f, -3.42f, -1.94f)
                curveToRelative(-1.18f, 0.23f, -2.13f, 1.2f, -2.35f, 2.38f)
                curveTo(1.7f, 16.34f, 3.16f, 18.0f, 5.0f, 18.0f)
                curveTo(6.3f, 18.0f, 7.4f, 17.16f, 7.82f, 16.0f)
                close()
                moveTo(5.0f, 16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(5.55f, 16.0f, 5.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveTo(20.66f, 12.0f, 19.0f, 12.0f)
                close()
                moveTo(19.0f, 16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(19.55f, 16.0f, 19.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(6.0f, 3.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(-6.0f, -3.0f)
                close()
            }
        }
        .build()
        return _electricScooter!!
    }

private var _electricScooter: ImageVector? = null
