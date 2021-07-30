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

public val SimpleIcons.Moleculer: ImageVector
    get() {
        if (_moleculer != null) {
            return _moleculer!!
        }
        _moleculer = Builder(name = "Moleculer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.442f, 0.718f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, -2.579f, 2.579f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, 1.368f, 2.275f)
                lineTo(12.809f, 8.27f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, -1.077f, -0.172f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, -3.505f, 3.505f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, 0.085f, 0.745f)
                lineToRelative(-2.83f, 1.036f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, -2.513f, -1.39f)
                arcTo(2.97f, 2.97f, 0.0f, false, false, 0.0f, 14.962f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, 2.97f, 2.97f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, 2.969f, -2.97f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, -0.072f, -0.634f)
                lineToRelative(2.716f, -1.193f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, 3.15f, 1.972f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, 2.129f, -0.724f)
                lineToRelative(2.276f, 2.167f)
                arcToRelative(4.305f, 4.305f, 0.0f, false, false, -0.749f, 2.426f)
                arcToRelative(4.305f, 4.305f, 0.0f, false, false, 4.306f, 4.305f)
                arcTo(4.305f, 4.305f, 0.0f, false, false, 24.0f, 18.977f)
                arcToRelative(4.305f, 4.305f, 0.0f, false, false, -4.305f, -4.305f)
                arcToRelative(4.305f, 4.305f, 0.0f, false, false, -2.718f, 0.969f)
                lineToRelative(-2.424f, -1.964f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, 0.684f, -2.074f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, -1.521f, -2.89f)
                lineToRelative(1.204f, -2.891f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, 0.522f, 0.054f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, 2.58f, -2.58f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, -2.58f, -2.578f)
                close()
            }
        }
        .build()
        return _moleculer!!
    }

private var _moleculer: ImageVector? = null
