package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.KeyboardCommandKey: ImageVector
    get() {
        if (_keyboardCommandKey != null) {
            return _keyboardCommandKey!!
        }
        _keyboardCommandKey = Builder(name = "KeyboardCommandKey", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 3.0f)
                curveTo(15.57f, 3.0f, 14.0f, 4.57f, 14.0f, 6.5f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 4.57f, 8.43f, 3.0f, 6.5f, 3.0f)
                reflectiveCurveTo(3.0f, 4.57f, 3.0f, 6.5f)
                reflectiveCurveTo(4.57f, 10.0f, 6.5f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(6.5f)
                curveTo(4.57f, 14.0f, 3.0f, 15.57f, 3.0f, 17.5f)
                reflectiveCurveTo(4.57f, 21.0f, 6.5f, 21.0f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(19.43f, 14.0f, 17.5f, 14.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(19.43f, 3.0f, 17.5f, 3.0f)
                lineTo(17.5f, 3.0f)
                close()
                moveTo(16.0f, 8.0f)
                verticalLineTo(6.5f)
                curveTo(16.0f, 5.67f, 16.67f, 5.0f, 17.5f, 5.0f)
                reflectiveCurveTo(19.0f, 5.67f, 19.0f, 6.5f)
                reflectiveCurveTo(18.33f, 8.0f, 17.5f, 8.0f)
                horizontalLineTo(16.0f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(6.5f, 8.0f)
                curveTo(5.67f, 8.0f, 5.0f, 7.33f, 5.0f, 6.5f)
                reflectiveCurveTo(5.67f, 5.0f, 6.5f, 5.0f)
                reflectiveCurveTo(8.0f, 5.67f, 8.0f, 6.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.5f)
                lineTo(6.5f, 8.0f)
                close()
                moveTo(10.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(10.0f)
                lineTo(10.0f, 14.0f)
                close()
                moveTo(17.5f, 19.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(18.33f, 19.0f, 17.5f, 19.0f)
                lineTo(17.5f, 19.0f)
                close()
                moveTo(6.5f, 19.0f)
                curveTo(5.67f, 19.0f, 5.0f, 18.33f, 5.0f, 17.5f)
                reflectiveCurveTo(5.67f, 16.0f, 6.5f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(1.5f)
                curveTo(8.0f, 18.33f, 7.33f, 19.0f, 6.5f, 19.0f)
                lineTo(6.5f, 19.0f)
                close()
            }
        }
        .build()
        return _keyboardCommandKey!!
    }

private var _keyboardCommandKey: ImageVector? = null
