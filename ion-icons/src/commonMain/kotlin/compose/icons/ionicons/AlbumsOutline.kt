package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.AlbumsOutline: ImageVector
    get() {
        if (_albumsOutline != null) {
            return _albumsOutline!!
        }
        _albumsOutline = Builder(name = "AlbumsOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(92.87f, 176.0f)
                lineTo(419.13f, 176.0f)
                arcTo(28.87f, 28.87f, 0.0f, false, true, 448.0f, 204.87f)
                lineTo(448.0f, 403.13f)
                arcTo(28.87f, 28.87f, 0.0f, false, true, 419.13f, 432.0f)
                lineTo(92.87f, 432.0f)
                arcTo(28.87f, 28.87f, 0.0f, false, true, 64.0f, 403.13f)
                lineTo(64.0f, 204.87f)
                arcTo(28.87f, 28.87f, 0.0f, false, true, 92.87f, 176.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(144.0f, 80.0f)
                lineTo(368.0f, 80.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 128.0f)
                lineTo(400.0f, 128.0f)
            }
        }
        .build()
        return _albumsOutline!!
    }

private var _albumsOutline: ImageVector? = null
