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

public val IonIcons.CartSharp: ImageVector
    get() {
        if (_cartSharp != null) {
            return _cartSharp!!
        }
        _cartSharp = Builder(name = "CartSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 416.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 416.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.78f, 304.0f)
                lineToRelative(261.34f, 0.0f)
                lineToRelative(38.4f, -192.0f)
                lineToRelative(-333.63f, 0.0f)
                lineToRelative(-8.47f, -48.0f)
                lineToRelative(-93.42f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(66.58f, 0.0f)
                lineToRelative(48.0f, 272.0f)
                lineToRelative(285.42f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-258.58f, 0.0f)
                lineToRelative(-5.64f, -32.0f)
                close()
            }
        }
        .build()
        return _cartSharp!!
    }

private var _cartSharp: ImageVector? = null
