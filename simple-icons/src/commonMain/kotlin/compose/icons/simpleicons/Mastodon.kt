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

public val SimpleIcons.Mastodon: ImageVector
    get() {
        if (_mastodon != null) {
            return _mastodon!!
        }
        _mastodon = Builder(name = "Mastodon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.268f, 5.313f)
                curveToRelative(-0.35f, -2.578f, -2.617f, -4.61f, -5.304f, -5.004f)
                curveTo(17.51f, 0.242f, 15.792f, 0.0f, 11.813f, 0.0f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-3.98f, 0.0f, -4.835f, 0.242f, -5.288f, 0.309f)
                curveTo(3.882f, 0.692f, 1.496f, 2.518f, 0.917f, 5.127f)
                curveTo(0.64f, 6.412f, 0.61f, 7.837f, 0.661f, 9.143f)
                curveToRelative(0.074f, 1.874f, 0.088f, 3.745f, 0.26f, 5.611f)
                curveToRelative(0.118f, 1.24f, 0.325f, 2.47f, 0.62f, 3.68f)
                curveToRelative(0.55f, 2.237f, 2.777f, 4.098f, 4.96f, 4.857f)
                curveToRelative(2.336f, 0.792f, 4.849f, 0.923f, 7.256f, 0.38f)
                curveToRelative(0.265f, -0.061f, 0.527f, -0.132f, 0.786f, -0.213f)
                curveToRelative(0.585f, -0.184f, 1.27f, -0.39f, 1.774f, -0.753f)
                arcToRelative(0.057f, 0.057f, 0.0f, false, false, 0.023f, -0.043f)
                verticalLineToRelative(-1.809f)
                arcToRelative(0.052f, 0.052f, 0.0f, false, false, -0.02f, -0.041f)
                arcToRelative(0.053f, 0.053f, 0.0f, false, false, -0.046f, -0.01f)
                arcToRelative(20.282f, 20.282f, 0.0f, false, true, -4.709f, 0.545f)
                curveToRelative(-2.73f, 0.0f, -3.463f, -1.284f, -3.674f, -1.818f)
                arcToRelative(5.593f, 5.593f, 0.0f, false, true, -0.319f, -1.433f)
                arcToRelative(0.053f, 0.053f, 0.0f, false, true, 0.066f, -0.054f)
                curveToRelative(1.517f, 0.363f, 3.072f, 0.546f, 4.632f, 0.546f)
                curveToRelative(0.376f, 0.0f, 0.75f, 0.0f, 1.125f, -0.01f)
                curveToRelative(1.57f, -0.044f, 3.224f, -0.124f, 4.768f, -0.422f)
                curveToRelative(0.038f, -0.008f, 0.077f, -0.015f, 0.11f, -0.024f)
                curveToRelative(2.435f, -0.464f, 4.753f, -1.92f, 4.989f, -5.604f)
                curveToRelative(0.008f, -0.145f, 0.03f, -1.52f, 0.03f, -1.67f)
                curveToRelative(0.002f, -0.512f, 0.167f, -3.63f, -0.024f, -5.545f)
                close()
                moveTo(19.52f, 14.508f)
                horizontalLineToRelative(-2.561f)
                lineTo(16.959f, 8.29f)
                curveToRelative(0.0f, -1.309f, -0.55f, -1.976f, -1.67f, -1.976f)
                curveToRelative(-1.23f, 0.0f, -1.846f, 0.79f, -1.846f, 2.35f)
                verticalLineToRelative(3.403f)
                horizontalLineToRelative(-2.546f)
                lineTo(10.897f, 8.663f)
                curveToRelative(0.0f, -1.56f, -0.617f, -2.35f, -1.848f, -2.35f)
                curveToRelative(-1.112f, 0.0f, -1.668f, 0.668f, -1.67f, 1.977f)
                verticalLineToRelative(6.218f)
                lineTo(4.822f, 14.508f)
                lineTo(4.822f, 8.102f)
                curveToRelative(0.0f, -1.31f, 0.337f, -2.35f, 1.011f, -3.12f)
                curveToRelative(0.696f, -0.77f, 1.608f, -1.164f, 2.74f, -1.164f)
                curveToRelative(1.311f, 0.0f, 2.302f, 0.5f, 2.962f, 1.498f)
                lineToRelative(0.638f, 1.06f)
                lineToRelative(0.638f, -1.06f)
                curveToRelative(0.66f, -0.999f, 1.65f, -1.498f, 2.96f, -1.498f)
                curveToRelative(1.13f, 0.0f, 2.043f, 0.395f, 2.74f, 1.164f)
                curveToRelative(0.675f, 0.77f, 1.012f, 1.81f, 1.012f, 3.12f)
                close()
            }
        }
        .build()
        return _mastodon!!
    }

private var _mastodon: ImageVector? = null
