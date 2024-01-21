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

public val SimpleIcons.Gocd: ImageVector
    get() {
        if (_gocd != null) {
            return _gocd!!
        }
        _gocd = Builder(name = "Gocd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.043f, 13.237f)
                lineToRelative(-8.907f, 5.935f)
                arcToRelative(1.47f, 1.47f, 0.0f, false, true, -0.823f, 0.25f)
                arcToRelative(1.449f, 1.449f, 0.0f, false, true, -0.696f, -0.173f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, true, -0.784f, -1.308f)
                verticalLineTo(12.0f)
                arcToRelative(1.482f, 1.482f, 0.0f, true, true, 2.957f, 0.0f)
                verticalLineToRelative(3.163f)
                lineTo(14.537f, 12.0f)
                lineTo(7.478f, 7.304f)
                arcTo(1.49f, 1.49f, 0.0f, true, true, 9.13f, 4.823f)
                lineToRelative(8.913f, 5.94f)
                arcToRelative(1.492f, 1.492f, 0.0f, false, true, 0.0f, 2.474f)
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.012f, 12.012f, 0.0f, false, false, 12.0f, 0.0f)
            }
        }
        .build()
        return _gocd!!
    }

private var _gocd: ImageVector? = null
