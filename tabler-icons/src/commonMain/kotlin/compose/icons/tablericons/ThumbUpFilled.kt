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

public val TablerIcons.ThumbUpFilled: ImageVector
    get() {
        if (_thumbUpFilled != null) {
            return _thumbUpFilled!!
        }
        _thumbUpFilled = Builder(name = "ThumbUpFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.98f, 2.65f)
                lineToRelative(0.015f, 0.174f)
                lineToRelative(0.005f, 0.176f)
                lineToRelative(-0.02f, 0.196f)
                lineToRelative(-1.006f, 5.032f)
                curveToRelative(-0.381f, 1.626f, -1.502f, 2.796f, -2.81f, 2.78f)
                lineToRelative(-0.164f, -0.008f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                lineToRelative(0.001f, -9.536f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.5f, -0.865f)
                arcToRelative(2.998f, 2.998f, 0.0f, false, false, 1.492f, -2.397f)
                lineToRelative(0.007f, -0.202f)
                verticalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _thumbUpFilled!!
    }

private var _thumbUpFilled: ImageVector? = null
