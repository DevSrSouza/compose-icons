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

public val TablerIcons.BucketDroplet: ImageVector
    get() {
        if (_bucketDroplet != null) {
            return _bucketDroplet!!
        }
        _bucketDroplet = Builder(name = "BucketDroplet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 16.0f)
                lineToRelative(1.465f, 1.638f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.015f, 0.099f)
                lineToRelative(1.55f, -1.737f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.737f, 9.737f)
                curveToRelative(2.299f, -2.3f, 3.23f, -5.095f, 2.081f, -6.245f)
                curveToRelative(-1.15f, -1.15f, -3.945f, -0.217f, -6.244f, 2.082f)
                curveToRelative(-2.3f, 2.299f, -3.231f, 5.095f, -2.082f, 6.244f)
                curveToRelative(1.15f, 1.15f, 3.946f, 0.218f, 6.245f, -2.081f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.492f, 11.818f)
                curveToRelative(0.362f, 0.362f, 0.768f, 0.676f, 1.208f, 0.934f)
                lineToRelative(6.895f, 4.047f)
                curveToRelative(1.078f, 0.557f, 2.255f, -0.075f, 3.692f, -1.512f)
                curveToRelative(1.437f, -1.437f, 2.07f, -2.614f, 1.512f, -3.692f)
                curveToRelative(-0.372f, -0.718f, -1.72f, -3.017f, -4.047f, -6.895f)
                arcToRelative(6.015f, 6.015f, 0.0f, false, false, -0.934f, -1.208f)
            }
        }
        .build()
        return _bucketDroplet!!
    }

private var _bucketDroplet: ImageVector? = null
