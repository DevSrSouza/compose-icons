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

public val BrandsGroup.Evernote: ImageVector
    get() {
        if (_evernote != null) {
            return _evernote!!
        }
        _evernote = Builder(name = "Evernote", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.82f, 132.21f)
                curveToRelative(1.6f, 22.31f, -17.55f, 21.59f, -21.61f, 21.59f)
                curveToRelative(-68.93f, 0.0f, -73.64f, -1.0f, -83.58f, 3.34f)
                curveToRelative(-0.56f, 0.22f, -0.74f, 0.0f, -0.37f, -0.37f)
                lineTo(123.79f, 46.45f)
                curveToRelative(0.38f, -0.37f, 0.6f, -0.22f, 0.38f, 0.37f)
                curveToRelative(-4.35f, 9.99f, -3.35f, 15.09f, -3.35f, 85.39f)
                close()
                moveTo(199.82f, 440.21f)
                curveToRelative(-14.68f, -37.08f, 13.0f, -76.93f, 52.52f, -76.62f)
                curveToRelative(17.49f, 0.0f, 22.6f, 23.21f, 7.95f, 31.42f)
                curveToRelative(-6.19f, 3.3f, -24.95f, 1.74f, -25.14f, 19.2f)
                curveToRelative(-0.05f, 17.09f, 19.67f, 25.0f, 31.2f, 24.89f)
                arcTo(45.64f, 45.64f, 0.0f, false, false, 312.0f, 393.45f)
                verticalLineToRelative(-0.08f)
                curveToRelative(0.0f, -11.63f, -7.79f, -47.22f, -47.54f, -55.34f)
                curveToRelative(-7.72f, -1.54f, -65.0f, -6.35f, -68.35f, -50.52f)
                curveToRelative(-3.74f, 16.93f, -17.4f, 63.49f, -43.11f, 69.09f)
                curveToRelative(-8.74f, 1.94f, -69.68f, 7.64f, -112.92f, -36.77f)
                curveToRelative(0.0f, 0.0f, -18.57f, -15.23f, -28.23f, -57.95f)
                curveToRelative(-3.38f, -15.75f, -9.28f, -39.7f, -11.14f, -62.0f)
                curveToRelative(0.0f, -18.0f, 11.14f, -30.45f, 25.07f, -32.2f)
                curveToRelative(81.0f, 0.0f, 90.0f, 2.32f, 101.0f, -7.8f)
                curveToRelative(9.82f, -9.24f, 7.8f, -15.5f, 7.8f, -102.78f)
                curveToRelative(1.0f, -8.3f, 7.79f, -30.81f, 53.41f, -24.14f)
                curveToRelative(6.0f, 0.86f, 31.91f, 4.18f, 37.48f, 30.64f)
                lineToRelative(64.26f, 11.15f)
                curveToRelative(20.43f, 3.71f, 70.94f, 7.0f, 80.6f, 57.94f)
                curveToRelative(22.66f, 121.09f, 8.91f, 238.46f, 7.8f, 238.46f)
                curveTo(362.15f, 485.53f, 267.06f, 480.0f, 267.06f, 480.0f)
                curveToRelative(-18.95f, -0.23f, -54.25f, -9.4f, -67.27f, -39.83f)
                close()
                moveTo(280.76f, 235.37f)
                curveToRelative(-1.0f, 1.92f, -2.2f, 6.0f, 0.85f, 7.0f)
                curveToRelative(14.09f, 4.93f, 39.75f, 6.84f, 45.88f, 5.53f)
                curveToRelative(3.11f, -0.25f, 3.05f, -4.43f, 2.48f, -6.65f)
                curveToRelative(-3.53f, -21.85f, -40.83f, -26.5f, -49.24f, -5.92f)
                close()
            }
        }
        .build()
        return _evernote!!
    }

private var _evernote: ImageVector? = null
