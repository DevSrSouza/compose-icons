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

public val SolidGroup.Utensils: ImageVector
    get() {
        if (_utensils != null) {
            return _utensils!!
        }
        _utensils = Builder(name = "Utensils", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 0.0f)
                curveTo(400.0f, 0.0f, 288.0f, 32.0f, 288.0f, 176.0f)
                lineTo(288.0f, 288.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(448.0f, 352.0f)
                lineTo(448.0f, 240.0f)
                lineTo(448.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(64.0f, 16.0f)
                curveTo(64.0f, 7.8f, 57.9f, 1.0f, 49.7f, 0.1f)
                reflectiveCurveTo(34.2f, 4.6f, 32.4f, 12.5f)
                lineTo(2.1f, 148.8f)
                curveTo(0.7f, 155.1f, 0.0f, 161.5f, 0.0f, 167.9f)
                curveToRelative(0.0f, 45.9f, 35.1f, 83.6f, 80.0f, 87.7f)
                lineTo(80.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(144.0f, 255.6f)
                curveToRelative(44.9f, -4.1f, 80.0f, -41.8f, 80.0f, -87.7f)
                curveToRelative(0.0f, -6.4f, -0.7f, -12.8f, -2.1f, -19.1f)
                lineTo(191.6f, 12.5f)
                curveToRelative(-1.8f, -8.0f, -9.3f, -13.3f, -17.4f, -12.4f)
                reflectiveCurveTo(160.0f, 7.8f, 160.0f, 16.0f)
                lineTo(160.0f, 150.2f)
                curveToRelative(0.0f, 5.4f, -4.4f, 9.8f, -9.8f, 9.8f)
                curveToRelative(-5.1f, 0.0f, -9.3f, -3.9f, -9.8f, -9.0f)
                lineTo(127.9f, 14.6f)
                curveTo(127.2f, 6.3f, 120.3f, 0.0f, 112.0f, 0.0f)
                reflectiveCurveToRelative(-15.2f, 6.3f, -15.9f, 14.6f)
                lineTo(83.7f, 151.0f)
                curveToRelative(-0.5f, 5.1f, -4.7f, 9.0f, -9.8f, 9.0f)
                curveToRelative(-5.4f, 0.0f, -9.8f, -4.4f, -9.8f, -9.8f)
                lineTo(64.1f, 16.0f)
                close()
                moveTo(112.3f, 168.0f)
                lineToRelative(-0.3f, 0.0f)
                lineToRelative(-0.3f, 0.0f)
                lineToRelative(0.3f, -0.7f)
                lineToRelative(0.3f, 0.7f)
                close()
            }
        }
        .build()
        return _utensils!!
    }

private var _utensils: ImageVector? = null
