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
                curveTo(5.388f, 0.0f, 0.0f, 5.388f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.388f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.388f, 12.0f, -12.0f)
                reflectiveCurveTo(18.629f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.314f)
                curveToRelative(-5.133f, 0.0f, -9.297f, -4.164f, -9.297f, -9.297f)
                reflectiveCurveTo(6.867f, 2.72f, 12.0f, 2.72f)
                reflectiveCurveToRelative(9.297f, 4.164f, 9.297f, 9.297f)
                reflectiveCurveToRelative(-4.164f, 9.297f, -9.297f, 9.297f)
                close()
                moveTo(10.028f, 12.0f)
                lineToRelative(1.48f, 1.479f)
                lineToRelative(-1.922f, 1.92f)
                lineToRelative(-1.478f, -1.478f)
                lineToRelative(-1.428f, 1.444f)
                lineToRelative(-1.92f, -1.92f)
                lineTo(6.203f, 12.0f)
                lineToRelative(-1.377f, -1.377f)
                lineToRelative(1.92f, -1.904f)
                lineToRelative(1.36f, 1.377f)
                lineToRelative(1.411f, -1.41f)
                lineToRelative(1.921f, 1.903f)
                lineTo(10.03f, 12.0f)
                close()
                moveTo(19.19f, 10.538f)
                lineTo(17.779f, 11.949f)
                lineTo(19.258f, 13.428f)
                lineTo(17.338f, 15.332f)
                lineTo(15.858f, 13.852f)
                lineTo(14.414f, 15.298f)
                lineTo(12.51f, 13.377f)
                lineTo(13.955f, 11.949f)
                lineTo(12.578f, 10.572f)
                lineTo(14.482f, 8.652f)
                lineTo(15.858f, 10.028f)
                lineTo(17.269f, 8.618f)
                lineTo(19.189f, 10.538f)
                close()
            }
        }
        .build()
        return _facepunch!!
    }

private var _facepunch: ImageVector? = null
