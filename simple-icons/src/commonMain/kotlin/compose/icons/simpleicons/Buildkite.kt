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

public val SimpleIcons.Buildkite: ImageVector
    get() {
        if (_buildkite != null) {
            return _buildkite!!
        }
        _buildkite = Builder(name = "Buildkite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.613f, 8.143f)
                lineToRelative(-7.668f, -3.856f)
                verticalLineToRelative(7.712f)
                lineToRelative(7.668f, -3.855f)
                close()
                moveTo(8.166f, 15.857f)
                verticalLineTo(8.143f)
                lineTo(0.387f, 4.287f)
                verticalLineTo(12.0f)
                lineToRelative(7.78f, 3.857f)
                close()
                moveTo(0.183f, 3.958f)
                arcToRelative(0.382f, 0.382f, 0.0f, false, true, 0.377f, -0.017f)
                lineToRelative(7.606f, 3.771f)
                lineToRelative(7.607f, -3.771f)
                arcToRelative(0.386f, 0.386f, 0.0f, false, true, 0.346f, 0.0f)
                lineToRelative(7.668f, 3.857f)
                arcToRelative(0.386f, 0.386f, 0.0f, false, true, 0.213f, 0.345f)
                verticalLineToRelative(7.71f)
                arcToRelative(0.388f, 0.388f, 0.0f, false, true, -0.213f, 0.346f)
                lineToRelative(-7.668f, 3.86f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, true, -0.562f, -0.345f)
                verticalLineToRelative(-7.09f)
                lineToRelative(-7.219f, 3.58f)
                arcToRelative(0.392f, 0.392f, 0.0f, false, true, -0.344f, 0.0f)
                lineTo(0.215f, 12.346f)
                arcTo(0.387f, 0.387f, 0.0f, false, true, 0.0f, 12.0f)
                verticalLineTo(4.287f)
                arcToRelative(0.385f, 0.385f, 0.0f, false, true, 0.183f, -0.329f)
                close()
            }
        }
        .build()
        return _buildkite!!
    }

private var _buildkite: ImageVector? = null
