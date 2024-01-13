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

public val SolidGroup.Robot: ImageVector
    get() {
        if (_robot != null) {
            return _robot!!
        }
        _robot = Builder(name = "Robot", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(352.0f, 96.0f)
                lineTo(472.0f, 96.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, 32.2f, 72.0f, 72.0f)
                lineTo(544.0f, 440.0f)
                curveToRelative(0.0f, 39.8f, -32.2f, 72.0f, -72.0f, 72.0f)
                lineTo(168.0f, 512.0f)
                curveToRelative(-39.8f, 0.0f, -72.0f, -32.2f, -72.0f, -72.0f)
                lineTo(96.0f, 168.0f)
                curveToRelative(0.0f, -39.8f, 32.2f, -72.0f, 72.0f, -72.0f)
                lineTo(288.0f, 96.0f)
                lineTo(288.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(208.0f, 384.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(208.0f, 384.0f)
                close()
                moveTo(304.0f, 384.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(304.0f, 384.0f)
                close()
                moveTo(400.0f, 384.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(400.0f, 384.0f)
                close()
                moveTo(264.0f, 256.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 80.0f, 0.0f)
                close()
                moveTo(416.0f, 296.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
                moveTo(48.0f, 224.0f)
                lineTo(64.0f, 224.0f)
                lineTo(64.0f, 416.0f)
                lineTo(48.0f, 416.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 272.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                close()
                moveTo(592.0f, 224.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(576.0f, 416.0f)
                lineTo(576.0f, 224.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _robot!!
    }

private var _robot: ImageVector? = null
