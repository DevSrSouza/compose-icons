package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.BrightnessAuto: ImageVector
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
                verticalLineTo(4.0f)
                horizontalLineToRelative(-4.69f)
                lineTo(12.0f, 0.69f)
                lineTo(8.69f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(4.69f)
                lineTo(0.69f, 12.0f)
                lineTo(4.0f, 15.31f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(4.69f)
                lineTo(12.0f, 23.31f)
                lineTo(15.31f, 20.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-4.69f)
                lineTo(23.31f, 12.0f)
                lineTo(20.0f, 8.69f)
                close()
                moveTo(14.3f, 16.0f)
                lineToRelative(-0.7f, -2.0f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(-0.7f, 2.0f)
                horizontalLineTo(7.8f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(3.2f, 9.0f)
                horizontalLineToRelative(-1.9f)
                close()
            }
        }
        .build()
        return _brightnessAuto!!
    }

private var _brightnessAuto: ImageVector? = null
