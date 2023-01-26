package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.49f, 10.5f)
                lineToRelative(0.0f, 4.5f)
                lineToRelative(1.15f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-0.87f, 0.0f)
                lineToRelative(-1.76f, 1.27f)
                lineToRelative(0.58f, 0.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.47f, 10.05f)
                curveToRelative(0.5f, 0.0f, 0.81f, 0.32f, 0.81f, 0.72f)
                curveToRelative(0.0f, 0.37f, -0.14f, 0.64f, -0.54f, 1.06f)
                curveToRelative(-0.36f, 0.38f, -1.06f, 1.08f, -2.13f, 2.15f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(3.89f)
                verticalLineToRelative(-0.99f)
                horizontalLineToRelative(-2.37f)
                lineToRelative(-0.03f, -0.05f)
                curveToRelative(0.68f, -0.68f, 1.15f, -1.14f, 1.4f, -1.39f)
                curveToRelative(0.61f, -0.6f, 0.92f, -1.22f, 0.92f, -1.86f)
                curveToRelative(0.0f, -0.24f, -0.05f, -1.04f, -0.91f, -1.48f)
                curveTo(12.04f, 9.0f, 11.25f, 8.87f, 10.56f, 9.2f)
                curveToRelative(-0.82f, 0.39f, -0.99f, 1.13f, -1.0f, 1.15f)
                lineToRelative(1.01f, 0.42f)
                curveTo(10.67f, 10.44f, 10.95f, 10.05f, 11.47f, 10.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.99f, 13.94f)
                curveToRelative(-0.83f, 0.0f, -0.99f, -0.76f, -1.02f, -0.86f)
                lineToRelative(-1.03f, 0.41f)
                curveToRelative(0.45f, 1.59f, 2.01f, 1.51f, 2.05f, 1.51f)
                curveToRelative(1.2f, 0.0f, 1.68f, -0.72f, 1.76f, -0.85f)
                curveToRelative(0.32f, -0.49f, 0.36f, -1.24f, -0.01f, -1.76f)
                curveToRelative(-0.17f, -0.24f, -0.4f, -0.41f, -0.68f, -0.52f)
                verticalLineTo(11.8f)
                curveToRelative(0.2f, -0.1f, 0.37f, -0.26f, 0.52f, -0.48f)
                curveToRelative(0.26f, -0.41f, 0.31f, -1.07f, -0.02f, -1.57f)
                curveTo(18.48f, 9.64f, 18.03f, 9.0f, 16.94f, 9.0f)
                curveToRelative(-1.26f, 0.0f, -1.74f, 0.9f, -1.85f, 1.24f)
                lineToRelative(0.99f, 0.41f)
                curveToRelative(0.11f, -0.32f, 0.35f, -0.64f, 0.85f, -0.64f)
                curveToRelative(0.44f, 0.0f, 0.75f, 0.26f, 0.75f, 0.65f)
                curveToRelative(0.0f, 0.58f, -0.55f, 0.72f, -0.88f, 0.72f)
                horizontalLineToRelative(-0.46f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.56f, 0.0f, 1.04f, 0.24f, 1.04f, 0.79f)
                curveTo(17.88f, 13.66f, 17.4f, 13.94f, 16.99f, 13.94f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
