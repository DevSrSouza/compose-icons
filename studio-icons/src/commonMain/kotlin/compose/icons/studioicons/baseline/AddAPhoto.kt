package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.AddAPhoto: ImageVector
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
                verticalLineTo(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(6.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(1.83f, 2.0f)
                horizontalLineTo(21.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(13.0f, 19.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveTo(10.24f, 19.0f, 13.0f, 19.0f)
                close()
                moveTo(9.8f, 14.0f)
                curveToRelative(0.0f, 1.77f, 1.43f, 3.2f, 3.2f, 3.2f)
                reflectiveCurveToRelative(3.2f, -1.43f, 3.2f, -3.2f)
                reflectiveCurveToRelative(-1.43f, -3.2f, -3.2f, -3.2f)
                reflectiveCurveTo(9.8f, 12.23f, 9.8f, 14.0f)
                close()
            }
        }
        .build()
        return _addAPhoto!!
    }

private var _addAPhoto: ImageVector? = null
