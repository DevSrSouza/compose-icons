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

public val IonIcons.FlashOffOutline: ImageVector
    get() {
        if (_flashOffOutline != null) {
            return _flashOffOutline!!
        }
        _flashOffOutline = Builder(name = "FlashOffOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                moveTo(294.34f, 84.28f)
                lineTo(272.26f, 205.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 6.17f, 15.71f)
                arcToRelative(16.49f, 16.49f, 0.0f, false, false, 9.93f, 3.17f)
                horizontalLineToRelative(94.12f)
                lineToRelative(-38.37f, 47.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.28f, 5.34f)
                lineToRelative(17.07f, 17.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.94f, -0.31f)
                lineToRelative(60.8f, -75.16f)
                arcTo(16.37f, 16.37f, 0.0f, false, false, 431.5f, 204.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 416.0f, 192.0f)
                horizontalLineTo(307.19f)
                lineTo(335.4f, 37.63f)
                curveToRelative(0.05f, -0.3f, 0.1f, -0.59f, 0.13f, -0.89f)
                arcTo(18.45f, 18.45f, 0.0f, false, false, 302.73f, 23.0f)
                lineTo(210.15f, 137.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.28f, 5.35f)
                lineToRelative(17.07f, 17.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.94f, -0.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.78f, 427.57f)
                lineToRelative(22.0f, -120.71f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.19f, -15.7f)
                arcToRelative(16.54f, 16.54f, 0.0f, false, false, -9.92f, -3.16f)
                horizontalLineToRelative(-94.1f)
                lineToRelative(38.36f, -47.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.28f, -5.34f)
                lineToRelative(-17.07f, -17.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.93f, 0.31f)
                lineTo(83.8f, 293.64f)
                arcTo(16.37f, 16.37f, 0.0f, false, false, 80.5f, 308.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 320.0f)
                horizontalLineTo(204.83f)
                lineTo(176.74f, 474.36f)
                lineToRelative(0.0f, 0.11f)
                arcTo(18.37f, 18.37f, 0.0f, false, false, 209.24f, 489.0f)
                lineToRelative(92.61f, -114.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.28f, -5.35f)
                lineTo(284.5f, 352.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.94f, 0.31f)
                close()
            }
        }
        .build()
        return _flashOffOutline!!
    }

private var _flashOffOutline: ImageVector? = null
