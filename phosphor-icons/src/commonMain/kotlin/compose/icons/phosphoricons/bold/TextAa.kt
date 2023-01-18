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

public val BoldGroup.TextAa: ImageVector
    get() {
        if (_textAa != null) {
            return _textAa!!
        }
        _textAa = Builder(name = "TextAa", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.9f, 50.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -21.8f, 0.0f)
                lineToRelative(-64.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 21.8f, 10.2f)
                lineTo(38.4f, 164.0f)
                horizontalLineToRelative(75.2f)
                lineToRelative(15.5f, 33.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 204.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, 5.1f, -1.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 5.8f, -16.0f)
                close()
                moveTo(49.7f, 140.0f)
                lineTo(76.0f, 84.2f)
                lineTo(102.3f, 140.0f)
                close()
                moveTo(204.0f, 90.9f)
                arcToRelative(47.0f, 47.0f, 0.0f, false, false, -26.9f, 8.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.8f, 19.7f)
                arcToRelative(22.6f, 22.6f, 0.0f, false, true, 13.1f, -4.0f)
                curveToRelative(11.0f, 0.0f, 20.0f, 7.2f, 20.0f, 16.0f)
                verticalLineToRelative(1.4f)
                arcToRelative(48.8f, 48.8f, 0.0f, false, false, -20.0f, -4.3f)
                curveToRelative(-24.3f, 0.0f, -44.0f, 17.5f, -44.0f, 39.0f)
                reflectiveCurveToRelative(19.7f, 39.0f, 44.0f, 39.0f)
                arcToRelative(48.4f, 48.4f, 0.0f, false, false, 23.2f, -5.9f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 236.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(248.0f, 130.9f)
                curveTo(248.0f, 108.8f, 228.3f, 90.9f, 204.0f, 90.9f)
                close()
                moveTo(204.0f, 182.0f)
                curveToRelative(-10.8f, 0.0f, -20.0f, -6.9f, -20.0f, -15.0f)
                reflectiveCurveToRelative(9.2f, -15.0f, 20.0f, -15.0f)
                reflectiveCurveToRelative(20.0f, 6.9f, 20.0f, 15.0f)
                reflectiveCurveTo(214.8f, 182.0f, 204.0f, 182.0f)
                close()
            }
        }
        .build()
        return _textAa!!
    }

private var _textAa: ImageVector? = null
