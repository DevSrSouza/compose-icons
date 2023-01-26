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

public val RoundGroup.FlashAuto: ImageVector
    get() {
        if (_flashAuto != null) {
            return _flashAuto!!
        }
        _flashAuto = Builder(name = "FlashAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.15f)
                curveToRelative(0.0f, 0.51f, 0.67f, 0.69f, 0.93f, 0.25f)
                lineToRelative(5.19f, -8.9f)
                curveToRelative(0.39f, -0.67f, -0.09f, -1.5f, -0.86f, -1.5f)
                lineTo(9.0f, 11.0f)
                lineToRelative(3.38f, -7.59f)
                curveToRelative(0.29f, -0.67f, -0.2f, -1.41f, -0.92f, -1.41f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                close()
                moveTo(18.0f, 2.0f)
                curveToRelative(-0.6f, 0.0f, -1.13f, 0.38f, -1.34f, 0.94f)
                lineTo(14.22f, 9.8f)
                curveToRelative(-0.2f, 0.59f, 0.23f, 1.2f, 0.85f, 1.2f)
                curveToRelative(0.38f, 0.0f, 0.72f, -0.24f, 0.84f, -0.6f)
                lineTo(16.4f, 9.0f)
                horizontalLineToRelative(3.2f)
                lineToRelative(0.49f, 1.4f)
                curveToRelative(0.13f, 0.36f, 0.46f, 0.6f, 0.84f, 0.6f)
                curveToRelative(0.62f, 0.0f, 1.05f, -0.61f, 0.84f, -1.19f)
                lineToRelative(-2.44f, -6.86f)
                curveTo(19.13f, 2.38f, 18.6f, 2.0f, 18.0f, 2.0f)
                close()
                moveTo(16.85f, 7.65f)
                lineTo(18.0f, 4.0f)
                lineToRelative(1.15f, 3.65f)
                horizontalLineToRelative(-2.3f)
                close()
            }
        }
        .build()
        return _flashAuto!!
    }

private var _flashAuto: ImageVector? = null
