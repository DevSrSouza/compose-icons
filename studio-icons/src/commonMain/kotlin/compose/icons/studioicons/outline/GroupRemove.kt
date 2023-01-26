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

public val OutlineGroup.GroupRemove: ImageVector
    get() {
        if (_groupRemove != null) {
            return _groupRemove!!
        }
        _groupRemove = Builder(name = "GroupRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(8.0f, 4.0f)
                curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveTo(10.21f, 4.0f, 8.0f, 4.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveTo(9.1f, 10.0f, 8.0f, 10.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                curveTo(16.0f, 14.34f, 10.67f, 13.0f, 8.0f, 13.0f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-0.99f)
                curveTo(2.2f, 16.29f, 5.3f, 15.0f, 8.0f, 15.0f)
                reflectiveCurveToRelative(5.8f, 1.29f, 6.0f, 2.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(12.51f, 4.05f)
                curveTo(13.43f, 5.11f, 14.0f, 6.49f, 14.0f, 8.0f)
                reflectiveCurveToRelative(-0.57f, 2.89f, -1.49f, 3.95f)
                curveTo(14.47f, 11.7f, 16.0f, 10.04f, 16.0f, 8.0f)
                reflectiveCurveTo(14.47f, 4.3f, 12.51f, 4.05f)
                close()
                moveTo(16.53f, 13.83f)
                curveTo(17.42f, 14.66f, 18.0f, 15.7f, 18.0f, 17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveTo(20.0f, 15.55f, 18.41f, 14.49f, 16.53f, 13.83f)
                close()
            }
        }
        .build()
        return _groupRemove!!
    }

private var _groupRemove: ImageVector? = null
