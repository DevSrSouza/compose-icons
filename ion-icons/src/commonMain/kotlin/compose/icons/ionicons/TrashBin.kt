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

public val IonIcons.TrashBin: ImageVector
    get() {
        if (_trashBin != null) {
            return _trashBin!!
        }
        _trashBin = Builder(name = "TrashBin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 48.0f)
                lineTo(448.0f, 48.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 480.0f, 80.0f)
                lineTo(480.0f, 96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 448.0f, 128.0f)
                lineTo(64.0f, 128.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 32.0f, 96.0f)
                lineTo(32.0f, 80.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 64.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(74.45f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.83f)
                lineTo(92.76f, 421.39f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 0.22f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 140.45f, 464.0f)
                horizontalLineTo(371.54f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 47.67f, -42.39f)
                lineToRelative(0.0f, -0.21f)
                lineToRelative(26.27f, -252.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.83f)
                close()
                moveTo(323.31f, 340.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.63f, 22.62f)
                lineTo(256.0f, 318.63f)
                lineToRelative(-44.69f, 44.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, -22.62f)
                lineTo(233.37f, 296.0f)
                lineToRelative(-44.69f, -44.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, -22.62f)
                lineTo(256.0f, 273.37f)
                lineToRelative(44.68f, -44.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 22.62f)
                lineTo(278.62f, 296.0f)
                close()
            }
        }
        .build()
        return _trashBin!!
    }

private var _trashBin: ImageVector? = null
