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

public val RemixIcons.SpectrumLine: ImageVector
    get() {
        if (_spectrumLine != null) {
            return _spectrumLine!!
        }
        _spectrumLine = Builder(name = "SpectrumLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.388f, 2.001f)
                lineToRelative(1.811f, 0.005f)
                lineToRelative(0.844f, 0.014f)
                curveToRelative(7.161f, 0.164f, 7.938f, 1.512f, 7.957f, 9.667f)
                lineToRelative(-0.006f, 1.512f)
                lineToRelative(-0.014f, 0.844f)
                curveToRelative(-0.164f, 7.161f, -1.512f, 7.938f, -9.667f, 7.957f)
                lineToRelative(-1.512f, -0.006f)
                lineToRelative(-0.888f, -0.015f)
                curveToRelative(-6.853f, -0.163f, -7.827f, -1.428f, -7.907f, -8.78f)
                lineTo(2.0f, 11.691f)
                lineToRelative(0.006f, -0.89f)
                lineToRelative(0.014f, -0.865f)
                curveToRelative(0.165f, -7.053f, 1.487f, -7.897f, 9.368f, -7.935f)
                close()
                moveTo(14.12f, 4.01f)
                lineTo(10.882f, 4.0f)
                lineToRelative(-1.322f, 0.01f)
                curveToRelative(-5.489f, 0.082f, -5.544f, 0.82f, -5.559f, 7.403f)
                lineToRelative(0.001f, 2.175f)
                lineToRelative(0.01f, 1.04f)
                curveToRelative(0.089f, 4.982f, 0.793f, 5.343f, 6.4f, 5.369f)
                lineToRelative(3.454f, -0.002f)
                lineToRelative(0.776f, -0.009f)
                curveToRelative(5.108f, -0.091f, 5.347f, -0.837f, 5.358f, -6.877f)
                lineToRelative(-0.003f, -2.743f)
                lineToRelative(-0.012f, -1.055f)
                curveToRelative(-0.094f, -4.796f, -0.785f, -5.25f, -5.865f, -5.303f)
                close()
                moveTo(8.25f, 7.0f)
                arcTo(8.75f, 8.75f, 0.0f, false, true, 17.0f, 15.75f)
                verticalLineToRelative(0.583f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, true, -0.667f, 0.667f)
                horizontalLineToRelative(-3.666f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, true, -0.667f, -0.667f)
                verticalLineToRelative(-0.583f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 8.25f, 12.0f)
                horizontalLineToRelative(-0.583f)
                arcTo(0.667f, 0.667f, 0.0f, false, true, 7.0f, 11.333f)
                verticalLineTo(7.667f)
                curveTo(7.0f, 7.299f, 7.299f, 7.0f, 7.667f, 7.0f)
                horizontalLineToRelative(0.583f)
                close()
            }
        }
        .build()
        return _spectrumLine!!
    }

private var _spectrumLine: ImageVector? = null
