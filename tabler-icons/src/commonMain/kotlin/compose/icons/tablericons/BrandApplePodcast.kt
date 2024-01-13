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

public val TablerIcons.BrandApplePodcast: ImageVector
    get() {
        if (_brandApplePodcast != null) {
            return _brandApplePodcast!!
        }
        _brandApplePodcast = Builder(name = "BrandApplePodcast", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.364f, 18.364f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -12.728f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.766f, 22.0f)
                horizontalLineToRelative(0.468f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.985f, -1.752f)
                lineToRelative(0.5f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.985f, -2.248f)
                horizontalLineToRelative(-1.468f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.985f, 2.248f)
                lineToRelative(0.5f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.985f, 1.752f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
            }
        }
        .build()
        return _brandApplePodcast!!
    }

private var _brandApplePodcast: ImageVector? = null
