package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) {
            return _gitBranch!!
        }
        _gitBranch = Builder(name = "GitBranch", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 34.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -6.0f, 67.5f)
                lineTo(182.0f, 104.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, -18.0f, 18.0f)
                lineTo(92.0f, 122.0f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, false, -18.0f, 6.0f)
                lineTo(74.0f, 101.5f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineToRelative(53.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 12.0f, 0.0f)
                lineTo(74.0f, 152.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, -18.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, 30.0f, -30.0f)
                verticalLineToRelative(-2.5f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 188.0f, 34.0f)
                close()
                moveTo(90.0f, 188.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 90.0f, 188.0f)
                close()
                moveTo(68.0f, 90.0f)
                arcTo(22.0f, 22.0f, 0.0f, true, true, 90.0f, 68.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 68.0f, 90.0f)
                close()
                moveTo(188.0f, 90.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 188.0f, 90.0f)
                close()
            }
        }
        .build()
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
