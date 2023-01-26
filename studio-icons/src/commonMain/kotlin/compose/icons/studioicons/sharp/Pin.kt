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

public val SharpGroup.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(7.64f, 15.0f)
                horizontalLineTo(6.49f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-0.9f, 0.66f)
                lineToRelative(-0.58f, -0.89f)
                lineTo(6.77f, 9.0f)
                horizontalLineToRelative(0.87f)
                verticalLineTo(15.0f)
                close()
                moveTo(13.5f, 15.0f)
                horizontalLineTo(9.61f)
                verticalLineToRelative(-1.02f)
                curveToRelative(1.07f, -1.07f, 1.77f, -1.77f, 2.13f, -2.15f)
                curveToRelative(0.4f, -0.42f, 0.54f, -0.69f, 0.54f, -1.06f)
                curveToRelative(0.0f, -0.4f, -0.31f, -0.72f, -0.81f, -0.72f)
                curveToRelative(-0.52f, 0.0f, -0.8f, 0.39f, -0.9f, 0.72f)
                lineToRelative(-1.01f, -0.42f)
                curveToRelative(0.01f, -0.02f, 0.18f, -0.76f, 1.0f, -1.15f)
                curveToRelative(0.69f, -0.33f, 1.48f, -0.2f, 1.95f, 0.03f)
                curveToRelative(0.86f, 0.44f, 0.91f, 1.24f, 0.91f, 1.48f)
                curveToRelative(0.0f, 0.64f, -0.31f, 1.26f, -0.92f, 1.86f)
                curveToRelative(-0.25f, 0.25f, -0.72f, 0.71f, -1.4f, 1.39f)
                lineToRelative(0.03f, 0.05f)
                horizontalLineToRelative(2.37f)
                verticalLineTo(15.0f)
                close()
                moveTo(18.75f, 14.15f)
                curveTo(18.67f, 14.28f, 18.19f, 15.0f, 16.99f, 15.0f)
                curveToRelative(-0.04f, 0.0f, -1.6f, 0.08f, -2.05f, -1.51f)
                lineToRelative(1.03f, -0.41f)
                curveToRelative(0.03f, 0.1f, 0.19f, 0.86f, 1.02f, 0.86f)
                curveToRelative(0.41f, 0.0f, 0.89f, -0.28f, 0.89f, -0.77f)
                curveToRelative(0.0f, -0.55f, -0.48f, -0.79f, -1.04f, -0.79f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.46f)
                curveToRelative(0.33f, 0.0f, 0.88f, -0.14f, 0.88f, -0.72f)
                curveToRelative(0.0f, -0.39f, -0.31f, -0.65f, -0.75f, -0.65f)
                curveToRelative(-0.5f, 0.0f, -0.74f, 0.32f, -0.85f, 0.64f)
                lineToRelative(-0.99f, -0.41f)
                curveTo(15.2f, 9.9f, 15.68f, 9.0f, 16.94f, 9.0f)
                curveToRelative(1.09f, 0.0f, 1.54f, 0.64f, 1.62f, 0.75f)
                curveToRelative(0.33f, 0.5f, 0.28f, 1.16f, 0.02f, 1.57f)
                curveToRelative(-0.15f, 0.22f, -0.32f, 0.38f, -0.52f, 0.48f)
                verticalLineToRelative(0.07f)
                curveToRelative(0.28f, 0.11f, 0.51f, 0.28f, 0.68f, 0.52f)
                curveTo(19.11f, 12.91f, 19.07f, 13.66f, 18.75f, 14.15f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
