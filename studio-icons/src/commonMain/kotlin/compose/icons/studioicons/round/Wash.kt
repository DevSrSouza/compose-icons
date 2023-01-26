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

public val RoundGroup.Wash: ImageVector
    get() {
        if (_wash != null) {
            return _wash!!
        }
        _wash = Builder(name = "Wash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.94f, 11.79f)
                curveTo(1.34f, 12.35f, 1.0f, 13.14f, 1.0f, 13.97f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                lineToRelative(13.68f, 0.0f)
                curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f)
                curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f)
                horizontalLineTo(12.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineToRelative(7.18f, 0.0f)
                curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f)
                curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f)
                horizontalLineTo(12.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineToRelative(8.18f, 0.0f)
                curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f)
                curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f)
                horizontalLineTo(12.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineToRelative(6.18f, 0.0f)
                curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f)
                curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f)
                horizontalLineTo(8.86f)
                lineToRelative(1.49f, -2.61f)
                curveToRelative(0.09f, -0.16f, 0.14f, -0.33f, 0.14f, -0.53f)
                curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f)
                lineTo(9.81f, 5.71f)
                curveTo(9.43f, 5.32f, 8.8f, 5.3f, 8.4f, 5.68f)
                lineTo(1.94f, 11.79f)
                close()
                moveTo(18.5f, 8.0f)
                curveTo(19.88f, 8.0f, 21.0f, 6.88f, 21.0f, 5.5f)
                curveToRelative(0.0f, -1.25f, -1.41f, -3.16f, -2.11f, -4.04f)
                curveToRelative(-0.2f, -0.25f, -0.57f, -0.25f, -0.77f, 0.0f)
                curveTo(17.41f, 2.34f, 16.0f, 4.25f, 16.0f, 5.5f)
                curveTo(16.0f, 6.88f, 17.12f, 8.0f, 18.5f, 8.0f)
                close()
                moveTo(13.5f, 9.0f)
                curveTo(14.33f, 9.0f, 15.0f, 8.33f, 15.0f, 7.5f)
                curveToRelative(0.0f, -0.56f, -0.67f, -1.49f, -1.11f, -2.04f)
                curveToRelative(-0.2f, -0.25f, -0.58f, -0.25f, -0.77f, 0.0f)
                curveTo(12.67f, 6.01f, 12.0f, 6.94f, 12.0f, 7.5f)
                curveTo(12.0f, 8.33f, 12.67f, 9.0f, 13.5f, 9.0f)
                close()
            }
        }
        .build()
        return _wash!!
    }

private var _wash: ImageVector? = null
