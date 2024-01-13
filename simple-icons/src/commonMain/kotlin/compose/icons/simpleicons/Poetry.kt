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

public val SimpleIcons.Poetry: ImageVector
    get() {
        if (_poetry != null) {
            return _poetry!!
        }
        _poetry = Builder(name = "Poetry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.604f, 0.0f)
                arcToRelative(19.144f, 19.144f, 0.0f, false, true, -5.268f, 13.213f)
                lineTo(2.396f, 0.0f)
                lineToRelative(13.583f, 13.583f)
                arcToRelative(19.149f, 19.149f, 0.0f, false, true, -13.583f, 5.624f)
                lineTo(2.396f, 0.0f)
                horizontalLineToRelative(19.208f)
                close()
                moveTo(19.693f, 17.297f)
                arcTo(24.455f, 24.455f, 0.0f, false, true, 7.189f, 24.0f)
                lineToRelative(-4.053f, -4.053f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, 13.37f, -5.838f)
                lineToRelative(3.187f, 3.188f)
                close()
            }
        }
        .build()
        return _poetry!!
    }

private var _poetry: ImageVector? = null
