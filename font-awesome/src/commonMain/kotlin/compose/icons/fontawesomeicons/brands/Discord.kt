package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Discord: ImageVector
    get() {
        if (_discord != null) {
            return _discord!!
        }
        _discord = Builder(name = "Discord", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(524.531f, 69.836f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.764f, -0.7f)
                arcTo(485.065f, 485.065f, 0.0f, false, false, 404.081f, 32.03f)
                arcToRelative(1.816f, 1.816f, 0.0f, false, false, -1.923f, 0.91f)
                arcToRelative(337.461f, 337.461f, 0.0f, false, false, -14.9f, 30.6f)
                arcToRelative(447.848f, 447.848f, 0.0f, false, false, -134.426f, 0.0f)
                arcToRelative(309.541f, 309.541f, 0.0f, false, false, -15.135f, -30.6f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, -1.924f, -0.91f)
                arcTo(483.689f, 483.689f, 0.0f, false, false, 116.085f, 69.137f)
                arcToRelative(1.712f, 1.712f, 0.0f, false, false, -0.788f, 0.676f)
                curveTo(39.068f, 183.651f, 18.186f, 294.69f, 28.43f, 404.354f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, false, 0.765f, 1.375f)
                arcTo(487.666f, 487.666f, 0.0f, false, false, 176.02f, 479.918f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 2.063f, -0.676f)
                arcTo(348.2f, 348.2f, 0.0f, false, false, 208.12f, 430.4f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, false, -1.019f, -2.588f)
                arcToRelative(321.173f, 321.173f, 0.0f, false, true, -45.868f, -21.853f)
                arcToRelative(1.885f, 1.885f, 0.0f, false, true, -0.185f, -3.126f)
                curveToRelative(3.082f, -2.309f, 6.166f, -4.711f, 9.109f, -7.137f)
                arcToRelative(1.819f, 1.819f, 0.0f, false, true, 1.9f, -0.256f)
                curveToRelative(96.229f, 43.917f, 200.41f, 43.917f, 295.5f, 0.0f)
                arcToRelative(1.812f, 1.812f, 0.0f, false, true, 1.924f, 0.233f)
                curveToRelative(2.944f, 2.426f, 6.027f, 4.851f, 9.132f, 7.16f)
                arcToRelative(1.884f, 1.884f, 0.0f, false, true, -0.162f, 3.126f)
                arcToRelative(301.407f, 301.407f, 0.0f, false, true, -45.89f, 21.83f)
                arcToRelative(1.875f, 1.875f, 0.0f, false, false, -1.0f, 2.611f)
                arcToRelative(391.055f, 391.055f, 0.0f, false, false, 30.014f, 48.815f)
                arcToRelative(1.864f, 1.864f, 0.0f, false, false, 2.063f, 0.7f)
                arcTo(486.048f, 486.048f, 0.0f, false, false, 610.7f, 405.729f)
                arcToRelative(1.882f, 1.882f, 0.0f, false, false, 0.765f, -1.352f)
                curveTo(623.729f, 277.594f, 590.933f, 167.465f, 524.531f, 69.836f)
                close()
                moveTo(222.491f, 337.58f)
                curveToRelative(-28.972f, 0.0f, -52.844f, -26.587f, -52.844f, -59.239f)
                reflectiveCurveTo(193.056f, 219.1f, 222.491f, 219.1f)
                curveToRelative(29.665f, 0.0f, 53.306f, 26.82f, 52.843f, 59.239f)
                curveTo(275.334f, 310.993f, 251.924f, 337.58f, 222.491f, 337.58f)
                close()
                moveTo(417.871f, 337.58f)
                curveToRelative(-28.971f, 0.0f, -52.843f, -26.587f, -52.843f, -59.239f)
                reflectiveCurveTo(388.437f, 219.1f, 417.871f, 219.1f)
                curveToRelative(29.667f, 0.0f, 53.307f, 26.82f, 52.844f, 59.239f)
                curveTo(470.715f, 310.993f, 447.538f, 337.58f, 417.871f, 337.58f)
                close()
            }
        }
        .build()
        return _discord!!
    }

private var _discord: ImageVector? = null
