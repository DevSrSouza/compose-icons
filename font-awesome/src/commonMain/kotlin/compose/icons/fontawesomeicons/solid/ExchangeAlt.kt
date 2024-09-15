package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                curveToRelative(0.0f, -13.26f, 10.74f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(360.0f)
                lineTo(384.0f, 80.0f)
                curveToRelative(0.0f, -21.37f, 25.9f, -32.04f, 40.97f, -16.97f)
                lineToRelative(80.0f, 80.0f)
                curveToRelative(9.37f, 9.37f, 9.37f, 24.57f, 0.0f, 33.94f)
                lineToRelative(-80.0f, 80.0f)
                curveTo(409.96f, 271.98f, 384.0f, 261.46f, 384.0f, 240.0f)
                verticalLineToRelative(-48.0f)
                lineTo(24.0f, 192.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.74f, -24.0f, -24.0f)
                close()
                moveTo(488.0f, 320.0f)
                lineTo(128.0f, 320.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -21.31f, -25.86f, -32.08f, -40.97f, -16.97f)
                lineToRelative(-80.0f, 80.0f)
                curveToRelative(-9.37f, 9.37f, -9.37f, 24.57f, 0.0f, 33.94f)
                lineToRelative(80.0f, 80.0f)
                curveTo(102.06f, 464.0f, 128.0f, 453.44f, 128.0f, 432.0f)
                verticalLineToRelative(-48.0f)
                horizontalLineToRelative(360.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _exchangeAlt!!
    }

private var _exchangeAlt: ImageVector? = null
