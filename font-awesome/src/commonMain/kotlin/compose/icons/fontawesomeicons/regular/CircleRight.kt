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

public val RegularGroup.CircleRight: ImageVector
    get() {
        if (_circleRight != null) {
            return _circleRight!!
        }
        _circleRight = Builder(name = "CircleRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                arcTo(208.0f, 208.0f, 0.0f, true, true, 48.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 416.0f, 0.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 0.0f, 256.0f)
                close()
                moveTo(294.6f, 135.1f)
                curveToRelative(-4.2f, -4.5f, -10.1f, -7.1f, -16.3f, -7.1f)
                curveTo(266.0f, 128.0f, 256.0f, 138.0f, 256.0f, 150.3f)
                verticalLineTo(208.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(57.7f)
                curveToRelative(0.0f, 12.3f, 10.0f, 22.3f, 22.3f, 22.3f)
                curveToRelative(6.2f, 0.0f, 12.1f, -2.6f, 16.3f, -7.1f)
                lineToRelative(99.9f, -107.1f)
                curveToRelative(3.5f, -3.8f, 5.5f, -8.7f, 5.5f, -13.8f)
                reflectiveCurveToRelative(-2.0f, -10.1f, -5.5f, -13.8f)
                lineTo(294.6f, 135.1f)
                close()
            }
        }
        .build()
        return _circleRight!!
    }

private var _circleRight: ImageVector? = null
