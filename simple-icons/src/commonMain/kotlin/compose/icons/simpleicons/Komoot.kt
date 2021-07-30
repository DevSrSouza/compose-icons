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

public val SimpleIcons.Komoot: ImageVector
    get() {
        if (_komoot != null) {
            return _komoot!!
        }
        _komoot = Builder(name = "Komoot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8f, 14.829f)
                lineToRelative(2.2f, -3.43f)
                lineToRelative(2.2f, 3.43f)
                lineToRelative(5.962f, 5.962f)
                arcTo(11.946f, 11.946f, 0.0f, false, true, 12.0f, 24.0f)
                curveToRelative(-3.043f, 0.0f, -5.935f, -1.14f, -8.162f, -3.209f)
                close()
                moveTo(0.0f, 12.0f)
                curveTo(0.0f, 5.385f, 5.385f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.62f, 0.0f, 12.0f, 5.385f, 12.0f, 12.0f)
                curveToRelative(0.0f, 2.663f, -0.855f, 5.175f, -2.469f, 7.284f)
                lineToRelative(-6.018f, -6.018f)
                curveToRelative(0.15f, -0.412f, 0.226f, -0.839f, 0.226f, -1.27f)
                arcTo(3.743f, 3.743f, 0.0f, false, false, 12.0f, 8.257f)
                arcToRelative(3.743f, 3.743f, 0.0f, false, false, -3.739f, 3.739f)
                curveToRelative(0.0f, 0.431f, 0.075f, 0.858f, 0.226f, 1.27f)
                lineToRelative(-6.018f, 6.018f)
                arcTo(11.865f, 11.865f, 0.0f, false, true, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return _komoot!!
    }

private var _komoot: ImageVector? = null
