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

public val SimpleIcons.Facepunch: ImageVector
    get() {
        if (_facepunch != null) {
            return _facepunch!!
        }
        _facepunch = Builder(name = "Facepunch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.39f, 0.0f, 0.004f, 5.388f, 0.004f, 12.0f)
                reflectiveCurveTo(5.39f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(11.996f, -5.388f, 11.996f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.314f)
                curveToRelative(-5.131f, 0.0f, -9.294f, -4.164f, -9.294f, -9.297f)
                curveTo(2.706f, 6.884f, 6.869f, 2.72f, 12.0f, 2.72f)
                reflectiveCurveToRelative(9.294f, 4.164f, 9.294f, 9.297f)
                curveToRelative(0.0f, 5.133f, -4.163f, 9.297f, -9.294f, 9.297f)
                close()
                moveTo(11.439f, 10.589f)
                lineToRelative(-1.92f, -1.904f)
                lineToRelative(-1.41f, 1.411f)
                lineTo(6.75f, 8.719f)
                lineToRelative(-1.92f, 1.904f)
                lineTo(6.206f, 12.0f)
                lineToRelative(-1.444f, 1.445f)
                lineToRelative(1.92f, 1.921f)
                lineToRelative(1.427f, -1.445f)
                lineTo(9.587f, 15.4f)
                lineToRelative(1.92f, -1.921f)
                lineTo(10.029f, 12.0f)
                lineToRelative(1.41f, -1.411f)
                close()
                moveTo(19.187f, 10.538f)
                lineToRelative(-1.41f, 1.411f)
                lineToRelative(1.478f, 1.479f)
                lineToRelative(-1.92f, 1.904f)
                lineToRelative(-1.478f, -1.479f)
                lineToRelative(-1.444f, 1.445f)
                lineToRelative(-1.903f, -1.921f)
                lineToRelative(1.444f, -1.428f)
                lineToRelative(-1.376f, -1.377f)
                lineToRelative(1.903f, -1.921f)
                lineToRelative(1.376f, 1.377f)
                lineToRelative(1.41f, -1.411f)
                lineToRelative(1.92f, 1.921f)
                close()
            }
        }
        .build()
        return _facepunch!!
    }

private var _facepunch: ImageVector? = null
