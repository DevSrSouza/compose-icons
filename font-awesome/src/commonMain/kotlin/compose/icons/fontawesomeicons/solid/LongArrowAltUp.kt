package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.LongArrowAltUp: ImageVector
    get() {
        if (_longArrowAltUp != null) {
            return _longArrowAltUp!!
        }
        _longArrowAltUp = Builder(name = "LongArrowAltUp", defaultWidth = 256.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 166.059f)
                verticalLineTo(468.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineTo(166.059f)
                horizontalLineToRelative(46.059f)
                curveToRelative(21.382f, 0.0f, 32.09f, -25.851f, 16.971f, -40.971f)
                lineToRelative(-86.059f, -86.059f)
                curveToRelative(-9.373f, -9.373f, -24.569f, -9.373f, -33.941f, 0.0f)
                lineToRelative(-86.059f, 86.059f)
                curveToRelative(-15.119f, 15.119f, -4.411f, 40.971f, 16.971f, 40.971f)
                horizontalLineTo(88.0f)
                close()
            }
        }
        .build()
        return _longArrowAltUp!!
    }

private var _longArrowAltUp: ImageVector? = null
