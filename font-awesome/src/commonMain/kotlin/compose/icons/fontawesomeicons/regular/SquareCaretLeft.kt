package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.SquareCaretLeft: ImageVector
    get() {
        if (_squareCaretLeft != null) {
            return _squareCaretLeft!!
        }
        _squareCaretLeft = Builder(name = "SquareCaretLeft", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                horizontalLineTo(64.0f)
                curveTo(28.66f, 32.0f, 0.0f, 60.66f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.34f, 28.66f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(35.34f, 0.0f, 64.0f, -28.66f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveTo(448.0f, 60.66f, 419.3f, 32.0f, 384.0f, 32.0f)
                close()
                moveTo(400.0f, 416.0f)
                curveToRelative(0.0f, 8.82f, -7.18f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-8.82f, 0.0f, -16.0f, -7.18f, -16.0f, -16.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -8.82f, 7.18f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(8.82f, 0.0f, 16.0f, 7.18f, 16.0f, 16.0f)
                verticalLineTo(416.0f)
                close()
                moveTo(273.6f, 138.0f)
                curveToRelative(-8.719f, -3.812f, -18.91f, -2.094f, -25.91f, 4.375f)
                lineToRelative(-104.0f, 96.0f)
                curveTo(138.8f, 242.9f, 136.0f, 249.3f, 136.0f, 256.0f)
                reflectiveCurveToRelative(2.812f, 13.09f, 7.719f, 17.62f)
                lineToRelative(104.0f, 96.0f)
                curveToRelative(7.0f, 6.469f, 17.19f, 8.188f, 25.91f, 4.375f)
                curveTo(282.3f, 370.2f, 288.0f, 361.5f, 288.0f, 352.0f)
                verticalLineTo(160.0f)
                curveTo(288.0f, 150.5f, 282.3f, 141.8f, 273.6f, 138.0f)
                close()
            }
        }
        .build()
        return _squareCaretLeft!!
    }

private var _squareCaretLeft: ImageVector? = null
