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
                horizontalLineToRelative(-45.495f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(50.848f)
                horizontalLineTo(128.0f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(84.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-84.0f)
                verticalLineToRelative(-63.556f)
                curveToRelative(0.0f, -32.266f, 24.562f, -57.086f, 61.792f, -57.086f)
                curveToRelative(23.658f, 0.0f, 45.878f, 11.505f, 57.652f, 18.849f)
                curveToRelative(5.151f, 3.213f, 11.888f, 2.051f, 15.688f, -2.685f)
                lineToRelative(28.493f, -35.513f)
                curveToRelative(4.233f, -5.276f, 3.279f, -13.005f, -2.119f, -17.081f)
                curveTo(273.124f, 54.56f, 236.576f, 32.0f, 187.931f, 32.0f)
                curveTo(106.026f, 32.0f, 48.0f, 84.742f, 48.0f, 157.961f)
                verticalLineTo(224.0f)
                horizontalLineTo(20.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(128.0f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(296.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineTo(364.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _poundSign!!
    }

private var _poundSign: ImageVector? = null
