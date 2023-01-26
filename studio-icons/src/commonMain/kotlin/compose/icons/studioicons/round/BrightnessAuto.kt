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

public val RoundGroup.BrightnessAuto: ImageVector
    get() {
        if (_brightnessAuto != null) {
            return _brightnessAuto!!
        }
        _brightnessAuto = Builder(name = "BrightnessAuto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.85f, 12.65f)
                horizontalLineToRelative(2.3f)
                lineTo(12.0f, 9.0f)
                lineToRelative(-1.15f, 3.65f)
                close()
                moveTo(20.0f, 8.69f)
                lineTo(20.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.69f)
                lineToRelative(-1.9f, -1.9f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f)
                lineTo(8.69f, 4.0f)
                lineTo(6.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(2.69f)
                lineToRelative(-1.9f, 1.9f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(1.9f, 1.9f)
                lineTo(4.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.69f)
                lineToRelative(1.9f, 1.9f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f)
                lineToRelative(1.9f, -1.9f)
                lineTo(18.0f, 20.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-2.69f)
                lineToRelative(1.9f, -1.9f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineTo(20.0f, 8.69f)
                close()
                moveTo(14.09f, 15.4f)
                lineTo(13.6f, 14.0f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(-0.49f, 1.4f)
                curveToRelative(-0.13f, 0.36f, -0.46f, 0.6f, -0.84f, 0.6f)
                curveToRelative(-0.62f, 0.0f, -1.05f, -0.61f, -0.84f, -1.19f)
                lineToRelative(2.44f, -6.86f)
                curveToRelative(0.2f, -0.57f, 0.73f, -0.95f, 1.33f, -0.95f)
                curveToRelative(0.6f, 0.0f, 1.13f, 0.38f, 1.34f, 0.94f)
                lineToRelative(2.44f, 6.86f)
                curveToRelative(0.21f, 0.58f, -0.22f, 1.19f, -0.84f, 1.19f)
                curveToRelative(-0.39f, 0.01f, -0.72f, -0.23f, -0.85f, -0.59f)
                close()
            }
        }
        .build()
        return _brightnessAuto!!
    }

private var _brightnessAuto: ImageVector? = null
