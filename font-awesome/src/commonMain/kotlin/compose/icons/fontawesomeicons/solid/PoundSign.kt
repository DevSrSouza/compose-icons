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

public val SolidGroup.PoundSign: ImageVector
    get() {
        if (_poundSign != null) {
            return _poundSign!!
        }
        _poundSign = Builder(name = "PoundSign", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(308.0f, 352.0f)
                horizontalLineToRelative(-45.49f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(50.85f)
                horizontalLineTo(128.0f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(84.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-84.0f)
                verticalLineToRelative(-63.56f)
                curveToRelative(0.0f, -32.27f, 24.56f, -57.09f, 61.79f, -57.09f)
                curveToRelative(23.66f, 0.0f, 45.88f, 11.51f, 57.65f, 18.85f)
                curveToRelative(5.15f, 3.21f, 11.89f, 2.05f, 15.69f, -2.68f)
                lineToRelative(28.49f, -35.51f)
                curveToRelative(4.23f, -5.28f, 3.28f, -13.01f, -2.12f, -17.08f)
                curveTo(273.12f, 54.56f, 236.58f, 32.0f, 187.93f, 32.0f)
                curveTo(106.03f, 32.0f, 48.0f, 84.74f, 48.0f, 157.96f)
                verticalLineTo(224.0f)
                horizontalLineTo(20.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(128.0f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(296.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineTo(364.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _poundSign!!
    }

private var _poundSign: ImageVector? = null
