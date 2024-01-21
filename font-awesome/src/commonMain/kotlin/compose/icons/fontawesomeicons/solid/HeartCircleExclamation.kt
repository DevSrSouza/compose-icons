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

public val SolidGroup.HeartCircleExclamation: ImageVector
    get() {
        if (_heartCircleExclamation != null) {
            return _heartCircleExclamation!!
        }
        _heartCircleExclamation = Builder(name = "HeartCircleExclamation", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(47.6f, 300.4f)
                lineTo(228.3f, 469.1f)
                curveToRelative(7.5f, 7.0f, 17.4f, 10.9f, 27.7f, 10.9f)
                reflectiveCurveToRelative(20.2f, -3.9f, 27.7f, -10.9f)
                lineToRelative(2.6f, -2.4f)
                curveTo(267.2f, 438.6f, 256.0f, 404.6f, 256.0f, 368.0f)
                curveToRelative(0.0f, -97.2f, 78.8f, -176.0f, 176.0f, -176.0f)
                curveToRelative(28.3f, 0.0f, 55.0f, 6.7f, 78.7f, 18.5f)
                curveToRelative(0.9f, -6.5f, 1.3f, -13.0f, 1.3f, -19.6f)
                verticalLineToRelative(-5.8f)
                curveToRelative(0.0f, -69.9f, -50.5f, -129.5f, -119.4f, -141.0f)
                curveTo(347.0f, 36.5f, 300.6f, 51.4f, 268.0f, 84.0f)
                lineTo(256.0f, 96.0f)
                lineTo(244.0f, 84.0f)
                curveToRelative(-32.6f, -32.6f, -79.0f, -47.5f, -124.6f, -39.9f)
                curveTo(50.5f, 55.6f, 0.0f, 115.2f, 0.0f, 185.1f)
                verticalLineToRelative(5.8f)
                curveToRelative(0.0f, 41.5f, 17.2f, 81.2f, 47.6f, 109.5f)
                close()
                moveTo(432.0f, 512.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, -288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, 288.0f)
                close()
                moveTo(432.0f, 416.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(432.0f, 272.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(416.0f, 288.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _heartCircleExclamation!!
    }

private var _heartCircleExclamation: ImageVector? = null
