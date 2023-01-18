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

public val IonIcons.FilmSharp: ImageVector
    get() {
        if (_filmSharp != null) {
            return _filmSharp!!
        }
        _filmSharp = Builder(name = "FilmSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 80.0f)
                lineTo(32.0f, 80.0f)
                lineTo(32.0f, 432.0f)
                lineTo(480.0f, 432.0f)
                close()
                moveTo(112.0f, 352.0f)
                verticalLineToRelative(48.0f)
                lineTo(64.0f, 400.0f)
                lineTo(64.0f, 352.0f)
                close()
                moveTo(112.0f, 272.0f)
                verticalLineToRelative(48.0f)
                lineTo(64.0f, 320.0f)
                lineTo(64.0f, 272.0f)
                close()
                moveTo(112.0f, 192.0f)
                verticalLineToRelative(48.0f)
                lineTo(64.0f, 240.0f)
                lineTo(64.0f, 192.0f)
                close()
                moveTo(112.0f, 112.0f)
                verticalLineToRelative(48.0f)
                lineTo(64.0f, 160.0f)
                lineTo(64.0f, 112.0f)
                close()
                moveTo(368.0f, 272.0f)
                lineTo(144.0f, 272.0f)
                lineTo(144.0f, 240.0f)
                lineTo(368.0f, 240.0f)
                close()
                moveTo(448.0f, 352.0f)
                verticalLineToRelative(48.0f)
                lineTo(400.0f, 400.0f)
                lineTo(400.0f, 352.0f)
                close()
                moveTo(448.0f, 272.0f)
                verticalLineToRelative(48.0f)
                lineTo(400.0f, 320.0f)
                lineTo(400.0f, 272.0f)
                close()
                moveTo(448.0f, 192.0f)
                verticalLineToRelative(48.0f)
                lineTo(400.0f, 240.0f)
                lineTo(400.0f, 192.0f)
                close()
                moveTo(448.0f, 112.0f)
                verticalLineToRelative(48.0f)
                lineTo(400.0f, 160.0f)
                lineTo(400.0f, 112.0f)
                close()
            }
        }
        .build()
        return _filmSharp!!
    }

private var _filmSharp: ImageVector? = null
