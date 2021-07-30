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

public val SimpleIcons.Cloudera: ImageVector
    get() {
        if (_cloudera != null) {
            return _cloudera!!
        }
        _cloudera = Builder(name = "Cloudera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.344f, 20.251f)
                arcToRelative(8.25f, 8.25f, 0.0f, true, true, 0.0f, -16.502f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, true, 5.633f, 2.234f)
                lineTo(15.519f, 8.53f)
                arcToRelative(4.686f, 4.686f, 0.0f, false, false, -3.175f, -1.239f)
                arcToRelative(4.709f, 4.709f, 0.0f, true, false, 3.284f, 8.081f)
                lineToRelative(2.657f, 2.346f)
                arcToRelative(8.224f, 8.224f, 0.0f, false, true, -5.941f, 2.533f)
                close()
            }
        }
        .build()
        return _cloudera!!
    }

private var _cloudera: ImageVector? = null
