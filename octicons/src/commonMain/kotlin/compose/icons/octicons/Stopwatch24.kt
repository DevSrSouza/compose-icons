package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Stopwatch24: ImageVector
    get() {
        if (_stopwatch24 != null) {
            return _stopwatch24!!
        }
        _stopwatch24 = Builder(name = "Stopwatch24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.25f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.278f)
                arcToRelative(9.955f, 9.955f, 0.0f, false, false, -5.635f, 2.276f)
                lineTo(4.28f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(1.315f, 1.316f)
                arcTo(9.962f, 9.962f, 0.0f, false, false, 2.0f, 12.75f)
                curveToRelative(0.0f, 5.523f, 4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                arcToRelative(9.962f, 9.962f, 0.0f, false, false, -2.535f, -6.654f)
                lineTo(20.78f, 4.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-1.334f, 1.334f)
                arcToRelative(9.955f, 9.955f, 0.0f, false, false, -5.636f, -2.276f)
                lineTo(12.75f, 1.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(12.0f, 21.25f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, -17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, 17.0f)
                close()
                moveTo(16.03f, 8.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-2.381f, 2.382f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(2.38f, -2.382f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.061f, 0.0f)
                close()
            }
        }
        .build()
        return _stopwatch24!!
    }

private var _stopwatch24: ImageVector? = null
