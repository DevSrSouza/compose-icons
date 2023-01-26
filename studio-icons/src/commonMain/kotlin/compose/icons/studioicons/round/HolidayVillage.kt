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

public val RoundGroup.HolidayVillage: ImageVector
    get() {
        if (_holidayVillage != null) {
            return _holidayVillage!!
        }
        _holidayVillage = Builder(name = "HolidayVillage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(8.76f)
                curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-3.76f, -3.76f)
                curveTo(13.76f, 4.11f, 13.51f, 4.0f, 13.24f, 4.0f)
                curveToRelative(-0.89f, 0.0f, -1.34f, 1.08f, -0.71f, 1.71f)
                lineToRelative(3.32f, 3.32f)
                curveTo(15.95f, 9.12f, 16.0f, 9.25f, 16.0f, 9.38f)
                verticalLineTo(19.0f)
                curveTo(16.0f, 19.55f, 16.45f, 20.0f, 17.0f, 20.0f)
                close()
                moveTo(21.0f, 20.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(7.11f)
                curveToRelative(0.0f, -0.26f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-2.1f, -2.11f)
                curveTo(19.42f, 4.11f, 19.16f, 4.0f, 18.9f, 4.0f)
                curveTo(18.0f, 4.0f, 17.56f, 5.08f, 18.19f, 5.71f)
                lineToRelative(1.67f, 1.67f)
                curveTo(19.95f, 7.47f, 20.0f, 7.6f, 20.0f, 7.73f)
                verticalLineTo(19.0f)
                curveTo(20.0f, 19.55f, 20.45f, 20.0f, 21.0f, 20.0f)
                close()
                moveTo(8.0f, 15.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-8.59f)
                curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-5.0f, -5.0f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-5.0f, 5.0f)
                curveTo(2.11f, 9.89f, 2.0f, 10.15f, 2.0f, 10.41f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                curveTo(7.0f, 15.45f, 7.45f, 15.0f, 8.0f, 15.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(8.55f, 13.0f, 8.0f, 13.0f)
                close()
            }
        }
        .build()
        return _holidayVillage!!
    }

private var _holidayVillage: ImageVector? = null
