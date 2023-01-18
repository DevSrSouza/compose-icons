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

public val IonIcons.BagAdd: ImageVector
    get() {
        if (_bagAdd != null) {
            return _bagAdd!!
        }
        _bagAdd = Builder(name = "BagAdd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(454.66f, 169.4f)
                arcTo(31.86f, 31.86f, 0.0f, false, false, 432.0f, 160.0f)
                lineTo(368.0f, 160.0f)
                lineTo(368.0f, 144.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, false, false, -224.0f, 0.0f)
                verticalLineToRelative(16.0f)
                lineTo(80.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                lineTo(48.0f, 408.0f)
                curveToRelative(0.0f, 39.0f, 33.0f, 72.0f, 72.0f, 72.0f)
                lineTo(392.0f, 480.0f)
                arcToRelative(72.22f, 72.22f, 0.0f, false, false, 50.48f, -20.55f)
                arcTo(69.48f, 69.48f, 0.0f, false, false, 464.0f, 409.25f)
                lineTo(464.0f, 192.0f)
                arcTo(31.78f, 31.78f, 0.0f, false, false, 454.66f, 169.4f)
                close()
                moveTo(320.0f, 336.0f)
                lineTo(272.0f, 336.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(240.0f, 336.0f)
                lineTo(192.0f, 336.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                horizontalLineToRelative(48.0f)
                lineTo(240.0f, 256.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
                moveTo(336.0f, 160.0f)
                lineTo(176.0f, 160.0f)
                lineTo(176.0f, 144.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 160.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bagAdd!!
    }

private var _bagAdd: ImageVector? = null
