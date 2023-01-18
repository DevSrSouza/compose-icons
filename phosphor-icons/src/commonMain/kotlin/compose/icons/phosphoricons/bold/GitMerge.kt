package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) {
            return _gitMerge!!
        }
        _gitMerge = Builder(name = "GitMerge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 100.0f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, -39.2f, 32.0f)
                lineTo(130.5f, 132.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, true, -27.7f, -13.0f)
                lineToRelative(-14.0f, -16.8f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -32.8f, 4.0f)
                verticalLineToRelative(43.6f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 24.0f, 0.0f)
                lineTo(80.0f, 129.1f)
                lineToRelative(4.4f, 5.3f)
                arcTo(59.8f, 59.8f, 0.0f, false, false, 130.5f, 156.0f)
                horizontalLineToRelative(20.9f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 188.0f, 100.0f)
                close()
                moveTo(68.0f, 52.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 52.0f, 68.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 68.0f, 52.0f)
                close()
                moveTo(68.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 68.0f, 204.0f)
                close()
                moveTo(188.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 188.0f, 156.0f)
                close()
            }
        }
        .build()
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
