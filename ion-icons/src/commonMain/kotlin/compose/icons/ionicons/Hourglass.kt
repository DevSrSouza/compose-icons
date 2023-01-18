package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(415.7f, 427.13f)
                curveToRelative(-8.74f, -76.89f, -43.83f, -108.76f, -69.46f, -132.0f)
                curveTo(328.52f, 279.0f, 320.0f, 270.61f, 320.0f, 256.0f)
                curveToRelative(0.0f, -14.41f, 8.49f, -22.64f, 26.16f, -38.44f)
                curveToRelative(25.93f, -23.17f, 61.44f, -54.91f, 69.56f, -132.84f)
                arcToRelative(47.0f, 47.0f, 0.0f, false, false, -12.0f, -36.26f)
                arcTo(50.3f, 50.3f, 0.0f, false, false, 366.39f, 32.0f)
                horizontalLineTo(145.61f)
                arcToRelative(50.34f, 50.34f, 0.0f, false, false, -37.39f, 16.46f)
                arcTo(47.05f, 47.05f, 0.0f, false, false, 96.28f, 84.72f)
                curveToRelative(8.09f, 77.68f, 43.47f, 109.19f, 69.3f, 132.19f)
                curveTo(183.42f, 232.8f, 192.0f, 241.09f, 192.0f, 256.0f)
                curveToRelative(0.0f, 15.1f, -8.6f, 23.56f, -26.5f, 39.75f)
                curveTo(140.0f, 318.85f, 105.0f, 350.48f, 96.3f, 427.13f)
                arcTo(46.59f, 46.59f, 0.0f, false, false, 108.0f, 463.33f)
                arcTo(50.44f, 50.44f, 0.0f, false, false, 145.61f, 480.0f)
                horizontalLineTo(366.39f)
                arcTo(50.44f, 50.44f, 0.0f, false, false, 404.0f, 463.33f)
                arcTo(46.59f, 46.59f, 0.0f, false, false, 415.7f, 427.13f)
                close()
                moveTo(343.3f, 432.0f)
                horizontalLineTo(169.13f)
                curveToRelative(-15.6f, 0.0f, -20.0f, -18.0f, -9.06f, -29.16f)
                curveTo(186.55f, 376.0f, 240.0f, 356.78f, 240.0f, 326.0f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -19.85f, -38.0f, -35.0f, -61.51f, -67.2f)
                curveToRelative(-3.88f, -5.31f, -3.49f, -12.8f, 6.37f, -12.8f)
                horizontalLineTo(327.59f)
                curveToRelative(8.41f, 0.0f, 10.22f, 7.43f, 6.4f, 12.75f)
                curveTo(310.82f, 189.0f, 272.0f, 204.05f, 272.0f, 224.0f)
                verticalLineTo(326.0f)
                curveToRelative(0.0f, 30.53f, 55.71f, 47.0f, 80.4f, 76.87f)
                curveTo(362.35f, 414.91f, 358.87f, 432.0f, 343.3f, 432.0f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
