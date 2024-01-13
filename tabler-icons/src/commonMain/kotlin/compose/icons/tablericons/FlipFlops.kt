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

public val TablerIcons.FlipFlops: ImageVector
    get() {
        if (_flipFlops != null) {
            return _flipFlops!!
        }
        _flipFlops = Builder(name = "FlipFlops", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.682f, 4.0f, 3.758f)
                curveToRelative(0.0f, 0.078f, 0.0f, 0.156f, -0.008f, 0.234f)
                lineToRelative(-0.6f, 9.014f)
                curveToRelative(-0.11f, 1.683f, -1.596f, 3.0f, -3.392f, 3.0f)
                reflectiveCurveToRelative(-3.28f, -1.311f, -3.392f, -3.0f)
                lineToRelative(-0.6f, -9.014f)
                curveToRelative(-0.138f, -2.071f, 1.538f, -3.855f, 3.743f, -3.985f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, true, 0.25f, -0.007f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 14.0f)
                curveToRelative(1.0f, -3.333f, 2.167f, -5.0f, 3.5f, -5.0f)
                curveToRelative(1.333f, 0.0f, 2.5f, 1.667f, 3.5f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 16.0f)
                verticalLineToRelative(1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.682f, 4.0f, 3.758f)
                curveToRelative(0.0f, 0.078f, 0.0f, 0.156f, -0.008f, 0.234f)
                lineToRelative(-0.6f, 9.014f)
                curveToRelative(-0.11f, 1.683f, -1.596f, 3.0f, -3.392f, 3.0f)
                reflectiveCurveToRelative(-3.28f, -1.311f, -3.392f, -3.0f)
                lineToRelative(-0.6f, -9.014f)
                curveToRelative(-0.138f, -2.071f, 1.538f, -3.855f, 3.742f, -3.985f)
                curveToRelative(0.084f, 0.0f, 0.167f, -0.007f, 0.25f, -0.007f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 14.0f)
                curveToRelative(1.0f, -3.333f, 2.167f, -5.0f, 3.5f, -5.0f)
                curveToRelative(1.333f, 0.0f, 2.5f, 1.667f, 3.5f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 16.0f)
                verticalLineToRelative(1.0f)
            }
        }
        .build()
        return _flipFlops!!
    }

private var _flipFlops: ImageVector? = null
