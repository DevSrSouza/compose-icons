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

public val Octicons.Repo16: ImageVector
    get() {
        if (_repo16 != null) {
            return _repo16!!
        }
        _repo16 = Builder(name = "Repo16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 0.0f)
                horizontalLineToRelative(8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.714f, 1.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.072f, 1.05f)
                arcTo(2.495f, 2.495f, 0.0f, false, true, 2.0f, 11.5f)
                close()
                moveTo(12.5f, 1.5f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.708f)
                arcTo(2.486f, 2.486f, 0.0f, false, true, 4.5f, 9.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(5.0f, 12.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(3.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.4f, 0.2f)
                lineToRelative(-1.45f, -1.087f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, false, -0.3f, 0.0f)
                lineTo(5.4f, 15.7f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.4f, -0.2f)
                close()
            }
        }
        .build()
        return _repo16!!
    }

private var _repo16: ImageVector? = null
