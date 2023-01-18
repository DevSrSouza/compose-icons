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

public val LightGroup.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) {
            return _bugDroid!!
        }
        _bugDroid = Builder(name = "BugDroid", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.1f, 84.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 146.1f, 84.0f)
                close()
                moveTo(100.1f, 94.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 100.1f, 94.0f)
                close()
                moveTo(214.0f, 108.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, -172.0f, 0.0f)
                lineTo(42.0f, 108.0f)
                arcTo(85.9f, 85.9f, 0.0f, false, true, 67.5f, 46.9f)
                lineTo(51.9f, 32.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.2f, -8.8f)
                lineTo(76.7f, 39.1f)
                arcToRelative(85.5f, 85.5f, 0.0f, false, true, 102.6f, 0.0f)
                lineToRelative(16.6f, -15.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.2f, 8.8f)
                lineTo(188.5f, 46.9f)
                arcTo(85.9f, 85.9f, 0.0f, false, true, 214.0f, 108.0f)
                close()
                moveTo(54.0f, 108.0f)
                verticalLineToRelative(14.0f)
                lineTo(202.0f, 122.0f)
                lineTo(202.0f, 108.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -148.0f, 0.0f)
                close()
                moveTo(202.0f, 148.0f)
                lineTo(202.0f, 134.0f)
                lineTo(54.0f, 134.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 148.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
