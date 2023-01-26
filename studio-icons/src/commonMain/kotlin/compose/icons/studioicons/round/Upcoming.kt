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

public val RoundGroup.Upcoming: ImageVector
    get() {
        if (_upcoming != null) {
            return _upcoming!!
        }
        _upcoming = Builder(name = "Upcoming", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.45f, 6.55f)
                lineTo(20.45f, 6.55f)
                curveToRelative(-0.38f, -0.38f, -1.01f, -0.38f, -1.39f, 0.0f)
                lineTo(16.89f, 8.7f)
                curveToRelative(-0.39f, 0.38f, -0.39f, 1.01f, 0.0f, 1.39f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f)
                curveToRelative(0.62f, -0.63f, 1.52f, -1.54f, 2.15f, -2.17f)
                curveTo(20.83f, 7.55f, 20.83f, 6.93f, 20.45f, 6.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.02f, 3.0f)
                horizontalLineToRelative(-0.03f)
                curveTo(11.44f, 3.0f, 11.0f, 3.44f, 11.0f, 3.98f)
                verticalLineToRelative(3.03f)
                curveTo(11.0f, 7.56f, 11.44f, 8.0f, 11.98f, 8.0f)
                horizontalLineToRelative(0.03f)
                curveTo(12.56f, 8.0f, 13.0f, 7.56f, 13.0f, 7.02f)
                verticalLineTo(3.98f)
                curveTo(13.0f, 3.44f, 12.56f, 3.0f, 12.02f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1f, 10.11f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.38f, -0.38f, 0.38f, -1.01f, 0.0f, -1.39f)
                lineTo(4.96f, 6.54f)
                curveToRelative(-0.38f, -0.39f, -1.01f, -0.39f, -1.39f, 0.0f)
                lineTo(3.55f, 6.55f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.39f)
                curveToRelative(0.63f, 0.62f, 1.53f, 1.54f, 2.15f, 2.17f)
                curveTo(6.09f, 10.49f, 6.72f, 10.49f, 7.1f, 10.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.24f, 0.0f, -2.31f, -0.75f, -2.76f, -1.83f)
                curveTo(8.92f, 12.43f, 8.14f, 12.0f, 7.34f, 12.0f)
                lineTo(4.0f, 12.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                lineToRelative(0.0f, 5.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineToRelative(-3.34f, 0.0f)
                curveToRelative(-0.8f, 0.0f, -1.58f, 0.43f, -1.9f, 1.17f)
                curveTo(14.31f, 14.25f, 13.24f, 15.0f, 12.0f, 15.0f)
            }
        }
        .build()
        return _upcoming!!
    }

private var _upcoming: ImageVector? = null
