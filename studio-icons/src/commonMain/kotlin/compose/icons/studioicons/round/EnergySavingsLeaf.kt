package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.EnergySavingsLeaf: ImageVector
    get() {
        if (_energySavingsLeaf != null) {
            return _energySavingsLeaf!!
        }
        _energySavingsLeaf = Builder(name = "EnergySavingsLeaf", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(-4.8f, 0.0f, -9.0f, 3.86f, -9.0f, 9.0f)
                curveToRelative(0.0f, 2.12f, 0.74f, 4.07f, 1.97f, 5.61f)
                lineToRelative(-1.68f, 1.68f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(1.68f, -1.68f)
                curveTo(7.93f, 20.26f, 9.88f, 21.0f, 12.0f, 21.0f)
                curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f)
                curveTo(20.12f, 16.61f, 21.0f, 14.3f, 21.0f, 12.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(15.83f, 12.26f)
                lineToRelative(-5.16f, 4.63f)
                curveToRelative(-0.16f, 0.15f, -0.41f, 0.14f, -0.56f, -0.01f)
                curveToRelative(-0.14f, -0.14f, -0.16f, -0.36f, -0.04f, -0.52f)
                lineToRelative(2.44f, -3.33f)
                lineToRelative(-4.05f, -0.4f)
                curveToRelative(-0.44f, -0.04f, -0.63f, -0.59f, -0.3f, -0.89f)
                lineToRelative(5.16f, -4.63f)
                curveToRelative(0.16f, -0.15f, 0.41f, -0.14f, 0.56f, 0.01f)
                curveToRelative(0.14f, 0.14f, 0.16f, 0.36f, 0.04f, 0.52f)
                lineToRelative(-2.44f, 3.33f)
                lineToRelative(4.05f, 0.4f)
                curveTo(15.98f, 11.41f, 16.16f, 11.96f, 15.83f, 12.26f)
                close()
            }
        }
        .build()
        return _energySavingsLeaf!!
    }

private var _energySavingsLeaf: ImageVector? = null
