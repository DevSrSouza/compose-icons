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

public val SimpleIcons.Hibernate: ImageVector
    get() {
        if (_hibernate != null) {
            return _hibernate!!
        }
        _hibernate = Builder(name = "Hibernate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.365f, 0.0f)
                lineTo(9.98f, 7.994f)
                horizontalLineToRelative(8.95f)
                lineTo(14.31f, 0.0f)
                lineTo(5.366f, 0.0f)
                close()
                moveTo(4.934f, 0.248f)
                lineTo(0.46f, 7.994f)
                lineToRelative(4.613f, 8.008f)
                lineTo(9.55f, 8.24f)
                lineTo(4.934f, 0.248f)
                close()
                moveTo(18.926f, 7.998f)
                lineToRelative(-4.475f, 7.76f)
                lineToRelative(4.617f, 7.992f)
                lineToRelative(4.471f, -7.744f)
                lineToRelative(-4.613f, -8.008f)
                close()
                moveTo(14.021f, 16.004f)
                lineToRelative(-8.95f, 0.002f)
                lineTo(9.688f, 24.0f)
                horizontalLineToRelative(8.946f)
                lineToRelative(-4.615f, -7.994f)
                lineToRelative(0.001f, -0.002f)
                close()
            }
        }
        .build()
        return _hibernate!!
    }

private var _hibernate: ImageVector? = null
