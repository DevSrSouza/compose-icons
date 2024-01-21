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

public val SolidGroup.MarsStrokeRight: ImageVector
    get() {
        if (_marsStrokeRight != null) {
            return _marsStrokeRight!!
        }
        _marsStrokeRight = Builder(name = "MarsStrokeRight", defaultWidth = 640.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 368.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, -224.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, 224.0f)
                close()
                moveTo(382.4f, 280.0f)
                curveTo(370.7f, 365.8f, 297.1f, 432.0f, 208.0f, 432.0f)
                curveToRelative(-97.2f, 0.0f, -176.0f, -78.8f, -176.0f, -176.0f)
                reflectiveCurveToRelative(78.8f, -176.0f, 176.0f, -176.0f)
                curveToRelative(89.1f, 0.0f, 162.7f, 66.2f, 174.4f, 152.0f)
                lineTo(416.0f, 232.0f)
                lineTo(416.0f, 176.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(32.0f)
                lineTo(496.0f, 176.0f)
                curveToRelative(0.0f, -9.7f, 5.8f, -18.5f, 14.8f, -22.2f)
                reflectiveCurveToRelative(19.3f, -1.7f, 26.2f, 5.2f)
                lineToRelative(80.0f, 80.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-80.0f, 80.0f)
                curveToRelative(-6.9f, 6.9f, -17.2f, 8.9f, -26.2f, 5.2f)
                reflectiveCurveToRelative(-14.8f, -12.5f, -14.8f, -22.2f)
                lineTo(496.0f, 280.0f)
                lineTo(464.0f, 280.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(416.0f, 280.0f)
                lineTo(382.4f, 280.0f)
                close()
            }
        }
        .build()
        return _marsStrokeRight!!
    }

private var _marsStrokeRight: ImageVector? = null
