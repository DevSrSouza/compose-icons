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

public val IonIcons.Snow: ImageVector
    get() {
        if (_snow != null) {
            return _snow!!
        }
        _snow = Builder(name = "Snow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(461.0f, 349.0f)
                lineToRelative(-34.0f, -19.64f)
                arcToRelative(89.53f, 89.53f, 0.0f, false, true, 20.94f, -16.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -21.28f, -38.51f)
                arcToRelative(133.62f, 133.62f, 0.0f, false, false, -38.55f, 32.1f)
                lineTo(300.0f, 256.0f)
                lineToRelative(88.09f, -50.86f)
                arcToRelative(133.46f, 133.46f, 0.0f, false, false, 38.55f, 32.1f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 21.28f, -38.51f)
                arcToRelative(89.74f, 89.74f, 0.0f, false, true, -20.94f, -16.0f)
                lineToRelative(34.0f, -19.64f)
                arcTo(22.0f, 22.0f, 0.0f, true, false, 439.0f, 125.0f)
                lineToRelative(-34.0f, 19.63f)
                arcToRelative(89.74f, 89.74f, 0.0f, false, true, -3.42f, -26.15f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 380.0f, 96.0f)
                horizontalLineToRelative(-0.41f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 21.59f)
                arcTo(133.61f, 133.61f, 0.0f, false, false, 366.09f, 167.0f)
                lineTo(278.0f, 217.89f)
                verticalLineTo(116.18f)
                arcToRelative(133.5f, 133.5f, 0.0f, false, false, 47.07f, -17.33f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.71f, -37.69f)
                arcTo(89.56f, 89.56f, 0.0f, false, true, 278.0f, 71.27f)
                verticalLineTo(38.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -44.0f, 0.0f)
                verticalLineTo(71.27f)
                arcToRelative(89.56f, 89.56f, 0.0f, false, true, -24.36f, -10.11f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, -22.71f, 37.69f)
                arcTo(133.5f, 133.5f, 0.0f, false, false, 234.0f, 116.18f)
                verticalLineTo(217.89f)
                lineTo(145.91f, 167.0f)
                arcToRelative(133.61f, 133.61f, 0.0f, false, false, 8.52f, -49.43f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -21.59f)
                horizontalLineTo(132.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -21.59f, 22.41f)
                arcTo(89.74f, 89.74f, 0.0f, false, true, 107.0f, 144.58f)
                lineTo(73.0f, 125.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, -22.0f, 38.1f)
                lineToRelative(34.0f, 19.64f)
                arcToRelative(89.74f, 89.74f, 0.0f, false, true, -20.94f, 16.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 21.28f, 38.51f)
                arcToRelative(133.62f, 133.62f, 0.0f, false, false, 38.55f, -32.1f)
                lineTo(212.0f, 256.0f)
                lineToRelative(-88.09f, 50.86f)
                arcToRelative(133.62f, 133.62f, 0.0f, false, false, -38.55f, -32.1f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, -21.28f, 38.51f)
                arcToRelative(89.74f, 89.74f, 0.0f, false, true, 20.94f, 16.0f)
                lineTo(51.0f, 349.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 22.0f, 38.1f)
                lineToRelative(34.0f, -19.63f)
                arcToRelative(89.74f, 89.74f, 0.0f, false, true, 3.42f, 26.15f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 132.0f, 416.0f)
                horizontalLineToRelative(0.41f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -21.59f)
                arcTo(133.61f, 133.61f, 0.0f, false, false, 145.91f, 345.0f)
                lineTo(234.0f, 294.11f)
                verticalLineTo(395.82f)
                arcToRelative(133.5f, 133.5f, 0.0f, false, false, -47.07f, 17.33f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 22.71f, 37.69f)
                arcTo(89.56f, 89.56f, 0.0f, false, true, 234.0f, 440.73f)
                verticalLineTo(474.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                verticalLineTo(440.73f)
                arcToRelative(89.56f, 89.56f, 0.0f, false, true, 24.36f, 10.11f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.71f, -37.69f)
                arcTo(133.5f, 133.5f, 0.0f, false, false, 278.0f, 395.82f)
                verticalLineTo(294.11f)
                lineTo(366.09f, 345.0f)
                arcToRelative(133.61f, 133.61f, 0.0f, false, false, -8.52f, 49.43f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 21.59f)
                horizontalLineTo(380.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 21.59f, -22.41f)
                arcTo(89.74f, 89.74f, 0.0f, false, true, 405.0f, 367.42f)
                lineToRelative(34.0f, 19.63f)
                arcTo(22.0f, 22.0f, 0.0f, true, false, 461.0f, 349.0f)
                close()
            }
        }
        .build()
        return _snow!!
    }

private var _snow: ImageVector? = null
