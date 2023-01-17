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

public val SolidGroup.CartArrowDown: ImageVector
    get() {
        if (_cartArrowDown != null) {
            return _cartArrowDown!!
        }
        _cartArrowDown = Builder(name = "CartArrowDown", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                reflectiveCurveTo(10.7f, 48.0f, 24.0f, 48.0f)
                lineTo(69.5f, 48.0f)
                curveToRelative(3.8f, 0.0f, 7.1f, 2.7f, 7.9f, 6.5f)
                lineToRelative(51.6f, 271.0f)
                curveToRelative(6.5f, 34.0f, 36.2f, 58.5f, 70.7f, 58.5f)
                lineTo(488.0f, 384.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(199.7f, 336.0f)
                curveToRelative(-11.5f, 0.0f, -21.4f, -8.2f, -23.6f, -19.5f)
                lineTo(170.7f, 288.0f)
                lineTo(459.2f, 288.0f)
                curveToRelative(32.6f, 0.0f, 61.1f, -21.8f, 69.5f, -53.3f)
                lineToRelative(41.0f, -152.3f)
                curveTo(576.6f, 57.0f, 557.4f, 32.0f, 531.1f, 32.0f)
                lineTo(360.0f, 32.0f)
                lineTo(360.0f, 134.1f)
                lineToRelative(23.0f, -23.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(311.9f, 32.0f)
                lineTo(120.1f, 32.0f)
                curveTo(111.0f, 12.8f, 91.6f, 0.0f, 69.5f, 0.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(176.0f, 512.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(512.0f, 464.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cartArrowDown!!
    }

private var _cartArrowDown: ImageVector? = null
