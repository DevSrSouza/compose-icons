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

public val SimpleIcons.Nuget: ImageVector
    get() {
        if (_nuget != null) {
            return _nuget!!
        }
        _nuget = Builder(name = "Nuget", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.998f, 0.342f)
                arcToRelative(1.997f, 1.997f, 0.0f, true, false, 0.0f, 3.995f)
                arcToRelative(1.997f, 1.997f, 0.0f, false, false, 0.0f, -3.995f)
                close()
                moveTo(11.178f, 4.682f)
                arcToRelative(6.156f, 6.156f, 0.0f, false, false, -6.153f, 6.155f)
                verticalLineToRelative(6.667f)
                curveToRelative(0.0f, 3.4f, 2.756f, 6.154f, 6.154f, 6.154f)
                horizontalLineToRelative(6.667f)
                curveToRelative(3.4f, 0.0f, 6.154f, -2.755f, 6.154f, -6.154f)
                verticalLineToRelative(-6.667f)
                arcToRelative(6.154f, 6.154f, 0.0f, false, false, -6.154f, -6.155f)
                close()
                moveTo(9.701f, 7.482f)
                arcToRelative(2.496f, 2.496f, 0.0f, true, true, 0.0f, 4.993f)
                arcToRelative(2.496f, 2.496f, 0.0f, false, true, 0.0f, -4.993f)
                close()
                moveTo(17.669f, 13.642f)
                arcToRelative(3.996f, 3.996f, 0.0f, true, true, -0.002f, 7.992f)
                arcToRelative(3.996f, 3.996f, 0.0f, false, true, 0.002f, -7.992f)
                close()
            }
        }
        .build()
        return _nuget!!
    }

private var _nuget: ImageVector? = null
