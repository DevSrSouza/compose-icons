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

public val IonIcons.HeartDislike: ImageVector
    get() {
        if (_heartDislike != null) {
            return _heartDislike!!
        }
        _heartDislike = Builder(name = "HeartDislike", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(417.84f, 448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.35f, -4.72f)
                lineTo(40.65f, 75.28f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.7f, -22.56f)
                lineToRelative(365.83f, 368.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 417.84f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(364.92f, 80.0f)
                curveToRelative(-44.09f, 0.0f, -74.61f, 24.82f, -92.39f, 45.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.06f, 0.0f)
                curveTo(245.69f, 104.82f, 215.16f, 80.0f, 171.08f, 80.0f)
                arcToRelative(107.71f, 107.71f, 0.0f, false, false, -31.0f, 4.54f)
                lineToRelative(269.13f, 270.7f)
                curveToRelative(3.0f, -3.44f, 5.7f, -6.64f, 8.14f, -9.6f)
                curveToRelative(40.0f, -48.75f, 59.15f, -98.79f, 58.61f, -153.0f)
                curveTo(475.37f, 130.53f, 425.54f, 80.0f, 364.92f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(69.0f, 149.15f)
                arcToRelative(115.06f, 115.06f, 0.0f, false, false, -9.0f, 43.49f)
                curveToRelative(-0.54f, 54.21f, 18.63f, 104.25f, 58.61f, 153.0f)
                curveToRelative(18.77f, 22.87f, 52.8f, 59.45f, 131.39f, 112.8f)
                arcToRelative(31.88f, 31.88f, 0.0f, false, false, 36.0f, 0.0f)
                curveToRelative(20.35f, -13.82f, 37.7f, -26.5f, 52.58f, -38.12f)
                close()
            }
        }
        .build()
        return _heartDislike!!
    }

private var _heartDislike: ImageVector? = null
