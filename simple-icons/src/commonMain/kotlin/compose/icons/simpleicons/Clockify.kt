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

public val SimpleIcons.Clockify: ImageVector
    get() {
        if (_clockify != null) {
            return _clockify!!
        }
        _clockify = Builder(name = "Clockify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3512f, 20.4035f)
                curveToRelative(1.1108f, 0.0f, 2.169f, -0.2217f, 3.139f, -0.6157f)
                lineToRelative(2.6913f, 2.6944f)
                curveTo(17.4555f, 23.4458f, 15.4688f, 24.0f, 13.3512f, 24.0f)
                curveTo(6.729f, 24.0f, 1.3594f, 18.627f, 1.3594f, 12.0006f)
                curveTo(1.3594f, 5.3729f, 6.7289f, 0.0f, 13.3512f, 0.0f)
                curveToRelative(2.0964f, 0.0f, 4.0652f, 0.5406f, 5.7789f, 1.4865f)
                lineTo(16.4834f, 4.136f)
                curveToRelative(-0.9687f, -0.3918f, -2.0236f, -0.6134f, -3.1322f, -0.6134f)
                curveToRelative(-4.6379f, 0.0f, -8.3976f, 3.779f, -8.3976f, 8.441f)
                curveToRelative(0.0f, 4.6609f, 3.7597f, 8.4399f, 8.3976f, 8.4399f)
                close()
                moveTo(15.5272f, 8.2491f)
                lineToRelative(5.5104f, -5.5139f)
                lineToRelative(1.5773f, 1.5772f)
                lineToRelative(-5.5104f, 5.514f)
                close()
                moveTo(13.2944f, 13.8839f)
                curveToRelative(-1.0784f, 0.0f, -1.952f, -0.8775f, -1.952f, -1.961f)
                curveToRelative(0.0f, -1.0825f, 0.8736f, -1.9611f, 1.952f, -1.9611f)
                curveToRelative(1.0784f, 0.0f, 1.952f, 0.8786f, 1.952f, 1.961f)
                curveToRelative(0.0f, 1.0836f, -0.8736f, 1.9611f, -1.952f, 1.9611f)
                close()
                moveTo(22.6406f, 19.5792f)
                lineToRelative(-1.5772f, 1.5783f)
                lineToRelative(-5.5105f, -5.514f)
                lineToRelative(1.5774f, -1.5783f)
                close()
            }
        }
        .build()
        return _clockify!!
    }

private var _clockify: ImageVector? = null
