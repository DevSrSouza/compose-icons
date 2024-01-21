package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandOnedrive: ImageVector
    get() {
        if (_brandOnedrive != null) {
            return _brandOnedrive!!
        }
        _brandOnedrive = Builder(name = "BrandOnedrive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.456f, 10.45f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, false, -12.0f, -2.151f)
                arcToRelative(4.857f, 4.857f, 0.0f, false, false, -4.44f, 5.241f)
                arcToRelative(4.856f, 4.856f, 0.0f, false, false, 5.236f, 4.444f)
                horizontalLineToRelative(10.751f)
                arcToRelative(3.771f, 3.771f, 0.0f, false, false, 3.99f, -3.54f)
                arcToRelative(3.772f, 3.772f, 0.0f, false, false, -3.538f, -3.992f)
                close()
            }
        }
        .build()
        return _brandOnedrive!!
    }

private var _brandOnedrive: ImageVector? = null
