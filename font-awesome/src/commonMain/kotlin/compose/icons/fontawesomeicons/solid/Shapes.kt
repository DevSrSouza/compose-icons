package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = Builder(name = "Shapes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 256.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, false, 256.0f, 384.0f)
                arcTo(128.0f, 128.0f, 0.0f, false, false, 128.0f, 256.0f)
                close()
                moveTo(507.0f, 201.14f)
                lineTo(400.07f, 18.29f)
                arcToRelative(37.26f, 37.26f, 0.0f, false, false, -64.14f, 0.0f)
                lineTo(229.0f, 201.14f)
                curveTo(214.76f, 225.52f, 232.58f, 256.0f, 261.09f, 256.0f)
                lineTo(474.91f, 256.0f)
                curveTo(503.42f, 256.0f, 521.24f, 225.52f, 507.0f, 201.14f)
                close()
                moveTo(480.0f, 288.0f)
                lineTo(320.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                lineTo(288.0f, 480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(480.0f, 512.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(512.0f, 320.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 480.0f, 288.0f)
                close()
            }
        }
        .build()
        return _shapes!!
    }

private var _shapes: ImageVector? = null
