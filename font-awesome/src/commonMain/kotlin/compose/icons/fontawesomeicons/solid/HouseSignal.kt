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

public val SolidGroup.HouseSignal: ImageVector
    get() {
        if (_houseSignal != null) {
            return _houseSignal!!
        }
        _houseSignal = Builder(name = "HouseSignal", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(357.7f, 8.5f)
                curveToRelative(-12.3f, -11.3f, -31.2f, -11.3f, -43.4f, 0.0f)
                lineToRelative(-208.0f, 192.0f)
                curveToRelative(-9.4f, 8.6f, -12.7f, 22.0f, -8.5f, 34.0f)
                curveToRelative(87.1f, 25.3f, 155.6f, 94.2f, 180.3f, 181.6f)
                lineTo(464.0f, 416.1f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(512.0f, 256.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.2f, 0.0f, 25.0f, -8.1f, 29.8f, -20.3f)
                reflectiveCurveToRelative(1.6f, -26.2f, -8.1f, -35.2f)
                lineToRelative(-208.0f, -192.0f)
                close()
                moveTo(288.0f, 208.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(304.0f, 288.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(288.0f, 208.0f)
                close()
                moveTo(24.0f, 256.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                curveToRelative(101.6f, 0.0f, 184.0f, 82.4f, 184.0f, 184.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                curveToRelative(0.0f, -128.1f, -103.9f, -232.0f, -232.0f, -232.0f)
                close()
                moveTo(32.0f, 512.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(0.0f, 376.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                curveToRelative(48.6f, 0.0f, 88.0f, 39.4f, 88.0f, 88.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                curveToRelative(0.0f, -75.1f, -60.9f, -136.0f, -136.0f, -136.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _houseSignal!!
    }

private var _houseSignal: ImageVector? = null
