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

public val SolidGroup.SquareUpRight: ImageVector
    get() {
        if (_squareUpRight != null) {
            return _squareUpRight!!
        }
        _squareUpRight = Builder(name = "SquareUpRight", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                horizontalLineTo(384.0f)
                close()
                moveTo(160.0f, 160.0f)
                curveToRelative(-6.5f, 0.0f, -12.3f, 3.9f, -14.8f, 9.9f)
                reflectiveCurveToRelative(-1.1f, 12.9f, 3.5f, 17.4f)
                lineToRelative(40.0f, 40.0f)
                lineToRelative(-71.0f, 71.0f)
                curveTo(114.0f, 302.0f, 112.0f, 306.9f, 112.0f, 312.0f)
                reflectiveCurveToRelative(2.0f, 10.0f, 5.7f, 13.7f)
                lineToRelative(36.7f, 36.7f)
                curveToRelative(3.6f, 3.6f, 8.5f, 5.7f, 13.7f, 5.7f)
                reflectiveCurveToRelative(10.0f, -2.0f, 13.7f, -5.7f)
                lineToRelative(71.0f, -71.0f)
                lineToRelative(40.0f, 40.0f)
                curveToRelative(4.6f, 4.6f, 11.5f, 5.9f, 17.4f, 3.5f)
                reflectiveCurveToRelative(9.9f, -8.3f, 9.9f, -14.8f)
                verticalLineTo(176.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(160.0f)
                close()
            }
        }
        .build()
        return _squareUpRight!!
    }

private var _squareUpRight: ImageVector? = null
