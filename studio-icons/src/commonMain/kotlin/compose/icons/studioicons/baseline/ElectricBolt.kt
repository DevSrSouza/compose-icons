package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.ElectricBolt: ImageVector
    get() {
        if (_electricBolt != null) {
            return _electricBolt!!
        }
        _electricBolt = Builder(name = "ElectricBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.69f, 2.21f)
                lineTo(4.33f, 11.49f)
                curveToRelative(-0.64f, 0.58f, -0.28f, 1.65f, 0.58f, 1.73f)
                lineTo(13.0f, 14.0f)
                lineToRelative(-4.85f, 6.76f)
                curveToRelative(-0.22f, 0.31f, -0.19f, 0.74f, 0.08f, 1.01f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.31f, 1.08f, 0.02f)
                lineToRelative(10.36f, -9.28f)
                curveToRelative(0.64f, -0.58f, 0.28f, -1.65f, -0.58f, -1.73f)
                lineTo(11.0f, 10.0f)
                lineToRelative(4.85f, -6.76f)
                curveToRelative(0.22f, -0.31f, 0.19f, -0.74f, -0.08f, -1.01f)
                lineToRelative(0.0f, 0.0f)
                curveTo(15.47f, 1.93f, 15.0f, 1.92f, 14.69f, 2.21f)
                close()
            }
        }
        .build()
        return _electricBolt!!
    }

private var _electricBolt: ImageVector? = null
