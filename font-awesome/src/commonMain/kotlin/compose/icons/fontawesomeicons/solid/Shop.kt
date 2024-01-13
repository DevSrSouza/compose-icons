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

public val SolidGroup.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(name = "Shop", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.8f, 192.0f)
                lineTo(603.2f, 192.0f)
                curveToRelative(20.3f, 0.0f, 36.8f, -16.5f, 36.8f, -36.8f)
                curveToRelative(0.0f, -7.3f, -2.2f, -14.4f, -6.2f, -20.4f)
                lineTo(558.2f, 21.4f)
                curveTo(549.3f, 8.0f, 534.4f, 0.0f, 518.3f, 0.0f)
                lineTo(121.7f, 0.0f)
                curveToRelative(-16.0f, 0.0f, -31.0f, 8.0f, -39.9f, 21.4f)
                lineTo(6.2f, 134.7f)
                curveToRelative(-4.0f, 6.1f, -6.2f, 13.2f, -6.2f, 20.4f)
                curveTo(0.0f, 175.5f, 16.5f, 192.0f, 36.8f, 192.0f)
                close()
                moveTo(64.0f, 224.0f)
                lineTo(64.0f, 384.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineTo(336.0f, 512.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(384.0f, 384.0f)
                lineTo(384.0f, 224.0f)
                lineTo(320.0f, 224.0f)
                lineTo(320.0f, 384.0f)
                lineTo(128.0f, 384.0f)
                lineTo(128.0f, 224.0f)
                lineTo(64.0f, 224.0f)
                close()
                moveTo(512.0f, 224.0f)
                lineTo(512.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(576.0f, 224.0f)
                lineTo(512.0f, 224.0f)
                close()
            }
        }
        .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
