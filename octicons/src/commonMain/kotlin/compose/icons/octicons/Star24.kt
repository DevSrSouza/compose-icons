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

public val Octicons.Star24: ImageVector
    get() {
        if (_star24 != null) {
            return _star24!!
        }
        _star24 = Builder(name = "Star24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.673f, 0.418f)
                lineToRelative(3.058f, 6.197f)
                lineToRelative(6.839f, 0.994f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.415f, 1.279f)
                lineToRelative(-4.948f, 4.823f)
                lineToRelative(1.168f, 6.811f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.088f, 0.791f)
                lineTo(12.0f, 18.347f)
                lineToRelative(-6.117f, 3.216f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.088f, -0.79f)
                lineToRelative(1.168f, -6.812f)
                lineToRelative(-4.948f, -4.823f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.416f, -1.28f)
                lineToRelative(6.838f, -0.993f)
                lineTo(11.328f, 0.668f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 12.0f, 0.25f)
                close()
                moveTo(12.0f, 2.695f)
                lineTo(9.44f, 7.882f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.565f, 0.41f)
                lineToRelative(-5.725f, 0.832f)
                lineToRelative(4.143f, 4.038f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 0.215f, 0.664f)
                lineToRelative(-0.978f, 5.702f)
                lineToRelative(5.121f, -2.692f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.698f, 0.0f)
                lineToRelative(5.12f, 2.692f)
                lineToRelative(-0.977f, -5.702f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 0.215f, -0.664f)
                lineToRelative(4.143f, -4.038f)
                lineToRelative(-5.725f, -0.831f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.565f, -0.41f)
                lineTo(12.0f, 2.694f)
                close()
            }
        }
        .build()
        return _star24!!
    }

private var _star24: ImageVector? = null
