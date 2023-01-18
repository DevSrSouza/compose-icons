package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.35f, 242.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, -0.68f)
                curveToRelative(73.63f, 69.36f, 147.51f, 111.56f, 234.45f, 133.07f)
                curveToRelative(11.73f, -32.0f, 12.77f, -67.22f, 2.64f, -101.58f)
                curveToRelative(-13.44f, -45.59f, -44.74f, -85.31f, -90.49f, -114.86f)
                curveToRelative(-40.84f, -26.38f, -81.66f, -33.25f, -121.15f, -39.89f)
                curveToRelative(-49.82f, -8.38f, -96.88f, -16.3f, -141.79f, -63.85f)
                curveToRelative(-5.0f, -5.26f, -11.81f, -7.37f, -18.32f, -5.66f)
                curveToRelative(-7.44f, 2.0f, -12.43f, 7.88f, -14.82f, 17.6f)
                curveToRelative(-5.6f, 22.75f, -2.0f, 86.51f, 13.75f, 153.82f)
                curveToRelative(25.29f, 108.14f, 65.65f, 162.86f, 95.06f, 189.73f)
                curveToRelative(38.0f, 34.69f, 87.62f, 53.9f, 136.93f, 53.9f)
                arcTo(186.0f, 186.0f, 0.0f, false, false, 308.0f, 461.56f)
                curveToRelative(41.71f, -6.32f, 76.43f, -27.27f, 96.0f, -57.75f)
                curveToRelative(-89.49f, -23.28f, -165.94f, -67.55f, -242.0f, -139.16f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 161.35f, 242.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(467.43f, 384.19f)
                curveToRelative(-16.83f, -2.59f, -33.13f, -5.84f, -49.0f, -9.77f)
                arcToRelative(157.71f, 157.71f, 0.0f, false, true, -12.13f, 25.68f)
                curveToRelative(-0.73f, 1.25f, -1.5f, 2.49f, -2.29f, 3.71f)
                arcToRelative(584.21f, 584.21f, 0.0f, false, false, 58.56f, 12.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 4.87f, -31.62f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
