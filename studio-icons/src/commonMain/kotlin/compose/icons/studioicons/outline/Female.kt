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

public val OutlineGroup.Female: ImageVector
    get() {
        if (_female != null) {
            return _female!!
        }
        _female = Builder(name = "Female", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 9.5f)
                curveTo(17.5f, 6.46f, 15.04f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(6.5f, 6.46f, 6.5f, 9.5f)
                curveToRelative(0.0f, 2.7f, 1.94f, 4.93f, 4.5f, 5.4f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.1f)
                curveTo(15.56f, 14.43f, 17.5f, 12.2f, 17.5f, 9.5f)
                close()
                moveTo(8.5f, 9.5f)
                curveTo(8.5f, 7.57f, 10.07f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveTo(13.93f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(8.5f, 11.43f, 8.5f, 9.5f)
                close()
            }
        }
        .build()
        return _female!!
    }

private var _female: ImageVector? = null
