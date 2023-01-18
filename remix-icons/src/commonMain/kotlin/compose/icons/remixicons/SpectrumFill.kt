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

public val RemixIcons.SpectrumFill: ImageVector
    get() {
        if (_spectrumFill != null) {
            return _spectrumFill!!
        }
        _spectrumFill = Builder(name = "SpectrumFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2f, 2.006f)
                curveTo(21.24f, 2.093f, 22.0f, 3.25f, 22.0f, 12.0f)
                lineToRelative(-0.006f, 1.2f)
                curveTo(21.907f, 21.24f, 20.75f, 22.0f, 12.0f, 22.0f)
                lineToRelative(-1.2f, -0.006f)
                curveToRelative(-7.658f, -0.083f, -8.711f, -1.136f, -8.794f, -8.795f)
                lineTo(2.0f, 11.691f)
                lineToRelative(0.006f, -0.89f)
                curveToRelative(0.085f, -7.85f, 1.19f, -8.76f, 9.382f, -8.8f)
                lineToRelative(1.811f, 0.005f)
                close()
                moveTo(8.25f, 7.0f)
                horizontalLineToRelative(-0.583f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, -0.66f, 0.568f)
                lineTo(7.0f, 7.667f)
                verticalLineToRelative(3.666f)
                curveToRelative(0.0f, 0.335f, 0.247f, 0.612f, 0.568f, 0.66f)
                lineToRelative(0.099f, 0.007f)
                horizontalLineToRelative(0.583f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 3.745f, 3.55f)
                lineToRelative(0.005f, 0.2f)
                verticalLineToRelative(0.583f)
                curveToRelative(0.0f, 0.335f, 0.247f, 0.612f, 0.568f, 0.66f)
                lineToRelative(0.099f, 0.007f)
                horizontalLineToRelative(3.666f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, 0.66f, -0.568f)
                lineToRelative(0.007f, -0.099f)
                verticalLineToRelative(-0.583f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -8.492f, -8.746f)
                lineTo(8.25f, 7.0f)
                close()
            }
        }
        .build()
        return _spectrumFill!!
    }

private var _spectrumFill: ImageVector? = null
