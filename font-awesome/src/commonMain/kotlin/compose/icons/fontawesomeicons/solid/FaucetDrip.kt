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

public val SolidGroup.FaucetDrip: ImageVector
    get() {
        if (_faucetDrip != null) {
            return _faucetDrip!!
        }
        _faucetDrip = Builder(name = "FaucetDrip", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(44.0f)
                lineToRelative(96.0f, -12.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(256.0f, 84.0f)
                lineToRelative(-31.0f, -3.9f)
                lineToRelative(-1.0f, -0.1f)
                lineToRelative(-1.0f, 0.1f)
                lineTo(192.0f, 84.0f)
                lineTo(96.0f, 96.0f)
                curveTo(78.3f, 96.0f, 64.0f, 81.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(96.0f, 12.0f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(0.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(96.0f)
                lineToRelative(22.6f, -22.6f)
                curveToRelative(6.0f, -6.0f, 14.1f, -9.4f, 22.6f, -9.4f)
                horizontalLineTo(192.0f)
                verticalLineTo(116.2f)
                lineToRelative(32.0f, -4.0f)
                lineToRelative(32.0f, 4.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(18.7f)
                curveToRelative(8.5f, 0.0f, 16.6f, 3.4f, 22.6f, 9.4f)
                lineTo(320.0f, 192.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(88.4f, 0.0f, 160.0f, 71.6f, 160.0f, 160.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(416.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(315.9f)
                curveToRelative(-20.2f, 29.0f, -53.9f, 48.0f, -91.9f, 48.0f)
                reflectiveCurveToRelative(-71.7f, -19.0f, -91.9f, -48.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(224.0f)
                close()
                moveTo(436.8f, 423.4f)
                curveToRelative(1.9f, -4.5f, 6.3f, -7.4f, 11.2f, -7.4f)
                reflectiveCurveToRelative(9.2f, 2.9f, 11.2f, 7.4f)
                lineToRelative(18.2f, 42.4f)
                curveToRelative(1.8f, 4.1f, 2.7f, 8.6f, 2.7f, 13.1f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineToRelative(-1.2f)
                curveToRelative(0.0f, -4.5f, 0.9f, -8.9f, 2.7f, -13.1f)
                lineToRelative(18.2f, -42.4f)
                close()
            }
        }
        .build()
        return _faucetDrip!!
    }

private var _faucetDrip: ImageVector? = null
