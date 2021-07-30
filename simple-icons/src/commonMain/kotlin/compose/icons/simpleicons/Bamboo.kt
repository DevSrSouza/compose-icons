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

public val SimpleIcons.Bamboo: ImageVector
    get() {
        if (_bamboo != null) {
            return _bamboo!!
        }
        _bamboo = Builder(name = "Bamboo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7142f, 13.6433f)
                horizontalLineToRelative(-4.9888f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, false, -0.655f, 0.555f)
                arcToRelative(4.1139f, 4.1139f, 0.0f, false, true, -4.0619f, 3.5299f)
                lineToRelative(1.35f, 6.1728f)
                arcToRelative(10.3737f, 10.3737f, 0.0f, false, false, 9.0077f, -9.5447f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, false, -0.652f, -0.713f)
                close()
                moveTo(13.0815f, 13.4853f)
                lineToRelative(7.1998f, -6.1718f)
                arcToRelative(0.645f, 0.645f, 0.0f, false, false, 0.0f, -0.984f)
                lineTo(13.0815f, 0.1597f)
                arcToRelative(0.648f, 0.648f, 0.0f, false, false, -1.074f, 0.483f)
                verticalLineToRelative(12.3426f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, false, 1.073f, 0.5f)
                close()
                moveTo(1.7268f, 14.9903f)
                arcTo(10.3847f, 10.3847f, 0.0f, false, false, 12.0115f, 24.0f)
                verticalLineToRelative(-6.2698f)
                arcToRelative(4.0929f, 4.0929f, 0.0f, false, true, -4.0999f, -4.0869f)
                close()
                moveTo(1.6308f, 13.5433f)
                verticalLineToRelative(0.1f)
                horizontalLineToRelative(6.2798f)
                arcToRelative(4.0929f, 4.0929f, 0.0f, false, true, 4.098f, -4.0879f)
                lineToRelative(-1.348f, -6.1698f)
                arcToRelative(10.3697f, 10.3697f, 0.0f, false, false, -9.0298f, 10.1577f)
            }
        }
        .build()
        return _bamboo!!
    }

private var _bamboo: ImageVector? = null
