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

public val RemixIcons.SnowyFill: ImageVector
    get() {
        if (_snowyFill != null) {
            return _snowyFill!!
        }
        _snowyFill = Builder(name = "SnowyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.027f, 17.43f)
                arcTo(8.003f, 8.003f, 0.0f, false, true, 9.0f, 2.0f)
                arcToRelative(8.003f, 8.003f, 0.0f, false, true, 7.458f, 5.099f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 18.0f, 17.978f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.973f, -0.549f)
                close()
                moveTo(13.0f, 16.267f)
                lineToRelative(1.964f, -1.134f)
                lineToRelative(1.0f, 1.732f)
                lineTo(14.0f, 18.0f)
                lineToRelative(1.964f, 1.134f)
                lineToRelative(-1.0f, 1.732f)
                lineTo(13.0f, 19.732f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.268f)
                lineToRelative(-1.964f, 1.134f)
                lineToRelative(-1.0f, -1.732f)
                lineTo(10.0f, 18.0f)
                lineToRelative(-1.964f, -1.134f)
                lineToRelative(1.0f, -1.732f)
                lineTo(11.0f, 16.268f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.268f)
                close()
            }
        }
        .build()
        return _snowyFill!!
    }

private var _snowyFill: ImageVector? = null
