package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) {
            return _numberSquareZero!!
        }
        _numberSquareZero = Builder(name = "NumberSquareZero", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 188.0f)
                curveToRelative(14.4f, 0.0f, 26.7f, -7.4f, 34.6f, -21.0f)
                curveToRelative(6.1f, -10.3f, 9.4f, -24.2f, 9.4f, -39.0f)
                reflectiveCurveToRelative(-3.3f, -28.7f, -9.4f, -39.0f)
                curveToRelative(-7.9f, -13.6f, -20.2f, -21.0f, -34.6f, -21.0f)
                reflectiveCurveToRelative(-26.7f, 7.4f, -34.6f, 21.0f)
                curveTo(87.3f, 99.3f, 84.0f, 113.2f, 84.0f, 128.0f)
                reflectiveCurveToRelative(3.3f, 28.7f, 9.4f, 39.0f)
                curveTo(101.3f, 180.6f, 113.6f, 188.0f, 128.0f, 188.0f)
                close()
                moveTo(128.0f, 92.0f)
                curveToRelative(15.8f, 0.0f, 20.0f, 23.5f, 20.0f, 36.0f)
                reflectiveCurveToRelative(-4.2f, 36.0f, -20.0f, 36.0f)
                reflectiveCurveToRelative(-20.0f, -23.5f, -20.0f, -36.0f)
                reflectiveCurveTo(112.2f, 92.0f, 128.0f, 92.0f)
                close()
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 52.0f)
                lineTo(204.0f, 52.0f)
                close()
            }
        }
        .build()
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
