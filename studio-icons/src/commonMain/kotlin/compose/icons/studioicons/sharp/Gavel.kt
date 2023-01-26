package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Gavel: ImageVector
    get() {
        if (_gavel != null) {
            return _gavel!!
        }
        _gavel = Builder(name = "Gavel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 21.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(5.24f, 8.07f)
                lineToRelative(2.83f, -2.83f)
                lineToRelative(14.14f, 14.14f)
                lineToRelative(-2.83f, 2.83f)
                lineTo(5.24f, 8.07f)
                close()
                moveTo(12.32f, 1.0f)
                lineToRelative(5.66f, 5.66f)
                lineToRelative(-2.83f, 2.83f)
                lineToRelative(-5.66f, -5.66f)
                lineTo(12.32f, 1.0f)
                close()
                moveTo(3.83f, 9.48f)
                lineToRelative(5.66f, 5.66f)
                lineToRelative(-2.83f, 2.83f)
                lineTo(1.0f, 12.31f)
                lineToRelative(2.83f, -2.83f)
                close()
            }
        }
        .build()
        return _gavel!!
    }

private var _gavel: ImageVector? = null
