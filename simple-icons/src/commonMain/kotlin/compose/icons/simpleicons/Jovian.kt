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

public val SimpleIcons.Jovian: ImageVector
    get() {
        if (_jovian != null) {
            return _jovian!!
        }
        _jovian = Builder(name = "Jovian", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 1.65f)
                curveTo(20.25f, 0.74f, 19.51f, 0.0f, 18.6f, 0.0f)
                lineTo(5.4f, 0.0f)
                curveToRelative(-0.91f, 0.0f, -1.65f, 0.74f, -1.65f, 1.65f)
                verticalLineToRelative(20.7f)
                curveToRelative(0.0f, 0.91f, 0.74f, 1.65f, 1.65f, 1.65f)
                horizontalLineToRelative(13.2f)
                curveToRelative(0.91f, 0.0f, 1.65f, -0.74f, 1.65f, -1.65f)
                lineTo(20.25f, 1.65f)
                close()
                moveTo(14.975f, 5.991f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(15.015f, 15.009f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(9.0f, 15.009f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _jovian!!
    }

private var _jovian: ImageVector? = null
