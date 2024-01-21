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

public val SolidGroup.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.2f)
                curveTo(22.5f, -1.7f, 32.5f, -0.3f, 39.6f, 5.8f)
                lineTo(80.0f, 40.4f)
                lineTo(120.4f, 5.8f)
                curveToRelative(9.0f, -7.7f, 22.3f, -7.7f, 31.2f, 0.0f)
                lineTo(192.0f, 40.4f)
                lineTo(232.4f, 5.8f)
                curveToRelative(9.0f, -7.7f, 22.3f, -7.7f, 31.2f, 0.0f)
                lineTo(304.0f, 40.4f)
                lineTo(344.4f, 5.8f)
                curveToRelative(7.1f, -6.1f, 17.1f, -7.5f, 25.6f, -3.6f)
                reflectiveCurveToRelative(14.0f, 12.4f, 14.0f, 21.8f)
                verticalLineTo(488.0f)
                curveToRelative(0.0f, 9.4f, -5.5f, 17.9f, -14.0f, 21.8f)
                reflectiveCurveToRelative(-18.5f, 2.5f, -25.6f, -3.6f)
                lineTo(304.0f, 471.6f)
                lineToRelative(-40.4f, 34.6f)
                curveToRelative(-9.0f, 7.7f, -22.3f, 7.7f, -31.2f, 0.0f)
                lineTo(192.0f, 471.6f)
                lineToRelative(-40.4f, 34.6f)
                curveToRelative(-9.0f, 7.7f, -22.3f, 7.7f, -31.2f, 0.0f)
                lineTo(80.0f, 471.6f)
                lineTo(39.6f, 506.2f)
                curveToRelative(-7.1f, 6.1f, -17.1f, 7.5f, -25.6f, 3.6f)
                reflectiveCurveTo(0.0f, 497.4f, 0.0f, 488.0f)
                verticalLineTo(24.0f)
                curveTo(0.0f, 14.6f, 5.5f, 6.1f, 14.0f, 2.2f)
                close()
                moveTo(96.0f, 144.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(288.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(96.0f)
                close()
                moveTo(80.0f, 352.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(288.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                close()
                moveTo(96.0f, 240.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(288.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(96.0f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
