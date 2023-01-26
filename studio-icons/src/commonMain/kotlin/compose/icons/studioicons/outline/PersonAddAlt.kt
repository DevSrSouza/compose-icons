package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.PersonAddAlt: ImageVector
    get() {
        if (_personAddAlt != null) {
            return _personAddAlt!!
        }
        _personAddAlt = Builder(name = "PersonAddAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(5.0f, 5.79f, 5.0f, 8.0f)
                curveTo(5.0f, 10.21f, 6.79f, 12.0f, 9.0f, 12.0f)
                close()
                moveTo(9.0f, 6.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(7.0f, 9.1f, 7.0f, 8.0f)
                curveTo(7.0f, 6.9f, 7.9f, 6.0f, 9.0f, 6.0f)
                close()
                moveTo(15.39f, 14.56f)
                curveTo(13.71f, 13.7f, 11.53f, 13.0f, 9.0f, 13.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(1.61f, 15.07f, 1.0f, 16.1f, 1.0f, 17.22f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.78f)
                curveTo(17.0f, 16.1f, 16.39f, 15.07f, 15.39f, 14.56f)
                close()
                moveTo(15.0f, 18.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-0.78f)
                curveToRelative(0.0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f)
                curveTo(4.71f, 15.73f, 6.63f, 15.0f, 9.0f, 15.0f)
                curveToRelative(2.37f, 0.0f, 4.29f, 0.73f, 5.48f, 1.34f)
                curveTo(14.8f, 16.5f, 15.0f, 16.84f, 15.0f, 17.22f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _personAddAlt!!
    }

private var _personAddAlt: ImageVector? = null
