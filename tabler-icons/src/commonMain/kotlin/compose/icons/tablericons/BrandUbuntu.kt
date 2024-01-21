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

public val TablerIcons.BrandUbuntu: ImageVector
    get() {
        if (_brandUbuntu != null) {
            return _brandUbuntu!!
        }
        _brandUbuntu = Builder(name = "BrandUbuntu", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.723f, 7.41f)
                arcToRelative(7.992f, 7.992f, 0.0f, false, false, -3.74f, -2.162f)
                moveToRelative(-3.971f, 0.0f)
                arcToRelative(7.993f, 7.993f, 0.0f, false, false, -3.789f, 2.216f)
                moveToRelative(-1.881f, 3.215f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.342f, 2.32f)
                curveToRelative(0.0f, 0.738f, 0.1f, 1.453f, 0.287f, 2.132f)
                moveToRelative(1.96f, 3.428f)
                arcToRelative(7.993f, 7.993f, 0.0f, false, false, 3.759f, 2.19f)
                moveToRelative(4.0f, 0.0f)
                arcToRelative(7.993f, 7.993f, 0.0f, false, false, 3.747f, -2.186f)
                moveToRelative(1.962f, -3.43f)
                arcToRelative(8.008f, 8.008f, 0.0f, false, false, 0.287f, -2.131f)
                curveToRelative(0.0f, -0.764f, -0.107f, -1.503f, -0.307f, -2.203f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 17.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 17.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
            }
        }
        .build()
        return _brandUbuntu!!
    }

private var _brandUbuntu: ImageVector? = null
