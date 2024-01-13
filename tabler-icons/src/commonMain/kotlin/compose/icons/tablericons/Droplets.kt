package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Droplets: ImageVector
    get() {
        if (_droplets != null) {
            return _droplets!!
        }
        _droplets = Builder(name = "Droplets", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.072f, 20.3f)
                arcToRelative(2.999f, 2.999f, 0.0f, false, false, 3.856f, 0.0f)
                arcToRelative(3.002f, 3.002f, 0.0f, false, false, 0.67f, -3.798f)
                lineToRelative(-2.095f, -3.227f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -1.005f, 0.0f)
                lineToRelative(-2.098f, 3.227f)
                arcToRelative(3.003f, 3.003f, 0.0f, false, false, 0.671f, 3.798f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.072f, 20.3f)
                arcToRelative(2.999f, 2.999f, 0.0f, false, false, 3.856f, 0.0f)
                arcToRelative(3.002f, 3.002f, 0.0f, false, false, 0.67f, -3.798f)
                lineToRelative(-2.095f, -3.227f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -1.005f, 0.0f)
                lineToRelative(-2.098f, 3.227f)
                arcToRelative(3.003f, 3.003f, 0.0f, false, false, 0.671f, 3.798f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.072f, 10.3f)
                arcToRelative(2.999f, 2.999f, 0.0f, false, false, 3.856f, 0.0f)
                arcToRelative(3.002f, 3.002f, 0.0f, false, false, 0.67f, -3.798f)
                lineToRelative(-2.095f, -3.227f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -1.005f, 0.0f)
                lineToRelative(-2.098f, 3.227f)
                arcToRelative(3.003f, 3.003f, 0.0f, false, false, 0.671f, 3.798f)
                close()
            }
        }
        .build()
        return _droplets!!
    }

private var _droplets: ImageVector? = null
