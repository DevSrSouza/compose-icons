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

public val SolidGroup.Faucet: ImageVector
    get() {
        if (_faucet != null) {
            return _faucet!!
        }
        _faucet = Builder(name = "Faucet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 96.0f)
                verticalLineToRelative(12.0f)
                lineTo(96.0f, 96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(96.0f, -12.0f)
                lineToRelative(31.0f, -3.9f)
                lineToRelative(1.0f, -0.1f)
                lineToRelative(1.0f, 0.1f)
                lineToRelative(31.0f, 3.9f)
                lineToRelative(96.0f, 12.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-96.0f, 12.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                close()
                moveTo(32.0f, 256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(132.1f)
                curveToRelative(20.2f, 29.0f, 53.9f, 48.0f, 91.9f, 48.0f)
                reflectiveCurveToRelative(71.7f, -19.0f, 91.9f, -48.0f)
                horizontalLineTo(352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -88.4f, -71.6f, -160.0f, -160.0f, -160.0f)
                horizontalLineTo(320.0f)
                lineToRelative(-22.6f, -22.6f)
                curveToRelative(-6.0f, -6.0f, -14.1f, -9.4f, -22.6f, -9.4f)
                horizontalLineTo(256.0f)
                verticalLineTo(180.2f)
                lineToRelative(-32.0f, -4.0f)
                lineToRelative(-32.0f, 4.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(173.3f)
                curveToRelative(-8.5f, 0.0f, -16.6f, 3.4f, -22.6f, 9.4f)
                lineTo(128.0f, 256.0f)
                horizontalLineTo(32.0f)
                close()
            }
        }
        .build()
        return _faucet!!
    }

private var _faucet: ImageVector? = null
