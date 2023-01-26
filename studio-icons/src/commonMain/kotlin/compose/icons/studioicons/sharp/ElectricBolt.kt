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

public val SharpGroup.ElectricBolt: ImageVector
    get() {
        if (_electricBolt != null) {
            return _electricBolt!!
        }
        _electricBolt = Builder(name = "ElectricBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                lineToRelative(-12.5f, 11.0f)
                lineToRelative(10.5f, 1.0f)
                lineToRelative(-5.0f, 7.0f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(12.5f, -11.0f)
                lineToRelative(-10.5f, -1.0f)
                lineToRelative(5.0f, -7.0f)
                close()
            }
        }
        .build()
        return _electricBolt!!
    }

private var _electricBolt: ImageVector? = null
