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
                moveTo(214.06f, 377.94f)
                horizontalLineTo(168.0f)
                verticalLineTo(134.06f)
                horizontalLineToRelative(46.06f)
                curveToRelative(21.38f, 0.0f, 32.09f, -25.85f, 16.97f, -40.97f)
                lineTo(144.97f, 7.03f)
                curveToRelative(-9.37f, -9.37f, -24.57f, -9.37f, -33.94f, 0.0f)
                lineTo(24.97f, 93.09f)
                curveToRelative(-15.12f, 15.12f, -4.41f, 40.97f, 16.97f, 40.97f)
                horizontalLineTo(88.0f)
                verticalLineToRelative(243.88f)
                horizontalLineTo(41.94f)
                curveToRelative(-21.38f, 0.0f, -32.09f, 25.85f, -16.97f, 40.97f)
                lineToRelative(86.06f, 86.06f)
                curveToRelative(9.37f, 9.37f, 24.57f, 9.37f, 33.94f, 0.0f)
                lineToRelative(86.06f, -86.06f)
                curveToRelative(15.12f, -15.12f, 4.41f, -40.97f, -16.97f, -40.97f)
                close()
            }
        }
        .build()
        return _arrowsAltV!!
    }

private var _arrowsAltV: ImageVector? = null
