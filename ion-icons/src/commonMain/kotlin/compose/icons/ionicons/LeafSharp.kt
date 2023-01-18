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

public val IonIcons.LeafSharp: ImageVector
    get() {
        if (_leafSharp != null) {
            return _leafSharp!!
        }
        _leafSharp = Builder(name = "LeafSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.38f, 253.68f)
                lineToRelative(21.94f, -23.3f)
                lineToRelative(11.65f, 11.0f)
                curveToRelative(73.63f, 69.36f, 147.51f, 111.56f, 234.45f, 133.07f)
                curveToRelative(11.73f, -32.0f, 12.77f, -67.22f, 2.64f, -101.58f)
                curveToRelative(-13.44f, -45.59f, -44.74f, -85.31f, -90.49f, -114.86f)
                curveToRelative(-40.25f, -26.0f, -76.6f, -32.09f, -115.09f, -38.54f)
                curveToRelative(-21.12f, -3.54f, -43.0f, -7.2f, -66.85f, -14.43f)
                curveTo(104.85f, 91.76f, 58.94f, 52.3f, 58.48f, 51.91f)
                lineTo(33.4f, 30.15f)
                lineTo(32.0f, 63.33f)
                curveToRelative(-0.1f, 2.56f, -2.42f, 63.57f, 14.22f, 147.77f)
                curveToRelative(17.58f, 89.0f, 50.24f, 155.85f, 97.07f, 198.63f)
                curveToRelative(38.0f, 34.69f, 87.62f, 53.9f, 136.93f, 53.9f)
                arcTo(185.88f, 185.88f, 0.0f, false, false, 308.0f, 461.56f)
                curveToRelative(41.72f, -6.32f, 76.43f, -27.27f, 96.0f, -57.75f)
                curveToRelative(-89.5f, -23.28f, -165.95f, -67.55f, -242.0f, -139.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(467.43f, 384.19f)
                curveToRelative(-16.83f, -2.59f, -33.13f, -5.84f, -49.0f, -9.77f)
                arcTo(158.49f, 158.49f, 0.0f, false, true, 406.3f, 400.1f)
                curveToRelative(-0.74f, 1.25f, -1.51f, 2.49f, -2.29f, 3.71f)
                arcToRelative(583.43f, 583.43f, 0.0f, false, false, 58.55f, 12.0f)
                lineToRelative(15.82f, 2.44f)
                lineToRelative(4.86f, -31.63f)
                close()
            }
        }
        .build()
        return _leafSharp!!
    }

private var _leafSharp: ImageVector? = null
