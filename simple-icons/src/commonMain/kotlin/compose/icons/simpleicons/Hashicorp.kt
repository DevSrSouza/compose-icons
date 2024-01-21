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

public val SimpleIcons.Hashicorp: ImageVector
    get() {
        if (_hashicorp != null) {
            return _hashicorp!!
        }
        _hashicorp = Builder(name = "Hashicorp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.114f, 4.094f)
                lineTo(4.215f, 7.5f)
                verticalLineToRelative(13.09f)
                lineTo(0.666f, 18.542f)
                lineTo(0.666f, 5.45f)
                lineTo(10.114f, 0.0f)
                verticalLineToRelative(4.094f)
                close()
                moveTo(13.886f, 17.464f)
                lineTo(17.435f, 15.415f)
                lineTo(17.435f, 2.05f)
                lineTo(13.885f, 0.0f)
                verticalLineToRelative(10.426f)
                horizontalLineToRelative(-3.77f)
                verticalLineToRelative(-3.89f)
                lineTo(6.562f, 8.585f)
                verticalLineToRelative(13.357f)
                lineToRelative(3.551f, 2.054f)
                lineTo(10.113f, 13.599f)
                horizontalLineToRelative(3.772f)
                verticalLineToRelative(3.865f)
                close()
                moveTo(19.783f, 3.41f)
                lineTo(19.783f, 16.5f)
                lineToRelative(-5.897f, 3.405f)
                lineTo(13.886f, 24.0f)
                lineToRelative(9.448f, -5.45f)
                lineTo(23.334f, 5.458f)
                lineToRelative(-3.551f, -2.05f)
                close()
            }
        }
        .build()
        return _hashicorp!!
    }

private var _hashicorp: ImageVector? = null
