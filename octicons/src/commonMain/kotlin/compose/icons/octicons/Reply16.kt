package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Reply16: ImageVector
    get() {
        if (_reply16 != null) {
            return _reply16!!
        }
        _reply16 = Builder(name = "Reply16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.78f, 1.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineTo(3.81f, 6.0f)
                horizontalLineToRelative(6.44f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 15.0f, 10.75f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.25f, -3.25f)
                horizontalLineTo(3.81f)
                lineToRelative(2.97f, 2.97f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                lineTo(1.47f, 7.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _reply16!!
    }

private var _reply16: ImageVector? = null
