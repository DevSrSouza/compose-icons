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

public val SimpleIcons.Mastercard: ImageVector
    get() {
        if (_mastercard != null) {
            return _mastercard!!
        }
        _mastercard = Builder(name = "Mastercard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.343f, 18.031f)
                curveToRelative(0.058f, 0.049f, 0.12f, 0.098f, 0.181f, 0.146f)
                curveToRelative(-1.177f, 0.783f, -2.59f, 1.238f, -4.107f, 1.238f)
                curveTo(3.32f, 19.416f, 0.0f, 16.096f, 0.0f, 12.0f)
                curveToRelative(0.0f, -4.095f, 3.32f, -7.416f, 7.416f, -7.416f)
                curveToRelative(1.518f, 0.0f, 2.931f, 0.456f, 4.105f, 1.238f)
                curveToRelative(-0.06f, 0.051f, -0.12f, 0.098f, -0.165f, 0.15f)
                curveTo(9.6f, 7.489f, 8.595f, 9.688f, 8.595f, 12.0f)
                curveToRelative(0.0f, 2.311f, 1.001f, 4.51f, 2.748f, 6.031f)
                close()
                moveTo(16.584f, 4.584f)
                curveToRelative(-1.52f, 0.0f, -2.931f, 0.456f, -4.105f, 1.238f)
                curveToRelative(0.06f, 0.051f, 0.12f, 0.098f, 0.165f, 0.15f)
                curveTo(14.4f, 7.489f, 15.405f, 9.688f, 15.405f, 12.0f)
                curveToRelative(0.0f, 2.31f, -1.001f, 4.507f, -2.748f, 6.031f)
                curveToRelative(-0.058f, 0.049f, -0.12f, 0.098f, -0.181f, 0.146f)
                curveToRelative(1.177f, 0.783f, 2.588f, 1.238f, 4.107f, 1.238f)
                curveTo(20.68f, 19.416f, 24.0f, 16.096f, 24.0f, 12.0f)
                curveToRelative(0.0f, -4.094f, -3.32f, -7.416f, -7.416f, -7.416f)
                close()
                moveTo(12.0f, 6.174f)
                curveToRelative(-0.096f, 0.075f, -0.189f, 0.15f, -0.28f, 0.231f)
                curveTo(10.156f, 7.764f, 9.169f, 9.765f, 9.169f, 12.0f)
                curveToRelative(0.0f, 2.236f, 0.987f, 4.236f, 2.551f, 5.595f)
                curveToRelative(0.09f, 0.08f, 0.185f, 0.158f, 0.28f, 0.232f)
                curveToRelative(0.096f, -0.074f, 0.189f, -0.152f, 0.28f, -0.232f)
                curveToRelative(1.563f, -1.359f, 2.551f, -3.359f, 2.551f, -5.595f)
                curveToRelative(0.0f, -2.235f, -0.987f, -4.236f, -2.551f, -5.595f)
                curveToRelative(-0.09f, -0.08f, -0.184f, -0.156f, -0.28f, -0.231f)
                close()
            }
        }
        .build()
        return _mastercard!!
    }

private var _mastercard: ImageVector? = null
