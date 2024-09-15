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
                moveTo(88.0f, 166.06f)
                verticalLineTo(468.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineTo(166.06f)
                horizontalLineToRelative(46.06f)
                curveToRelative(21.38f, 0.0f, 32.09f, -25.85f, 16.97f, -40.97f)
                lineToRelative(-86.06f, -86.06f)
                curveToRelative(-9.37f, -9.37f, -24.57f, -9.37f, -33.94f, 0.0f)
                lineToRelative(-86.06f, 86.06f)
                curveToRelative(-15.12f, 15.12f, -4.41f, 40.97f, 16.97f, 40.97f)
                horizontalLineTo(88.0f)
                close()
            }
        }
        .build()
        return _longArrowAltUp!!
    }

private var _longArrowAltUp: ImageVector? = null
