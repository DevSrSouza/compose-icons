package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.5f, 5.7f)
                curveToRelative(13.9f, -5.0f, 29.1f, -5.0f, 43.1f, 0.0f)
                lineToRelative(192.0f, 68.6f)
                curveTo(495.0f, 83.4f, 512.0f, 107.5f, 512.0f, 134.6f)
                lineTo(512.0f, 377.4f)
                curveToRelative(0.0f, 27.0f, -17.0f, 51.2f, -42.5f, 60.3f)
                lineToRelative(-192.0f, 68.6f)
                curveToRelative(-13.9f, 5.0f, -29.1f, 5.0f, -43.1f, 0.0f)
                lineToRelative(-192.0f, -68.6f)
                curveTo(17.0f, 428.6f, 0.0f, 404.5f, 0.0f, 377.4f)
                lineTo(0.0f, 134.6f)
                curveToRelative(0.0f, -27.0f, 17.0f, -51.2f, 42.5f, -60.3f)
                lineToRelative(192.0f, -68.6f)
                close()
                moveTo(256.0f, 66.0f)
                lineTo(82.3f, 128.0f)
                lineTo(256.0f, 190.0f)
                lineToRelative(173.7f, -62.0f)
                lineTo(256.0f, 66.0f)
                close()
                moveTo(288.0f, 434.6f)
                lineToRelative(160.0f, -57.1f)
                verticalLineToRelative(-188.0f)
                lineTo(288.0f, 246.6f)
                verticalLineToRelative(188.0f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
