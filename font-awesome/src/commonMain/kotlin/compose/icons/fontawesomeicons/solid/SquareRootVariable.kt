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

public val SolidGroup.SquareRootVariable: ImageVector
    get() {
        if (_squareRootVariable != null) {
            return _squareRootVariable!!
        }
        _squareRootVariable = Builder(name = "SquareRootVariable", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(282.6f, 78.1f)
                curveToRelative(8.0f, -27.3f, 33.0f, -46.1f, 61.4f, -46.1f)
                horizontalLineTo(544.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(344.0f)
                lineTo(238.7f, 457.0f)
                curveToRelative(-3.6f, 12.3f, -14.1f, 21.2f, -26.8f, 22.8f)
                reflectiveCurveToRelative(-25.1f, -4.6f, -31.5f, -15.6f)
                lineTo(77.6f, 288.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(77.6f)
                curveToRelative(22.8f, 0.0f, 43.8f, 12.1f, 55.3f, 31.8f)
                lineToRelative(65.2f, 111.8f)
                lineTo(282.6f, 78.1f)
                close()
                moveTo(393.4f, 233.4f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                lineTo(480.0f, 274.7f)
                lineToRelative(41.4f, -41.4f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, 32.8f, 0.0f, 45.3f)
                lineTo(525.3f, 320.0f)
                lineToRelative(41.4f, 41.4f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                lineTo(480.0f, 365.3f)
                lineToRelative(-41.4f, 41.4f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(434.7f, 320.0f)
                lineToRelative(-41.4f, -41.4f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                close()
            }
        }
        .build()
        return _squareRootVariable!!
    }

private var _squareRootVariable: ImageVector? = null
