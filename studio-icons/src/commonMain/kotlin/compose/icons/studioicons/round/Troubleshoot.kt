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

public val RoundGroup.Troubleshoot: ImageVector
    get() {
        if (_troubleshoot != null) {
            return _troubleshoot!!
        }
        _troubleshoot = Builder(name = "Troubleshoot", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.29f, 19.88f)
                lineToRelative(-3.98f, -3.98f)
                curveToRelative(1.3f, -1.67f, 1.96f, -3.85f, 1.58f, -6.2f)
                curveToRelative(-0.54f, -3.41f, -3.33f, -6.14f, -6.75f, -6.62f)
                curveTo(7.57f, 2.44f, 3.61f, 5.69f, 3.07f, 10.0f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.53f, -3.13f, 3.48f, -5.44f, 6.85f, -4.93f)
                curveToRelative(2.61f, 0.4f, 4.7f, 2.57f, 5.02f, 5.2f)
                curveTo(17.39f, 13.9f, 14.55f, 17.0f, 11.0f, 17.0f)
                curveToRelative(-2.42f, 0.0f, -4.5f, -1.44f, -5.45f, -3.5f)
                horizontalLineTo(3.4f)
                curveTo(4.45f, 16.69f, 7.46f, 19.0f, 11.0f, 19.0f)
                curveToRelative(1.85f, 0.0f, 3.55f, -0.63f, 4.9f, -1.69f)
                lineToRelative(3.98f, 3.98f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(21.68f, 20.9f, 21.68f, 20.27f, 21.29f, 19.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.43f, 9.69f)
                lineToRelative(1.03f, 4.47f)
                curveTo(9.57f, 14.65f, 10.01f, 15.0f, 10.51f, 15.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.46f, 0.0f, 0.87f, -0.3f, 1.02f, -0.74f)
                lineToRelative(1.01f, -3.04f)
                lineToRelative(0.69f, 1.66f)
                curveToRelative(0.16f, 0.37f, 0.52f, 0.62f, 0.92f, 0.62f)
                horizontalLineToRelative(0.58f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                horizontalLineTo(14.5f)
                lineToRelative(-0.97f, -2.34f)
                curveTo(13.36f, 9.26f, 12.97f, 9.0f, 12.53f, 9.0f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.46f, 0.0f, -0.87f, 0.3f, -1.02f, 0.74f)
                lineToRelative(-0.88f, 2.63f)
                lineTo(9.54f, 7.83f)
                curveTo(9.43f, 7.35f, 8.99f, 7.0f, 8.49f, 7.0f)
                horizontalLineToRelative(0.0f)
                curveTo(8.02f, 7.0f, 7.6f, 7.31f, 7.46f, 7.76f)
                lineTo(6.45f, 11.0f)
                horizontalLineToRelative(-4.7f)
                curveTo(1.34f, 11.0f, 1.0f, 11.34f, 1.0f, 11.75f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(5.07f)
                curveToRelative(0.44f, 0.0f, 0.82f, -0.28f, 0.95f, -0.7f)
                lineTo(8.43f, 9.69f)
                close()
            }
        }
        .build()
        return _troubleshoot!!
    }

private var _troubleshoot: ImageVector? = null
