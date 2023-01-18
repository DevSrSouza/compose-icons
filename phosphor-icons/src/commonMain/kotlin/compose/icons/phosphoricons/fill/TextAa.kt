package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.TextAa: ImageVector
    get() {
        if (_textAa != null) {
            return _textAa!!
        }
        _textAa = Builder(name = "TextAa", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 94.9f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -29.6f, 11.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.2f, 11.4f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 18.4f, -7.2f)
                curveToRelative(13.2f, 0.0f, 24.0f, 9.0f, 24.0f, 20.0f)
                verticalLineToRelative(7.2f)
                arcToRelative(43.0f, 43.0f, 0.0f, false, false, -24.0f, -7.2f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 16.1f, -40.0f, 36.0f)
                reflectiveCurveToRelative(17.9f, 36.0f, 40.0f, 36.0f)
                arcToRelative(42.9f, 42.9f, 0.0f, false, false, 24.7f, -7.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 240.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(248.0f, 130.9f)
                curveTo(248.0f, 111.0f, 230.1f, 94.9f, 208.0f, 94.9f)
                close()
                moveTo(208.0f, 186.9f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -9.0f, -24.0f, -20.0f)
                reflectiveCurveToRelative(10.8f, -20.0f, 24.0f, -20.0f)
                reflectiveCurveToRelative(24.0f, 9.0f, 24.0f, 20.0f)
                reflectiveCurveTo(221.2f, 186.9f, 208.0f, 186.9f)
                close()
                moveTo(137.9f, 148.2f)
                horizontalLineToRelative(0.0f)
                lineTo(87.1f, 52.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.2f, 0.0f)
                lineTo(22.1f, 148.2f)
                horizontalLineToRelative(0.0f)
                lineTo(0.9f, 188.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 3.4f, 10.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 10.8f, -3.4f)
                lineTo(34.0f, 160.0f)
                horizontalLineToRelative(92.0f)
                lineToRelative(18.9f, 35.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 152.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.1f, -11.7f)
                close()
                moveTo(42.5f, 144.0f)
                lineTo(80.0f, 73.1f)
                lineTo(117.5f, 144.0f)
                close()
            }
        }
        .build()
        return _textAa!!
    }

private var _textAa: ImageVector? = null
