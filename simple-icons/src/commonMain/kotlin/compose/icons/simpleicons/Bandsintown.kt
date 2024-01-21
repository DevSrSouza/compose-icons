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

public val SimpleIcons.Bandsintown: ImageVector
    get() {
        if (_bandsintown != null) {
            return _bandsintown!!
        }
        _bandsintown = Builder(name = "Bandsintown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.399f, 12.8f)
                verticalLineToRelative(4.8f)
                lineTo(19.2f, 17.6f)
                verticalLineToRelative(1.6f)
                lineTo(4.799f, 19.2f)
                lineTo(4.799f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 12.8f)
                lineTo(6.399f, 12.8f)
                close()
                moveTo(11.2f, 4.8f)
                lineTo(6.399f, 4.8f)
                verticalLineToRelative(6.4f)
                lineTo(11.2f, 11.2f)
                lineTo(11.2f, 4.8f)
                close()
                moveTo(17.6f, 4.8f)
                horizontalLineToRelative(-4.8f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(4.8f)
                lineTo(17.6f, 4.8f)
                close()
                moveTo(24.0f, 0.0f)
                horizontalLineToRelative(-4.8f)
                verticalLineToRelative(11.2f)
                lineTo(24.0f, 11.2f)
                lineTo(24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bandsintown!!
    }

private var _bandsintown: ImageVector? = null
