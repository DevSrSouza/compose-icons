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

public val SolidGroup.Shrimp: ImageVector
    get() {
        if (_shrimp != null) {
            return _shrimp!!
        }
        _shrimp = Builder(name = "Shrimp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(3.7f, 88.9f, 77.0f, 160.0f, 167.0f, 160.0f)
                horizontalLineToRelative(56.0f)
                lineTo(288.0f, 128.0f)
                lineTo(264.0f, 128.0f)
                lineTo(88.8f, 128.0f)
                lineTo(64.0f, 128.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(464.0f, 64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(224.0f, 456.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(72.0f)
                lineTo(320.0f, 407.8f)
                lineToRelative(-64.1f, -22.4f)
                curveToRelative(-12.5f, -4.4f, -26.2f, 2.2f, -30.6f, 14.7f)
                reflectiveCurveToRelative(2.2f, 26.2f, 14.7f, 30.6f)
                lineToRelative(4.5f, 1.6f)
                curveTo(233.0f, 433.9f, 224.0f, 443.9f, 224.0f, 456.0f)
                close()
                moveTo(352.0f, 479.3f)
                curveToRelative(36.4f, -3.3f, 69.5f, -17.6f, 96.1f, -39.6f)
                lineToRelative(-86.5f, -34.6f)
                curveToRelative(-3.0f, 1.8f, -6.2f, 3.2f, -9.6f, 4.3f)
                verticalLineToRelative(69.9f)
                close()
                moveTo(472.6f, 415.0f)
                curveToRelative(24.6f, -30.3f, 39.4f, -68.9f, 39.4f, -111.0f)
                curveToRelative(0.0f, -12.3f, -1.3f, -24.3f, -3.7f, -35.9f)
                lineTo(382.8f, 355.1f)
                curveToRelative(0.8f, 3.4f, 1.2f, 7.0f, 1.2f, 10.6f)
                curveToRelative(0.0f, 4.6f, -0.7f, 9.0f, -1.9f, 13.1f)
                lineTo(472.6f, 415.0f)
                close()
                moveTo(336.0f, 128.0f)
                lineTo(320.0f, 128.0f)
                lineTo(320.0f, 320.0f)
                horizontalLineToRelative(18.3f)
                curveToRelative(9.9f, 0.0f, 19.1f, 3.2f, 26.6f, 8.5f)
                lineToRelative(133.5f, -92.4f)
                curveTo(471.8f, 172.6f, 409.1f, 128.0f, 336.0f, 128.0f)
                close()
                moveTo(168.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
