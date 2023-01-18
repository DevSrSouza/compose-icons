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

public val RemixIcons.AncientPavilionLine: ImageVector
    get() {
        if (_ancientPavilionLine != null) {
            return _ancientPavilionLine!!
        }
        _ancientPavilionLine = Builder(name = "AncientPavilionLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.513f, 2.001f)
                arcToRelative(9.004f, 9.004f, 0.0f, false, false, 9.97f, 5.877f)
                arcTo(4.501f, 4.501f, 0.0f, false, true, 19.0f, 11.888f)
                lineTo(19.0f, 19.0f)
                lineToRelative(2.0f, 0.001f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.001f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.113f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, true, -3.484f, -4.01f)
                arcToRelative(9.004f, 9.004f, 0.0f, false, false, 9.972f, -5.876f)
                horizontalLineToRelative(1.025f)
                close()
                moveTo(17.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                lineTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(12.0f, 5.327f)
                lineToRelative(-0.11f, 0.155f)
                arcTo(11.012f, 11.012f, 0.0f, false, true, 5.4f, 9.736f)
                lineToRelative(-0.358f, 0.073f)
                lineToRelative(0.673f, 0.19f)
                horizontalLineToRelative(12.573f)
                lineToRelative(0.668f, -0.19f)
                lineToRelative(-0.011f, -0.002f)
                arcToRelative(11.01f, 11.01f, 0.0f, false, true, -6.836f, -4.326f)
                lineTo(12.0f, 5.326f)
                close()
            }
        }
        .build()
        return _ancientPavilionLine!!
    }

private var _ancientPavilionLine: ImageVector? = null
