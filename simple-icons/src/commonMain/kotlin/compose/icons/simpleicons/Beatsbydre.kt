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

public val SimpleIcons.Beatsbydre: ImageVector
    get() {
        if (_beatsbydre != null) {
            return _beatsbydre!!
        }
        _beatsbydre = Builder(name = "Beatsbydre", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0099f, 15.5996f)
                arcTo(3.5995f, 3.5995f, 0.0f, true, false, 8.4103f, 12.0f)
                arcToRelative(3.5995f, 3.5995f, 0.0f, false, false, 3.5996f, 3.5996f)
                close()
                moveTo(12.0099f, 0.0015f)
                arcToRelative(11.9985f, 11.9985f, 0.0f, false, false, -3.5996f, 0.552f)
                verticalLineToRelative(6.6471f)
                arcTo(5.9992f, 5.9992f, 0.0f, true, true, 6.0106f, 12.0f)
                lineTo(6.0106f, 1.6033f)
                arcTo(11.9985f, 11.9985f, 0.0f, true, false, 12.01f, 0.0015f)
                close()
            }
        }
        .build()
        return _beatsbydre!!
    }

private var _beatsbydre: ImageVector? = null
