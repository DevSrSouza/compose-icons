package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                    pathFillType = NonZero) {
                moveTo(10.25f, 0.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.278f)
                arcToRelative(9.954f, 9.954f, 0.0f, false, true, 5.636f, 2.276f)
                lineTo(19.72f, 3.72f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, 0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, 1.042f)
                lineToRelative(-1.315f, 1.316f)
                arcTo(9.959f, 9.959f, 0.0f, false, true, 22.0f, 12.75f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveToRelative(-10.0f, -4.477f, -10.0f, -10.0f)
                arcToRelative(9.959f, 9.959f, 0.0f, false, true, 2.535f, -6.654f)
                lineTo(3.22f, 4.78f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, -1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, -0.018f)
                lineToRelative(1.335f, 1.334f)
                arcToRelative(9.958f, 9.958f, 0.0f, false, true, 5.635f, -2.276f)
                lineTo(11.25f, 1.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(12.0f, 21.25f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, -0.001f, -17.001f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 12.0f, 21.25f)
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
