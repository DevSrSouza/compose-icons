package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.EnergySavingsLeaf: ImageVector
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
                lineTo(3.0f, 19.59f)
                lineTo(4.41f, 21.0f)
                lineToRelative(1.97f, -1.97f)
                curveTo(7.93f, 20.26f, 9.88f, 21.0f, 12.0f, 21.0f)
                curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f)
                curveTo(20.12f, 16.61f, 21.0f, 14.3f, 21.0f, 12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(10.5f, 17.0f)
                lineTo(10.0f, 16.5f)
                lineToRelative(2.5f, -3.5f)
                lineToRelative(-5.0f, -0.5f)
                lineToRelative(6.0f, -5.5f)
                lineTo(14.0f, 7.5f)
                lineTo(11.5f, 11.0f)
                lineToRelative(5.0f, 0.5f)
                lineTo(10.5f, 17.0f)
                close()
            }
        }
        .build()
        return _energySavingsLeaf!!
    }

private var _energySavingsLeaf: ImageVector? = null
