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

public val RoundGroup.PublishedWithChanges: ImageVector
    get() {
        if (_publishedWithChanges != null) {
            return _publishedWithChanges!!
        }
        _publishedWithChanges = Builder(name = "PublishedWithChanges", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.95f, 10.23f)
                lineToRelative(-5.66f, 5.66f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.95f, -4.95f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(17.34f, 9.21f, 17.34f, 9.84f, 16.95f, 10.23f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -2.33f, 1.02f, -4.42f, 2.62f, -5.88f)
                lineToRelative(1.53f, 1.53f)
                curveTo(8.46f, 7.96f, 9.0f, 7.74f, 9.0f, 7.29f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(4.21f)
                curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineTo(5.2f, 4.7f)
                curveTo(3.24f, 6.52f, 2.0f, 9.11f, 2.0f, 12.0f)
                curveToRelative(0.0f, 4.75f, 3.32f, 8.73f, 7.76f, 9.75f)
                curveToRelative(0.63f, 0.14f, 1.24f, -0.33f, 1.24f, -0.98f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.47f, -0.33f, -0.87f, -0.79f, -0.98f)
                curveTo(6.66f, 18.98f, 4.0f, 15.8f, 4.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -4.75f, -3.32f, -8.73f, -7.76f, -9.75f)
                curveTo(13.61f, 2.11f, 13.0f, 2.58f, 13.0f, 3.23f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.47f, 0.33f, 0.87f, 0.79f, 0.98f)
                curveTo(17.34f, 5.02f, 20.0f, 8.2f, 20.0f, 12.0f)
                curveToRelative(0.0f, 2.33f, -1.02f, 4.42f, -2.62f, 5.88f)
                lineToRelative(-1.53f, -1.53f)
                curveTo(15.54f, 16.04f, 15.0f, 16.26f, 15.0f, 16.71f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4.29f)
                curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineTo(18.8f, 19.3f)
                curveTo(20.76f, 17.48f, 22.0f, 14.89f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _publishedWithChanges!!
    }

private var _publishedWithChanges: ImageVector? = null
