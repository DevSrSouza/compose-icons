package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.QueryStats: ImageVector
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
                curveToRelative(0.48f, -0.77f, 0.75f, -1.67f, 0.69f, -2.66f)
                curveToRelative(-0.13f, -2.15f, -1.84f, -3.97f, -3.97f, -4.2f)
                curveToRelative(-2.72f, -0.3f, -5.02f, 1.81f, -5.02f, 4.47f)
                curveToRelative(0.0f, 2.49f, 2.01f, 4.5f, 4.49f, 4.5f)
                curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f)
                lineToRelative(2.41f, 2.41f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f)
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
                lineToRelative(-3.08f, 5.01f)
                curveToRelative(-0.36f, 0.58f, -1.17f, 0.64f, -1.61f, 0.13f)
                lineToRelative(-2.12f, -2.47f)
                lineToRelative(-3.06f, 4.9f)
                curveToRelative(-0.31f, 0.49f, -0.97f, 0.62f, -1.44f, 0.28f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.42f, -0.31f, -0.54f, -0.89f, -0.26f, -1.34f)
                lineToRelative(3.78f, -6.05f)
                curveToRelative(0.36f, -0.57f, 1.17f, -0.63f, 1.61f, -0.12f)
                lineTo(9.0f, 12.5f)
                lineToRelative(3.18f, -5.17f)
                curveToRelative(0.38f, -0.62f, 1.28f, -0.64f, 1.68f, -0.03f)
                lineTo(15.72f, 10.08f)
                close()
                moveTo(18.31f, 10.58f)
                curveToRelative(-0.64f, -0.28f, -1.33f, -0.45f, -2.05f, -0.49f)
                lineTo(20.8f, 2.9f)
                curveToRelative(0.31f, -0.49f, 0.97f, -0.61f, 1.43f, -0.27f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.43f, 0.31f, 0.54f, 0.9f, 0.26f, 1.34f)
                lineTo(18.31f, 10.58f)
                close()
            }
        }
        .build()
        return _queryStats!!
    }

private var _queryStats: ImageVector? = null
