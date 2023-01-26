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

public val SharpGroup.Wash: ImageVector
    get() {
        if (_wash != null) {
            return _wash!!
        }
        _wash = Builder(name = "Wash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.12f, 5.0f)
                lineTo(1.0f, 12.68f)
                verticalLineTo(23.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.86f)
                lineToRelative(1.88f, -3.3f)
                lineTo(9.12f, 5.0f)
                lineTo(9.12f, 5.0f)
                close()
                moveTo(13.5f, 9.0f)
                curveTo(14.33f, 9.0f, 15.0f, 8.33f, 15.0f, 7.5f)
                curveTo(15.0f, 6.66f, 13.5f, 5.0f, 13.5f, 5.0f)
                reflectiveCurveTo(12.0f, 6.66f, 12.0f, 7.5f)
                curveTo(12.0f, 8.33f, 12.67f, 9.0f, 13.5f, 9.0f)
                close()
                moveTo(18.5f, 1.0f)
                curveToRelative(0.0f, 0.0f, -2.5f, 2.83f, -2.5f, 4.5f)
                curveTo(16.0f, 6.88f, 17.12f, 8.0f, 18.5f, 8.0f)
                reflectiveCurveTo(21.0f, 6.88f, 21.0f, 5.5f)
                curveTo(21.0f, 3.83f, 18.5f, 1.0f, 18.5f, 1.0f)
                close()
            }
        }
        .build()
        return _wash!!
    }

private var _wash: ImageVector? = null
