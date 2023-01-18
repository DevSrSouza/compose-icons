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

public val RemixIcons.InstagramFill: ImageVector
    get() {
        if (_instagramFill != null) {
            return _instagramFill!!
        }
        _instagramFill = Builder(name = "InstagramFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(2.717f, 0.0f, 3.056f, 0.01f, 4.122f, 0.06f)
                curveToRelative(1.065f, 0.05f, 1.79f, 0.217f, 2.428f, 0.465f)
                curveToRelative(0.66f, 0.254f, 1.216f, 0.598f, 1.772f, 1.153f)
                arcToRelative(4.908f, 4.908f, 0.0f, false, true, 1.153f, 1.772f)
                curveToRelative(0.247f, 0.637f, 0.415f, 1.363f, 0.465f, 2.428f)
                curveToRelative(0.047f, 1.066f, 0.06f, 1.405f, 0.06f, 4.122f)
                curveToRelative(0.0f, 2.717f, -0.01f, 3.056f, -0.06f, 4.122f)
                curveToRelative(-0.05f, 1.065f, -0.218f, 1.79f, -0.465f, 2.428f)
                arcToRelative(4.883f, 4.883f, 0.0f, false, true, -1.153f, 1.772f)
                arcToRelative(4.915f, 4.915f, 0.0f, false, true, -1.772f, 1.153f)
                curveToRelative(-0.637f, 0.247f, -1.363f, 0.415f, -2.428f, 0.465f)
                curveToRelative(-1.066f, 0.047f, -1.405f, 0.06f, -4.122f, 0.06f)
                curveToRelative(-2.717f, 0.0f, -3.056f, -0.01f, -4.122f, -0.06f)
                curveToRelative(-1.065f, -0.05f, -1.79f, -0.218f, -2.428f, -0.465f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, true, -1.772f, -1.153f)
                arcToRelative(4.904f, 4.904f, 0.0f, false, true, -1.153f, -1.772f)
                curveToRelative(-0.248f, -0.637f, -0.415f, -1.363f, -0.465f, -2.428f)
                curveTo(2.013f, 15.056f, 2.0f, 14.717f, 2.0f, 12.0f)
                curveToRelative(0.0f, -2.717f, 0.01f, -3.056f, 0.06f, -4.122f)
                curveToRelative(0.05f, -1.066f, 0.217f, -1.79f, 0.465f, -2.428f)
                arcToRelative(4.88f, 4.88f, 0.0f, false, true, 1.153f, -1.772f)
                arcTo(4.897f, 4.897f, 0.0f, false, true, 5.45f, 2.525f)
                curveToRelative(0.638f, -0.248f, 1.362f, -0.415f, 2.428f, -0.465f)
                curveTo(8.944f, 2.013f, 9.283f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, -10.0f)
                close()
                moveTo(18.5f, 6.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                close()
            }
        }
        .build()
        return _instagramFill!!
    }

private var _instagramFill: ImageVector? = null
