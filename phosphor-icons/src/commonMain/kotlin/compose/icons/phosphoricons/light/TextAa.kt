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

public val LightGroup.TextAa: ImageVector
    get() {
        if (_textAa != null) {
            return _textAa!!
        }
        _textAa = Builder(name = "TextAa", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.1f, 149.1f)
                horizontalLineToRelative(0.0f)
                lineTo(85.3f, 53.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.6f, 0.0f)
                lineTo(23.9f, 149.1f)
                horizontalLineToRelative(0.0f)
                lineTo(2.7f, 189.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.6f, 5.6f)
                lineTo(32.8f, 158.0f)
                horizontalLineToRelative(94.4f)
                lineToRelative(19.5f, 36.8f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 152.0f, 198.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 2.8f, -0.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.5f, -8.1f)
                close()
                moveTo(39.1f, 146.0f)
                lineTo(80.0f, 68.8f)
                lineTo(120.9f, 146.0f)
                close()
                moveTo(208.0f, 96.9f)
                arcToRelative(40.2f, 40.2f, 0.0f, false, false, -28.2f, 11.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.1f, 8.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.5f, 0.0f)
                arcToRelative(28.3f, 28.3f, 0.0f, false, true, 19.8f, -7.7f)
                curveToRelative(14.3f, 0.0f, 26.0f, 9.9f, 26.0f, 22.0f)
                verticalLineToRelative(11.2f)
                arcToRelative(40.3f, 40.3f, 0.0f, false, false, -26.0f, -9.2f)
                curveToRelative(-21.0f, 0.0f, -38.0f, 15.3f, -38.0f, 34.0f)
                reflectiveCurveToRelative(17.0f, 34.0f, 38.0f, 34.0f)
                arcToRelative(40.3f, 40.3f, 0.0f, false, false, 26.0f, -9.2f)
                verticalLineToRelative(0.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(246.0f, 130.9f)
                curveTo(246.0f, 112.2f, 229.0f, 96.9f, 208.0f, 96.9f)
                close()
                moveTo(208.0f, 188.9f)
                curveToRelative(-14.3f, 0.0f, -26.0f, -9.9f, -26.0f, -22.0f)
                reflectiveCurveToRelative(11.7f, -22.0f, 26.0f, -22.0f)
                reflectiveCurveToRelative(26.0f, 9.9f, 26.0f, 22.0f)
                reflectiveCurveTo(222.3f, 188.9f, 208.0f, 188.9f)
                close()
            }
        }
        .build()
        return _textAa!!
    }

private var _textAa: ImageVector? = null
