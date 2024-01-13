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

public val TablerIcons.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.555f, 3.843f)
                lineToRelative(3.602f, 3.602f)
                arcToRelative(2.877f, 2.877f, 0.0f, false, true, 0.0f, 4.069f)
                lineToRelative(-2.643f, 2.643f)
                arcToRelative(2.877f, 2.877f, 0.0f, false, true, -4.069f, 0.0f)
                lineToRelative(-0.301f, -0.301f)
                lineToRelative(-6.558f, 6.558f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.239f, 0.578f)
                lineToRelative(-0.175f, 0.008f)
                horizontalLineToRelative(-1.172f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-1.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.467f, -1.284f)
                lineToRelative(0.119f, -0.13f)
                lineToRelative(0.414f, -0.414f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(2.144f, -2.144f)
                lineToRelative(-0.301f, -0.301f)
                arcToRelative(2.877f, 2.877f, 0.0f, false, true, 0.0f, -4.069f)
                lineToRelative(2.643f, -2.643f)
                arcToRelative(2.877f, 2.877f, 0.0f, false, true, 4.069f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                horizontalLineToRelative(0.01f)
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
