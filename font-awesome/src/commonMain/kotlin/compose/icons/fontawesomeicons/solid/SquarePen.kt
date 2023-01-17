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

public val SolidGroup.SquarePen: ImageVector
    get() {
        if (_squarePen != null) {
            return _squarePen!!
        }
        _squarePen = Builder(name = "SquarePen", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(384.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(64.0f)
                close()
                moveTo(325.8f, 139.7f)
                lineToRelative(14.4f, 14.4f)
                curveToRelative(15.6f, 15.6f, 15.6f, 40.9f, 0.0f, 56.6f)
                lineToRelative(-21.4f, 21.4f)
                lineToRelative(-71.0f, -71.0f)
                lineToRelative(21.4f, -21.4f)
                curveToRelative(15.6f, -15.6f, 40.9f, -15.6f, 56.6f, 0.0f)
                close()
                moveTo(119.9f, 289.0f)
                lineTo(225.1f, 183.8f)
                lineToRelative(71.0f, 71.0f)
                lineTo(190.9f, 359.9f)
                curveToRelative(-4.1f, 4.1f, -9.2f, 7.0f, -14.9f, 8.4f)
                lineToRelative(-60.1f, 15.0f)
                curveToRelative(-5.5f, 1.4f, -11.2f, -0.2f, -15.2f, -4.2f)
                reflectiveCurveToRelative(-5.6f, -9.7f, -4.2f, -15.2f)
                lineToRelative(15.0f, -60.1f)
                curveToRelative(1.4f, -5.6f, 4.3f, -10.8f, 8.4f, -14.9f)
                close()
            }
        }
        .build()
        return _squarePen!!
    }

private var _squarePen: ImageVector? = null
