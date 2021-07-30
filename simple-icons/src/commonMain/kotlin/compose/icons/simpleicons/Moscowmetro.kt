package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Moscowmetro: ImageVector
    get() {
        if (_moscowmetro != null) {
            return _moscowmetro!!
        }
        _moscowmetro = Builder(name = "Moscowmetro", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.603f, 11.85f)
                lineToRelative(-2.481f, -6.26f)
                lineToRelative(-2.092f, 3.66f)
                lineToRelative(-2.092f, -3.66f)
                lineToRelative(-2.481f, 6.262f)
                lineTo(6.74f, 11.852f)
                verticalLineToRelative(0.941f)
                horizontalLineToRelative(3.736f)
                verticalLineToRelative(-0.941f)
                horizontalLineToRelative(-0.553f)
                lineToRelative(0.538f, -1.555f)
                lineToRelative(1.569f, 2.57f)
                lineToRelative(1.569f, -2.57f)
                lineToRelative(0.538f, 1.555f)
                horizontalLineToRelative(-0.553f)
                verticalLineToRelative(0.941f)
                horizontalLineToRelative(3.751f)
                verticalLineToRelative(-0.941f)
                close()
                moveTo(21.938f, 9.938f)
                arcTo(9.933f, 9.933f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(6.516f, 0.0f, 2.062f, 4.453f, 2.062f, 9.938f)
                curveToRelative(0.0f, 2.75f, 1.121f, 5.23f, 2.914f, 7.023f)
                arcToRelative(0.804f, 0.804f, 0.0f, false, false, 1.375f, -0.568f)
                arcToRelative(0.825f, 0.825f, 0.0f, false, false, -0.239f, -0.582f)
                arcToRelative(8.303f, 8.303f, 0.0f, false, true, -2.42f, -5.873f)
                curveToRelative(0.0f, -4.588f, 3.72f, -8.324f, 8.308f, -8.324f)
                curveToRelative(4.588f, 0.0f, 8.324f, 3.736f, 8.324f, 8.324f)
                arcToRelative(8.289f, 8.289f, 0.0f, false, true, -2.436f, 5.888f)
                lineToRelative(-7.024f, 7.023f)
                lineTo(12.0f, 24.0f)
                lineToRelative(7.039f, -7.039f)
                arcToRelative(9.891f, 9.891f, 0.0f, false, false, 2.899f, -7.023f)
                close()
            }
        }
        .build()
        return _moscowmetro!!
    }

private var _moscowmetro: ImageVector? = null
