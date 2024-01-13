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

public val SolidGroup.ArrowPointer: ImageVector
    get() {
        if (_arrowPointer != null) {
            return _arrowPointer!!
        }
        _arrowPointer = Builder(name = "ArrowPointer", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 55.2f)
                verticalLineTo(426.0f)
                curveToRelative(0.0f, 12.2f, 9.9f, 22.0f, 22.0f, 22.0f)
                curveToRelative(6.3f, 0.0f, 12.4f, -2.7f, 16.6f, -7.5f)
                lineTo(121.2f, 346.0f)
                lineToRelative(58.1f, 116.3f)
                curveToRelative(7.9f, 15.8f, 27.1f, 22.2f, 42.9f, 14.3f)
                reflectiveCurveToRelative(22.2f, -27.1f, 14.3f, -42.9f)
                lineTo(179.8f, 320.0f)
                horizontalLineTo(297.9f)
                curveToRelative(12.2f, 0.0f, 22.1f, -9.9f, 22.1f, -22.1f)
                curveToRelative(0.0f, -6.3f, -2.7f, -12.3f, -7.4f, -16.5f)
                lineTo(38.6f, 37.9f)
                curveTo(34.3f, 34.1f, 28.9f, 32.0f, 23.2f, 32.0f)
                curveTo(10.4f, 32.0f, 0.0f, 42.4f, 0.0f, 55.2f)
                close()
            }
        }
        .build()
        return _arrowPointer!!
    }

private var _arrowPointer: ImageVector? = null
