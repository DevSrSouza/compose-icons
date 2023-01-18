package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.BookCompass: ImageVector
    get() {
        if (_bookCompass != null) {
            return _bookCompass!!
        }
        _bookCompass = Builder(name = "BookCompass", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 10.0f)
                curveTo(11.0f, 9.3096f, 11.5597f, 8.75f, 12.25f, 8.75f)
                curveTo(12.9404f, 8.75f, 13.5f, 9.3096f, 13.5f, 10.0f)
                curveTo(13.5f, 10.6904f, 12.9404f, 11.25f, 12.25f, 11.25f)
                curveTo(11.5597f, 11.25f, 11.0f, 10.6904f, 11.0f, 10.0f)
                close()
                moveTo(4.0f, 4.5f)
                curveTo(4.0f, 3.1193f, 5.1193f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.3807f, 2.0f, 20.5f, 3.1193f, 20.5f, 4.5f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.1642f, 20.1642f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.0523f, 5.9477f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 20.5f, 20.5f, 20.8358f, 20.5f, 21.25f)
                curveTo(20.5f, 21.6642f, 20.1642f, 22.0f, 19.75f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 22.0f, 4.0f, 20.8807f, 4.0f, 19.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(13.0f, 5.75f)
                curveTo(13.0f, 5.3358f, 12.6642f, 5.0f, 12.25f, 5.0f)
                curveTo(11.8358f, 5.0f, 11.5f, 5.3358f, 11.5f, 5.75f)
                verticalLineTo(7.3535f)
                curveTo(10.3458f, 7.68f, 9.5f, 8.7412f, 9.5f, 10.0f)
                curveTo(9.5f, 10.7807f, 9.8253f, 11.4854f, 10.3478f, 11.986f)
                lineTo(9.0537f, 15.2215f)
                curveTo(8.8998f, 15.606f, 9.0869f, 16.0425f, 9.4715f, 16.1964f)
                curveTo(9.8561f, 16.3502f, 10.2925f, 16.1631f, 10.4464f, 15.7785f)
                lineTo(11.6813f, 12.6911f)
                curveTo(11.8648f, 12.7297f, 12.0551f, 12.75f, 12.25f, 12.75f)
                curveTo(12.445f, 12.75f, 12.6352f, 12.7297f, 12.8187f, 12.6911f)
                lineTo(14.0537f, 15.7785f)
                curveTo(14.2075f, 16.1631f, 14.644f, 16.3502f, 15.0286f, 16.1964f)
                curveTo(15.4131f, 16.0425f, 15.6002f, 15.606f, 15.4464f, 15.2215f)
                lineTo(14.1522f, 11.986f)
                curveTo(14.6747f, 11.4854f, 15.0f, 10.7807f, 15.0f, 10.0f)
                curveTo(15.0f, 8.7412f, 14.1543f, 7.68f, 13.0f, 7.3535f)
                verticalLineTo(5.75f)
                close()
            }
        }
        .build()
        return _bookCompass!!
    }

private var _bookCompass: ImageVector? = null
