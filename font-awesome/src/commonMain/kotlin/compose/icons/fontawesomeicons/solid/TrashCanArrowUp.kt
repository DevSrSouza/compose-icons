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

public val SolidGroup.TrashCanArrowUp: ImageVector
    get() {
        if (_trashCanArrowUp != null) {
            return _trashCanArrowUp!!
        }
        _trashCanArrowUp = Builder(name = "TrashCanArrowUp", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(163.8f, 0.0f)
                lineTo(284.2f, 0.0f)
                curveToRelative(12.1f, 0.0f, 23.2f, 6.8f, 28.6f, 17.7f)
                lineTo(320.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 96.0f)
                curveTo(14.3f, 96.0f, 0.0f, 81.7f, 0.0f, 64.0f)
                reflectiveCurveTo(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                lineToRelative(7.2f, -14.3f)
                curveTo(140.6f, 6.8f, 151.7f, 0.0f, 163.8f, 0.0f)
                close()
                moveTo(32.0f, 128.0f)
                lineTo(416.0f, 128.0f)
                lineTo(416.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(96.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(32.0f, 128.0f)
                close()
                moveTo(224.0f, 192.0f)
                curveToRelative(-6.4f, 0.0f, -12.5f, 2.5f, -17.0f, 7.0f)
                lineToRelative(-80.0f, 80.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(39.0f, -39.0f)
                lineTo(199.9f, 408.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(247.9f, 273.9f)
                lineToRelative(39.0f, 39.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-80.0f, -80.0f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7.0f, -17.0f, -7.0f)
                close()
            }
        }
        .build()
        return _trashCanArrowUp!!
    }

private var _trashCanArrowUp: ImageVector? = null
