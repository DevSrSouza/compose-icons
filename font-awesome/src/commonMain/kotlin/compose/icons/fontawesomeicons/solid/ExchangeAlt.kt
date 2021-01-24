package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ExchangeAlt: ImageVector
    get() {
        if (_exchangeAlt != null) {
            return _exchangeAlt!!
        }
        _exchangeAlt = Builder(name = "ExchangeAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 168.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -13.255f, 10.745f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(360.0f)
                lineTo(384.0f, 80.0f)
                curveToRelative(0.0f, -21.367f, 25.899f, -32.042f, 40.971f, -16.971f)
                lineToRelative(80.0f, 80.0f)
                curveToRelative(9.372f, 9.373f, 9.372f, 24.569f, 0.0f, 33.941f)
                lineToRelative(-80.0f, 80.0f)
                curveTo(409.956f, 271.982f, 384.0f, 261.456f, 384.0f, 240.0f)
                verticalLineToRelative(-48.0f)
                lineTo(24.0f, 192.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                close()
                moveTo(488.0f, 320.0f)
                lineTo(128.0f, 320.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -21.314f, -25.862f, -32.08f, -40.971f, -16.971f)
                lineToRelative(-80.0f, 80.0f)
                curveToRelative(-9.372f, 9.373f, -9.372f, 24.569f, 0.0f, 33.941f)
                lineToRelative(80.0f, 80.0f)
                curveTo(102.057f, 463.997f, 128.0f, 453.437f, 128.0f, 432.0f)
                verticalLineToRelative(-48.0f)
                horizontalLineToRelative(360.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _exchangeAlt!!
    }

private var _exchangeAlt: ImageVector? = null
