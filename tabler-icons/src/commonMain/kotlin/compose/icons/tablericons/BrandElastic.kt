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

public val TablerIcons.BrandElastic: ImageVector
    get() {
        if (_brandElastic != null) {
            return _brandElastic!!
        }
        _brandElastic = Builder(name = "BrandElastic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                curveToRelative(0.0f, 0.712f, -0.232f, 1.387f, -0.5f, 2.0f)
                curveToRelative(1.894f, 0.042f, 3.5f, 1.595f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.869f, -1.656f, 3.4f, -3.5f, 3.5f)
                curveToRelative(0.333f, 0.625f, 0.5f, 1.125f, 0.5f, 1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                curveToRelative(-0.787f, 0.0f, -1.542f, -0.432f, -2.0f, -1.0f)
                curveToRelative(-0.786f, 1.73f, -2.476f, 3.0f, -4.5f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -4.583f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.11f, -6.992f)
                lineToRelative(0.195f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.0f, -4.0f)
                curveToRelative(0.787f, 0.0f, 1.542f, 0.432f, 2.0f, 1.0f)
                curveToRelative(0.786f, -1.73f, 2.476f, -3.0f, 4.5f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 9.0f)
                lineToRelative(-3.0f, -1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 5.0f)
                lineToRelative(-1.0f, 4.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(5.0f, 2.0f)
                lineToRelative(4.0f, -4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.499f, 16.0f)
                lineToRelative(-3.0f, -0.5f)
                lineToRelative(-1.0f, -2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 19.0f)
                lineToRelative(1.0f, -3.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.417f, 15.0f)
                lineToRelative(4.083f, -4.0f)
            }
        }
        .build()
        return _brandElastic!!
    }

private var _brandElastic: ImageVector? = null
