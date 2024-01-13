package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Upwork: ImageVector
    get() {
        if (_upwork != null) {
            return _upwork!!
        }
        _upwork = Builder(name = "Upwork", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(270.8f, 274.3f)
                curveToRelative(5.2f, 8.4f, 23.6f, 29.9f, 51.5f, 29.9f)
                verticalLineToRelative(0.0f)
                curveToRelative(25.2f, 0.0f, 44.9f, -20.2f, 44.9f, -49.7f)
                reflectiveCurveToRelative(-19.4f, -49.7f, -44.9f, -49.7f)
                reflectiveCurveToRelative(-44.9f, 16.7f, -51.5f, 69.5f)
                close()
                moveTo(244.1f, 232.5f)
                curveToRelative(7.3f, -30.5f, 32.7f, -60.1f, 78.2f, -60.1f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(45.1f, 0.0f, 80.9f, 35.2f, 80.9f, 82.2f)
                reflectiveCurveToRelative(-35.9f, 81.9f, -80.9f, 81.9f)
                curveToRelative(-0.6f, 0.0f, -1.1f, 0.0f, -1.7f, 0.0f)
                curveToRelative(-0.5f, 0.0f, -1.1f, 0.0f, -1.6f, 0.0f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-14.5f, -0.5f, -28.7f, -4.8f, -40.9f, -12.6f)
                curveToRelative(-4.7f, -2.8f, -9.1f, -6.0f, -13.4f, -9.5f)
                lineToRelative(-12.8f, 78.4f)
                lineTo(214.9f, 392.8f)
                lineToRelative(19.4f, -110.6f)
                curveToRelative(-20.8f, -29.1f, -31.6f, -62.4f, -36.2f, -79.7f)
                lineTo(198.1f, 255.0f)
                curveToRelative(0.0f, 48.0f, -30.5f, 81.5f, -74.2f, 81.5f)
                curveToRelative(-22.0f, 0.0f, -41.0f, -8.0f, -54.8f, -23.3f)
                curveToRelative(-13.4f, -14.8f, -20.8f, -35.5f, -20.8f, -58.3f)
                lineTo(48.3f, 176.8f)
                lineTo(84.5f, 176.8f)
                lineToRelative(-0.3f, 78.2f)
                curveToRelative(0.0f, 28.4f, 14.5f, 49.3f, 39.8f, 49.3f)
                reflectiveCurveToRelative(38.2f, -20.9f, 38.2f, -49.3f)
                lineTo(162.2f, 176.8f)
                horizontalLineToRelative(62.8f)
                curveToRelative(4.8f, 19.3f, 10.9f, 40.1f, 19.2f, 55.6f)
                close()
            }
        }
        .build()
        return _upwork!!
    }

private var _upwork: ImageVector? = null
