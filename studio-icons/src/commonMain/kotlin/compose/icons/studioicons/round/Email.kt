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

public val RoundGroup.Email: ImageVector
    get() {
        if (_email != null) {
            return _email!!
        }
        _email = Builder(name = "Email", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.6f, 8.25f)
                lineToRelative(-7.07f, 4.42f)
                curveToRelative(-0.32f, 0.2f, -0.74f, 0.2f, -1.06f, 0.0f)
                lineTo(4.4f, 8.25f)
                curveToRelative(-0.25f, -0.16f, -0.4f, -0.43f, -0.4f, -0.72f)
                curveToRelative(0.0f, -0.67f, 0.73f, -1.07f, 1.3f, -0.72f)
                lineTo(12.0f, 11.0f)
                lineToRelative(6.7f, -4.19f)
                curveToRelative(0.57f, -0.35f, 1.3f, 0.05f, 1.3f, 0.72f)
                curveToRelative(0.0f, 0.29f, -0.15f, 0.56f, -0.4f, 0.72f)
                close()
            }
        }
        .build()
        return _email!!
    }

private var _email: ImageVector? = null
