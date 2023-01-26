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

public val BaselineGroup.Sanitizer: ImageVector
    get() {
        if (_sanitizer != null) {
            return _sanitizer!!
        }
        _sanitizer = Builder(name = "Sanitizer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 6.5f)
                curveTo(15.5f, 5.66f, 17.0f, 4.0f, 17.0f, 4.0f)
                reflectiveCurveToRelative(1.5f, 1.66f, 1.5f, 2.5f)
                curveTo(18.5f, 7.33f, 17.83f, 8.0f, 17.0f, 8.0f)
                reflectiveCurveTo(15.5f, 7.33f, 15.5f, 6.5f)
                close()
                moveTo(19.5f, 15.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0.0f, -1.67f, -2.5f, -4.5f, -2.5f, -4.5f)
                reflectiveCurveTo(17.0f, 10.83f, 17.0f, 12.5f)
                curveTo(17.0f, 13.88f, 18.12f, 15.0f, 19.5f, 15.0f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(16.0f, 12.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -2.97f, 2.16f, -5.43f, 5.0f, -5.91f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.13f, 0.0f, 2.15f, 0.39f, 2.99f, 1.01f)
                lineToRelative(-1.43f, 1.43f)
                curveTo(14.1f, 4.17f, 13.57f, 4.0f, 13.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.09f)
                curveTo(13.84f, 6.57f, 16.0f, 9.03f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _sanitizer!!
    }

private var _sanitizer: ImageVector? = null
