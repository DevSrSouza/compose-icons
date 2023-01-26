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

public val OutlineGroup.HdrEnhancedSelect: ImageVector
    get() {
        if (_hdrEnhancedSelect != null) {
            return _hdrEnhancedSelect!!
        }
        _hdrEnhancedSelect = Builder(name = "HdrEnhancedSelect", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveTo(8.69f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveTo(14.21f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(11.0f)
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
                moveTo(18.0f, 18.5f)
                curveToRelative(0.0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f)
                lineTo(18.0f, 22.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-0.9f, -2.0f)
                horizontalLineToRelative(-1.1f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f)
                verticalLineTo(18.5f)
                close()
                moveTo(16.5f, 18.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(3.5f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(3.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.5f)
                close()
                moveTo(10.0f, 16.0f)
                curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(10.0f, 20.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _hdrEnhancedSelect!!
    }

private var _hdrEnhancedSelect: ImageVector? = null
