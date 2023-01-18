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

public val RemixIcons.EqualizerFill: ImageVector
    get() {
        if (_equalizerFill != null) {
            return _equalizerFill!!
        }
        _equalizerFill = Builder(name = "EqualizerFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.17f, 18.0f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, 5.66f, 0.0f)
                lineTo(22.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(11.83f, 20.0f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.17f)
                close()
                moveTo(12.17f, 11.0f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, 5.66f, 0.0f)
                lineTo(22.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.17f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.17f)
                close()
                moveTo(6.17f, 4.0f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, 5.66f, 0.0f)
                lineTo(22.0f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(11.83f, 6.0f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(4.17f)
                close()
            }
        }
        .build()
        return _equalizerFill!!
    }

private var _equalizerFill: ImageVector? = null
