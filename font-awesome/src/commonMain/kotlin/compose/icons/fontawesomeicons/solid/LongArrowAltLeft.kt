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

public val SolidGroup.LongArrowAltLeft: ImageVector
    get() {
        if (_longArrowAltLeft != null) {
            return _longArrowAltLeft!!
        }
        _longArrowAltLeft = Builder(name = "LongArrowAltLeft", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.059f, 296.0f)
                horizontalLineTo(436.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineTo(134.059f)
                verticalLineToRelative(-46.059f)
                curveToRelative(0.0f, -21.382f, -25.851f, -32.09f, -40.971f, -16.971f)
                lineTo(7.029f, 239.029f)
                curveToRelative(-9.373f, 9.373f, -9.373f, 24.569f, 0.0f, 33.941f)
                lineToRelative(86.059f, 86.059f)
                curveToRelative(15.119f, 15.119f, 40.971f, 4.411f, 40.971f, -16.971f)
                verticalLineTo(296.0f)
                close()
            }
        }
        .build()
        return _longArrowAltLeft!!
    }

private var _longArrowAltLeft: ImageVector? = null
