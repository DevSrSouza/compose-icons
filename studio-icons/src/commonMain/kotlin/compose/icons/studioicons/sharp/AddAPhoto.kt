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

public val SharpGroup.AddAPhoto: ImageVector
    get() {
        if (_addAPhoto != null) {
            return _addAPhoto!!
        }
        _addAPhoto = Builder(name = "AddAPhoto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                lineTo(3.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(6.0f, 10.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                lineTo(9.0f, 4.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(1.83f, 2.0f)
                lineTo(23.0f, 6.0f)
                verticalLineToRelative(16.0f)
                lineTo(3.0f, 22.0f)
                lineTo(3.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(13.0f, 19.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                close()
                moveTo(10.0f, 14.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _addAPhoto!!
    }

private var _addAPhoto: ImageVector? = null
