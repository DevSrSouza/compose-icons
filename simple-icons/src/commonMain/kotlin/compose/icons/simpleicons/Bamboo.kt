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
                moveTo(21.714f, 13.643f)
                horizontalLineToRelative(-4.989f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, false, -0.655f, 0.555f)
                arcToRelative(4.114f, 4.114f, 0.0f, false, true, -4.062f, 3.53f)
                lineToRelative(1.35f, 6.173f)
                arcToRelative(10.374f, 10.374f, 0.0f, false, false, 9.008f, -9.545f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, false, -0.652f, -0.713f)
                close()
                moveTo(13.081f, 13.485f)
                lineToRelative(7.2f, -6.172f)
                arcToRelative(0.645f, 0.645f, 0.0f, false, false, 0.0f, -0.984f)
                lineTo(13.082f, 0.16f)
                arcToRelative(0.648f, 0.648f, 0.0f, false, false, -1.074f, 0.483f)
                verticalLineToRelative(12.343f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, false, 1.073f, 0.5f)
                close()
                moveTo(1.727f, 14.99f)
                arcTo(10.385f, 10.385f, 0.0f, false, false, 12.012f, 24.0f)
                verticalLineToRelative(-6.27f)
                arcToRelative(4.093f, 4.093f, 0.0f, false, true, -4.1f, -4.087f)
                close()
                moveTo(1.631f, 13.543f)
                verticalLineToRelative(0.1f)
                horizontalLineToRelative(6.28f)
                arcToRelative(4.093f, 4.093f, 0.0f, false, true, 4.098f, -4.088f)
                lineToRelative(-1.348f, -6.17f)
                arcToRelative(10.37f, 10.37f, 0.0f, false, false, -9.03f, 10.158f)
            }
        }
        .build()
        return _bamboo!!
    }

private var _bamboo: ImageVector? = null
