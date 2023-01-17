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

public val TablerIcons.BrandYoutubeKids: ImageVector
    get() {
        if (_brandYoutubeKids != null) {
            return _brandYoutubeKids!!
        }
        _brandYoutubeKids = Builder(name = "BrandYoutubeKids", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.782f, 17.03f)
                lineToRelative(-3.413f, 0.235f)
                lineToRelative(-0.023f, 0.002f)
                curveToRelative(-1.117f, 0.09f, -2.214f, 0.335f, -3.257f, 0.725f)
                lineToRelative(-2.197f, 0.794f)
                arcToRelative(3.597f, 3.597f, 0.0f, false, true, -2.876f, -0.189f)
                arcToRelative(3.342f, 3.342f, 0.0f, false, true, -1.732f, -2.211f)
                lineToRelative(-1.204f, -5.293f)
                arcToRelative(3.21f, 3.21f, 0.0f, false, true, 0.469f, -2.503f)
                arcToRelative(3.468f, 3.468f, 0.0f, false, true, 2.177f, -1.452f)
                lineToRelative(9.843f, -2.06f)
                curveToRelative(1.87f, -0.392f, 3.716f, 0.744f, 4.124f, 2.537f)
                lineToRelative(1.227f, 5.392f)
                arcToRelative(3.217f, 3.217f, 0.0f, false, true, -0.61f, 2.7f)
                arcToRelative(3.506f, 3.506f, 0.0f, false, true, -2.528f, 1.323f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                lineToRelative(0.972f, 4.0f)
                lineToRelative(4.028f, -3.0f)
                close()
            }
        }
        .build()
        return _brandYoutubeKids!!
    }

private var _brandYoutubeKids: ImageVector? = null
