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

public val SimpleIcons.Dunked: ImageVector
    get() {
        if (_dunked != null) {
            return _dunked!!
        }
        _dunked = Builder(name = "Dunked", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.799f, 0.0f)
                verticalLineToRelative(19.8599f)
                arcTo(4.2002f, 4.2002f, 0.0f, false, false, 18.0003f, 24.0f)
                horizontalLineToRelative(4.2002f)
                verticalLineTo(4.1411f)
                arcTo(4.2002f, 4.2002f, 0.0f, false, false, 17.9992f, 0.0f)
                horizontalLineTo(13.798f)
                close()
                moveTo(6.2983f, 15.0014f)
                arcToRelative(4.5008f, 4.5008f, 0.0f, false, false, -4.4988f, 4.3906f)
                verticalLineToRelative(0.2224f)
                arcToRelative(4.5008f, 4.5008f, 0.0f, false, false, 8.9986f, 0.0f)
                verticalLineToRelative(-0.2154f)
                arcToRelative(4.5008f, 4.5008f, 0.0f, false, false, -4.4998f, -4.3986f)
                close()
            }
        }
        .build()
        return _dunked!!
    }

private var _dunked: ImageVector? = null
