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

public val RegularGroup.SquareCaretUp: ImageVector
    get() {
        if (_squareCaretUp != null) {
            return _squareCaretUp!!
        }
        _squareCaretUp = Builder(name = "SquareCaretUp", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.6f, 175.7f)
                curveTo(237.1f, 170.8f, 230.7f, 168.0f, 224.0f, 168.0f)
                reflectiveCurveTo(210.9f, 170.8f, 206.4f, 175.7f)
                lineToRelative(-96.0f, 104.0f)
                curveToRelative(-6.469f, 7.0f, -8.188f, 17.19f, -4.375f, 25.91f)
                curveTo(109.8f, 314.3f, 118.5f, 320.0f, 127.1f, 320.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(9.531f, 0.0f, 18.16f, -5.656f, 22.0f, -14.38f)
                curveToRelative(3.813f, -8.719f, 2.094f, -18.91f, -4.375f, -25.91f)
                lineTo(241.6f, 175.7f)
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
        return _squareCaretUp!!
    }

private var _squareCaretUp: ImageVector? = null
