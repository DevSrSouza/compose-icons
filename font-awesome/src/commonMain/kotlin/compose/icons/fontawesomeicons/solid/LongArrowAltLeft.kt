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
                moveTo(134.06f, 296.0f)
                horizontalLineTo(436.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineTo(134.06f)
                verticalLineToRelative(-46.06f)
                curveToRelative(0.0f, -21.38f, -25.85f, -32.09f, -40.97f, -16.97f)
                lineTo(7.03f, 239.03f)
                curveToRelative(-9.37f, 9.37f, -9.37f, 24.57f, 0.0f, 33.94f)
                lineToRelative(86.06f, 86.06f)
                curveToRelative(15.12f, 15.12f, 40.97f, 4.41f, 40.97f, -16.97f)
                verticalLineTo(296.0f)
                close()
            }
        }
        .build()
        return _longArrowAltLeft!!
    }

private var _longArrowAltLeft: ImageVector? = null
