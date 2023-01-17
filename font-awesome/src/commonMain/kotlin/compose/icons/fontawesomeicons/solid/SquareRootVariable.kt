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
                moveTo(289.0f, 24.2f)
                curveTo(292.5f, 10.0f, 305.3f, 0.0f, 320.0f, 0.0f)
                horizontalLineTo(544.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(345.0f)
                lineTo(239.0f, 487.8f)
                curveToRelative(-3.2f, 13.0f, -14.2f, 22.6f, -27.6f, 24.0f)
                reflectiveCurveToRelative(-26.1f, -5.5f, -32.1f, -17.5f)
                lineTo(76.2f, 288.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(96.0f)
                curveToRelative(12.1f, 0.0f, 23.2f, 6.8f, 28.6f, 17.7f)
                lineToRelative(73.3f, 146.6f)
                lineTo(289.0f, 24.2f)
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
