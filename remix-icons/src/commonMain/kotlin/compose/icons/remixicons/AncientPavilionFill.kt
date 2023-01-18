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

public val RemixIcons.AncientPavilionFill: ImageVector
    get() {
        if (_ancientPavilionFill != null) {
            return _ancientPavilionFill!!
        }
        _ancientPavilionFill = Builder(name = "AncientPavilionFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.513f, 2.001f)
                arcToRelative(9.004f, 9.004f, 0.0f, false, false, 9.97f, 5.877f)
                arcTo(4.501f, 4.501f, 0.0f, false, true, 19.0f, 11.888f)
                verticalLineTo(19.0f)
                lineToRelative(2.0f, 0.001f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.113f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, true, -3.484f, -4.01f)
                arcToRelative(9.004f, 9.004f, 0.0f, false, false, 9.972f, -5.876f)
                horizontalLineToRelative(1.025f)
                close()
                moveTo(17.0f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _ancientPavilionFill!!
    }

private var _ancientPavilionFill: ImageVector? = null
