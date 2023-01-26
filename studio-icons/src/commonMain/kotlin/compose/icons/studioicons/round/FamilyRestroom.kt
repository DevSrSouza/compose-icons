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

public val RoundGroup.FamilyRestroom: ImageVector
    get() {
        if (_familyRestroom != null) {
            return _familyRestroom!!
        }
        _familyRestroom = Builder(name = "FamilyRestroom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(16.0f, 5.11f, 16.0f, 4.0f)
                close()
                moveTo(20.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.11f)
                curveToRelative(0.68f, 0.0f, 1.16f, -0.67f, 0.95f, -1.32f)
                lineToRelative(-2.1f, -6.31f)
                curveTo(19.68f, 7.55f, 18.92f, 7.0f, 18.06f, 7.0f)
                horizontalLineToRelative(-0.12f)
                curveToRelative(-0.86f, 0.0f, -1.63f, 0.55f, -1.9f, 1.37f)
                lineToRelative(-0.86f, 2.58f)
                curveTo(16.26f, 11.55f, 17.0f, 12.68f, 17.0f, 14.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                curveTo(19.55f, 22.0f, 20.0f, 21.55f, 20.0f, 21.0f)
                close()
                moveTo(12.5f, 11.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(11.0f, 9.17f, 11.0f, 10.0f)
                reflectiveCurveTo(11.67f, 11.5f, 12.5f, 11.5f)
                close()
                moveTo(5.5f, 6.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f)
                reflectiveCurveTo(4.39f, 6.0f, 5.5f, 6.0f)
                close()
                moveTo(7.5f, 21.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(8.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveTo(7.05f, 22.0f, 7.5f, 21.55f, 7.5f, 21.0f)
                close()
                moveTo(10.0f, 14.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.82f, -0.68f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                curveTo(10.68f, 12.5f, 10.0f, 13.18f, 10.0f, 14.0f)
            }
        }
        .build()
        return _familyRestroom!!
    }

private var _familyRestroom: ImageVector? = null
