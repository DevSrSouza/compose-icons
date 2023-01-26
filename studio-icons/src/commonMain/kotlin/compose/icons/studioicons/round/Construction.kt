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

public val RoundGroup.Construction: ImageVector
    get() {
        if (_construction != null) {
            return _construction!!
        }
        _construction = Builder(name = "Construction", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.99f, 17.99f)
                lineToRelative(-4.94f, -4.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(4.94f, 4.94f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f)
                curveTo(21.57f, 19.52f, 21.57f, 18.57f, 20.99f, 17.99f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.65f, 10.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.58f, -0.16f, -1.12f, -0.41f, -1.6f)
                lineToRelative(-2.7f, 2.7f)
                lineToRelative(-1.49f, -1.49f)
                lineToRelative(2.7f, -2.7f)
                curveTo(18.77f, 3.16f, 18.23f, 3.0f, 17.65f, 3.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 0.41f, 0.08f, 0.8f, 0.21f, 1.16f)
                lineToRelative(-1.85f, 1.85f)
                lineToRelative(-1.78f, -1.78f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f)
                lineTo(5.08f, 6.32f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.71f, 0.71f)
                horizontalLineTo(3.25f)
                curveToRelative(-0.19f, 0.0f, -0.37f, 0.07f, -0.5f, 0.21f)
                curveToRelative(-0.28f, 0.28f, -0.28f, 0.72f, 0.0f, 1.0f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0.28f, 0.28f, 0.72f, 0.28f, 1.0f, 0.0f)
                curveToRelative(0.13f, -0.13f, 0.21f, -0.31f, 0.21f, -0.5f)
                verticalLineTo(9.15f)
                lineTo(7.2f, 9.85f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(1.78f, 1.78f)
                lineToRelative(-6.35f, 6.35f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f)
                lineTo(16.48f, 9.79f)
                curveTo(16.85f, 9.92f, 17.24f, 10.0f, 17.65f, 10.0f)
                close()
            }
        }
        .build()
        return _construction!!
    }

private var _construction: ImageVector? = null
