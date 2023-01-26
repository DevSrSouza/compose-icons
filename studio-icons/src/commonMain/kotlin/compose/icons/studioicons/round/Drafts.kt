package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Drafts: ImageVector
    get() {
        if (_drafts != null) {
            return _drafts!!
        }
        _drafts = Builder(name = "Drafts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.99f, 8.0f)
                curveToRelative(0.0f, -0.72f, -0.37f, -1.35f, -0.94f, -1.7f)
                lineToRelative(-8.04f, -4.71f)
                curveToRelative(-0.62f, -0.37f, -1.4f, -0.37f, -2.02f, 0.0f)
                lineTo(2.95f, 6.3f)
                curveTo(2.38f, 6.65f, 2.0f, 7.28f, 2.0f, 8.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineToRelative(-0.01f, -10.0f)
                close()
                moveTo(10.94f, 12.34f)
                lineToRelative(-7.2f, -4.5f)
                lineToRelative(7.25f, -4.25f)
                curveToRelative(0.62f, -0.37f, 1.4f, -0.37f, 2.02f, 0.0f)
                lineToRelative(7.25f, 4.25f)
                lineToRelative(-7.2f, 4.5f)
                curveToRelative(-0.65f, 0.4f, -1.47f, 0.4f, -2.12f, 0.0f)
                close()
            }
        }
        .build()
        return _drafts!!
    }

private var _drafts: ImageVector? = null
