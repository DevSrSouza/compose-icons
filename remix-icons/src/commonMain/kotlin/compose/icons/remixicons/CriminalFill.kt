package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CriminalFill: ImageVector
    get() {
        if (_criminalFill != null) {
            return _criminalFill!!
        }
        _criminalFill = Builder(name = "CriminalFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 6.894f, 14.786f)
                curveToRelative(1.255f, 0.83f, 2.033f, 1.89f, 2.101f, 3.049f)
                lineTo(21.0f, 20.0f)
                lineToRelative(-9.0f, 2.0f)
                lineToRelative(-9.0f, -2.0f)
                lineToRelative(0.005f, -0.165f)
                curveToRelative(0.067f, -1.16f, 0.846f, -2.22f, 2.1f, -3.05f)
                arcTo(8.965f, 8.965f, 0.0f, false, true, 3.0f, 11.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, -9.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 0.672f, -2.5f, 1.5f)
                reflectiveCurveTo(10.62f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveToRelative(2.5f, -0.672f, 2.5f, -1.5f)
                reflectiveCurveTo(13.38f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.672f, -2.0f, 1.5f)
                reflectiveCurveTo(7.895f, 11.0f, 9.0f, 11.0f)
                reflectiveCurveToRelative(2.0f, -0.672f, 2.0f, -1.5f)
                reflectiveCurveTo(10.105f, 8.0f, 9.0f, 8.0f)
                close()
                moveTo(15.0f, 8.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.672f, -2.0f, 1.5f)
                reflectiveCurveToRelative(0.895f, 1.5f, 2.0f, 1.5f)
                reflectiveCurveToRelative(2.0f, -0.672f, 2.0f, -1.5f)
                reflectiveCurveTo(16.105f, 8.0f, 15.0f, 8.0f)
                close()
            }
        }
        .build()
        return _criminalFill!!
    }

private var _criminalFill: ImageVector? = null
