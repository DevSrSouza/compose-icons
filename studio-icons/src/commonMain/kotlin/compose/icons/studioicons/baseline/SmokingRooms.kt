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

public val BaselineGroup.SmokingRooms: ImageVector
    get() {
        if (_smokingRooms != null) {
            return _smokingRooms!!
        }
        _smokingRooms = Builder(name = "SmokingRooms", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 19.0f)
                close()
                moveTo(20.5f, 16.0f)
                lineTo(22.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.0f)
                lineTo(18.0f, 19.0f)
                close()
                moveTo(18.85f, 7.73f)
                curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f)
                curveTo(19.85f, 3.5f, 18.35f, 2.0f, 16.5f, 2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(1.02f, 0.0f, 1.85f, 0.83f, 1.85f, 1.85f)
                reflectiveCurveTo(17.52f, 7.2f, 16.5f, 7.2f)
                verticalLineToRelative(1.5f)
                curveToRelative(2.24f, 0.0f, 4.0f, 1.83f, 4.0f, 4.07f)
                lineTo(20.5f, 15.0f)
                lineTo(22.0f, 15.0f)
                verticalLineToRelative(-2.24f)
                curveToRelative(0.0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f)
                close()
                moveTo(16.03f, 10.2f)
                lineTo(14.5f, 10.2f)
                curveToRelative(-1.02f, 0.0f, -1.85f, -0.98f, -1.85f, -2.0f)
                reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f)
                verticalLineToRelative(-1.5f)
                curveToRelative(-1.85f, 0.0f, -3.35f, 1.5f, -3.35f, 3.35f)
                reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f)
                horizontalLineToRelative(1.53f)
                curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f)
                lineTo(18.0f, 15.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.64f)
                curveToRelative(0.0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f)
                close()
            }
        }
        .build()
        return _smokingRooms!!
    }

private var _smokingRooms: ImageVector? = null
