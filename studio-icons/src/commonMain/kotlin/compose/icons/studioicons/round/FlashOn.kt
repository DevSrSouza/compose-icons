package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.FlashOn: ImageVector
    get() {
        if (_flashOn != null) {
            return _flashOn!!
        }
        _flashOn = Builder(name = "FlashOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.15f)
                curveToRelative(0.0f, 0.51f, 0.67f, 0.69f, 0.93f, 0.25f)
                lineToRelative(5.19f, -8.9f)
                curveToRelative(0.39f, -0.67f, -0.09f, -1.5f, -0.86f, -1.5f)
                horizontalLineTo(13.0f)
                lineToRelative(2.49f, -6.65f)
                curveToRelative(0.25f, -0.65f, -0.23f, -1.35f, -0.93f, -1.35f)
                horizontalLineTo(8.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _flashOn!!
    }

private var _flashOn: ImageVector? = null
