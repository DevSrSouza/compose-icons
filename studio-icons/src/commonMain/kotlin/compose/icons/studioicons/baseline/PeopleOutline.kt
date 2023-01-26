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

public val BaselineGroup.PeopleOutline: ImageVector
    get() {
        if (_peopleOutline != null) {
            return _peopleOutline!!
        }
        _peopleOutline = Builder(name = "PeopleOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 13.0f)
                curveToRelative(-1.2f, 0.0f, -3.07f, 0.34f, -4.5f, 1.0f)
                curveToRelative(-1.43f, -0.67f, -3.3f, -1.0f, -4.5f, -1.0f)
                curveTo(5.33f, 13.0f, 1.0f, 14.08f, 1.0f, 16.25f)
                lineTo(1.0f, 19.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-2.75f)
                curveToRelative(0.0f, -2.17f, -4.33f, -3.25f, -6.5f, -3.25f)
                close()
                moveTo(12.5f, 17.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -0.54f, 2.56f, -1.75f, 5.0f, -1.75f)
                reflectiveCurveToRelative(5.0f, 1.21f, 5.0f, 1.75f)
                verticalLineToRelative(1.25f)
                close()
                moveTo(21.5f, 17.5f)
                lineTo(14.0f, 17.5f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -0.46f, -0.2f, -0.86f, -0.52f, -1.22f)
                curveToRelative(0.88f, -0.3f, 1.96f, -0.53f, 3.02f, -0.53f)
                curveToRelative(2.44f, 0.0f, 5.0f, 1.21f, 5.0f, 1.75f)
                verticalLineToRelative(1.25f)
                close()
                moveTo(7.5f, 12.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(9.43f, 5.0f, 7.5f, 5.0f)
                reflectiveCurveTo(4.0f, 6.57f, 4.0f, 8.5f)
                reflectiveCurveTo(5.57f, 12.0f, 7.5f, 12.0f)
                close()
                moveTo(7.5f, 6.5f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(18.43f, 5.0f, 16.5f, 5.0f)
                reflectiveCurveTo(13.0f, 6.57f, 13.0f, 8.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(16.5f, 6.5f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _peopleOutline!!
    }

private var _peopleOutline: ImageVector? = null
