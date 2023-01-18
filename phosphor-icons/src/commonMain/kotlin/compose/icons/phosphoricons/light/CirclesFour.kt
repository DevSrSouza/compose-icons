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

public val LightGroup.CirclesFour: ImageVector
    get() {
        if (_circlesFour != null) {
            return _circlesFour!!
        }
        _circlesFour = Builder(name = "CirclesFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 34.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 76.0f, 34.0f)
                close()
                moveTo(76.0f, 106.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 30.0f, -30.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 76.0f, 106.0f)
                close()
                moveTo(180.0f, 118.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, -42.0f, -42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 180.0f, 118.0f)
                close()
                moveTo(180.0f, 46.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, -30.0f, 30.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 180.0f, 46.0f)
                close()
                moveTo(76.0f, 138.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 76.0f, 138.0f)
                close()
                moveTo(76.0f, 210.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 30.0f, -30.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 76.0f, 210.0f)
                close()
                moveTo(180.0f, 138.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 180.0f, 138.0f)
                close()
                moveTo(180.0f, 210.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 30.0f, -30.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 180.0f, 210.0f)
                close()
            }
        }
        .build()
        return _circlesFour!!
    }

private var _circlesFour: ImageVector? = null
