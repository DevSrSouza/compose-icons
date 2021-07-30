package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Archicad: ImageVector
    get() {
        if (_archicad != null) {
            return _archicad!!
        }
        _archicad = Builder(name = "Archicad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5896f, 16.3222f)
                curveToRelative(-0.779f, 0.0f, -1.4104f, -0.6315f, -1.4104f, -1.4105f)
                curveToRelative(0.0f, -0.779f, 0.6314f, -1.4104f, 1.4104f, -1.4104f)
                reflectiveCurveTo(24.0f, 14.1328f, 24.0f, 14.9117f)
                curveToRelative(0.0f, 0.779f, -0.6315f, 1.4105f, -1.4104f, 1.4105f)
                close()
                moveTo(0.1507f, 19.8272f)
                curveToRelative(-0.35f, 0.6959f, -0.0696f, 1.5438f, 0.6263f, 1.8938f)
                curveToRelative(0.6959f, 0.35f, 1.5438f, 0.0695f, 1.8938f, -0.6263f)
                curveToRelative(0.0f, 0.0f, 7.8494f, -16.0114f, 14.2545f, -16.1487f)
                curveToRelative(4.2299f, -0.0907f, 4.2313f, 5.642f, 4.2313f, 5.642f)
                curveToRelative(0.0f, 0.779f, 0.6314f, 1.4104f, 1.4104f, 1.4104f)
                reflectiveCurveToRelative(1.4104f, -0.6314f, 1.4104f, -1.4104f)
                curveToRelative(0.0f, 0.0f, 0.0566f, -8.3813f, -7.0196f, -8.4569f)
                curveTo(8.7634f, 1.8711f, 0.1507f, 19.8272f, 0.1507f, 19.8272f)
                close()
            }
        }
        .build()
        return _archicad!!
    }

private var _archicad: ImageVector? = null
