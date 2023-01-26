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

public val RoundGroup.Blind: ImageVector
    get() {
        if (_blind != null) {
            return _blind!!
        }
        _blind = Builder(name = "Blind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.41f, 3.5f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.04f, 7.12f)
                curveToRelative(-0.17f, -0.35f, -0.44f, -0.65f, -0.8f, -0.85f)
                curveTo(10.63f, 5.91f, 9.9f, 5.93f, 9.31f, 6.24f)
                lineToRelative(0.0f, -0.01f)
                lineTo(4.92f, 8.73f)
                curveTo(4.3f, 9.08f, 3.91f, 9.74f, 3.91f, 10.46f)
                verticalLineTo(13.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.54f)
                lineToRelative(1.5f, -0.85f)
                curveToRelative(-0.32f, 1.1f, -0.5f, 2.24f, -0.5f, 3.39f)
                verticalLineToRelative(5.33f)
                lineToRelative(-2.0f, 2.67f)
                curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f)
                lineToRelative(2.04f, -2.72f)
                curveToRelative(0.23f, -0.31f, 0.37f, -0.69f, 0.4f, -1.08f)
                lineToRelative(0.18f, -2.94f)
                lineTo(10.91f, 18.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-4.87f)
                curveToRelative(0.0f, -0.41f, -0.13f, -0.81f, -0.36f, -1.15f)
                lineToRelative(-1.6f, -2.29f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.01f)
                curveToRelative(-0.11f, -1.16f, 0.07f, -2.32f, 0.46f, -3.4f)
                curveToRelative(0.75f, 1.14f, 1.88f, 1.98f, 3.2f, 2.41f)
                lineToRelative(5.7f, 9.87f)
                curveToRelative(0.14f, 0.24f, 0.44f, 0.32f, 0.68f, 0.18f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.24f, -0.14f, 0.32f, -0.44f, 0.18f, -0.68f)
                lineTo(15.92f, 13.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.54f, 0.0f, 0.98f, -0.44f, 0.98f, -0.98f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0.0f, -0.5f, -0.37f, -0.94f, -0.87f, -0.99f)
                curveToRelative(-0.95f, -0.1f, -2.37f, -0.52f, -3.21f, -2.18f)
            }
        }
        .build()
        return _blind!!
    }

private var _blind: ImageVector? = null
