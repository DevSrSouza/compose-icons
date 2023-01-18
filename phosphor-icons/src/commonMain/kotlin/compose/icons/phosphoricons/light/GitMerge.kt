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

public val LightGroup.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) {
            return _gitMerge!!
        }
        _gitMerge = Builder(name = "GitMerge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 106.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -33.9f, 32.0f)
                lineTo(130.5f, 138.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -32.3f, -15.1f)
                lineToRelative(-19.0f, -22.8f)
                arcTo(33.9f, 33.9f, 0.0f, true, false, 62.0f, 101.5f)
                verticalLineToRelative(53.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 12.0f, 0.0f)
                lineTo(74.0f, 112.6f)
                lineToRelative(15.0f, 18.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 130.5f, 150.0f)
                horizontalLineToRelative(25.0f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 188.0f, 106.0f)
                close()
                moveTo(46.0f, 68.0f)
                arcTo(22.0f, 22.0f, 0.0f, true, true, 68.0f, 90.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 46.0f, 68.0f)
                close()
                moveTo(90.0f, 188.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 90.0f, 188.0f)
                close()
                moveTo(188.0f, 162.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 188.0f, 162.0f)
                close()
            }
        }
        .build()
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
