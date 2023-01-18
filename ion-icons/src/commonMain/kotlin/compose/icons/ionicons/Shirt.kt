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

public val IonIcons.Shirt: ImageVector
    get() {
        if (_shirt != null) {
            return _shirt!!
        }
        _shirt = Builder(name = "Shirt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 96.0f)
                curveToRelative(33.08f, 0.0f, 60.71f, -25.78f, 64.0f, -58.0f)
                curveToRelative(0.3f, -3.0f, -3.0f, -6.0f, -6.0f, -6.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, -4.74f, 0.9f)
                curveToRelative(-0.2f, 0.08f, -21.1f, 8.1f, -53.26f, 8.1f)
                reflectiveCurveToRelative(-53.1f, -8.0f, -53.26f, -8.1f)
                arcToRelative(16.21f, 16.21f, 0.0f, false, false, -5.3f, -0.9f)
                horizontalLineToRelative(-0.06f)
                arcTo(5.69f, 5.69f, 0.0f, false, false, 192.0f, 38.0f)
                curveTo(195.35f, 70.16f, 223.0f, 96.0f, 256.0f, 96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(485.29f, 89.9f)
                lineTo(356.0f, 44.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.27f, 3.16f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, -189.38f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 156.0f, 44.64f)
                lineTo(26.71f, 89.9f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.28f, 108.0f)
                lineToRelative(16.63f, 88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 46.83f, 208.9f)
                lineToRelative(48.88f, 5.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.1f, 8.19f)
                lineToRelative(-7.33f, 240.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.1f, 14.94f)
                arcTo(17.49f, 17.49f, 0.0f, false, false, 112.0f, 480.0f)
                horizontalLineTo(400.0f)
                arcToRelative(17.49f, 17.49f, 0.0f, false, false, 7.42f, -1.55f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.1f, -14.94f)
                lineToRelative(-7.33f, -240.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.1f, -8.19f)
                lineToRelative(48.88f, -5.52f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 479.09f, 196.0f)
                lineToRelative(16.63f, -88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 485.29f, 89.9f)
                close()
            }
        }
        .build()
        return _shirt!!
    }

private var _shirt: ImageVector? = null
