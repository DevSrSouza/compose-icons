package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.HdrPlus: ImageVector
    get() {
        if (_hdrPlus != null) {
            return _hdrPlus!!
        }
        _hdrPlus = Builder(name = "HdrPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 14.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 7.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 15.5f)
                curveToRelative(0.0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f)
                lineTo(12.0f, 19.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-0.9f, -2.0f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f)
                verticalLineTo(15.5f)
                close()
                moveTo(12.0f, 12.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
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
                moveTo(17.5f, 10.5f)
                curveToRelative(0.0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _hdrPlus!!
    }

private var _hdrPlus: ImageVector? = null
