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

public val SimpleIcons.Appian: ImageVector
    get() {
        if (_appian != null) {
            return _appian!!
        }
        _appian = Builder(name = "Appian", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.646f, 6.117f)
                curveTo(19.538f, 1.763f, 17.883f, 0.0f, 13.636f, 0.0f)
                horizontalLineTo(7.34f)
                verticalLineToRelative(4.066f)
                horizontalLineToRelative(4.57f)
                curveToRelative(1.799f, 0.0f, 2.807f, 0.0f, 2.807f, 1.655f)
                verticalLineToRelative(2.375f)
                curveToRelative(-0.828f, 0.0f, -2.88f, -0.036f, -4.426f, -0.036f)
                curveToRelative(-4.246f, 0.0f, -5.83f, 1.727f, -5.937f, 6.117f)
                verticalLineToRelative(3.742f)
                curveToRelative(0.108f, 4.102f, 1.51f, 5.865f, 5.253f, 6.081f)
                lineToRelative(3.85f, -4.066f)
                curveToRelative(-0.397f, 0.036f, -0.864f, 0.036f, -1.44f, 0.036f)
                curveToRelative(-1.798f, 0.0f, -2.806f, 0.0f, -2.806f, -1.655f)
                verticalLineToRelative(-4.57f)
                curveToRelative(0.0f, -1.655f, 1.007f, -1.655f, 2.806f, -1.655f)
                curveToRelative(1.908f, 0.0f, 2.807f, 0.0f, 2.807f, 1.655f)
                verticalLineToRelative(10.22f)
                horizontalLineToRelative(4.821f)
                close()
            }
        }
        .build()
        return _appian!!
    }

private var _appian: ImageVector? = null
