package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.PenSquareSolid: ImageVector
    get() {
        if (_penSquareSolid != null) {
            return _penSquareSolid!!
        }
        _penSquareSolid = Builder(name = "PenSquareSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(20.127f, 8.877f)
                curveTo(19.357f, 8.877f, 18.584f, 9.17f, 18.002f, 9.752f)
                lineTo(9.7363f, 18.0176f)
                lineTo(9.7051f, 18.3301f)
                lineTo(9.2363f, 21.6445f)
                lineTo(9.0176f, 22.9883f)
                lineTo(10.3613f, 22.7695f)
                lineTo(13.6738f, 22.3008f)
                lineTo(13.9863f, 22.2695f)
                lineTo(22.2539f, 14.0039f)
                curveTo(23.4139f, 12.8439f, 23.4139f, 10.9139f, 22.2539f, 9.7539f)
                curveTo(21.6709f, 9.1709f, 20.897f, 8.877f, 20.127f, 8.877f)
                close()
                moveTo(20.127f, 10.877f)
                curveTo(20.381f, 10.877f, 20.6467f, 10.9592f, 20.8457f, 11.1582f)
                curveTo(21.2327f, 11.5452f, 21.244f, 12.1352f, 20.877f, 12.5332f)
                lineTo(20.8457f, 12.5645f)
                lineTo(13.0488f, 20.3926f)
                lineTo(11.3926f, 20.6113f)
                lineTo(11.6113f, 18.9551f)
                lineTo(19.4395f, 11.1582f)
                curveTo(19.6385f, 10.9592f, 19.874f, 10.877f, 20.127f, 10.877f)
                close()
            }
        }
        .build()
        return _penSquareSolid!!
    }

private var _penSquareSolid: ImageVector? = null
