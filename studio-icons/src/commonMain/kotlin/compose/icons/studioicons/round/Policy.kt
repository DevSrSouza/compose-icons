package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Policy: ImageVector
    get() {
        if (_policy != null) {
            return _policy!!
        }
        _policy = Builder(name = "Policy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.3f)
                curveToRelative(0.0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f)
                lineToRelative(-7.0f, -3.11f)
                curveToRelative(-0.52f, -0.23f, -1.11f, -0.23f, -1.62f, 0.0f)
                lineToRelative(-7.0f, 3.11f)
                curveTo(3.47f, 4.79f, 3.0f, 5.51f, 3.0f, 6.3f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f)
                curveToRelative(2.3f, -0.56f, 4.33f, -1.9f, 5.88f, -3.71f)
                lineToRelative(-3.12f, -3.12f)
                curveToRelative(-1.94f, 1.29f, -4.58f, 1.07f, -6.29f, -0.64f)
                curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0.0f, -7.07f)
                curveToRelative(1.95f, -1.95f, 5.12f, -1.95f, 7.07f, 0.0f)
                curveToRelative(1.71f, 1.71f, 1.92f, 4.35f, 0.64f, 6.29f)
                lineToRelative(2.9f, 2.9f)
                curveTo(20.29f, 15.69f, 21.0f, 13.38f, 21.0f, 11.0f)
                verticalLineTo(6.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
        .build()
        return _policy!!
    }

private var _policy: ImageVector? = null
