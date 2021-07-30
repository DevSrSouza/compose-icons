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

public val SimpleIcons.Manjaro: ImageVector
    get() {
        if (_manjaro != null) {
            return _manjaro!!
        }
        _manjaro = Builder(name = "Manjaro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(6.75f)
                lineTo(6.75f, 6.75f)
                horizontalLineToRelative(8.625f)
                lineTo(15.375f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(8.625f, 8.625f)
                lineTo(8.625f, 24.0f)
                horizontalLineToRelative(6.75f)
                lineTo(15.375f, 8.625f)
                horizontalLineToRelative(-6.75f)
                close()
                moveTo(17.25f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-6.75f)
                close()
            }
        }
        .build()
        return _manjaro!!
    }

private var _manjaro: ImageVector? = null
