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

public val SolidGroup.RoadCircleExclamation: ImageVector
    get() {
        if (_roadCircleExclamation != null) {
            return _roadCircleExclamation!!
        }
        _roadCircleExclamation = Builder(name = "RoadCircleExclamation", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.2f, 32.0f)
                lineTo(288.0f, 32.0f)
                lineTo(288.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(352.0f, 32.0f)
                horizontalLineToRelative(74.8f)
                curveToRelative(27.1f, 0.0f, 51.3f, 17.1f, 60.3f, 42.6f)
                lineToRelative(42.7f, 120.6f)
                curveToRelative(-10.9f, -2.1f, -22.2f, -3.2f, -33.8f, -3.2f)
                curveToRelative(-59.5f, 0.0f, -112.1f, 29.6f, -144.0f, 74.8f)
                lineTo(352.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                curveToRelative(2.3f, 0.0f, 4.6f, -0.3f, 6.8f, -0.7f)
                curveToRelative(-4.5f, 15.5f, -6.8f, 31.8f, -6.8f, 48.7f)
                curveToRelative(0.0f, 5.4f, 0.2f, 10.7f, 0.7f, 16.0f)
                lineToRelative(-0.7f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                lineTo(86.6f, 480.0f)
                curveTo(56.5f, 480.0f, 32.0f, 455.5f, 32.0f, 425.4f)
                curveToRelative(0.0f, -6.2f, 1.1f, -12.4f, 3.1f, -18.2f)
                lineTo(152.9f, 74.6f)
                curveTo(162.0f, 49.1f, 186.1f, 32.0f, 213.2f, 32.0f)
                close()
                moveTo(496.0f, 224.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, 288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, -288.0f)
                close()
                moveTo(496.0f, 464.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(496.0f, 272.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(512.0f, 288.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _roadCircleExclamation!!
    }

private var _roadCircleExclamation: ImageVector? = null
