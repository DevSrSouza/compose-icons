package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Stellar: ImageVector
    get() {
        if (_stellar != null) {
            return _stellar!!
        }
        _stellar = Builder(name = "Stellar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.283f, 1.851f)
                arcTo(10.154f, 10.154f, 0.0f, false, false, 1.846f, 12.002f)
                curveToRelative(0.0f, 0.259f, 0.01f, 0.516f, 0.03f, 0.773f)
                arcTo(1.847f, 1.847f, 0.0f, false, true, 0.872f, 14.56f)
                lineTo(0.0f, 15.005f)
                verticalLineToRelative(2.074f)
                lineToRelative(2.568f, -1.309f)
                lineToRelative(0.832f, -0.424f)
                lineToRelative(0.82f, -0.417f)
                lineToRelative(14.71f, -7.496f)
                lineToRelative(1.653f, -0.842f)
                lineTo(24.0f, 4.85f)
                verticalLineTo(2.776f)
                lineToRelative(-3.387f, 1.728f)
                lineToRelative(-2.89f, 1.473f)
                lineToRelative(-13.955f, 7.108f)
                arcToRelative(8.376f, 8.376f, 0.0f, false, true, -0.07f, -1.086f)
                arcToRelative(8.313f, 8.313f, 0.0f, false, true, 12.366f, -7.247f)
                lineToRelative(1.654f, -0.843f)
                lineToRelative(0.247f, -0.126f)
                arcToRelative(10.154f, 10.154f, 0.0f, false, false, -5.682f, -1.932f)
                close()
                moveTo(24.0f, 6.925f)
                lineTo(5.055f, 16.571f)
                lineToRelative(-1.653f, 0.844f)
                lineTo(0.0f, 19.15f)
                verticalLineToRelative(2.072f)
                lineTo(3.378f, 19.5f)
                lineToRelative(2.89f, -1.473f)
                lineToRelative(13.97f, -7.117f)
                arcToRelative(8.474f, 8.474f, 0.0f, false, true, 0.07f, 1.092f)
                arcTo(8.313f, 8.313f, 0.0f, false, true, 7.93f, 19.248f)
                lineToRelative(-0.101f, 0.054f)
                lineToRelative(-1.793f, 0.914f)
                arcToRelative(10.154f, 10.154f, 0.0f, false, false, 16.119f, -8.214f)
                curveToRelative(0.0f, -0.26f, -0.01f, -0.522f, -0.03f, -0.78f)
                arcToRelative(1.848f, 1.848f, 0.0f, false, true, 1.003f, -1.785f)
                lineTo(24.0f, 8.992f)
                close()
            }
        }
        .build()
        return _stellar!!
    }

private var _stellar: ImageVector? = null
