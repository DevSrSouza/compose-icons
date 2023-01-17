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

public val SolidGroup.TrowelBricks: ImageVector
    get() {
        if (_trowelBricks != null) {
            return _trowelBricks!!
        }
        _trowelBricks = Builder(name = "TrowelBricks", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.8f, 4.8f)
                curveTo(250.3f, 10.6f, 256.0f, 20.9f, 256.0f, 32.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(89.0f)
                curveToRelative(3.6f, -13.8f, 16.1f, -24.0f, 31.0f, -24.0f)
                horizontalLineToRelative(88.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(376.0f, 176.0f)
                curveToRelative(-14.9f, 0.0f, -27.4f, -10.2f, -31.0f, -24.0f)
                lineTo(256.0f, 152.0f)
                verticalLineToRelative(72.0f)
                curveToRelative(0.0f, 11.1f, -5.7f, 21.4f, -15.2f, 27.2f)
                reflectiveCurveToRelative(-21.2f, 6.4f, -31.1f, 1.4f)
                lineToRelative(-192.0f, -96.0f)
                curveTo(6.8f, 151.2f, 0.0f, 140.1f, 0.0f, 128.0f)
                reflectiveCurveToRelative(6.8f, -23.2f, 17.7f, -28.6f)
                lineToRelative(192.0f, -96.0f)
                curveToRelative(9.9f, -5.0f, 21.7f, -4.4f, 31.1f, 1.4f)
                close()
                moveTo(288.0f, 256.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(480.0f, 224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(320.0f, 352.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(288.0f, 256.0f)
                close()
                moveTo(32.0f, 384.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(224.0f, 384.0f)
                lineTo(480.0f, 384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(224.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(192.0f, 416.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _trowelBricks!!
    }

private var _trowelBricks: ImageVector? = null
