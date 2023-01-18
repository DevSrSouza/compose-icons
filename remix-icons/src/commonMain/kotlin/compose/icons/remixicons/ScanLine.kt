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

public val RemixIcons.ScanLine: ImageVector
    get() {
        if (_scanLine != null) {
            return _scanLine!!
        }
        _scanLine = Builder(name = "ScanLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.671f, 4.257f)
                lineTo(13.414f, 12.0f)
                lineTo(12.0f, 13.414f)
                lineToRelative(-6.32f, -6.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 3.706f, -2.658f)
                lineTo(7.85f, 2.9f)
                arcTo(9.963f, 9.963f, 0.0f, false, true, 12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                arcToRelative(9.98f, 9.98f, 0.0f, false, true, 3.671f, -7.743f)
                close()
            }
        }
        .build()
        return _scanLine!!
    }

private var _scanLine: ImageVector? = null
