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

public val RemixIcons.FacebookCircleFill: ImageVector
    get() {
        if (_facebookCircleFill != null) {
            return _facebookCircleFill!!
        }
        _facebookCircleFill = Builder(name = "FacebookCircleFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveToRelative(0.0f, 4.991f, 3.657f, 9.128f, 8.438f, 9.879f)
                verticalLineTo(14.89f)
                horizontalLineToRelative(-2.54f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(2.54f)
                verticalLineTo(9.797f)
                curveToRelative(0.0f, -2.506f, 1.492f, -3.89f, 3.777f, -3.89f)
                curveToRelative(1.094f, 0.0f, 2.238f, 0.195f, 2.238f, 0.195f)
                verticalLineToRelative(2.46f)
                horizontalLineToRelative(-1.26f)
                curveToRelative(-1.243f, 0.0f, -1.63f, 0.771f, -1.63f, 1.562f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(2.773f)
                lineToRelative(-0.443f, 2.89f)
                horizontalLineToRelative(-2.33f)
                verticalLineToRelative(6.989f)
                curveTo(18.343f, 21.129f, 22.0f, 16.99f, 22.0f, 12.0f)
                curveToRelative(0.0f, -5.523f, -4.477f, -10.0f, -10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _facebookCircleFill!!
    }

private var _facebookCircleFill: ImageVector? = null
