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

public val SolidGroup.SquareCaretUp: ImageVector
    get() {
        if (_squareCaretUp != null) {
            return _squareCaretUp!!
        }
        _squareCaretUp = Builder(name = "SquareCaretUp", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
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
                moveTo(224.0f, 160.0f)
                curveToRelative(6.7f, 0.0f, 13.0f, 2.8f, 17.6f, 7.7f)
                lineToRelative(104.0f, 112.0f)
                curveToRelative(6.5f, 7.0f, 8.2f, 17.2f, 4.4f, 25.9f)
                reflectiveCurveToRelative(-12.5f, 14.4f, -22.0f, 14.4f)
                horizontalLineTo(120.0f)
                curveToRelative(-9.5f, 0.0f, -18.2f, -5.7f, -22.0f, -14.4f)
                reflectiveCurveToRelative(-2.1f, -18.9f, 4.4f, -25.9f)
                lineToRelative(104.0f, -112.0f)
                curveToRelative(4.5f, -4.9f, 10.9f, -7.7f, 17.6f, -7.7f)
                close()
            }
        }
        .build()
        return _squareCaretUp!!
    }

private var _squareCaretUp: ImageVector? = null
