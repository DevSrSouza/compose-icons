package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ICursor: ImageVector
    get() {
        if (_iCursor != null) {
            return _iCursor!!
        }
        _iCursor = Builder(name = "ICursor", defaultWidth = 256.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 52.048f)
                verticalLineTo(12.065f)
                curveTo(256.0f, 5.496f, 250.726f, 0.148f, 244.158f, 0.066f)
                curveTo(211.621f, -0.344f, 166.469f, 0.011f, 128.0f, 37.959f)
                curveTo(90.266f, 0.736f, 46.979f, -0.114f, 11.913f, 0.114f)
                curveTo(5.318f, 0.157f, 0.0f, 5.519f, 0.0f, 12.114f)
                verticalLineToRelative(39.645f)
                curveToRelative(0.0f, 6.687f, 5.458f, 12.078f, 12.145f, 11.998f)
                curveTo(38.111f, 63.447f, 96.0f, 67.243f, 96.0f, 112.182f)
                verticalLineTo(224.0f)
                horizontalLineTo(60.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 44.932f, -56.075f, 48.031f, -83.95f, 47.959f)
                curveTo(5.404f, 447.942f, 0.0f, 453.306f, 0.0f, 459.952f)
                verticalLineToRelative(39.983f)
                curveToRelative(0.0f, 6.569f, 5.274f, 11.917f, 11.842f, 11.999f)
                curveToRelative(32.537f, 0.409f, 77.689f, 0.054f, 116.158f, -37.894f)
                curveToRelative(37.734f, 37.223f, 81.021f, 38.073f, 116.087f, 37.845f)
                curveToRelative(6.595f, -0.043f, 11.913f, -5.405f, 11.913f, -12.0f)
                verticalLineTo(460.24f)
                curveToRelative(0.0f, -6.687f, -5.458f, -12.078f, -12.145f, -11.998f)
                curveTo(217.889f, 448.553f, 160.0f, 444.939f, 160.0f, 400.0f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(36.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-36.0f)
                verticalLineTo(112.182f)
                curveToRelative(0.0f, -44.932f, 56.075f, -48.213f, 83.95f, -48.142f)
                curveToRelative(6.646f, 0.018f, 12.05f, -5.346f, 12.05f, -11.992f)
                close()
            }
        }
        .build()
        return _iCursor!!
    }

private var _iCursor: ImageVector? = null
