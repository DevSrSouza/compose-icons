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

public val IonIcons.FlashOff: ImageVector
    get() {
        if (_flashOff != null) {
            return _flashOff!!
        }
        _flashOff = Builder(name = "FlashOff", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 448.0f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, true, -11.31f, -4.69f)
                lineToRelative(-352.0f, -352.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 91.31f, 68.69f)
                lineToRelative(352.0f, 352.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 432.0f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(431.5f, 204.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 416.0f, 192.0f)
                horizontalLineTo(307.19f)
                lineTo(335.4f, 37.63f)
                curveToRelative(0.05f, -0.3f, 0.1f, -0.59f, 0.13f, -0.89f)
                arcTo(18.45f, 18.45f, 0.0f, false, false, 302.73f, 23.0f)
                lineTo(210.15f, 137.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.29f, 5.35f)
                lineToRelative(151.0f, 151.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.94f, -0.31f)
                lineToRelative(60.8f, -75.16f)
                arcTo(16.37f, 16.37f, 0.0f, false, false, 431.5f, 204.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(301.57f, 369.19f)
                lineToRelative(-151.0f, -151.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.93f, 0.31f)
                lineTo(83.8f, 293.64f)
                arcTo(16.37f, 16.37f, 0.0f, false, false, 80.5f, 308.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 320.0f)
                horizontalLineTo(204.83f)
                lineTo(176.74f, 474.36f)
                lineToRelative(0.0f, 0.11f)
                arcTo(18.37f, 18.37f, 0.0f, false, false, 209.24f, 489.0f)
                lineToRelative(92.61f, -114.46f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 301.57f, 369.19f)
                close()
            }
        }
        .build()
        return _flashOff!!
    }

private var _flashOff: ImageVector? = null
