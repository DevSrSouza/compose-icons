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

public val SimpleIcons.Bookmeter: ImageVector
    get() {
        if (_bookmeter != null) {
            return _bookmeter!!
        }
        _bookmeter = Builder(name = "Bookmeter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.678f, 14.262f)
                horizontalLineToRelative(6.089f)
                lineTo(6.767f, 24.0f)
                lineTo(0.678f, 24.0f)
                verticalLineToRelative(-9.738f)
                close()
                moveTo(8.893f, 23.979f)
                horizontalLineToRelative(6.089f)
                lineTo(14.982f, 7.11f)
                lineTo(8.893f, 7.11f)
                verticalLineToRelative(16.869f)
                close()
                moveTo(17.234f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(6.089f)
                lineTo(23.323f, 0.0f)
                horizontalLineToRelative(-6.089f)
                close()
            }
        }
        .build()
        return _bookmeter!!
    }

private var _bookmeter: ImageVector? = null
