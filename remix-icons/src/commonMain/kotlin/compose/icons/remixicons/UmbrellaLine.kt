package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.UmbrellaLine: ImageVector
    get() {
        if (_umbrellaLine != null) {
            return _umbrellaLine!!
        }
        _umbrellaLine = Builder(name = "UmbrellaLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.05f)
                curveToRelative(5.053f, 0.501f, 9.0f, 4.765f, 9.0f, 9.95f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -5.185f, 3.947f, -9.449f, 9.0f, -9.95f)
                verticalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(0.05f)
                close()
                moveTo(19.938f, 11.0f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, false, -15.876f, 0.0f)
                horizontalLineToRelative(15.876f)
                close()
            }
        }
        .build()
        return _umbrellaLine!!
    }

private var _umbrellaLine: ImageVector? = null
