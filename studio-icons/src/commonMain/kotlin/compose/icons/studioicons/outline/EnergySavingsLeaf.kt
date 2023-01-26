package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.EnergySavingsLeaf: ImageVector
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
                curveTo(12.0f, 3.0f, 12.0f, 3.0f, 12.0f, 3.0f)
                curveToRelative(-4.8f, 0.0f, -9.0f, 3.86f, -9.0f, 9.0f)
                curveToRelative(0.0f, 2.12f, 0.74f, 4.07f, 1.97f, 5.61f)
                lineTo(3.0f, 19.59f)
                lineTo(4.41f, 21.0f)
                lineToRelative(1.97f, -1.97f)
                curveTo(7.93f, 20.26f, 9.88f, 21.0f, 12.0f, 21.0f)
                curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f)
                curveTo(20.12f, 16.61f, 21.0f, 14.3f, 21.0f, 12.0f)
                lineToRelative(0.0f, -9.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, 1.87f, -0.73f, 3.63f, -2.05f, 4.95f)
                curveTo(15.63f, 18.27f, 13.87f, 19.0f, 12.0f, 19.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                curveToRelative(0.0f, -1.9f, 0.74f, -3.68f, 2.1f, -4.99f)
                curveTo(8.42f, 5.71f, 10.16f, 5.0f, 12.0f, 5.0f)
                lineToRelative(7.0f, 0.0f)
                lineTo(19.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.46f, 12.63f)
                lineToRelative(4.05f, 0.4f)
                lineToRelative(-2.44f, 3.33f)
                curveToRelative(-0.11f, 0.16f, -0.1f, 0.38f, 0.04f, 0.52f)
                curveToRelative(0.15f, 0.15f, 0.4f, 0.16f, 0.56f, 0.01f)
                lineToRelative(5.16f, -4.63f)
                curveToRelative(0.33f, -0.3f, 0.15f, -0.85f, -0.3f, -0.89f)
                lineToRelative(-4.05f, -0.4f)
                lineToRelative(2.44f, -3.33f)
                curveToRelative(0.11f, -0.16f, 0.1f, -0.38f, -0.04f, -0.52f)
                curveToRelative(-0.15f, -0.15f, -0.4f, -0.16f, -0.56f, -0.01f)
                lineToRelative(-5.16f, 4.63f)
                curveTo(7.84f, 12.04f, 8.02f, 12.59f, 8.46f, 12.63f)
                close()
            }
        }
        .build()
        return _energySavingsLeaf!!
    }

private var _energySavingsLeaf: ImageVector? = null
