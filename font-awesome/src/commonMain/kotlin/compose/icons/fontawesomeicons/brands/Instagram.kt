package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Instagram: ImageVector
    get() {
        if (_instagram != null) {
            return _instagram!!
        }
        _instagram = Builder(name = "Instagram", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.1f, 141.0f)
                curveToRelative(-63.6f, 0.0f, -114.9f, 51.3f, -114.9f, 114.9f)
                reflectiveCurveToRelative(51.3f, 114.9f, 114.9f, 114.9f)
                reflectiveCurveTo(339.0f, 319.5f, 339.0f, 255.9f)
                reflectiveCurveTo(287.7f, 141.0f, 224.1f, 141.0f)
                close()
                moveTo(224.1f, 330.6f)
                curveToRelative(-41.1f, 0.0f, -74.7f, -33.5f, -74.7f, -74.7f)
                reflectiveCurveToRelative(33.5f, -74.7f, 74.7f, -74.7f)
                reflectiveCurveToRelative(74.7f, 33.5f, 74.7f, 74.7f)
                reflectiveCurveToRelative(-33.6f, 74.7f, -74.7f, 74.7f)
                close()
                moveTo(370.5f, 136.3f)
                curveToRelative(0.0f, 14.9f, -12.0f, 26.8f, -26.8f, 26.8f)
                curveToRelative(-14.9f, 0.0f, -26.8f, -12.0f, -26.8f, -26.8f)
                reflectiveCurveToRelative(12.0f, -26.8f, 26.8f, -26.8f)
                reflectiveCurveToRelative(26.8f, 12.0f, 26.8f, 26.8f)
                close()
                moveTo(446.6f, 163.5f)
                curveToRelative(-1.7f, -35.9f, -9.9f, -67.7f, -36.2f, -93.9f)
                curveToRelative(-26.2f, -26.2f, -58.0f, -34.4f, -93.9f, -36.2f)
                curveToRelative(-37.0f, -2.1f, -147.9f, -2.1f, -184.9f, 0.0f)
                curveToRelative(-35.8f, 1.7f, -67.6f, 9.9f, -93.9f, 36.1f)
                reflectiveCurveToRelative(-34.4f, 58.0f, -36.2f, 93.9f)
                curveToRelative(-2.1f, 37.0f, -2.1f, 147.9f, 0.0f, 184.9f)
                curveToRelative(1.7f, 35.9f, 9.9f, 67.7f, 36.2f, 93.9f)
                reflectiveCurveToRelative(58.0f, 34.4f, 93.9f, 36.2f)
                curveToRelative(37.0f, 2.1f, 147.9f, 2.1f, 184.9f, 0.0f)
                curveToRelative(35.9f, -1.7f, 67.7f, -9.9f, 93.9f, -36.2f)
                curveToRelative(26.2f, -26.2f, 34.4f, -58.0f, 36.2f, -93.9f)
                curveToRelative(2.1f, -37.0f, 2.1f, -147.8f, 0.0f, -184.8f)
                close()
                moveTo(398.8f, 388.0f)
                curveToRelative(-7.8f, 19.6f, -22.9f, 34.7f, -42.6f, 42.6f)
                curveToRelative(-29.5f, 11.7f, -99.5f, 9.0f, -132.1f, 9.0f)
                reflectiveCurveToRelative(-102.7f, 2.6f, -132.1f, -9.0f)
                curveToRelative(-19.6f, -7.8f, -34.7f, -22.9f, -42.6f, -42.6f)
                curveToRelative(-11.7f, -29.5f, -9.0f, -99.5f, -9.0f, -132.1f)
                reflectiveCurveToRelative(-2.6f, -102.7f, 9.0f, -132.1f)
                curveToRelative(7.8f, -19.6f, 22.9f, -34.7f, 42.6f, -42.6f)
                curveToRelative(29.5f, -11.7f, 99.5f, -9.0f, 132.1f, -9.0f)
                reflectiveCurveToRelative(102.7f, -2.6f, 132.1f, 9.0f)
                curveToRelative(19.6f, 7.8f, 34.7f, 22.9f, 42.6f, 42.6f)
                curveToRelative(11.7f, 29.5f, 9.0f, 99.5f, 9.0f, 132.1f)
                reflectiveCurveToRelative(2.7f, 102.7f, -9.0f, 132.1f)
                close()
            }
        }
        .build()
        return _instagram!!
    }

private var _instagram: ImageVector? = null
