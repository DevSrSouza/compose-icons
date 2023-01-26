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

public val RoundGroup.GasMeter: ImageVector
    get() {
        if (_gasMeter != null) {
            return _gasMeter!!
        }
        _gasMeter = Builder(name = "GasMeter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.0f)
                curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 5.79f, 18.21f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.1f, -2.5f, -2.46f)
                curveToRelative(0.0f, -1.02f, 0.38f, -1.35f, 2.12f, -3.35f)
                curveToRelative(0.2f, -0.23f, 0.56f, -0.23f, 0.75f, 0.0f)
                curveToRelative(1.73f, 1.99f, 2.12f, 2.34f, 2.12f, 3.35f)
                curveTo(14.5f, 16.9f, 13.38f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(15.0f, 10.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveTo(16.0f, 9.55f, 15.55f, 10.0f, 15.0f, 10.0f)
                close()
            }
        }
        .build()
        return _gasMeter!!
    }

private var _gasMeter: ImageVector? = null
