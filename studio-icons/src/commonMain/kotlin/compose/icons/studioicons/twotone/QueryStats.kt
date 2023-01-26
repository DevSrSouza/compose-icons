package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.QueryStats: ImageVector
    get() {
        if (_queryStats != null) {
            return _queryStats!!
        }
        _queryStats = Builder(name = "QueryStats", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.88f, 18.47f)
                curveToRelative(0.44f, -0.7f, 0.7f, -1.51f, 0.7f, -2.39f)
                curveToRelative(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.01f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.01f, 4.5f, 4.49f, 4.5f)
                curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f)
                lineTo(21.58f, 23.0f)
                lineTo(23.0f, 21.58f)
                lineTo(19.88f, 18.47f)
                close()
                moveTo(16.08f, 18.58f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveTo(18.58f, 17.46f, 17.46f, 18.58f, 16.08f, 18.58f)
                close()
                moveTo(15.72f, 10.08f)
                curveToRelative(-0.74f, 0.02f, -1.45f, 0.18f, -2.1f, 0.45f)
                lineToRelative(-0.55f, -0.83f)
                lineToRelative(-3.8f, 6.18f)
                lineToRelative(-3.01f, -3.52f)
                lineToRelative(-3.63f, 5.81f)
                lineTo(1.0f, 17.0f)
                lineToRelative(5.0f, -8.0f)
                lineToRelative(3.0f, 3.5f)
                lineTo(13.0f, 6.0f)
                curveTo(13.0f, 6.0f, 15.72f, 10.08f, 15.72f, 10.08f)
                close()
                moveTo(18.31f, 10.58f)
                curveToRelative(-0.64f, -0.28f, -1.33f, -0.45f, -2.05f, -0.49f)
                curveToRelative(0.0f, 0.0f, 5.12f, -8.09f, 5.12f, -8.09f)
                lineTo(23.0f, 3.18f)
                lineTo(18.31f, 10.58f)
                close()
            }
        }
        .build()
        return _queryStats!!
    }

private var _queryStats: ImageVector? = null
