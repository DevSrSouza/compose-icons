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

public val SimpleIcons.V2ex: ImageVector
    get() {
        if (_v2ex != null) {
            return _v2ex!!
        }
        _v2ex = Builder(name = "V2ex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.671f, 1.933f)
                horizontalLineToRelative(13.821f)
                arcToRelative(1.342f, 1.342f, 0.0f, false, true, 0.98f, 0.425f)
                lineToRelative(8.166f, 8.725f)
                arcToRelative(1.342f, 1.342f, 0.0f, false, true, 0.0f, 1.834f)
                lineToRelative(-8.166f, 8.724f)
                arcToRelative(1.342f, 1.342f, 0.0f, false, true, -0.98f, 0.426f)
                horizontalLineTo(0.673f)
                arcTo(0.671f, 0.671f, 0.0f, false, true, 0.0f, 21.395f)
                verticalLineToRelative(-6.878f)
                horizontalLineToRelative(13.19f)
                lineToRelative(2.276f, -2.28f)
                arcToRelative(0.336f, 0.336f, 0.0f, false, false, 0.0f, -0.474f)
                lineToRelative(-2.276f, -2.28f)
                horizontalLineTo(0.0f)
                verticalLineTo(2.604f)
                arcToRelative(0.671f, 0.671f, 0.0f, false, true, 0.671f, -0.671f)
                close()
            }
        }
        .build()
        return _v2ex!!
    }

private var _v2ex: ImageVector? = null
