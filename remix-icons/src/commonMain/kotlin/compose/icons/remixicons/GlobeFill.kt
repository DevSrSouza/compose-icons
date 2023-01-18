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

public val RemixIcons.GlobeFill: ImageVector
    get() {
        if (_globeFill != null) {
            return _globeFill!!
        }
        _globeFill = Builder(name = "GlobeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 23.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.05f)
                arcToRelative(10.002f, 10.002f, 0.0f, false, true, -7.684f, -4.988f)
                lineToRelative(1.737f, -0.992f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 15.97f, 3.053f)
                lineToRelative(0.992f, -1.737f)
                arcTo(9.996f, 9.996f, 0.0f, false, true, 22.0f, 10.0f)
                curveToRelative(0.0f, 5.185f, -3.947f, 9.449f, -9.0f, 9.95f)
                lineTo(13.0f, 21.0f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 0.0f, -14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, 14.0f)
                close()
            }
        }
        .build()
        return _globeFill!!
    }

private var _globeFill: ImageVector? = null
