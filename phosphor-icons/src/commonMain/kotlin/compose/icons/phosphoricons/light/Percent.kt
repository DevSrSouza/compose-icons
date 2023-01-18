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

public val LightGroup.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = Builder(name = "Percent", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.2f, 60.2f)
                lineToRelative(-144.0f, 144.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineToRelative(144.0f, -144.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                close()
                moveTo(52.0f, 100.0f)
                arcToRelative(33.8f, 33.8f, 0.0f, false, true, 0.0f, -48.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, true, 48.0f, 0.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -24.0f, 58.0f)
                arcTo(33.5f, 33.5f, 0.0f, false, true, 52.0f, 100.0f)
                close()
                moveTo(54.0f, 76.0f)
                arcTo(22.0f, 22.0f, 0.0f, true, false, 91.6f, 60.4f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, false, -31.2f, 0.0f)
                arcTo(22.2f, 22.2f, 0.0f, false, false, 54.0f, 76.0f)
                close()
                moveTo(214.0f, 180.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, -58.0f, -24.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, true, 48.0f, 0.0f)
                arcTo(33.3f, 33.3f, 0.0f, false, true, 214.0f, 180.0f)
                close()
                moveTo(202.0f, 180.0f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, false, -6.4f, -15.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, false, -31.2f, 0.0f)
                arcTo(22.1f, 22.1f, 0.0f, true, false, 202.0f, 180.0f)
                close()
            }
        }
        .build()
        return _percent!!
    }

private var _percent: ImageVector? = null
