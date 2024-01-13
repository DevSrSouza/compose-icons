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

public val TablerIcons.DropletOff: ImageVector
    get() {
        if (_dropletOff != null) {
            return _dropletOff!!
        }
        _dropletOff = Builder(name = "DropletOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.963f, 14.938f)
                arcToRelative(6.54f, 6.54f, 0.0f, false, false, -0.899f, -4.06f)
                lineToRelative(-4.89f, -7.26f)
                curveToRelative(-0.42f, -0.626f, -1.287f, -0.804f, -1.936f, -0.398f)
                arcToRelative(1.376f, 1.376f, 0.0f, false, false, -0.41f, 0.397f)
                lineToRelative(-1.282f, 1.9f)
                moveToRelative(-1.625f, 2.415f)
                lineToRelative(-1.986f, 2.946f)
                curveToRelative(-1.695f, 2.837f, -1.035f, 6.44f, 1.567f, 8.545f)
                curveToRelative(2.602f, 2.105f, 6.395f, 2.105f, 8.996f, 0.0f)
                arcToRelative(6.83f, 6.83f, 0.0f, false, false, 1.376f, -1.499f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _dropletOff!!
    }

private var _dropletOff: ImageVector? = null
