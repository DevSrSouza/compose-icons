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

public val RemixIcons.FacebookFill: ImageVector
    get() {
        if (_facebookFill != null) {
            return _facebookFill!!
        }
        _facebookFill = Builder(name = "FacebookFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.5f)
                horizontalLineToRelative(2.5f)
                lineToRelative(1.0f, -4.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.03f, 0.0f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(2.14f)
                curveToRelative(-0.326f, -0.043f, -1.557f, -0.14f, -2.857f, -0.14f)
                curveTo(11.928f, 2.0f, 10.0f, 3.657f, 10.0f, 6.7f)
                verticalLineToRelative(2.8f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-8.5f)
                close()
            }
        }
        .build()
        return _facebookFill!!
    }

private var _facebookFill: ImageVector? = null
