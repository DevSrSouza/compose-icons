package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) {
            return _numberSquareZero!!
        }
        _numberSquareZero = Builder(name = "NumberSquareZero", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 40.0f)
                lineTo(208.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f)
                lineTo(216.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 216.0f)
                lineTo(48.0f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 208.0f)
                lineTo(40.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 72.0f)
                curveToRelative(-13.0f, 0.0f, -24.0f, 6.7f, -31.2f, 19.0f)
                curveToRelative(-5.7f, 9.7f, -8.8f, 22.9f, -8.8f, 37.0f)
                reflectiveCurveToRelative(3.1f, 27.3f, 8.8f, 37.0f)
                curveToRelative(7.2f, 12.3f, 18.2f, 19.0f, 31.2f, 19.0f)
                reflectiveCurveToRelative(24.0f, -6.7f, 31.2f, -19.0f)
                curveToRelative(5.7f, -9.7f, 8.8f, -22.9f, 8.8f, -37.0f)
                reflectiveCurveToRelative(-3.1f, -27.3f, -8.8f, -37.0f)
                curveTo(152.0f, 78.7f, 141.0f, 72.0f, 128.0f, 72.0f)
                close()
                moveTo(128.0f, 168.0f)
                curveToRelative(-8.9f, 0.0f, -24.0f, -8.4f, -24.0f, -40.0f)
                reflectiveCurveToRelative(15.1f, -40.0f, 24.0f, -40.0f)
                reflectiveCurveToRelative(24.0f, 8.4f, 24.0f, 40.0f)
                reflectiveCurveTo(136.9f, 168.0f, 128.0f, 168.0f)
                close()
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 48.0f)
                lineTo(208.0f, 48.0f)
                lineTo(208.0f, 208.0f)
                close()
            }
        }
        .build()
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
