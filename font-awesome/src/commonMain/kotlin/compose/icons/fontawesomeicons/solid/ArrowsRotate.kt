package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ArrowsRotate: ImageVector
    get() {
        if (_arrowsRotate != null) {
            return _arrowsRotate!!
        }
        _arrowsRotate = Builder(name = "ArrowsRotate", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.1f, 202.6f)
                curveToRelative(7.7f, -21.8f, 20.2f, -42.3f, 37.8f, -59.8f)
                curveToRelative(62.5f, -62.5f, 163.8f, -62.5f, 226.3f, 0.0f)
                lineTo(386.3f, 160.0f)
                horizontalLineTo(352.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(463.5f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(0.4f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(35.2f)
                lineTo(414.4f, 97.6f)
                curveToRelative(-87.5f, -87.5f, -229.3f, -87.5f, -316.8f, 0.0f)
                curveTo(73.2f, 122.0f, 55.6f, 150.7f, 44.8f, 181.4f)
                curveToRelative(-5.9f, 16.7f, 2.9f, 34.9f, 19.5f, 40.8f)
                reflectiveCurveToRelative(34.9f, -2.9f, 40.8f, -19.5f)
                close()
                moveTo(39.0f, 289.3f)
                curveToRelative(-5.0f, 1.5f, -9.8f, 4.2f, -13.7f, 8.2f)
                curveToRelative(-4.0f, 4.0f, -6.7f, 8.8f, -8.1f, 14.0f)
                curveToRelative(-0.3f, 1.2f, -0.6f, 2.5f, -0.8f, 3.8f)
                curveToRelative(-0.3f, 1.7f, -0.4f, 3.4f, -0.4f, 5.1f)
                verticalLineTo(432.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(396.9f)
                lineToRelative(17.6f, 17.5f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(87.5f, 87.4f, 229.3f, 87.4f, 316.7f, 0.0f)
                curveToRelative(24.4f, -24.4f, 42.1f, -53.1f, 52.9f, -83.7f)
                curveToRelative(5.9f, -16.7f, -2.9f, -34.9f, -19.5f, -40.8f)
                reflectiveCurveToRelative(-34.9f, 2.9f, -40.8f, 19.5f)
                curveToRelative(-7.7f, 21.8f, -20.2f, 42.3f, -37.8f, 59.8f)
                curveToRelative(-62.5f, 62.5f, -163.8f, 62.5f, -226.3f, 0.0f)
                lineToRelative(-0.1f, -0.1f)
                lineTo(125.6f, 352.0f)
                horizontalLineTo(160.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(48.4f)
                curveToRelative(-1.6f, 0.0f, -3.2f, 0.1f, -4.8f, 0.3f)
                reflectiveCurveToRelative(-3.1f, 0.5f, -4.6f, 1.0f)
                close()
            }
        }
        .build()
        return _arrowsRotate!!
    }

private var _arrowsRotate: ImageVector? = null
