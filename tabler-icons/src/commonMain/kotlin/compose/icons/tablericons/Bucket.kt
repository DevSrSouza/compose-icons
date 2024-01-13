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

public val TablerIcons.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = Builder(name = "Bucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                moveToRelative(-8.0f, 0.0f)
                arcToRelative(8.0f, 4.0f, 0.0f, true, false, 16.0f, 0.0f)
                arcToRelative(8.0f, 4.0f, 0.0f, true, false, -16.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                curveToRelative(0.0f, 0.664f, 0.088f, 1.324f, 0.263f, 1.965f)
                lineToRelative(2.737f, 10.035f)
                curveToRelative(0.5f, 1.5f, 2.239f, 2.0f, 5.0f, 2.0f)
                reflectiveCurveToRelative(4.5f, -0.5f, 5.0f, -2.0f)
                curveToRelative(0.333f, -1.0f, 1.246f, -4.345f, 2.737f, -10.035f)
                arcToRelative(7.45f, 7.45f, 0.0f, false, false, 0.263f, -1.965f)
            }
        }
        .build()
        return _bucket!!
    }

private var _bucket: ImageVector? = null
