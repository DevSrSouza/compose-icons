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

public val SimpleIcons.Konva: ImageVector
    get() {
        if (_konva != null) {
            return _konva!!
        }
        _konva = Builder(name = "Konva", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(13.391f, 18.541f)
                lineTo(13.152f, 14.781f)
                lineTo(10.761f, 13.173f)
                lineTo(10.913f, 18.302f)
                lineTo(6.588f, 18.454f)
                lineTo(6.415f, 5.045f)
                lineTo(10.5f, 4.98f)
                lineToRelative(0.087f, 5.346f)
                lineToRelative(2.217f, -1.608f)
                lineToRelative(0.109f, -3.781f)
                lineToRelative(4.412f, 0.283f)
                lineToRelative(-0.348f, 4.586f)
                lineToRelative(-2.608f, 1.608f)
                lineToRelative(2.673f, 1.174f)
                lineToRelative(0.913f, 5.694f)
                lineToRelative(-4.564f, 0.259f)
                close()
            }
        }
        .build()
        return _konva!!
    }

private var _konva: ImageVector? = null
