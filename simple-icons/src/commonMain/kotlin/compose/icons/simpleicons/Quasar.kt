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

public val SimpleIcons.Quasar: VectorAsset
    get() {
        if (_quasar != null) {
            return _quasar!!
        }
        _quasar = VectorAssetBuilder(name = "Quasar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.34f, 12.001f)
                arcToRelative(2.342f, 2.342f, 0.0f, false, true, -4.683f, 0.0f)
                arcToRelative(2.342f, 2.342f, 0.0f, false, true, 4.684f, 0.0f)
                close()
                moveTo(22.391f, 6.001f)
                arcToRelative(11.996f, 11.996f, 0.0f, false, false, -1.839f, -2.405f)
                lineToRelative(-2.707f, 1.562f)
                arcToRelative(9.002f, 9.002f, 0.0f, false, false, -2.825f, -1.637f)
                arcToRelative(11.107f, 11.107f, 0.0f, false, false, -2.187f, 3.12f)
                curveToRelative(3.012f, -0.204f, 6.124f, 0.885f, 9.013f, 3.142f)
                lineToRelative(1.703f, -0.983f)
                arcTo(11.969f, 11.969f, 0.0f, false, false, 22.39f, 6.0f)
                close()
                moveTo(22.392f, 18.001f)
                arcToRelative(11.99f, 11.99f, 0.0f, false, false, 1.162f, -2.796f)
                lineToRelative(-2.706f, -1.562f)
                curveToRelative(0.202f, -1.091f, 0.2f, -2.198f, 0.005f, -3.266f)
                arcToRelative(11.112f, 11.112f, 0.0f, false, false, -3.796f, -0.334f)
                curveToRelative(1.684f, 2.507f, 2.295f, 5.746f, 1.786f, 9.376f)
                lineToRelative(1.703f, 0.983f)
                arcTo(11.989f, 11.989f, 0.0f, false, false, 22.392f, 18.0f)
                close()
                moveTo(12.0f, 24.0f)
                arcToRelative(11.968f, 11.968f, 0.0f, false, false, 3.002f, -0.39f)
                verticalLineToRelative(-3.126f)
                arcToRelative(9.024f, 9.024f, 0.0f, false, false, 2.83f, -1.629f)
                arcToRelative(11.102f, 11.102f, 0.0f, false, false, -1.609f, -3.454f)
                curveToRelative(-1.328f, 2.712f, -3.828f, 4.862f, -7.227f, 6.235f)
                verticalLineToRelative(1.966f)
                curveToRelative(0.98f, 0.26f, 1.99f, 0.392f, 3.004f, 0.397f)
                close()
                moveTo(1.607f, 18.0f)
                arcToRelative(11.995f, 11.995f, 0.0f, false, false, 1.84f, 2.404f)
                lineToRelative(2.706f, -1.562f)
                arcToRelative(9.002f, 9.002f, 0.0f, false, false, 2.825f, 1.638f)
                arcToRelative(11.107f, 11.107f, 0.0f, false, false, 2.188f, -3.122f)
                curveToRelative(-3.013f, 0.206f, -6.124f, -0.884f, -9.013f, -3.141f)
                lineTo(0.45f, 15.2f)
                curveToRelative(0.266f, 0.979f, 0.654f, 1.92f, 1.157f, 2.8f)
                close()
                moveTo(1.607f, 6.0f)
                arcTo(11.99f, 11.99f, 0.0f, false, false, 0.443f, 8.796f)
                lineTo(3.15f, 10.36f)
                arcToRelative(9.019f, 9.019f, 0.0f, false, false, -0.005f, 3.265f)
                curveToRelative(1.273f, 0.332f, 2.546f, 0.445f, 3.796f, 0.334f)
                curveToRelative(-1.683f, -2.507f, -2.296f, -5.746f, -1.785f, -9.376f)
                lineTo(3.453f, 3.6f)
                arcTo(11.994f, 11.994f, 0.0f, false, false, 1.606f, 6.0f)
                close()
                moveTo(11.999f, 0.0f)
                arcToRelative(12.071f, 12.071f, 0.0f, false, false, -3.002f, 0.39f)
                verticalLineToRelative(3.125f)
                arcToRelative(9.028f, 9.028f, 0.0f, false, false, -2.831f, 1.629f)
                arcToRelative(11.102f, 11.102f, 0.0f, false, false, 1.61f, 3.454f)
                curveToRelative(1.327f, -2.712f, 3.827f, -4.86f, 7.227f, -6.235f)
                lineTo(15.003f, 0.398f)
                curveToRelative(-0.98f, -0.26f, -1.99f, -0.392f, -3.004f, -0.398f)
                close()
            }
        }
        .build()
        return _quasar!!
    }

private var _quasar: VectorAsset? = null
