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

public val RegularGroup.SquareCaretDown: ImageVector
    get() {
        if (_squareCaretDown != null) {
            return _squareCaretDown!!
        }
        _squareCaretDown = Builder(name = "SquareCaretDown", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 192.0f)
                horizontalLineTo(128.0f)
                curveTo(118.5f, 192.0f, 109.8f, 197.7f, 105.1f, 206.4f)
                curveTo(102.2f, 215.1f, 103.9f, 225.3f, 110.4f, 232.3f)
                lineToRelative(96.0f, 104.0f)
                curveTo(210.9f, 341.2f, 217.3f, 344.0f, 224.0f, 344.0f)
                reflectiveCurveToRelative(13.09f, -2.812f, 17.62f, -7.719f)
                lineToRelative(96.0f, -104.0f)
                curveToRelative(6.469f, -7.0f, 8.188f, -17.19f, 4.375f, -25.91f)
                curveTo(338.2f, 197.7f, 329.5f, 192.0f, 320.0f, 192.0f)
                close()
                moveTo(384.0f, 32.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 32.0f, 0.0f, 60.66f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.34f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.66f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveTo(448.0f, 60.66f, 419.3f, 32.0f, 384.0f, 32.0f)
                close()
                moveTo(400.0f, 416.0f)
                curveToRelative(0.0f, 8.82f, -7.178f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-8.822f, 0.0f, -16.0f, -7.18f, -16.0f, -16.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -8.82f, 7.178f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(8.822f, 0.0f, 16.0f, 7.18f, 16.0f, 16.0f)
                verticalLineTo(416.0f)
                close()
            }
        }
        .build()
        return _squareCaretDown!!
    }

private var _squareCaretDown: ImageVector? = null
