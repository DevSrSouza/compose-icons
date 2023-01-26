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

public val OutlineGroup.HdrPlus: ImageVector
    get() {
        if (_hdrPlus != null) {
            return _hdrPlus!!
        }
        _hdrPlus = Builder(name = "HdrPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.13f, 19.0f)
                curveToRelative(1.15f, 0.64f, 2.47f, 1.0f, 3.87f, 1.0f)
                curveToRelative(4.41f, 0.0f, 8.0f, -3.59f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveToRelative(-8.0f, 3.59f, -8.0f, 8.0f)
                curveToRelative(0.0f, 2.52f, 1.17f, 4.77f, 3.0f, 6.24f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f)
                lineTo(12.0f, 19.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-0.9f, -2.0f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.13f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.48f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f)
                reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.5f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(1.49f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(16.0f)
                close()
                moveTo(10.5f, 15.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(10.5f)
                close()
                moveTo(10.5f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(10.5f)
                close()
                moveTo(16.0f, 6.0f)
                curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(16.0f, 10.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _hdrPlus!!
    }

private var _hdrPlus: ImageVector? = null
