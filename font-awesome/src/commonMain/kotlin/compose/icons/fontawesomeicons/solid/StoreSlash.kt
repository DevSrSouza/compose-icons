package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.StoreSlash: ImageVector
    get() {
        if (_storeSlash != null) {
            return _storeSlash!!
        }
        _storeSlash = Builder(name = "StoreSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(121.51f, 384.0f)
                lineTo(121.51f, 284.2f)
                arcToRelative(119.43f, 119.43f, 0.0f, false, true, -28.0f, 3.8f)
                arcToRelative(123.46f, 123.46f, 0.0f, false, true, -17.1f, -1.2f)
                arcToRelative(114.88f, 114.88f, 0.0f, false, true, -15.58f, -3.6f)
                lineTo(60.83f, 480.0f)
                curveToRelative(0.0f, 17.7f, 13.59f, 32.0f, 30.4f, 32.0f)
                lineTo(505.75f, 512.0f)
                lineTo(348.42f, 384.0f)
                close()
                moveTo(93.51f, 255.91f)
                curveToRelative(25.1f, 0.0f, 47.29f, -10.72f, 64.0f, -27.24f)
                lineTo(24.0f, 120.05f)
                curveToRelative(-30.52f, 53.39f, -2.45f, 126.53f, 56.49f, 135.0f)
                arcTo(95.68f, 95.68f, 0.0f, false, false, 93.48f, 255.91f)
                close()
                moveTo(602.13f, 458.09f)
                lineTo(547.2f, 413.41f)
                lineTo(547.2f, 283.2f)
                arcToRelative(93.5f, 93.5f, 0.0f, false, true, -15.57f, 3.6f)
                arcToRelative(127.31f, 127.31f, 0.0f, false, true, -17.29f, 1.2f)
                arcToRelative(114.89f, 114.89f, 0.0f, false, true, -28.0f, -3.8f)
                verticalLineToRelative(79.68f)
                lineTo(348.52f, 251.77f)
                arcToRelative(88.06f, 88.06f, 0.0f, false, false, 25.41f, 4.14f)
                curveToRelative(28.11f, 0.0f, 53.0f, -13.0f, 70.11f, -33.11f)
                curveToRelative(17.19f, 20.11f, 42.08f, 33.11f, 70.11f, 33.11f)
                arcToRelative(94.31f, 94.31f, 0.0f, false, false, 13.0f, -0.91f)
                curveToRelative(59.66f, -8.41f, 88.0f, -82.8f, 56.06f, -136.4f)
                lineTo(521.55f, 15.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 495.81f, 0.0f)
                lineTo(112.0f, 0.0f)
                arcTo(30.11f, 30.11f, 0.0f, false, false, 86.27f, 15.0f)
                lineTo(76.88f, 30.78f)
                lineTo(43.19f, 3.38f)
                arcTo(14.68f, 14.68f, 0.0f, false, false, 21.86f, 6.19f)
                lineTo(3.2f, 31.45f)
                arcTo(16.58f, 16.58f, 0.0f, false, false, 5.87f, 53.91f)
                lineTo(564.81f, 508.63f)
                arcToRelative(14.69f, 14.69f, 0.0f, false, false, 21.33f, -2.82f)
                lineToRelative(18.66f, -25.26f)
                arcTo(16.58f, 16.58f, 0.0f, false, false, 602.13f, 458.09f)
                close()
            }
        }
        .build()
        return _storeSlash!!
    }

private var _storeSlash: ImageVector? = null
