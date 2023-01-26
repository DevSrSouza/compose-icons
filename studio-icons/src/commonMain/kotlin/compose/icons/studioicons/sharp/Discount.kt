package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Discount: ImageVector
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
                lineToRelative(-9.79f, -9.79f)
                lineToRelative(0.0f, 2.83f)
                lineToRelative(9.79f, 9.79f)
                lineToRelative(9.04f, -9.04f)
                lineToRelative(-1.42f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 9.04f)
                lineToRelative(9.79f, 9.79f)
                lineToRelative(9.04f, -9.04f)
                lineTo(12.04f, 0.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.04f)
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
