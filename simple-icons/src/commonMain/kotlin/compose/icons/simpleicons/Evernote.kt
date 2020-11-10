package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Evernote: VectorAsset
    get() {
        if (_evernote != null) {
            return _evernote!!
        }
        _evernote = VectorAssetBuilder(name = "Evernote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.692f, 5.445f)
                curveToRelative(0.0f, 0.239f, -0.02f, 0.637f, -0.256f, 0.895f)
                curveToRelative(-0.257f, 0.24f, -0.652f, 0.259f, -0.888f, 0.259f)
                lineTo(4.022f, 6.599f)
                curveToRelative(-0.73f, 0.0f, -1.165f, 0.0f, -1.46f, 0.04f)
                curveToRelative(-0.159f, 0.02f, -0.356f, 0.1f, -0.455f, 0.14f)
                curveToRelative(-0.04f, 0.019f, -0.04f, 0.0f, -0.02f, -0.02f)
                lineTo(7.85f, 0.848f)
                curveToRelative(0.02f, -0.02f, 0.04f, -0.02f, 0.02f, 0.02f)
                curveToRelative(-0.04f, 0.099f, -0.118f, 0.298f, -0.138f, 0.457f)
                curveToRelative(-0.04f, 0.298f, -0.04f, 0.736f, -0.04f, 1.472f)
                verticalLineToRelative(2.647f)
                close()
                moveTo(13.04f, 23.314f)
                curveToRelative(-0.67f, -0.438f, -1.026f, -1.015f, -1.164f, -1.373f)
                arcToRelative(2.924f, 2.924f, 0.0f, false, true, -0.217f, -1.095f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, 3.0f, -3.004f)
                curveToRelative(0.493f, 0.0f, 0.888f, 0.398f, 0.888f, 0.895f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, true, -0.454f, 0.776f)
                curveToRelative(-0.099f, 0.06f, -0.237f, 0.1f, -0.336f, 0.12f)
                curveToRelative(-0.098f, 0.02f, -0.473f, 0.06f, -0.65f, 0.218f)
                curveToRelative(-0.198f, 0.16f, -0.356f, 0.418f, -0.356f, 0.697f)
                curveToRelative(0.0f, 0.298f, 0.118f, 0.577f, 0.316f, 0.776f)
                curveToRelative(0.355f, 0.358f, 0.829f, 0.557f, 1.342f, 0.557f)
                arcToRelative(2.436f, 2.436f, 0.0f, false, false, 2.427f, -2.447f)
                curveToRelative(0.0f, -1.214f, -0.809f, -2.289f, -1.875f, -2.766f)
                curveToRelative(-0.158f, -0.08f, -0.414f, -0.14f, -0.651f, -0.2f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, false, -0.592f, -0.099f)
                curveToRelative(-0.829f, -0.1f, -2.901f, -0.756f, -3.04f, -2.606f)
                curveToRelative(0.0f, 0.0f, -0.611f, 2.785f, -1.835f, 3.541f)
                curveToRelative(-0.118f, 0.06f, -0.276f, 0.12f, -0.454f, 0.16f)
                curveToRelative(-0.177f, 0.04f, -0.374f, 0.06f, -0.434f, 0.06f)
                curveToRelative(-1.993f, 0.119f, -4.105f, -0.518f, -5.565f, -2.03f)
                curveToRelative(0.0f, 0.0f, -0.987f, -0.816f, -1.5f, -3.104f)
                curveToRelative(-0.118f, -0.558f, -0.355f, -1.553f, -0.493f, -2.488f)
                curveToRelative(-0.06f, -0.338f, -0.08f, -0.597f, -0.099f, -0.836f)
                curveToRelative(0.0f, -0.975f, 0.592f, -1.631f, 1.342f, -1.73f)
                horizontalLineToRelative(4.026f)
                curveToRelative(0.69f, 0.0f, 1.086f, -0.18f, 1.342f, -0.419f)
                curveToRelative(0.336f, -0.318f, 0.415f, -0.776f, 0.415f, -1.313f)
                verticalLineToRelative(-4.08f)
                verticalLineToRelative(-0.118f)
                curveTo(8.52f, 0.669f, 9.173f, 0.052f, 10.139f, 0.052f)
                horizontalLineToRelative(0.474f)
                curveToRelative(0.197f, 0.0f, 0.434f, 0.02f, 0.651f, 0.04f)
                curveToRelative(0.158f, 0.02f, 0.296f, 0.06f, 0.533f, 0.12f)
                curveToRelative(1.204f, 0.298f, 1.46f, 1.532f, 1.46f, 1.532f)
                reflectiveCurveToRelative(2.27f, 0.398f, 3.415f, 0.597f)
                curveToRelative(1.085f, 0.199f, 3.77f, 0.378f, 4.282f, 3.104f)
                curveToRelative(1.204f, 6.487f, 0.474f, 12.775f, 0.415f, 12.775f)
                curveToRelative(-0.849f, 6.129f, -5.901f, 5.83f, -5.901f, 5.83f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.428f, -0.736f)
                close()
                moveTo(17.58f, 10.28f)
                curveToRelative(-0.652f, -0.06f, -1.204f, 0.2f, -1.402f, 0.697f)
                curveToRelative(-0.04f, 0.1f, -0.079f, 0.219f, -0.059f, 0.278f)
                curveToRelative(0.02f, 0.06f, 0.06f, 0.08f, 0.099f, 0.1f)
                curveToRelative(0.237f, 0.12f, 0.631f, 0.179f, 1.204f, 0.239f)
                curveToRelative(0.572f, 0.06f, 0.967f, 0.1f, 1.223f, 0.06f)
                curveToRelative(0.04f, 0.0f, 0.08f, -0.02f, 0.119f, -0.08f)
                curveToRelative(0.04f, -0.06f, 0.02f, -0.18f, 0.02f, -0.279f)
                curveToRelative(-0.06f, -0.537f, -0.553f, -0.935f, -1.204f, -1.015f)
                close()
            }
        }
        .build()
        return _evernote!!
    }

private var _evernote: VectorAsset? = null
