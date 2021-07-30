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

public val SimpleIcons.Wappalyzer: ImageVector
    get() {
        if (_wappalyzer != null) {
            return _wappalyzer!!
        }
        _wappalyzer = Builder(name = "Wappalyzer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.014f)
                verticalLineToRelative(-0.604f)
                lineTo(12.0f, 1.805f)
                lineTo(0.0f, 10.41f)
                verticalLineToRelative(0.603f)
                lineToRelative(12.0f, 8.606f)
                lineToRelative(12.0f, -8.605f)
                close()
                moveTo(8.634f, 10.82f)
                lineToRelative(2.75f, 1.07f)
                lineToRelative(0.016f, -0.01f)
                lineToRelative(-1.526f, -1.967f)
                lineToRelative(0.984f, -0.72f)
                lineToRelative(2.695f, 1.116f)
                lineToRelative(0.016f, -0.011f)
                lineToRelative(-1.463f, -2.018f)
                lineToRelative(1.247f, -0.913f)
                lineToRelative(2.6f, 3.85f)
                lineToRelative(-1.046f, 0.766f)
                lineToRelative(-2.797f, -1.157f)
                lineToRelative(-0.012f, 0.008f)
                lineToRelative(1.593f, 2.038f)
                lineToRelative(-1.048f, 0.767f)
                lineToRelative(-5.26f, -1.903f)
                lineToRelative(1.251f, -0.916f)
                close()
                moveTo(23.052f, 12.308f)
                lineToRelative(0.947f, 0.679f)
                verticalLineToRelative(0.603f)
                lineToRelative(-12.0f, 8.605f)
                lineTo(0.0f, 13.59f)
                verticalLineToRelative(-0.603f)
                lineToRelative(0.947f, -0.678f)
                lineToRelative(10.761f, 7.717f)
                lineToRelative(0.292f, 0.21f)
                lineToRelative(0.291f, -0.21f)
                lineToRelative(10.762f, -7.717f)
                close()
            }
        }
        .build()
        return _wappalyzer!!
    }

private var _wappalyzer: ImageVector? = null
