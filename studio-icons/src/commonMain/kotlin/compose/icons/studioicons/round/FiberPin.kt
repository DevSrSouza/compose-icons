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

public val RoundGroup.FiberPin: ImageVector
    get() {
        if (_fiberPin != null) {
            return _fiberPin!!
        }
        _fiberPin = Builder(name = "FiberPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(9.0f, 11.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveTo(4.0f, 14.66f, 4.0f, 14.25f)
                lineTo(4.0f, 10.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.5f, 14.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(20.0f, 14.21f)
                curveToRelative(0.0f, 0.44f, -0.35f, 0.79f, -0.79f, 0.79f)
                curveToRelative(-0.25f, 0.0f, -0.49f, -0.12f, -0.64f, -0.33f)
                lineToRelative(-2.31f, -3.17f)
                verticalLineToRelative(2.88f)
                curveToRelative(0.0f, 0.34f, -0.28f, 0.62f, -0.62f, 0.62f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.35f, 0.0f, -0.63f, -0.28f, -0.63f, -0.62f)
                lineTo(15.0f, 9.83f)
                curveToRelative(0.0f, -0.46f, 0.37f, -0.83f, 0.83f, -0.83f)
                curveToRelative(0.27f, 0.0f, 0.52f, 0.13f, 0.67f, 0.35f)
                lineToRelative(2.25f, 3.15f)
                lineTo(18.75f, 9.62f)
                curveToRelative(0.0f, -0.34f, 0.28f, -0.62f, 0.62f, -0.62f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.34f, 0.0f, 0.62f, 0.28f, 0.62f, 0.62f)
                verticalLineToRelative(4.59f)
                close()
                moveTo(5.5f, 10.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _fiberPin!!
    }

private var _fiberPin: ImageVector? = null
