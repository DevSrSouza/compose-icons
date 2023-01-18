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

public val LightGroup.Nut: ImageVector
    get() {
        if (_nut != null) {
            return _nut!!
        }
        _nut = Builder(name = "Nut", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.9f, 68.5f)
                lineTo(134.9f, 21.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -13.8f, 0.0f)
                lineToRelative(-84.0f, 47.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 30.0f, 80.7f)
                verticalLineToRelative(94.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.1f, 12.2f)
                lineToRelative(84.0f, 47.5f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 13.8f, 0.0f)
                lineToRelative(84.0f, -47.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.1f, -12.2f)
                lineTo(226.0f, 80.7f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 218.9f, 68.5f)
                close()
                moveTo(214.0f, 175.3f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -1.0f, 1.8f)
                lineToRelative(-84.0f, 47.5f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(43.0f, 177.1f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -1.0f, -1.8f)
                lineTo(42.0f, 80.7f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.0f, -1.8f)
                lineToRelative(84.0f, -47.5f)
                lineToRelative(1.0f, -0.2f)
                lineToRelative(1.0f, 0.2f)
                lineToRelative(84.0f, 47.5f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.0f, 1.8f)
                close()
                moveTo(128.0f, 86.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 128.0f, 86.0f)
                close()
                moveTo(128.0f, 158.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 30.0f, -30.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 128.0f, 158.0f)
                close()
            }
        }
        .build()
        return _nut!!
    }

private var _nut: ImageVector? = null
