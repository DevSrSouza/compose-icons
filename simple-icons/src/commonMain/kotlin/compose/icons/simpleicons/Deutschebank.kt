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

public val SimpleIcons.Deutschebank: ImageVector
    get() {
        if (_deutschebank != null) {
            return _deutschebank!!
        }
        _deutschebank = Builder(name = "Deutschebank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.375f, 3.375f)
                verticalLineToRelative(17.25f)
                horizontalLineToRelative(17.25f)
                lineTo(20.625f, 3.375f)
                lineTo(3.375f, 3.375f)
                close()
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(5.25f, 18.225f)
                lineTo(14.4f, 5.775f)
                horizontalLineToRelative(4.35f)
                lineTo(9.6f, 18.225f)
                lineTo(5.25f, 18.225f)
                close()
            }
        }
        .build()
        return _deutschebank!!
    }

private var _deutschebank: ImageVector? = null
