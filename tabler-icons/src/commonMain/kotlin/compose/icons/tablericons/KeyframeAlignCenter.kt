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

public val TablerIcons.KeyframeAlignCenter: ImageVector
    get() {
        if (_keyframeAlignCenter != null) {
            return _keyframeAlignCenter!!
        }
        _keyframeAlignCenter = Builder(name = "KeyframeAlignCenter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                verticalLineToRelative(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.816f, 16.58f)
                curveToRelative(-0.207f, 0.267f, -0.504f, 0.42f, -0.816f, 0.42f)
                curveToRelative(-0.312f, 0.0f, -0.61f, -0.153f, -0.816f, -0.42f)
                lineToRelative(-2.908f, -3.748f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, true, 0.0f, -1.664f)
                lineToRelative(2.908f, -3.748f)
                curveToRelative(0.207f, -0.267f, 0.504f, -0.42f, 0.816f, -0.42f)
                curveToRelative(0.312f, 0.0f, 0.61f, 0.153f, 0.816f, 0.42f)
                lineToRelative(2.908f, 3.748f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, true, 0.0f, 1.664f)
                lineToRelative(-2.908f, 3.748f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                horizontalLineToRelative(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                horizontalLineToRelative(2.0f)
            }
        }
        .build()
        return _keyframeAlignCenter!!
    }

private var _keyframeAlignCenter: ImageVector? = null
