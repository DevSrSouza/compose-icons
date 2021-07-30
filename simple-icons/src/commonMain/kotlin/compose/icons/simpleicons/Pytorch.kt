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

public val SimpleIcons.Pytorch: ImageVector
    get() {
        if (_pytorch != null) {
            return _pytorch!!
        }
        _pytorch = Builder(name = "Pytorch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 0.0f)
                lineTo(4.952f, 7.053f)
                arcToRelative(9.865f, 9.865f, 0.0f, false, false, 0.0f, 14.022f)
                arcToRelative(9.866f, 9.866f, 0.0f, false, false, 14.022f, 0.0f)
                curveToRelative(3.984f, -3.9f, 3.986f, -10.205f, 0.085f, -14.023f)
                lineToRelative(-1.744f, 1.743f)
                curveToRelative(2.904f, 2.905f, 2.904f, 7.634f, 0.0f, 10.538f)
                reflectiveCurveToRelative(-7.634f, 2.904f, -10.538f, 0.0f)
                reflectiveCurveToRelative(-2.904f, -7.634f, 0.0f, -10.538f)
                lineToRelative(4.647f, -4.646f)
                lineToRelative(0.582f, -0.665f)
                close()
                moveTo(15.573f, 3.899f)
                arcToRelative(1.327f, 1.327f, 0.0f, false, false, -1.327f, 1.327f)
                arcToRelative(1.327f, 1.327f, 0.0f, false, false, 1.327f, 1.328f)
                arcTo(1.327f, 1.327f, 0.0f, false, false, 16.9f, 5.226f)
                arcTo(1.327f, 1.327f, 0.0f, false, false, 15.573f, 3.9f)
                close()
            }
        }
        .build()
        return _pytorch!!
    }

private var _pytorch: ImageVector? = null
