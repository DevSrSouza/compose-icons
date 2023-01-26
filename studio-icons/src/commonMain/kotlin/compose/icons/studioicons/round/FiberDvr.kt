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

public val RoundGroup.FiberDvr: ImageVector
    get() {
        if (_fiberDvr != null) {
            return _fiberDvr!!
        }
        _fiberDvr = Builder(name = "FiberDvr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 10.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.5f, 10.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(23.0f, 5.0f)
                curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(8.0f, 13.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(14.1f, 9.92f)
                lineToRelative(-1.27f, 4.36f)
                curveToRelative(-0.12f, 0.43f, -0.52f, 0.72f, -0.96f, 0.72f)
                reflectiveCurveToRelative(-0.84f, -0.29f, -0.96f, -0.72f)
                lineTo(9.64f, 9.92f)
                curveToRelative(-0.14f, -0.46f, 0.21f, -0.92f, 0.69f, -0.92f)
                curveToRelative(0.32f, 0.0f, 0.6f, 0.21f, 0.69f, 0.52f)
                lineToRelative(0.85f, 2.91f)
                lineToRelative(0.85f, -2.91f)
                curveToRelative(0.09f, -0.31f, 0.37f, -0.52f, 0.69f, -0.52f)
                curveToRelative(0.48f, 0.0f, 0.83f, 0.46f, 0.69f, 0.92f)
                close()
                moveTo(21.0f, 11.5f)
                curveToRelative(0.0f, 0.6f, -0.4f, 1.15f, -0.9f, 1.4f)
                lineToRelative(0.63f, 1.48f)
                curveToRelative(0.19f, 0.45f, -0.14f, 0.96f, -0.63f, 0.96f)
                curveToRelative(-0.28f, 0.0f, -0.53f, -0.16f, -0.63f, -0.42f)
                lineTo(18.65f, 13.0f)
                lineTo(17.5f, 13.0f)
                verticalLineToRelative(1.31f)
                curveToRelative(0.0f, 0.38f, -0.31f, 0.69f, -0.69f, 0.69f)
                horizontalLineToRelative(-0.12f)
                curveToRelative(-0.38f, 0.0f, -0.69f, -0.31f, -0.69f, -0.69f)
                lineTo(16.0f, 9.64f)
                curveToRelative(0.0f, -0.35f, 0.29f, -0.64f, 0.64f, -0.64f)
                horizontalLineToRelative(2.86f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _fiberDvr!!
    }

private var _fiberDvr: ImageVector? = null
