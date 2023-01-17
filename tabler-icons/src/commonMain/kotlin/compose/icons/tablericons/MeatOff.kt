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

public val TablerIcons.MeatOff: ImageVector
    get() {
        if (_meatOff != null) {
            return _meatOff!!
        }
        _meatOff = Builder(name = "MeatOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.62f, 8.382f)
                lineToRelative(1.966f, -1.967f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.414f, -1.415f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -1.413f, 3.414f)
                lineToRelative(-1.82f, 1.821f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.904f, 18.596f)
                curveToRelative(2.733f, 2.734f, 5.9f, 4.0f, 7.07f, 2.829f)
                curveToRelative(1.172f, -1.172f, -0.094f, -4.338f, -2.828f, -7.071f)
                curveToRelative(-2.733f, -2.734f, -5.9f, -4.0f, -7.07f, -2.829f)
                curveToRelative(-1.172f, 1.172f, 0.094f, 4.338f, 2.828f, 7.071f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 16.0f)
                lineToRelative(1.0f, 1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.975f, 21.425f)
                curveToRelative(1.582f, -1.582f, 2.679f, -3.407f, 3.242f, -5.2f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.6f, 12.6f)
                curveToRelative(-0.16f, -1.238f, -0.653f, -2.345f, -1.504f, -3.195f)
                curveToRelative(-0.85f, -0.85f, -1.955f, -1.344f, -3.192f, -1.503f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.274f, 8.284f)
                curveToRelative(-1.792f, 0.563f, -3.616f, 1.66f, -5.198f, 3.242f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _meatOff!!
    }

private var _meatOff: ImageVector? = null
