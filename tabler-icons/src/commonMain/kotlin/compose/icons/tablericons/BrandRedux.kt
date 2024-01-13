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

public val TablerIcons.BrandRedux: ImageVector
    get() {
        if (_brandRedux != null) {
            return _brandRedux!!
        }
        _brandRedux = Builder(name = "BrandRedux", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.54f, 7.0f)
                curveToRelative(-0.805f, -2.365f, -2.536f, -4.0f, -4.54f, -4.0f)
                curveToRelative(-2.774f, 0.0f, -5.023f, 2.632f, -5.023f, 6.496f)
                curveToRelative(0.0f, 1.956f, 1.582f, 4.727f, 2.512f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.711f, 11.979f)
                curveToRelative(-1.656f, 1.877f, -2.214f, 4.185f, -1.211f, 5.911f)
                curveToRelative(1.387f, 2.39f, 5.138f, 2.831f, 8.501f, 0.9f)
                curveToRelative(1.703f, -0.979f, 2.875f, -3.362f, 3.516f, -4.798f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.014f, 19.99f)
                curveToRelative(2.511f, 0.0f, 4.523f, -0.438f, 5.487f, -2.1f)
                curveToRelative(1.387f, -2.39f, -0.215f, -5.893f, -3.579f, -7.824f)
                curveToRelative(-1.702f, -0.979f, -4.357f, -1.235f, -5.927f, -1.07f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.493f, 9.862f)
                curveToRelative(0.48f, 0.276f, 1.095f, 0.112f, 1.372f, -0.366f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.367f, -1.365f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, -1.373f, 0.366f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.368f, 1.365f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 15.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 14.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
            }
        }
        .build()
        return _brandRedux!!
    }

private var _brandRedux: ImageVector? = null
