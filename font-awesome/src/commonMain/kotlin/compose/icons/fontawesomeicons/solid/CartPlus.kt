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

public val SolidGroup.CartPlus: ImageVector
    get() {
        if (_cartPlus != null) {
            return _cartPlus!!
        }
        _cartPlus = Builder(name = "CartPlus", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                curveTo(0.0f, 10.7f, 10.7f, 0.0f, 24.0f, 0.0f)
                lineTo(69.5f, 0.0f)
                curveToRelative(22.0f, 0.0f, 41.5f, 12.8f, 50.6f, 32.0f)
                horizontalLineToRelative(411.0f)
                curveToRelative(26.3f, 0.0f, 45.5f, 25.0f, 38.6f, 50.4f)
                lineToRelative(-41.0f, 152.3f)
                curveToRelative(-8.5f, 31.4f, -37.0f, 53.3f, -69.5f, 53.3f)
                lineTo(170.7f, 288.0f)
                lineToRelative(5.4f, 28.5f)
                curveToRelative(2.2f, 11.3f, 12.1f, 19.5f, 23.6f, 19.5f)
                lineTo(488.0f, 336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(199.7f, 384.0f)
                curveToRelative(-34.6f, 0.0f, -64.3f, -24.6f, -70.7f, -58.5f)
                lineTo(77.4f, 54.5f)
                curveToRelative(-0.7f, -3.8f, -4.0f, -6.5f, -7.9f, -6.5f)
                lineTo(24.0f, 48.0f)
                curveTo(10.7f, 48.0f, 0.0f, 37.3f, 0.0f, 24.0f)
                close()
                moveTo(128.0f, 464.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(464.0f, 416.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
                moveTo(252.0f, 160.0f)
                curveToRelative(0.0f, 11.0f, 9.0f, 20.0f, 20.0f, 20.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(44.0f)
                curveToRelative(0.0f, 11.0f, 9.0f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -9.0f, 20.0f, -20.0f)
                lineTo(356.0f, 180.0f)
                horizontalLineToRelative(44.0f)
                curveToRelative(11.0f, 0.0f, 20.0f, -9.0f, 20.0f, -20.0f)
                reflectiveCurveToRelative(-9.0f, -20.0f, -20.0f, -20.0f)
                lineTo(356.0f, 140.0f)
                lineTo(356.0f, 96.0f)
                curveToRelative(0.0f, -11.0f, -9.0f, -20.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-20.0f, 9.0f, -20.0f, 20.0f)
                verticalLineToRelative(44.0f)
                lineTo(272.0f, 140.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, 9.0f, -20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _cartPlus!!
    }

private var _cartPlus: ImageVector? = null
