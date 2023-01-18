package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) {
            return _numberSquareZero!!
        }
        _numberSquareZero = Builder(name = "NumberSquareZero", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 74.0f)
                curveToRelative(-12.4f, 0.0f, -22.6f, 6.2f, -29.4f, 18.0f)
                curveTo(93.0f, 101.4f, 90.0f, 114.2f, 90.0f, 128.0f)
                reflectiveCurveToRelative(3.0f, 26.6f, 8.6f, 36.0f)
                curveToRelative(6.8f, 11.8f, 17.0f, 18.0f, 29.4f, 18.0f)
                reflectiveCurveToRelative(22.6f, -6.2f, 29.4f, -18.0f)
                curveToRelative(5.6f, -9.4f, 8.6f, -22.2f, 8.6f, -36.0f)
                reflectiveCurveToRelative(-3.0f, -26.6f, -8.6f, -36.0f)
                curveTo(150.6f, 80.2f, 140.4f, 74.0f, 128.0f, 74.0f)
                close()
                moveTo(128.0f, 170.0f)
                curveToRelative(-18.0f, 0.0f, -26.0f, -21.1f, -26.0f, -42.0f)
                curveToRelative(0.0f, -29.0f, 13.1f, -42.0f, 26.0f, -42.0f)
                curveToRelative(18.0f, 0.0f, 26.0f, 21.1f, 26.0f, 42.0f)
                curveTo(154.0f, 157.0f, 140.9f, 170.0f, 128.0f, 170.0f)
                close()
                moveTo(208.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
