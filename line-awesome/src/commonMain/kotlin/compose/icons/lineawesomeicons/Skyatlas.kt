package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Skyatlas: ImageVector
    get() {
        if (_skyatlas != null) {
            return _skyatlas!!
        }
        _skyatlas = Builder(name = "Skyatlas", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.805f, 6.594f)
                curveTo(19.66f, 6.594f, 24.707f, 8.055f, 24.707f, 13.477f)
                curveTo(24.707f, 13.805f, 24.637f, 14.578f, 24.637f, 14.578f)
                curveTo(24.637f, 14.578f, 25.555f, 14.297f, 26.586f, 14.297f)
                curveTo(27.949f, 14.297f, 32.0f, 15.367f, 32.0f, 19.688f)
                curveTo(32.0f, 23.797f, 28.465f, 25.406f, 26.211f, 25.406f)
                curveTo(17.969f, 25.406f, 16.137f, 12.887f, 8.199f, 12.887f)
                curveTo(4.512f, 12.887f, 2.633f, 15.59f, 2.633f, 18.008f)
                curveTo(2.633f, 21.625f, 5.332f, 23.551f, 8.34f, 23.551f)
                curveTo(12.848f, 23.551f, 15.398f, 20.594f, 15.758f, 20.594f)
                curveTo(16.184f, 20.594f, 16.371f, 20.832f, 16.371f, 21.066f)
                curveTo(16.371f, 22.027f, 12.285f, 25.406f, 7.914f, 25.406f)
                curveTo(3.652f, 25.406f, 0.0f, 22.703f, 0.0f, 18.008f)
                curveTo(0.0f, 13.734f, 3.547f, 10.656f, 7.656f, 10.656f)
                curveTo(16.879f, 10.656f, 18.688f, 23.012f, 25.742f, 23.012f)
                curveTo(28.254f, 23.012f, 29.5f, 21.227f, 29.5f, 19.629f)
                curveTo(29.5f, 17.633f, 28.043f, 15.988f, 25.977f, 15.988f)
                curveTo(25.129f, 15.988f, 24.238f, 16.555f, 23.629f, 16.555f)
                curveTo(23.016f, 16.555f, 22.781f, 16.129f, 22.781f, 15.754f)
                curveTo(22.781f, 15.309f, 23.109f, 14.555f, 23.109f, 13.711f)
                curveTo(23.109f, 12.262f, 21.973f, 8.191f, 17.238f, 8.191f)
                curveTo(14.469f, 8.191f, 13.293f, 10.07f, 12.777f, 10.07f)
                curveTo(12.258f, 10.07f, 12.211f, 9.813f, 12.211f, 9.484f)
                curveTo(12.215f, 9.152f, 13.996f, 6.594f, 17.805f, 6.594f)
                close()
            }
        }
        .build()
        return _skyatlas!!
    }

private var _skyatlas: ImageVector? = null
