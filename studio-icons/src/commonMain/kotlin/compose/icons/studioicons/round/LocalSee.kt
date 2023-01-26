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

public val RoundGroup.LocalSee: ImageVector
    get() {
        if (_localSee != null) {
            return _localSee!!
        }
        _localSee = Builder(name = "LocalSee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 14.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.23f, 0.0f, 2.25f, -0.9f, 2.46f, -2.07f)
                curveToRelative(-1.0f, -1.01f, -1.83f, -1.98f, -2.48f, -2.93f)
                curveTo(10.61f, 11.52f, 9.5f, 12.63f, 9.5f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.65f, 17.08f)
                curveToRelative(-0.37f, 0.32f, -0.92f, 0.32f, -1.3f, 0.0f)
                curveToRelative(-1.26f, -1.08f, -0.7f, -0.61f, -1.3f, -1.14f)
                curveToRelative(-0.83f, 1.74f, -2.73f, 2.87f, -4.85f, 2.5f)
                curveToRelative(-1.83f, -0.32f, -3.31f, -1.8f, -3.63f, -3.63f)
                curveToRelative(-0.42f, -2.44f, 1.13f, -4.58f, 3.31f, -5.14f)
                curveTo(10.3f, 8.45f, 10.0f, 7.28f, 10.0f, 6.15f)
                curveTo(10.0f, 5.4f, 10.1f, 4.68f, 10.28f, 4.0f)
                horizontalLineToRelative(-0.4f)
                curveToRelative(-0.56f, 0.0f, -1.1f, 0.24f, -1.48f, 0.65f)
                lineTo(7.17f, 6.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 6.0f, 2.0f, 6.9f, 2.0f, 8.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-6.03f)
                curveTo(20.59f, 15.46f, 19.35f, 16.48f, 18.65f, 17.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.34f, 14.42f)
                curveToRelative(0.37f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f)
                curveTo(22.22f, 11.25f, 24.0f, 8.5f, 24.0f, 6.15f)
                curveTo(24.0f, 2.42f, 21.15f, 0.0f, 18.0f, 0.0f)
                reflectiveCurveToRelative(-6.0f, 2.42f, -6.0f, 6.15f)
                curveTo(12.0f, 8.5f, 13.78f, 11.25f, 17.34f, 14.42f)
                close()
                moveTo(17.27f, 5.25f)
                lineTo(18.0f, 3.0f)
                lineToRelative(0.73f, 2.25f)
                horizontalLineTo(21.0f)
                lineToRelative(-1.85f, 1.47f)
                lineTo(19.85f, 9.0f)
                lineTo(18.0f, 7.59f)
                lineTo(16.15f, 9.0f)
                lineToRelative(0.7f, -2.28f)
                lineTo(15.0f, 5.25f)
                horizontalLineTo(17.27f)
                close()
            }
        }
        .build()
        return _localSee!!
    }

private var _localSee: ImageVector? = null
