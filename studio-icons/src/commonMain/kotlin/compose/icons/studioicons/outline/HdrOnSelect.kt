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

public val OutlineGroup.HdrOnSelect: ImageVector
    get() {
        if (_hdrOnSelect != null) {
            return _hdrOnSelect!!
        }
        _hdrOnSelect = Builder(name = "HdrOnSelect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 18.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.9f, 2.0f)
                horizontalLineTo(18.0f)
                lineToRelative(-0.9f, -2.1f)
                curveTo(17.6f, 19.6f, 18.0f, 19.1f, 18.0f, 18.5f)
                close()
                moveTo(16.5f, 18.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(18.5f)
                close()
                moveTo(3.5f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(18.0f)
                close()
                moveTo(10.0f, 16.0f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(10.0f)
                curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveTo(11.5f, 16.7f, 10.8f, 16.0f, 10.0f, 16.0f)
                close()
                moveTo(10.0f, 20.5f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(20.5f)
                close()
                moveTo(24.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveTo(9.79f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(8.69f, 2.0f, 6.0f, 4.69f, 6.0f, 8.0f)
                reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                reflectiveCurveTo(15.31f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _hdrOnSelect!!
    }

private var _hdrOnSelect: ImageVector? = null
