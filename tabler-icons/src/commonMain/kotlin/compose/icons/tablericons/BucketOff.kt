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

public val TablerIcons.BucketOff: ImageVector
    get() {
        if (_bucketOff != null) {
            return _bucketOff!!
        }
        _bucketOff = Builder(name = "BucketOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.029f, 5.036f)
                curveToRelative(-0.655f, 0.58f, -1.029f, 1.25f, -1.029f, 1.964f)
                curveToRelative(0.0f, 2.033f, 3.033f, 3.712f, 6.96f, 3.967f)
                moveToRelative(3.788f, -0.21f)
                curveToRelative(3.064f, -0.559f, 5.252f, -2.029f, 5.252f, -3.757f)
                curveToRelative(0.0f, -2.21f, -3.582f, -4.0f, -8.0f, -4.0f)
                curveToRelative(-1.605f, 0.0f, -3.1f, 0.236f, -4.352f, 0.643f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                curveToRelative(0.0f, 0.664f, 0.088f, 1.324f, 0.263f, 1.965f)
                lineToRelative(2.737f, 10.035f)
                curveToRelative(0.5f, 1.5f, 2.239f, 2.0f, 5.0f, 2.0f)
                reflectiveCurveToRelative(4.5f, -0.5f, 5.0f, -2.0f)
                curveToRelative(0.1f, -0.3f, 0.252f, -0.812f, 0.457f, -1.535f)
                moveToRelative(0.862f, -3.146f)
                curveToRelative(0.262f, -0.975f, 0.735f, -2.76f, 1.418f, -5.354f)
                arcToRelative(7.45f, 7.45f, 0.0f, false, false, 0.263f, -1.965f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _bucketOff!!
    }

private var _bucketOff: ImageVector? = null
