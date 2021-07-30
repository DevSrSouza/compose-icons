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

public val SimpleIcons.Klout: ImageVector
    get() {
        if (_klout != null) {
            return _klout!!
        }
        _klout = Builder(name = "Klout", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.673f)
                verticalLineToRelative(14.72f)
                horizontalLineToRelative(16.17f)
                lineTo(24.0f, 21.327f)
                lineTo(24.0f, 2.673f)
                lineTo(0.0f, 2.673f)
                close()
                moveTo(9.827f, 11.093f)
                horizontalLineToRelative(-1.17f)
                lineToRelative(-2.88f, 4.054f)
                lineTo(2.35f, 15.147f)
                lineToRelative(3.94f, -5.265f)
                lineToRelative(-3.638f, -5.07f)
                horizontalLineToRelative(3.336f)
                lineToRelative(2.66f, 3.885f)
                horizontalLineToRelative(1.18f)
                verticalLineToRelative(2.397f)
                close()
                moveTo(18.234f, 15.146f)
                lineToRelative(-2.88f, -4.053f)
                horizontalLineToRelative(-1.966f)
                verticalLineToRelative(4.053f)
                horizontalLineToRelative(-2.73f)
                lineTo(10.658f, 4.812f)
                horizontalLineToRelative(2.734f)
                verticalLineToRelative(3.885f)
                horizontalLineToRelative(1.965f)
                lineToRelative(2.658f, -3.885f)
                horizontalLineToRelative(3.33f)
                lineToRelative(-3.636f, 5.07f)
                lineToRelative(3.94f, 5.265f)
                horizontalLineToRelative(-3.416f)
                close()
            }
        }
        .build()
        return _klout!!
    }

private var _klout: ImageVector? = null
