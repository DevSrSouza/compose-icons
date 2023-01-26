package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Grass: ImageVector
    get() {
        if (_grass != null) {
            return _grass!!
        }
        _grass = Builder(name = "Grass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.75f)
                lineToRelative(0.0f, 0.0f)
                curveTo(7.02f, 15.19f, 4.81f, 12.99f, 2.0f, 12.26f)
                curveTo(2.64f, 12.1f, 3.31f, 12.0f, 4.0f, 12.0f)
                curveTo(8.42f, 12.0f, 12.0f, 15.58f, 12.0f, 20.0f)
                close()
                moveTo(22.0f, 12.26f)
                curveTo(21.36f, 12.1f, 20.69f, 12.0f, 20.0f, 12.0f)
                curveToRelative(-2.93f, 0.0f, -5.48f, 1.58f, -6.88f, 3.93f)
                curveToRelative(0.29f, 0.66f, 0.53f, 1.35f, 0.67f, 2.07f)
                curveToRelative(0.13f, 0.65f, 0.2f, 1.32f, 0.2f, 2.0f)
                horizontalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.75f)
                curveTo(16.98f, 15.19f, 19.19f, 12.99f, 22.0f, 12.26f)
                close()
                moveTo(15.64f, 11.02f)
                curveToRelative(0.78f, -2.09f, 2.23f, -3.84f, 4.09f, -5.0f)
                curveTo(15.44f, 6.16f, 12.0f, 9.67f, 12.0f, 14.0f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.02f, 0.0f, 0.02f)
                curveTo(12.95f, 12.75f, 14.2f, 11.72f, 15.64f, 11.02f)
                close()
                moveTo(11.42f, 8.85f)
                curveTo(10.58f, 6.66f, 8.88f, 4.89f, 6.7f, 4.0f)
                curveTo(8.14f, 5.86f, 9.0f, 8.18f, 9.0f, 10.71f)
                curveToRelative(0.0f, 0.21f, -0.03f, 0.41f, -0.04f, 0.61f)
                curveToRelative(0.43f, 0.24f, 0.83f, 0.52f, 1.22f, 0.82f)
                curveTo(10.39f, 10.96f, 10.83f, 9.85f, 11.42f, 8.85f)
                close()
            }
        }
        .build()
        return _grass!!
    }

private var _grass: ImageVector? = null
