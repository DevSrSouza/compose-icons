package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Recycling: ImageVector
    get() {
        if (_recycling != null) {
            return _recycling!!
        }
        _recycling = Builder(name = "Recycling", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.77f, 7.15f)
                lineTo(7.2f, 4.78f)
                lineToRelative(1.03f, -1.71f)
                curveToRelative(0.39f, -0.65f, 1.33f, -0.65f, 1.72f, 0.0f)
                lineToRelative(1.48f, 2.46f)
                lineToRelative(-1.23f, 2.06f)
                lineTo(9.2f, 9.21f)
                lineTo(5.77f, 7.15f)
                close()
                moveTo(21.72f, 12.97f)
                lineToRelative(-1.6f, -2.66f)
                lineToRelative(-3.46f, 2.0f)
                lineTo(18.87f, 16.0f)
                horizontalLineTo(20.0f)
                curveToRelative(0.76f, 0.0f, 1.45f, -0.43f, 1.79f, -1.11f)
                curveTo(21.93f, 14.61f, 22.0f, 14.31f, 22.0f, 14.0f)
                curveTo(22.0f, 13.64f, 21.9f, 13.29f, 21.72f, 12.97f)
                close()
                moveTo(16.0f, 21.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.76f, 0.0f, 1.45f, -0.43f, 1.79f, -1.11f)
                lineTo(20.74f, 17.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(4.0f, 4.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(10.0f, 17.0f)
                horizontalLineTo(5.7f)
                lineToRelative(-0.84f, 1.41f)
                curveToRelative(-0.3f, 0.5f, -0.32f, 1.12f, -0.06f, 1.65f)
                lineToRelative(0.0f, 0.0f)
                curveTo(5.08f, 20.63f, 5.67f, 21.0f, 6.32f, 21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(6.12f, 14.35f)
                lineToRelative(1.73f, 1.04f)
                lineTo(6.48f, 9.9f)
                lineTo(1.0f, 11.27f)
                lineToRelative(1.7f, 1.02f)
                lineToRelative(-0.41f, 0.69f)
                curveToRelative(-0.35f, 0.59f, -0.38f, 1.31f, -0.07f, 1.92f)
                lineToRelative(1.63f, 3.26f)
                lineTo(6.12f, 14.35f)
                close()
                moveTo(17.02f, 5.14f)
                lineToRelative(-1.3f, -2.17f)
                curveTo(15.35f, 2.37f, 14.7f, 2.0f, 14.0f, 2.0f)
                horizontalLineToRelative(-3.53f)
                lineToRelative(3.12f, 5.2f)
                lineToRelative(-1.72f, 1.03f)
                lineToRelative(5.49f, 1.37f)
                lineToRelative(1.37f, -5.49f)
                lineTo(17.02f, 5.14f)
                close()
            }
        }
        .build()
        return _recycling!!
    }

private var _recycling: ImageVector? = null
