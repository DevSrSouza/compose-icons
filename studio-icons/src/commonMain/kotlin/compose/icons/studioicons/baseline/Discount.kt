package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Discount: ImageVector
    get() {
        if (_discount != null) {
            return _discount!!
        }
        _discount = Builder(name = "Discount", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.79f, 21.0f)
                lineTo(3.0f, 11.21f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                lineToRelative(7.79f, 7.79f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f)
                lineToRelative(6.21f, -6.21f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineTo(12.79f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.38f, 17.41f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f)
                lineToRelative(6.21f, -6.21f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineToRelative(-7.79f, -7.79f)
                curveTo(12.25f, 0.21f, 11.74f, 0.0f, 11.21f, 0.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 0.0f, 3.0f, 0.9f, 3.0f, 2.0f)
                verticalLineToRelative(6.21f)
                curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                lineTo(11.38f, 17.41f)
                close()
                moveTo(7.25f, 3.0f)
                curveTo(7.94f, 3.0f, 8.5f, 3.56f, 8.5f, 4.25f)
                reflectiveCurveTo(7.94f, 5.5f, 7.25f, 5.5f)
                reflectiveCurveTo(6.0f, 4.94f, 6.0f, 4.25f)
                reflectiveCurveTo(6.56f, 3.0f, 7.25f, 3.0f)
                close()
            }
        }
        .build()
        return _discount!!
    }

private var _discount: ImageVector? = null
