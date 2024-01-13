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

public val TablerIcons.FingerprintOff: ImageVector
    get() {
        if (_fingerprintOff != null) {
            return _fingerprintOff!!
        }
        _fingerprintOff = Builder(name = "FingerprintOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9f, 7.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.1f, 5.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.8f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                curveToRelative(0.0f, -0.848f, 0.264f, -1.634f, 0.713f, -2.28f)
                moveToRelative(2.4f, -1.621f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.887f, 3.901f)
                lineToRelative(0.0f, 1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 2.5f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 1.8f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9f, 19.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -0.9f, -7.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.854f, -5.143f)
                moveToRelative(2.176f, -1.825f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.97f, 0.018f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _fingerprintOff!!
    }

private var _fingerprintOff: ImageVector? = null
