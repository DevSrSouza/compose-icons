package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Hackerrank: ImageVector
    get() {
        if (_hackerrank != null) {
            return _hackerrank!!
        }
        _hackerrank = Builder(name = "Hackerrank", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.998f, 3.0f)
                curveTo(14.225f, 3.0f, 5.535f, 7.984f, 4.658f, 9.504f)
                curveTo(3.78f, 11.025f, 3.78f, 20.983f, 4.658f, 22.498f)
                curveTo(5.539f, 24.017f, 14.229f, 29.0f, 15.998f, 29.0f)
                curveTo(17.762f, 29.0f, 26.452f, 24.02f, 27.336f, 22.502f)
                curveTo(28.223f, 20.98f, 28.223f, 11.014f, 27.336f, 9.498f)
                lineTo(27.336f, 9.496f)
                curveTo(26.445f, 7.979f, 17.756f, 3.0f, 15.998f, 3.0f)
                close()
                moveTo(15.996f, 5.012f)
                curveTo(17.693f, 5.365f, 24.418f, 9.217f, 25.596f, 10.51f)
                curveTo(26.136f, 12.151f, 26.135f, 19.844f, 25.596f, 21.488f)
                curveTo(24.426f, 22.779f, 17.695f, 26.636f, 15.996f, 26.988f)
                curveTo(14.298f, 26.638f, 7.572f, 22.783f, 6.4f, 21.49f)
                curveTo(5.865f, 19.842f, 5.865f, 12.156f, 6.4f, 10.51f)
                curveTo(7.569f, 9.217f, 14.297f, 5.362f, 15.996f, 5.012f)
                close()
                moveTo(13.0f, 9.0f)
                lineTo(11.0f, 11.0f)
                lineTo(12.0f, 11.0f)
                lineTo(12.0f, 21.0f)
                lineTo(14.0f, 21.0f)
                lineTo(14.0f, 17.0f)
                lineTo(18.0f, 17.0f)
                lineTo(18.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                lineTo(19.0f, 23.0f)
                lineTo(21.0f, 21.0f)
                lineTo(20.0f, 21.0f)
                lineTo(20.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                lineTo(18.0f, 15.0f)
                lineTo(14.0f, 15.0f)
                lineTo(14.0f, 11.0f)
                lineTo(15.0f, 11.0f)
                lineTo(13.0f, 9.0f)
                close()
            }
        }
        .build()
        return _hackerrank!!
    }

private var _hackerrank: ImageVector? = null
