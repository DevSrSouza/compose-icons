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

public val SharpGroup.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 3.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(3.87f, 0.0f, 7.0f, -3.13f, 7.0f, -7.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(0.4f, 0.0f)
                curveToRelative(1.67f, 0.0f, 3.19f, -1.13f, 3.52f, -2.77f)
                curveTo(22.39f, 4.98f, 20.67f, 3.0f, 18.5f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(18.5f, 8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(0.5f)
                curveTo(19.33f, 5.0f, 20.0f, 5.67f, 20.0f, 6.5f)
                reflectiveCurveTo(19.33f, 8.0f, 18.5f, 8.0f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
