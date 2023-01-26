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

public val SharpGroup.FamilyRestroom: ImageVector
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
                moveTo(20.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-3.0f, -9.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(-1.17f, 3.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
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
                moveTo(7.5f, 22.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(14.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _familyRestroom!!
    }

private var _familyRestroom: ImageVector? = null
