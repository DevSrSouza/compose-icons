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

public val RemixIcons.PlaneFill: ImageVector
    get() {
        if (_planeFill != null) {
            return _planeFill!!
        }
        _planeFill = Builder(name = "PlaneFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.947f)
                lineTo(22.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-8.0f, -2.526f)
                verticalLineToRelative(5.36f)
                lineToRelative(3.0f, 1.666f)
                verticalLineTo(22.0f)
                lineToRelative(-4.5f, -1.0f)
                lineTo(8.0f, 22.0f)
                verticalLineToRelative(-1.5f)
                lineToRelative(3.0f, -1.667f)
                verticalLineToRelative(-5.36f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(8.0f, -5.053f)
                verticalLineTo(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(5.447f)
                close()
            }
        }
        .build()
        return _planeFill!!
    }

private var _planeFill: ImageVector? = null
