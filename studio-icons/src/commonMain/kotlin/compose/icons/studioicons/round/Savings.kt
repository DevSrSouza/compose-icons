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

public val RoundGroup.Savings: ImageVector
    get() {
        if (_savings != null) {
            return _savings!!
        }
        _savings = Builder(name = "Savings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.83f, 7.5f)
                lineToRelative(-2.27f, -2.27f)
                curveToRelative(0.07f, -0.42f, 0.18f, -0.81f, 0.32f, -1.15f)
                curveToRelative(0.11f, -0.26f, 0.15f, -0.56f, 0.09f, -0.87f)
                curveTo(17.84f, 2.49f, 17.14f, 1.99f, 16.4f, 2.0f)
                curveToRelative(-1.59f, 0.03f, -3.0f, 0.81f, -3.9f, 2.0f)
                lineToRelative(-5.0f, 0.0f)
                curveTo(4.46f, 4.0f, 2.0f, 6.46f, 2.0f, 9.5f)
                curveToRelative(0.0f, 2.25f, 1.37f, 7.48f, 2.08f, 10.04f)
                curveTo(4.32f, 20.4f, 5.11f, 21.0f, 6.01f, 21.0f)
                lineTo(8.0f, 21.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                lineToRelative(2.01f, 0.0f)
                curveToRelative(0.88f, 0.0f, 1.66f, -0.58f, 1.92f, -1.43f)
                lineToRelative(1.25f, -4.16f)
                lineToRelative(2.14f, -0.72f)
                curveToRelative(0.41f, -0.14f, 0.68f, -0.52f, 0.68f, -0.95f)
                verticalLineTo(8.5f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(19.83f)
                close()
                moveTo(12.0f, 9.0f)
                horizontalLineTo(9.0f)
                curveTo(8.45f, 9.0f, 8.0f, 8.55f, 8.0f, 8.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveTo(13.0f, 8.55f, 12.55f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(17.0f, 10.55f, 16.55f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _savings!!
    }

private var _savings: ImageVector? = null
