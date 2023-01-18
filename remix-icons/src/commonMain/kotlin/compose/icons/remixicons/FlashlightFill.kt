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

public val RemixIcons.FlashlightFill: ImageVector
    get() {
        if (_flashlightFill != null) {
            return _flashlightFill!!
        }
        _flashlightFill = Builder(name = "FlashlightFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(-9.0f, 13.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineTo(4.0f)
                lineToRelative(9.0f, -13.0f)
                close()
            }
        }
        .build()
        return _flashlightFill!!
    }

private var _flashlightFill: ImageVector? = null
