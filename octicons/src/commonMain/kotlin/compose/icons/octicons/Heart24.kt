package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Heart24: ImageVector
    get() {
        if (_heart24 != null) {
            return _heart24!!
        }
        _heart24 = Builder(name = "Heart24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 20.703f)
                lineToRelative(0.343f, 0.667f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, -0.686f, 0.0f)
                lineToRelative(-0.003f, -0.002f)
                lineToRelative(-0.007f, -0.003f)
                lineToRelative(-0.025f, -0.013f)
                arcToRelative(31.138f, 31.138f, 0.0f, false, true, -5.233f, -3.576f)
                curveTo(3.8f, 15.573f, 1.0f, 12.332f, 1.0f, 8.514f)
                verticalLineToRelative(-0.001f)
                curveTo(1.0f, 5.053f, 3.829f, 2.5f, 6.736f, 2.5f)
                curveTo(9.03f, 2.5f, 10.881f, 3.726f, 12.0f, 5.605f)
                curveTo(13.12f, 3.726f, 14.97f, 2.5f, 17.264f, 2.5f)
                curveTo(20.17f, 2.5f, 23.0f, 5.052f, 23.0f, 8.514f)
                curveToRelative(0.0f, 3.818f, -2.801f, 7.06f, -5.389f, 9.262f)
                arcToRelative(31.148f, 31.148f, 0.0f, false, true, -5.233f, 3.576f)
                lineToRelative(-0.025f, 0.013f)
                lineToRelative(-0.007f, 0.003f)
                lineToRelative(-0.002f, 0.001f)
                close()
                moveTo(6.736f, 4.0f)
                curveTo(4.657f, 4.0f, 2.5f, 5.88f, 2.5f, 8.514f)
                curveToRelative(0.0f, 3.107f, 2.324f, 5.96f, 4.861f, 8.12f)
                arcToRelative(29.655f, 29.655f, 0.0f, false, false, 4.566f, 3.175f)
                lineToRelative(0.073f, 0.041f)
                lineToRelative(0.073f, -0.04f)
                curveToRelative(0.271f, -0.153f, 0.661f, -0.38f, 1.13f, -0.674f)
                curveToRelative(0.94f, -0.588f, 2.19f, -1.441f, 3.436f, -2.502f)
                curveToRelative(2.537f, -2.16f, 4.861f, -5.013f, 4.861f, -8.12f)
                curveTo(21.5f, 5.88f, 19.343f, 4.0f, 17.264f, 4.0f)
                curveToRelative(-2.106f, 0.0f, -3.801f, 1.389f, -4.553f, 3.643f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.422f, 0.0f)
                curveTo(10.537f, 5.389f, 8.841f, 4.0f, 6.736f, 4.0f)
                close()
            }
        }
        .build()
        return _heart24!!
    }

private var _heart24: ImageVector? = null
