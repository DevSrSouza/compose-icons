package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ServiceFill: ImageVector
    get() {
        if (_serviceFill != null) {
            return _serviceFill!!
        }
        _serviceFill = Builder(name = "ServiceFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.121f, 10.48f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-0.707f, 0.706f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.828f, -2.828f)
                lineToRelative(5.63f, -5.632f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 6.377f, 10.568f)
                lineToRelative(-2.108f, 2.135f)
                lineToRelative(-4.95f, -4.95f)
                close()
                moveTo(3.161f, 4.468f)
                arcToRelative(6.503f, 6.503f, 0.0f, false, true, 8.009f, -0.938f)
                lineTo(7.757f, 6.944f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.513f, 5.794f)
                lineToRelative(0.144f, -0.137f)
                lineToRelative(4.243f, 4.242f)
                lineToRelative(-4.243f, 4.243f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.828f, 0.0f)
                lineTo(3.16f, 13.66f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 0.0f, -9.192f)
                close()
            }
        }
        .build()
        return _serviceFill!!
    }

private var _serviceFill: ImageVector? = null
