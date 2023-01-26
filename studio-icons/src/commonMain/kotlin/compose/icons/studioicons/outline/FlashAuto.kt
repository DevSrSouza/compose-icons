package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FlashAuto: ImageVector
    get() {
        if (_flashAuto != null) {
            return _flashAuto!!
        }
        _flashAuto = Builder(name = "FlashAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                lineToRelative(7.0f, -12.0f)
                lineTo(9.0f, 11.0f)
                lineToRelative(4.0f, -9.0f)
                lineTo(3.0f, 2.0f)
                close()
                moveTo(19.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-3.2f, 9.0f)
                horizontalLineToRelative(1.9f)
                lineToRelative(0.7f, -2.0f)
                horizontalLineToRelative(3.2f)
                lineToRelative(0.7f, 2.0f)
                horizontalLineToRelative(1.9f)
                lineTo(19.0f, 2.0f)
                close()
                moveTo(16.85f, 7.65f)
                lineTo(18.0f, 4.0f)
                lineToRelative(1.15f, 3.65f)
                horizontalLineToRelative(-2.3f)
                close()
            }
        }
        .build()
        return _flashAuto!!
    }

private var _flashAuto: ImageVector? = null
