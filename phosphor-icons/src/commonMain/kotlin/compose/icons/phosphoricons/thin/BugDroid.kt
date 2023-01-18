package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) {
            return _bugDroid!!
        }
        _bugDroid = Builder(name = "BugDroid", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.1f, 84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 148.1f, 84.0f)
                close()
                moveTo(100.1f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 100.1f, 92.0f)
                close()
                moveTo(212.0f, 108.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -168.0f, 0.0f)
                lineTo(44.0f, 108.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 70.4f, 46.9f)
                lineToRelative(-17.1f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.4f, -5.8f)
                lineTo(76.5f, 41.7f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, true, 103.0f, 0.0f)
                lineToRelative(17.8f, -16.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.4f, 5.8f)
                lineToRelative(-17.1f, 16.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 212.0f, 108.0f)
                close()
                moveTo(52.0f, 108.0f)
                verticalLineToRelative(16.0f)
                lineTo(204.0f, 124.0f)
                lineTo(204.0f, 108.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -152.0f, 0.0f)
                close()
                moveTo(204.0f, 148.0f)
                lineTo(204.0f, 132.0f)
                lineTo(52.0f, 132.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 152.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
