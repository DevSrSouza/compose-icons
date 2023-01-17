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

public val SolidGroup.HatWizard: ImageVector
    get() {
        if (_hatWizard != null) {
            return _hatWizard!!
        }
        _hatWizard = Builder(name = "HatWizard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 416.0f)
                lineTo(168.6f, 180.7f)
                curveToRelative(15.3f, -34.4f, 40.3f, -63.5f, 72.0f, -83.7f)
                lineToRelative(146.9f, -94.0f)
                curveToRelative(3.0f, -1.9f, 6.5f, -2.9f, 10.0f, -2.9f)
                curveTo(407.7f, 0.0f, 416.0f, 8.3f, 416.0f, 18.6f)
                verticalLineToRelative(1.6f)
                curveToRelative(0.0f, 2.6f, -0.5f, 5.1f, -1.4f, 7.5f)
                lineTo(354.8f, 176.9f)
                curveToRelative(-1.9f, 4.7f, -2.8f, 9.7f, -2.8f, 14.7f)
                curveToRelative(0.0f, 5.5f, 1.2f, 11.0f, 3.4f, 16.1f)
                lineTo(448.0f, 416.0f)
                horizontalLineTo(240.9f)
                lineToRelative(11.8f, -35.4f)
                lineToRelative(40.4f, -13.5f)
                curveToRelative(6.5f, -2.2f, 10.9f, -8.3f, 10.9f, -15.2f)
                reflectiveCurveToRelative(-4.4f, -13.0f, -10.9f, -15.2f)
                lineToRelative(-40.4f, -13.5f)
                lineToRelative(-13.5f, -40.4f)
                curveTo(237.0f, 276.4f, 230.9f, 272.0f, 224.0f, 272.0f)
                reflectiveCurveToRelative(-13.0f, 4.4f, -15.2f, 10.9f)
                lineToRelative(-13.5f, 40.4f)
                lineToRelative(-40.4f, 13.5f)
                curveTo(148.4f, 339.0f, 144.0f, 345.1f, 144.0f, 352.0f)
                reflectiveCurveToRelative(4.4f, 13.0f, 10.9f, 15.2f)
                lineToRelative(40.4f, 13.5f)
                lineTo(207.1f, 416.0f)
                horizontalLineTo(64.0f)
                close()
                moveTo(279.6f, 141.5f)
                curveToRelative(-1.1f, -3.3f, -4.1f, -5.5f, -7.6f, -5.5f)
                reflectiveCurveToRelative(-6.5f, 2.2f, -7.6f, 5.5f)
                lineToRelative(-6.7f, 20.2f)
                lineToRelative(-20.2f, 6.7f)
                curveToRelative(-3.3f, 1.1f, -5.5f, 4.1f, -5.5f, 7.6f)
                reflectiveCurveToRelative(2.2f, 6.5f, 5.5f, 7.6f)
                lineToRelative(20.2f, 6.7f)
                lineToRelative(6.7f, 20.2f)
                curveToRelative(1.1f, 3.3f, 4.1f, 5.5f, 7.6f, 5.5f)
                reflectiveCurveToRelative(6.5f, -2.2f, 7.6f, -5.5f)
                lineToRelative(6.7f, -20.2f)
                lineToRelative(20.2f, -6.7f)
                curveToRelative(3.3f, -1.1f, 5.5f, -4.1f, 5.5f, -7.6f)
                reflectiveCurveToRelative(-2.2f, -6.5f, -5.5f, -7.6f)
                lineToRelative(-20.2f, -6.7f)
                lineToRelative(-6.7f, -20.2f)
                close()
                moveTo(32.0f, 448.0f)
                horizontalLineTo(480.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _hatWizard!!
    }

private var _hatWizard: ImageVector? = null
