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

public val IonIcons.HeartDislikeOutline: ImageVector
    get() {
        if (_heartDislikeOutline != null) {
            return _heartDislikeOutline!!
        }
        _heartDislikeOutline = Builder(name = "HeartDislikeOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(417.84f, 448.0f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, true, -11.35f, -4.72f)
                lineTo(40.65f, 75.26f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 63.35f, 52.7f)
                lineToRelative(365.83f, 368.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 417.84f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(364.92f, 80.0f)
                curveToRelative(-48.09f, 0.0f, -80.0f, 29.55f, -96.92f, 51.0f)
                curveToRelative(-16.88f, -21.48f, -48.83f, -51.0f, -96.92f, -51.0f)
                arcToRelative(107.37f, 107.37f, 0.0f, false, false, -31.0f, 4.55f)
                lineTo(168.0f, 112.0f)
                curveToRelative(22.26f, 0.0f, 45.81f, 9.0f, 63.94f, 26.67f)
                arcToRelative(123.0f, 123.0f, 0.0f, false, true, 21.75f, 28.47f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 28.6f, 0.0f)
                arcToRelative(123.0f, 123.0f, 0.0f, false, true, 21.77f, -28.51f)
                curveTo(322.19f, 121.0f, 342.66f, 112.0f, 364.92f, 112.0f)
                curveToRelative(43.15f, 0.0f, 78.62f, 36.33f, 79.07f, 81.0f)
                curveToRelative(0.54f, 53.69f, -22.75f, 99.55f, -57.38f, 139.52f)
                lineToRelative(22.63f, 22.77f)
                curveToRelative(3.0f, -3.44f, 5.7f, -6.64f, 8.14f, -9.6f)
                curveToRelative(40.0f, -48.75f, 59.15f, -98.8f, 58.61f, -153.0f)
                curveTo(475.37f, 130.52f, 425.54f, 80.0f, 364.92f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.0f, 432.0f)
                curveTo(180.38f, 372.51f, 91.0f, 297.6f, 92.0f, 193.0f)
                arcToRelative(83.69f, 83.69f, 0.0f, false, true, 2.24f, -18.39f)
                lineTo(69.0f, 149.14f)
                arcToRelative(115.1f, 115.1f, 0.0f, false, false, -9.0f, 43.49f)
                curveToRelative(-0.54f, 54.22f, 18.63f, 104.27f, 58.61f, 153.0f)
                curveToRelative(18.77f, 22.87f, 52.8f, 59.45f, 131.39f, 112.8f)
                arcToRelative(31.84f, 31.84f, 0.0f, false, false, 36.0f, 0.0f)
                curveToRelative(20.35f, -13.81f, 37.7f, -26.5f, 52.58f, -38.11f)
                lineToRelative(-22.66f, -22.81f)
                curveTo(300.25f, 409.6f, 284.09f, 421.05f, 268.0f, 432.0f)
                close()
            }
        }
        .build()
        return _heartDislikeOutline!!
    }

private var _heartDislikeOutline: ImageVector? = null
