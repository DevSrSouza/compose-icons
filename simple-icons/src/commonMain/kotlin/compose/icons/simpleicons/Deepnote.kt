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

public val SimpleIcons.Deepnote: ImageVector
    get() {
        if (_deepnote != null) {
            return _deepnote!!
        }
        _deepnote = Builder(name = "Deepnote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.22f, 11.506f)
                lineToRelative(0.111f, 0.018f)
                curveToRelative(-0.038f, -0.006f, -0.075f, -0.011f, -0.111f, -0.018f)
                close()
                moveTo(14.695f, 19.579f)
                curveToRelative(0.636f, -2.816f, -2.172f, -4.8f, -6.955f, -4.814f)
                lineTo(0.713f, 24.0f)
                horizontalLineToRelative(9.586f)
                curveToRelative(0.132f, -0.025f, 0.256f, -0.056f, 0.384f, -0.085f)
                curveToRelative(2.258f, -1.057f, 3.598f, -2.501f, 4.012f, -4.336f)
                close()
                moveTo(10.299f, 24.0f)
                horizontalLineToRelative(0.203f)
                lineToRelative(0.021f, -0.01f)
                curveToRelative(-0.075f, 0.003f, -0.148f, 0.008f, -0.224f, 0.01f)
                close()
                moveTo(24.0f, 11.319f)
                curveTo(24.0f, 3.15f, 18.711f, -0.597f, 8.134f, 0.077f)
                lineTo(0.0f, 11.319f)
                horizontalLineToRelative(7.568f)
                curveToRelative(3.323f, 0.0f, 8.457f, 0.719f, 8.457f, 6.153f)
                curveToRelative(0.0f, 3.622f, -1.909f, 5.798f, -5.727f, 6.528f)
                curveToRelative(0.099f, -0.003f, 0.194f, -0.009f, 0.291f, -0.013f)
                lineToRelative(-0.011f, 0.001f)
                lineToRelative(-0.076f, 0.012f)
                horizontalLineToRelative(0.912f)
                lineToRelative(0.247f, -0.077f)
                curveTo(19.885f, 23.27f, 24.0f, 19.07f, 24.0f, 11.319f)
                close()
            }
        }
        .build()
        return _deepnote!!
    }

private var _deepnote: ImageVector? = null
