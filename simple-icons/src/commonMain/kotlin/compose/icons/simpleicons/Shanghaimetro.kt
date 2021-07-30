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

public val SimpleIcons.Shanghaimetro: ImageVector
    get() {
        if (_shanghaimetro != null) {
            return _shanghaimetro!!
        }
        _shanghaimetro = Builder(name = "Shanghaimetro", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.383f, 11.664f)
                horizontalLineToRelative(-1.716f)
                lineToRelative(-3.432f, -4.487f)
                lineToRelative(-3.073f, 3.606f)
                lineTo(9.31f, 7.177f)
                lineToRelative(-3.513f, 4.487f)
                horizontalLineTo(3.63f)
                curveToRelative(0.185f, -4.464f, 3.872f, -8.047f, 8.383f, -8.047f)
                curveToRelative(3.953f, 0.0f, 7.27f, 2.748f, 8.15f, 6.424f)
                horizontalLineToRelative(3.687f)
                curveTo(22.91f, 4.359f, 17.96f, 0.01f, 12.0f, 0.01f)
                curveToRelative(-6.632f, 0.0f, -12.0f, 5.369f, -12.0f, 12.0f)
                curveToRelative(0.0f, 1.102f, 0.15f, 2.169f, 0.429f, 3.177f)
                horizontalLineToRelative(6.516f)
                lineToRelative(2.412f, -2.55f)
                lineToRelative(2.805f, 3.478f)
                lineToRelative(2.945f, -3.502f)
                lineToRelative(1.902f, 2.61f)
                horizontalLineToRelative(2.69f)
                curveToRelative(-1.287f, 2.967f, -4.256f, 5.495f, -7.699f, 5.495f)
                curveToRelative(-2.84f, 0.0f, -5.357f, -1.681f, -6.875f, -3.942f)
                horizontalLineTo(0.997f)
                curveTo(2.852f, 21.02f, 7.072f, 23.988f, 12.0f, 23.988f)
                curveToRelative(6.632f, 0.0f, 12.0f, -5.368f, 12.0f, -12.0f)
                curveToRelative(0.0f, -0.116f, 0.0f, -0.231f, -0.012f, -0.347f)
                lineToRelative(-3.605f, 0.023f)
                close()
            }
        }
        .build()
        return _shanghaimetro!!
    }

private var _shanghaimetro: ImageVector? = null
