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

public val BaselineGroup.Microwave: ImageVector
    get() {
        if (_microwave != null) {
            return _microwave!!
        }
        _microwave = Builder(name = "Microwave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.8f, 10.61f)
                lineTo(5.37f, 9.19f)
                curveTo(5.73f, 8.79f, 6.59f, 8.0f, 7.75f, 8.0f)
                curveToRelative(0.8f, 0.0f, 1.39f, 0.39f, 1.81f, 0.67f)
                curveTo(9.87f, 8.88f, 10.07f, 9.0f, 10.25f, 9.0f)
                curveToRelative(0.37f, 0.0f, 0.8f, -0.41f, 0.95f, -0.61f)
                lineToRelative(1.42f, 1.42f)
                curveToRelative(-0.36f, 0.4f, -1.22f, 1.19f, -2.37f, 1.19f)
                curveToRelative(-0.79f, 0.0f, -1.37f, -0.38f, -1.79f, -0.66f)
                curveTo(8.13f, 10.12f, 7.94f, 10.0f, 7.75f, 10.0f)
                curveTo(7.38f, 10.0f, 6.95f, 10.41f, 6.8f, 10.61f)
                close()
                moveTo(7.75f, 15.0f)
                curveToRelative(0.19f, 0.0f, 0.38f, 0.12f, 0.71f, 0.34f)
                curveToRelative(0.42f, 0.28f, 1.0f, 0.66f, 1.79f, 0.66f)
                curveToRelative(1.16f, 0.0f, 2.01f, -0.79f, 2.37f, -1.19f)
                lineToRelative(-1.42f, -1.42f)
                curveToRelative(-0.15f, 0.2f, -0.59f, 0.61f, -0.95f, 0.61f)
                curveToRelative(-0.18f, 0.0f, -0.38f, -0.12f, -0.69f, -0.33f)
                curveTo(9.14f, 13.39f, 8.55f, 13.0f, 7.75f, 13.0f)
                curveToRelative(-1.16f, 0.0f, -2.02f, 0.79f, -2.38f, 1.19f)
                lineToRelative(1.42f, 1.42f)
                curveTo(6.95f, 15.41f, 7.38f, 15.0f, 7.75f, 15.0f)
                close()
                moveTo(22.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveTo(21.1f, 4.0f, 22.0f, 4.9f, 22.0f, 6.0f)
                close()
                moveTo(14.0f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(19.0f, 16.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                curveTo(18.55f, 17.0f, 19.0f, 16.55f, 19.0f, 16.0f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                curveTo(18.55f, 13.0f, 19.0f, 12.55f, 19.0f, 12.0f)
                close()
                moveTo(19.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _microwave!!
    }

private var _microwave: ImageVector? = null
