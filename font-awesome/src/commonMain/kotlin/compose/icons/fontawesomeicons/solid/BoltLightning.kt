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

public val SolidGroup.BoltLightning: ImageVector
    get() {
        if (_boltLightning != null) {
            return _boltLightning!!
        }
        _boltLightning = Builder(name = "BoltLightning", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                lineTo(28.5f, 28.0f)
                curveToRelative(2.0f, -16.0f, 15.6f, -28.0f, 31.8f, -28.0f)
                horizontalLineTo(228.9f)
                curveToRelative(15.0f, 0.0f, 27.1f, 12.1f, 27.1f, 27.1f)
                curveToRelative(0.0f, 3.2f, -0.6f, 6.5f, -1.7f, 9.5f)
                lineTo(208.0f, 160.0f)
                horizontalLineTo(347.3f)
                curveToRelative(20.2f, 0.0f, 36.7f, 16.4f, 36.7f, 36.7f)
                curveToRelative(0.0f, 7.4f, -2.2f, 14.6f, -6.4f, 20.7f)
                lineToRelative(-192.2f, 281.0f)
                curveToRelative(-5.9f, 8.6f, -15.6f, 13.7f, -25.9f, 13.7f)
                horizontalLineToRelative(-2.9f)
                curveToRelative(-15.7f, 0.0f, -28.5f, -12.8f, -28.5f, -28.5f)
                curveToRelative(0.0f, -2.3f, 0.3f, -4.6f, 0.9f, -6.9f)
                lineTo(176.0f, 288.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _boltLightning!!
    }

private var _boltLightning: ImageVector? = null
