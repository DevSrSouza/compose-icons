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

public val OutlineGroup.SaveAs: ImageVector
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
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.4f)
                lineToRelative(2.0f, -2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(11.17f)
                lineTo(19.0f, 7.83f)
                verticalLineToRelative(6.57f)
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
                moveTo(23.25f, 16.51f)
                lineToRelative(-0.85f, 0.85f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(0.85f, -0.85f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f)
                lineToRelative(1.06f, 1.06f)
                curveTo(23.45f, 16.0f, 23.45f, 16.32f, 23.25f, 16.51f)
                close()
            }
        }
        .build()
        return _saveAs!!
    }

private var _saveAs: ImageVector? = null
