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

public val SimpleIcons.Guangzhoumetro: ImageVector
    get() {
        if (_guangzhoumetro != null) {
            return _guangzhoumetro!!
        }
        _guangzhoumetro = Builder(name = "Guangzhoumetro", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.433f, 12.329f)
                arcTo(16.188f, 16.188f, 0.0f, false, true, 22.118f, 0.009f)
                lineTo(17.684f, 0.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -4.776f, 11.374f)
                lineTo(12.908f, 24.0f)
                horizontalLineToRelative(3.525f)
                close()
                moveTo(7.564f, 12.329f)
                arcTo(16.174f, 16.174f, 0.0f, false, false, 1.882f, 0.009f)
                lineTo(6.319f, 0.0f)
                arcToRelative(16.238f, 16.238f, 0.0f, false, true, 4.773f, 11.374f)
                lineTo(11.092f, 24.0f)
                lineTo(7.564f, 24.0f)
                close()
            }
        }
        .build()
        return _guangzhoumetro!!
    }

private var _guangzhoumetro: ImageVector? = null
