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

public val RoundGroup.Subscript: ImageVector
    get() {
        if (_subscript != null) {
            return _subscript!!
        }
        _subscript = Builder(name = "Subscript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.52f, 10.73f)
                lineTo(7.3f, 5.72f)
                curveTo(6.82f, 4.97f, 7.35f, 4.0f, 8.23f, 4.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.39f, 0.0f, 0.74f, 0.2f, 0.95f, 0.53f)
                lineToRelative(2.76f, 4.46f)
                horizontalLineToRelative(0.12f)
                lineToRelative(2.74f, -4.45f)
                curveTo(15.01f, 4.2f, 15.37f, 4.0f, 15.76f, 4.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.88f, 0.0f, 1.42f, 0.98f, 0.94f, 1.72f)
                lineToRelative(-3.23f, 5.0f)
                lineToRelative(3.55f, 5.55f)
                curveTo(17.5f, 17.02f, 16.96f, 18.0f, 16.08f, 18.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.38f, 0.0f, -0.74f, -0.2f, -0.95f, -0.52f)
                lineToRelative(-3.07f, -4.89f)
                horizontalLineToRelative(-0.12f)
                lineToRelative(-3.07f, 4.89f)
                curveTo(8.67f, 17.8f, 8.31f, 18.0f, 7.92f, 18.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.88f, 0.0f, -1.42f, -0.97f, -0.94f, -1.72f)
                lineTo(10.52f, 10.73f)
                close()
                moveTo(23.0f, 19.5f)
                lineTo(23.0f, 19.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.5f)
                curveTo(22.78f, 20.0f, 23.0f, 19.78f, 23.0f, 19.5f)
                close()
            }
        }
        .build()
        return _subscript!!
    }

private var _subscript: ImageVector? = null
