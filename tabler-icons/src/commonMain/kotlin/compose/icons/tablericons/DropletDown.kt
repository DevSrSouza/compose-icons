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

public val TablerIcons.DropletDown: ImageVector
    get() {
        if (_dropletDown != null) {
            return _dropletDown!!
        }
        _dropletDown = Builder(name = "DropletDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.602f, 12.003f)
                arcToRelative(6.66f, 6.66f, 0.0f, false, false, -0.538f, -1.126f)
                lineToRelative(-4.89f, -7.26f)
                curveToRelative(-0.42f, -0.625f, -1.287f, -0.803f, -1.936f, -0.397f)
                arcToRelative(1.376f, 1.376f, 0.0f, false, false, -0.41f, 0.397f)
                lineToRelative(-4.893f, 7.26f)
                curveToRelative(-1.695f, 2.838f, -1.035f, 6.441f, 1.567f, 8.546f)
                arcToRelative(7.159f, 7.159f, 0.0f, false, false, 4.972f, 1.564f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                verticalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-3.0f, -3.0f)
            }
        }
        .build()
        return _dropletDown!!
    }

private var _dropletDown: ImageVector? = null
