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

public val SolidGroup.GlassWaterDroplet: ImageVector
    get() {
        if (_glassWaterDroplet != null) {
            return _glassWaterDroplet!!
        }
        _glassWaterDroplet = Builder(name = "GlassWaterDroplet", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(55.1f, 0.0f, 46.6f, 3.7f, 40.6f, 10.2f)
                reflectiveCurveToRelative(-9.1f, 15.2f, -8.5f, 24.1f)
                lineTo(60.9f, 437.7f)
                curveToRelative(3.0f, 41.9f, 37.8f, 74.3f, 79.8f, 74.3f)
                lineTo(307.3f, 512.0f)
                curveToRelative(42.0f, 0.0f, 76.8f, -32.4f, 79.8f, -74.3f)
                lineTo(415.9f, 34.3f)
                curveToRelative(0.6f, -8.9f, -2.4f, -17.6f, -8.5f, -24.1f)
                reflectiveCurveTo(392.9f, 0.0f, 384.0f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(115.0f, 297.5f)
                lineTo(98.4f, 64.0f)
                lineTo(349.6f, 64.0f)
                lineTo(333.0f, 297.5f)
                lineTo(320.0f, 304.0f)
                curveToRelative(-20.1f, 10.1f, -43.9f, 10.1f, -64.0f, 0.0f)
                reflectiveCurveToRelative(-43.9f, -10.1f, -64.0f, 0.0f)
                reflectiveCurveToRelative(-43.9f, 10.1f, -64.0f, 0.0f)
                lineToRelative(-13.0f, -6.5f)
                close()
                moveTo(288.0f, 196.0f)
                curveToRelative(0.0f, -24.0f, -33.7f, -70.1f, -52.2f, -93.5f)
                curveToRelative(-6.1f, -7.7f, -17.5f, -7.7f, -23.6f, 0.0f)
                curveTo(193.7f, 125.9f, 160.0f, 172.0f, 160.0f, 196.0f)
                curveToRelative(0.0f, 33.1f, 28.7f, 60.0f, 64.0f, 60.0f)
                reflectiveCurveToRelative(64.0f, -26.9f, 64.0f, -60.0f)
                close()
            }
        }
        .build()
        return _glassWaterDroplet!!
    }

private var _glassWaterDroplet: ImageVector? = null
