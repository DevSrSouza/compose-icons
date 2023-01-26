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

public val SharpGroup.SaveAs: ImageVector
    get() {
        if (_saveAs != null) {
            return _saveAs!!
        }
        _saveAs = Builder(name = "SaveAs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.4f)
                verticalLineTo(7.0f)
                lineToRelative(-4.0f, -4.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(9.4f)
                lineTo(21.0f, 12.4f)
                close()
                moveTo(15.0f, 15.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveTo(15.0f, 13.34f, 15.0f, 15.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(19.99f, 16.25f)
                lineToRelative(1.77f, 1.77f)
                lineTo(16.77f, 23.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(-1.77f)
                lineTo(19.99f, 16.25f)
                close()
                moveTo(23.61f, 16.16f)
                lineToRelative(-1.2f, 1.2f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(1.2f, -1.2f)
                lineTo(23.61f, 16.16f)
                close()
            }
        }
        .build()
        return _saveAs!!
    }

private var _saveAs: ImageVector? = null
