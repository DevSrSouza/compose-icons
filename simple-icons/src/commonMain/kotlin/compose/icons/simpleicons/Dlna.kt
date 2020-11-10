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

public val SimpleIcons.Dlna: VectorAsset
    get() {
        if (_dlna != null) {
            return _dlna!!
        }
        _dlna = VectorAssetBuilder(name = "Dlna", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.254f, 12.667f)
                horizontalLineTo(13.019f)
                curveToRelative(-1.051f, 0.0f, -2.1f, 0.489f, -2.692f, 1.266f)
                verticalLineToRelative(-0.017f)
                curveToRelative(-0.591f, 0.816f, -1.544f, 1.353f, -2.629f, 1.353f)
                curveToRelative(-1.796f, 0.0f, -3.249f, -1.458f, -3.249f, -3.251f)
                curveToRelative(0.0f, -1.795f, 1.454f, -3.251f, 3.249f, -3.251f)
                curveToRelative(1.085f, 0.0f, 2.039f, 0.536f, 2.629f, 1.353f)
                verticalLineToRelative(-0.013f)
                curveToRelative(0.592f, 0.776f, 1.641f, 1.273f, 2.692f, 1.273f)
                horizontalLineToRelative(10.129f)
                curveToRelative(0.186f, -0.005f, 0.873f, -0.095f, 0.848f, -0.981f)
                curveToRelative(-0.884f, -5.086f, -5.879f, -8.987f, -11.923f, -8.987f)
                curveToRelative(-3.721f, 0.0f, -7.047f, 1.48f, -9.262f, 3.803f)
                curveToRelative(-0.356f, 0.527f, 0.014f, 0.689f, 0.35f, 0.734f)
                horizontalLineToRelative(6.608f)
                curveToRelative(1.05f, 0.0f, 2.1f, -0.498f, 2.691f, -1.277f)
                verticalLineTo(4.69f)
                curveToRelative(0.591f, -0.817f, 1.546f, -1.355f, 2.63f, -1.355f)
                curveToRelative(1.795f, 0.0f, 3.249f, 1.456f, 3.249f, 3.251f)
                curveToRelative(0.0f, 1.793f, -1.454f, 3.252f, -3.249f, 3.252f)
                curveToRelative(-1.084f, 0.0f, -2.039f, -0.537f, -2.63f, -1.355f)
                verticalLineToRelative(0.019f)
                curveToRelative(-0.591f, -0.779f, -1.641f, -1.266f, -2.691f, -1.266f)
                horizontalLineToRelative(-7.22f)
                lineToRelative(0.028f, 0.003f)
                curveToRelative(0.0f, 0.0f, -1.068f, -0.06f, -1.719f, 0.859f)
                curveTo(0.361f, 8.9f, 0.0f, 10.621f, 0.0f, 12.002f)
                curveToRelative(0.0f, 1.388f, 0.198f, 2.649f, 0.867f, 3.923f)
                curveToRelative(0.564f, 0.908f, 1.71f, 0.849f, 1.71f, 0.849f)
                lineTo(2.535f, 16.78f)
                horizontalLineToRelative(7.233f)
                curveToRelative(1.05f, 0.0f, 2.1f, -0.49f, 2.691f, -1.268f)
                verticalLineToRelative(0.019f)
                curveToRelative(0.591f, -0.817f, 1.546f, -1.355f, 2.63f, -1.355f)
                curveToRelative(1.795f, 0.0f, 3.249f, 1.458f, 3.249f, 3.251f)
                curveToRelative(0.0f, 1.795f, -1.454f, 3.251f, -3.249f, 3.251f)
                curveToRelative(-1.084f, 0.0f, -2.039f, -0.537f, -2.63f, -1.354f)
                verticalLineToRelative(0.018f)
                curveToRelative(-0.591f, -0.779f, -1.641f, -1.277f, -2.691f, -1.277f)
                horizontalLineTo(3.164f)
                curveToRelative(-0.328f, 0.042f, -0.698f, 0.198f, -0.379f, 0.699f)
                curveToRelative(2.216f, 2.337f, 5.555f, 3.824f, 9.288f, 3.824f)
                curveToRelative(6.054f, 0.0f, 11.056f, -3.911f, 11.926f, -9.009f)
                curveTo(23.995f, 12.866f, 23.51f, 12.702f, 23.254f, 12.667f)
            }
        }
        .build()
        return _dlna!!
    }

private var _dlna: VectorAsset? = null
