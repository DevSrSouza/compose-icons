package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Poo: ImageVector
    get() {
        if (_poo != null) {
            return _poo!!
        }
        _poo = Builder(name = "Poo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(451.4f, 369.1f)
                curveTo(468.7f, 356.0f, 480.0f, 335.4f, 480.0f, 312.0f)
                curveToRelative(0.0f, -39.8f, -32.2f, -72.0f, -72.0f, -72.0f)
                horizontalLineToRelative(-14.1f)
                curveToRelative(13.4f, -11.7f, 22.1f, -28.8f, 22.1f, -48.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineToRelative(-5.9f)
                curveToRelative(3.6f, -10.1f, 5.9f, -20.7f, 5.9f, -32.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-5.2f, 0.0f, -10.2f, 0.7f, -15.1f, 1.5f)
                curveTo(250.3f, 14.6f, 256.0f, 30.6f, 256.0f, 48.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                curveToRelative(0.0f, 19.2f, 8.7f, 36.3f, 22.1f, 48.0f)
                lineTo(104.0f, 240.0f)
                curveToRelative(-39.8f, 0.0f, -72.0f, 32.2f, -72.0f, 72.0f)
                curveToRelative(0.0f, 23.4f, 11.3f, 44.0f, 28.6f, 57.1f)
                curveTo(26.3f, 374.6f, 0.0f, 404.1f, 0.0f, 440.0f)
                curveToRelative(0.0f, 39.8f, 32.2f, 72.0f, 72.0f, 72.0f)
                horizontalLineToRelative(368.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, -32.2f, 72.0f, -72.0f)
                curveToRelative(0.0f, -35.9f, -26.3f, -65.4f, -60.6f, -70.9f)
                close()
                moveTo(192.0f, 256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(351.5f, 395.0f)
                curveTo(341.0f, 422.9f, 293.0f, 448.0f, 256.0f, 448.0f)
                reflectiveCurveToRelative(-85.0f, -25.1f, -95.5f, -53.0f)
                curveToRelative(-2.0f, -5.3f, 2.0f, -11.0f, 7.8f, -11.0f)
                horizontalLineToRelative(175.4f)
                curveToRelative(5.8f, 0.0f, 9.8f, 5.7f, 7.8f, 11.0f)
                close()
                moveTo(320.0f, 320.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _poo!!
    }

private var _poo: ImageVector? = null
