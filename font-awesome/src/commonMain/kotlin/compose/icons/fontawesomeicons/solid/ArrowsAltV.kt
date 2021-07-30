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

public val SolidGroup.ArrowsAltV: ImageVector
    get() {
        if (_arrowsAltV != null) {
            return _arrowsAltV!!
        }
        _arrowsAltV = Builder(name = "ArrowsAltV", defaultWidth = 256.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.059f, 377.941f)
                horizontalLineTo(168.0f)
                verticalLineTo(134.059f)
                horizontalLineToRelative(46.059f)
                curveToRelative(21.382f, 0.0f, 32.09f, -25.851f, 16.971f, -40.971f)
                lineTo(144.971f, 7.029f)
                curveToRelative(-9.373f, -9.373f, -24.568f, -9.373f, -33.941f, 0.0f)
                lineTo(24.971f, 93.088f)
                curveToRelative(-15.119f, 15.119f, -4.411f, 40.971f, 16.971f, 40.971f)
                horizontalLineTo(88.0f)
                verticalLineToRelative(243.882f)
                horizontalLineTo(41.941f)
                curveToRelative(-21.382f, 0.0f, -32.09f, 25.851f, -16.971f, 40.971f)
                lineToRelative(86.059f, 86.059f)
                curveToRelative(9.373f, 9.373f, 24.568f, 9.373f, 33.941f, 0.0f)
                lineToRelative(86.059f, -86.059f)
                curveToRelative(15.12f, -15.119f, 4.412f, -40.971f, -16.97f, -40.971f)
                close()
            }
        }
        .build()
        return _arrowsAltV!!
    }

private var _arrowsAltV: ImageVector? = null
