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

public val SolidGroup.SadCry: ImageVector
    get() {
        if (_sadCry != null) {
            return _sadCry!!
        }
        _sadCry = Builder(name = "SadCry", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                curveToRelative(0.0f, 90.1f, 48.2f, 168.7f, 120.0f, 212.1f)
                lineTo(120.0f, 288.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(196.7f)
                curveToRelative(29.5f, 12.4f, 62.0f, 19.3f, 96.0f, 19.3f)
                reflectiveCurveToRelative(66.5f, -6.9f, 96.0f, -19.3f)
                lineTo(344.0f, 288.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(180.1f)
                curveTo(447.8f, 424.7f, 496.0f, 346.0f, 496.0f, 256.0f)
                curveTo(496.0f, 119.0f, 385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(182.5f, 224.5f)
                curveToRelative(-14.8f, -13.2f, -46.2f, -13.2f, -61.0f, 0.0f)
                lineTo(112.0f, 233.0f)
                curveToRelative(-3.8f, 3.3f, -9.3f, 4.0f, -13.7f, 1.6f)
                curveToRelative(-4.4f, -2.4f, -6.9f, -7.4f, -6.1f, -12.4f)
                curveToRelative(4.0f, -25.2f, 34.2f, -42.1f, 59.9f, -42.1f)
                reflectiveCurveTo(208.0f, 197.0f, 212.0f, 222.2f)
                curveToRelative(0.8f, 5.0f, -1.7f, 10.0f, -6.1f, 12.4f)
                curveToRelative(-5.8f, 3.1f, -11.2f, 0.7f, -13.7f, -1.6f)
                lineToRelative(-9.7f, -8.5f)
                close()
                moveTo(248.0f, 416.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -28.7f, -48.0f, -64.0f)
                reflectiveCurveToRelative(21.5f, -64.0f, 48.0f, -64.0f)
                reflectiveCurveToRelative(48.0f, 28.7f, 48.0f, 64.0f)
                reflectiveCurveToRelative(-21.5f, 64.0f, -48.0f, 64.0f)
                close()
                moveTo(397.8f, 234.5f)
                curveToRelative(-5.8f, 3.1f, -11.2f, 0.7f, -13.7f, -1.6f)
                lineToRelative(-9.5f, -8.5f)
                curveToRelative(-14.8f, -13.2f, -46.2f, -13.2f, -61.0f, 0.0f)
                lineTo(304.0f, 233.0f)
                curveToRelative(-3.8f, 3.3f, -9.3f, 4.0f, -13.7f, 1.6f)
                curveToRelative(-4.4f, -2.4f, -6.9f, -7.4f, -6.1f, -12.4f)
                curveToRelative(4.0f, -25.2f, 34.2f, -42.1f, 59.9f, -42.1f)
                reflectiveCurveTo(400.0f, 197.0f, 404.0f, 222.2f)
                curveToRelative(0.6f, 4.9f, -1.8f, 9.9f, -6.2f, 12.3f)
                close()
            }
        }
        .build()
        return _sadCry!!
    }

private var _sadCry: ImageVector? = null
